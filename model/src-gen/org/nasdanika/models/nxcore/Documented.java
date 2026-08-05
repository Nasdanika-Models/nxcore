/**
 */
package org.nasdanika.models.nxcore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documented</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.nxcore.Documented#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.Documented#getDocRef <em>Doc Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.Documented#getDocFormat <em>Doc Format</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.Documented#getDocContents <em>Doc Contents</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.Documented#getDocSections <em>Doc Sections</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.nxcore.NxcorePackage#getDocumented()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Documented extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Inline documentation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.nasdanika.models.nxcore.NxcorePackage#getDocumented_Documentation()
	 * @model unique="false"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.nxcore.Documented#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Documentation resource URI resolved relative to this model element resource URI.
	 * Documentation format is derived from extension if not set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Doc Ref</em>' attribute.
	 * @see #setDocRef(String)
	 * @see org.nasdanika.models.nxcore.NxcorePackage#getDocumented_DocRef()
	 * @model unique="false"
	 * @generated
	 */
	String getDocRef();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.nxcore.Documented#getDocRef <em>Doc Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc Ref</em>' attribute.
	 * @see #getDocRef()
	 * @generated
	 */
	void setDocRef(String value);

	/**
	 * Returns the value of the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Documentation format. If not set, defaults to markdown for inline documentation and is
	 * derived from the documentation resource extension for docRef
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Doc Format</em>' attribute.
	 * @see #setDocFormat(String)
	 * @see org.nasdanika.models.nxcore.NxcorePackage#getDocumented_DocFormat()
	 * @model unique="false"
	 * @generated
	 */
	String getDocFormat();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.nxcore.Documented#getDocFormat <em>Doc Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc Format</em>' attribute.
	 * @see #getDocFormat()
	 * @generated
	 */
	void setDocFormat(String value);

	/**
	 * Returns the value of the '<em><b>Doc Contents</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.nxcore.Content}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Documentation contents - follows after the own documentation/docRef
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Doc Contents</em>' containment reference list.
	 * @see org.nasdanika.models.nxcore.NxcorePackage#getDocumented_DocContents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Content> getDocContents();

	/**
	 * Returns the value of the '<em><b>Doc Sections</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.nxcore.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Documentation sections, follow after docContents
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Doc Sections</em>' containment reference list.
	 * @see org.nasdanika.models.nxcore.NxcorePackage#getDocumented_DocSections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getDocSections();

} // Documented
