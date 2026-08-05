/**
 */
package org.nasdanika.models.nxcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spel Evaluator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.nxcore.SpelEvaluator#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.nxcore.NxcorePackage#getSpelEvaluator()
 * @model
 * @generated
 */
public interface SpelEvaluator extends Evaluator {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  SpEL expression text, parsed to org.springframework.expression.Expression
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.nasdanika.models.nxcore.NxcorePackage#getSpelEvaluator_Expression()
	 * @model unique="false"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.nxcore.SpelEvaluator#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // SpelEvaluator
