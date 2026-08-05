module org.nasdanika.models.nxcore.doc {
		
	requires transitive org.nasdanika.models.nxcore;
	requires transitive org.nasdanika.models.ecore.graph;
	requires org.apache.commons.text;
	
	exports org.nasdanika.models.nxcore.doc;
	opens org.nasdanika.models.nxcore.doc; // For loading resources
	
}
