package org.nasdanika.models.nxcore.capability;

import java.util.concurrent.CompletionStage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.groovy.DslResourceContentsHandler;
import org.nasdanika.groovy.DslResourceContentsHandler.Marker;

/**
 * Provides {@link MarkdownHelper} for a given resource base {@link URI}
 */
public class DslMarkerCapabilityFactory extends ServiceCapabilityFactory<Resource, DslResourceContentsHandler.Marker> {
	
	@Override
	public boolean isFor(Class<?> type, Object requirement) {
		return DslResourceContentsHandler.Marker.class == type && requirement instanceof Resource;
	}

	@Override
	protected CompletionStage<Iterable<CapabilityProvider<Marker>>> createService(
			Class<Marker> serviceType,
			Resource serviceRequirement, 
			Loader loader,
			ProgressMonitor progressMonitor) {
		
		return wrap(new DslMarker(serviceRequirement));
	}
		
}
