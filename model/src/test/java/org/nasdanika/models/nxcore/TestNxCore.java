package org.nasdanika.models.nxcore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;

public class TestNxCore {
	
	@Test
	public void testEvaluator() throws IOException {
		System.out.println("testEvaluatorDslResource");
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
		
		File groovyFile = new File("src/test/resources/test-evaluator.groovy").getCanonicalFile();
		Resource groovyResource = resourceSet.getResource(URI.createFileURI(groovyFile.getAbsolutePath()), true);

		Object result = ((Evaluator) groovyResource.getContents().get(0)).evaluate();
		System.out.println("Result: " + result);
		assertEquals(4, result);		
		
		File ecoreFile = new File("target/test-evaluator.groovy.xml").getCanonicalFile();
		Resource ecoreResource = resourceSet.createResource(URI.createFileURI(ecoreFile.getAbsolutePath()));
		ecoreResource.getContents().addAll(EcoreUtil.copyAll(groovyResource.getContents()));
		ecoreResource.save(null);
		
	}

}
