/**
 */
package org.nasdanika.models.nxcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script Evaluator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.nxcore.ScriptEvaluator#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.nxcore.NxcorePackage#getScriptEvaluator()
 * @model
 * @generated
 */
public interface ScriptEvaluator extends SourceEvaluator {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  JSR-223 engine short name. Required for script; for scriptRef
	 * falls back to selection by URI extension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.nasdanika.models.nxcore.NxcorePackage#getScriptEvaluator_Language()
	 * @model unique="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.nxcore.ScriptEvaluator#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

} // ScriptEvaluator
