package org.nasdanika.models.nxcore.capability;

import java.io.File;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jgit.lib.Constants;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.lib.StoredConfig;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.nasdanika.groovy.DslResourceContentsHandler;
import org.nasdanika.models.nxcore.GitMarker;
import org.nasdanika.models.nxcore.Marked;
import org.nasdanika.models.nxcore.Marker;
import org.nasdanika.models.nxcore.NxcoreFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DslMarker implements DslResourceContentsHandler.Marker {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DslMarker.class);

	private Marker markerTemplate;
	
	public DslMarker(Resource resource) {
		org.eclipse.emf.common.util.URI resourceURI = resource.getURI();
		
		try {
			if (resourceURI.isFile()) {
				File file = new File(resourceURI.toFileString()).getCanonicalFile();
				FileRepositoryBuilder repositoryBuilder = new FileRepositoryBuilder().readEnvironment();
				repositoryBuilder.findGitDir(file);
				if (repositoryBuilder.getGitDir() != null) {
					try (Repository repository = repositoryBuilder.build()) {
						GitMarker gitMarker = NxcoreFactory.eINSTANCE.createGitMarker();
						StoredConfig config = repository.getConfig();
						for (String remote: repository.getRemoteNames()) {
							gitMarker.getRemotes().put(remote, config.getString("remote", "origin", "url"));
						}
						gitMarker.setBranch(repository.getBranch());
						for (Ref ref: repository.getRefDatabase().getRefs()) {
							if (ref.getName().equals(Constants.HEAD)) {
								gitMarker.setHead(ref.getObjectId().getName());
								for (Ref refTwo: repository.getRefDatabase().getRefs()) {
									if (!refTwo.getName().equals(Constants.HEAD) && refTwo.getObjectId().equals(ref.getObjectId())) {
										gitMarker.getHeadRefs().add(refTwo.getName());
									}
								}							
							}
						}
						URI repoWorkTreeURI = repository.getWorkTree().toURI();					
						gitMarker.setPath(repoWorkTreeURI.relativize(file.toURI()).toString());
						markerTemplate = gitMarker;
					}
				}
			}
		} catch (Exception e) {
			LOGGER.error("Error creating marker for resource " + resourceURI, e);
		}
		if (markerTemplate == null) {
			markerTemplate = NxcoreFactory.eINSTANCE.createMarker();
		}
		markerTemplate.setLocation(resourceURI.toString());
		
		ResourceSet resourceSet = resource.getResourceSet();
		if (resourceSet != null) {
			URIConverter uriConverter = resourceSet.getURIConverter();
			Set<String> requestedOptions = Set.of(URIConverter.ATTRIBUTE_TIME_STAMP);
			Map<String, Object> options = Map.of(URIConverter.OPTION_REQUESTED_ATTRIBUTES, requestedOptions);
			Map<String,?> attributes = uriConverter.getAttributes(resourceURI, options);
			Long timeStamp = (Long) attributes.get(URIConverter.ATTRIBUTE_TIME_STAMP);
			if (timeStamp != null) {
				markerTemplate.setDate(new Date(timeStamp));
			}
		}
	}

	@Override
	public void mark(EObject eObject, EStructuralFeature feature, int line, int col) {
		if (eObject instanceof Marked marked) {
			Marker marker = EcoreUtil.copy(markerTemplate);
			marker.setPosition(String.valueOf(line)); // col is always -1 for now
			if (feature != null) {
				marker.setFeature(feature.getName());
			}
			marked.getMarkers().add(marker);
		}
	}

}
