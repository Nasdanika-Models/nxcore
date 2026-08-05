/**
 */
package org.nasdanika.models.nxcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Section/documentation content
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.nxcore.Content#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.Content#getContentRef <em>Content Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.Content#getContentType <em>Content Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.nxcore.NxcorePackage#getContent()
 * @model
 * @generated
 */
public interface Content extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.nasdanika.models.nxcore.NxcorePackage#getContent_Content()
	 * @model unique="false"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.nxcore.Content#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Content Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Ref</em>' attribute.
	 * @see #setContentRef(String)
	 * @see org.nasdanika.models.nxcore.NxcorePackage#getContent_ContentRef()
	 * @model unique="false"
	 * @generated
	 */
	String getContentRef();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.nxcore.Content#getContentRef <em>Content Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Ref</em>' attribute.
	 * @see #getContentRef()
	 * @generated
	 */
	void setContentRef(String value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see org.nasdanika.models.nxcore.NxcorePackage#getContent_ContentType()
	 * @model unique="false"
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.nxcore.Content#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

} // Content
