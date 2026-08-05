/**
 */
package org.nasdanika.models.nxcore.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.nxcore.Marker;
import org.nasdanika.models.nxcore.NxcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.nxcore.impl.MarkerImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.impl.MarkerImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.impl.MarkerImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.impl.MarkerImpl#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarkerImpl extends MinimalEObjectImpl.Container implements Marker {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NxcorePackage.Literals.MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return (String)eDynamicGet(NxcorePackage.MARKER__LOCATION, NxcorePackage.Literals.MARKER__LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		eDynamicSet(NxcorePackage.MARKER__LOCATION, NxcorePackage.Literals.MARKER__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPosition() {
		return (String)eDynamicGet(NxcorePackage.MARKER__POSITION, NxcorePackage.Literals.MARKER__POSITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(String newPosition) {
		eDynamicSet(NxcorePackage.MARKER__POSITION, NxcorePackage.Literals.MARKER__POSITION, newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return (String)eDynamicGet(NxcorePackage.MARKER__COMMENT, NxcorePackage.Literals.MARKER__COMMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		eDynamicSet(NxcorePackage.MARKER__COMMENT, NxcorePackage.Literals.MARKER__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return (Date)eDynamicGet(NxcorePackage.MARKER__DATE, NxcorePackage.Literals.MARKER__DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		eDynamicSet(NxcorePackage.MARKER__DATE, NxcorePackage.Literals.MARKER__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NxcorePackage.MARKER__LOCATION:
				return getLocation();
			case NxcorePackage.MARKER__POSITION:
				return getPosition();
			case NxcorePackage.MARKER__COMMENT:
				return getComment();
			case NxcorePackage.MARKER__DATE:
				return getDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NxcorePackage.MARKER__LOCATION:
				setLocation((String)newValue);
				return;
			case NxcorePackage.MARKER__POSITION:
				setPosition((String)newValue);
				return;
			case NxcorePackage.MARKER__COMMENT:
				setComment((String)newValue);
				return;
			case NxcorePackage.MARKER__DATE:
				setDate((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NxcorePackage.MARKER__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case NxcorePackage.MARKER__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case NxcorePackage.MARKER__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case NxcorePackage.MARKER__DATE:
				setDate(DATE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NxcorePackage.MARKER__LOCATION:
				return LOCATION_EDEFAULT == null ? getLocation() != null : !LOCATION_EDEFAULT.equals(getLocation());
			case NxcorePackage.MARKER__POSITION:
				return POSITION_EDEFAULT == null ? getPosition() != null : !POSITION_EDEFAULT.equals(getPosition());
			case NxcorePackage.MARKER__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
			case NxcorePackage.MARKER__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
		}
		return super.eIsSet(featureID);
	}

} //MarkerImpl
