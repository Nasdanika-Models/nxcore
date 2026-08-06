package org.nasdanika.models.nxcore.capability;

import java.util.concurrent.CompletionStage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.nasdanika.capability.CapabilityProvider;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.common.MarkdownHelper;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.groovy.DslResourceContentsHandler;
import org.nasdanika.groovy.DslResourceContentsHandler.Factory;
import org.nasdanika.models.nxcore.NxcoreFactory;
import org.nasdanika.models.nxcore.NxcorePackage;
import org.nasdanika.models.nxcore.SpelEvaluator;

/**
 * Provides {@link MarkdownHelper} for a given resource base {@link URI}
 */
public class EvaluatorCapabilityFactory extends ServiceCapabilityFactory<Resource, DslResourceContentsHandler.Factory> {
	
	@Override
	public boolean isFor(Class<?> type, Object requirement) {
		return DslResourceContentsHandler.Factory.class == type && requirement instanceof Resource;
	}

	@Override
	protected CompletionStage<Iterable<CapabilityProvider<Factory>>> createService(
			Class<Factory> serviceType,
			Resource serviceRequirement, Loader loader,
			ProgressMonitor progressMonitor) {
		
		DslResourceContentsHandler.Factory factory = new DslResourceContentsHandler.Factory() {

			@Override
			public boolean canCreate(EReference eReference, Object value) {
				return eReference.getEType() == NxcorePackage.Literals.EVALUATOR && value instanceof String expr && !Util.isBlank(expr);
			}

			@Override
			public EObject create(EReference eReference, Object value) {
				SpelEvaluator spelEvaluator = NxcoreFactory.eINSTANCE.createSpelEvaluator();
				spelEvaluator.setExpression((String) value);
				return spelEvaluator;
			}
			
		};
		
		return wrap(factory);
	}
		
}
