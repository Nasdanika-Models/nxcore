/**
 */
package org.nasdanika.models.nxcore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referrable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.models.nxcore.NxcorePackage#getReferrable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Referrable extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceDataType="org.nasdanika.models.nxcore.Object" sourceUnique="false" eReferenceUnique="false" accumulatorUnique="false" accumulatorMany="true"
	 * @generated
	 */
	void collect(Object source, EReference eReference, EList<EObject> accumulator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" eReferenceUnique="false"
	 * @generated
	 */
	EList<EObject> getReferrers(EReference eReference);

} // Referrable
