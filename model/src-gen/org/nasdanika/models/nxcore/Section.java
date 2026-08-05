/**
 */
package org.nasdanika.models.nxcore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.nxcore.Section#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.Section#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.nxcore.NxcorePackage#getSection()
 * @model
 * @generated
 */
public interface Section extends SectionReference {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.nxcore.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.models.nxcore.NxcorePackage#getSection_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getChildren();

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.nxcore.Content}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see org.nasdanika.models.nxcore.NxcorePackage#getSection_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Content> getContents();

} // Section
