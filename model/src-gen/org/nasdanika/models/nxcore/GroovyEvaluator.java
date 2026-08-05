/**
 */
package org.nasdanika.models.nxcore;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Groovy Evaluator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.models.nxcore.NxcorePackage#getGroovyEvaluator()
 * @model
 * @generated
 */
public interface GroovyEvaluator extends SourceEvaluator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" resultTypeDataType="org.nasdanika.models.nxcore.Class&lt;T&gt;" resultTypeUnique="false" bindingsDataType="org.nasdanika.models.nxcore.Map&lt;org.eclipse.emf.ecore.EString, org.nasdanika.models.nxcore.Object&gt;" bindingsUnique="false"
	 * @generated
	 */
	<T> T evaluate(Class<T> resultType, Map<String, Object> bindings);

} // GroovyEvaluator
