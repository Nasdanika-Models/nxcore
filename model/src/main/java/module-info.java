import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.nxcore.capability.NxcoreEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.nxcore {
	
	exports org.nasdanika.models.nxcore;
	exports org.nasdanika.models.nxcore.impl;
	exports org.nasdanika.models.nxcore.util;
	exports org.nasdanika.models.nxcore.dsl;
	opens org.nasdanika.models.nxcore;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.groovy;
	requires transitive org.eclipse.jgit;
	requires spring.expression;
	requires java.scripting;
	requires org.apache.groovy;	
	
	provides CapabilityFactory with 
		NxcoreEPackageResourceSetCapabilityFactory;
	
}