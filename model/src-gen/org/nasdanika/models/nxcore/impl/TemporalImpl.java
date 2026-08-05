/**
 */
package org.nasdanika.models.nxcore.impl;

import java.time.Duration;
import java.time.Instant;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.nxcore.NxcorePackage;
import org.nasdanika.models.nxcore.Temporal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.nxcore.impl.TemporalImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.impl.TemporalImpl#getInstant <em>Instant</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.impl.TemporalImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.impl.TemporalImpl#getLowerBounds <em>Lower Bounds</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.impl.TemporalImpl#getUpperBounds <em>Upper Bounds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemporalImpl extends MinimalEObjectImpl.Container implements Temporal {
	/**
	 * The default value of the '{@link #getInstant() <em>Instant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstant()
	 * @generated
	 * @ordered
	 */
	protected static final Instant INSTANT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DURATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NxcorePackage.Literals.TEMPORAL;
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
	public Temporal getBase() {
		return (Temporal)eDynamicGet(NxcorePackage.TEMPORAL__BASE, NxcorePackage.Literals.TEMPORAL__BASE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Temporal basicGetBase() {
		return (Temporal)eDynamicGet(NxcorePackage.TEMPORAL__BASE, NxcorePackage.Literals.TEMPORAL__BASE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(Temporal newBase) {
		eDynamicSet(NxcorePackage.TEMPORAL__BASE, NxcorePackage.Literals.TEMPORAL__BASE, newBase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instant getInstant() {
		return (Instant)eDynamicGet(NxcorePackage.TEMPORAL__INSTANT, NxcorePackage.Literals.TEMPORAL__INSTANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstant(Instant newInstant) {
		eDynamicSet(NxcorePackage.TEMPORAL__INSTANT, NxcorePackage.Literals.TEMPORAL__INSTANT, newInstant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getDuration() {
		return (Duration)eDynamicGet(NxcorePackage.TEMPORAL__DURATION, NxcorePackage.Literals.TEMPORAL__DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(Duration newDuration) {
		eDynamicSet(NxcorePackage.TEMPORAL__DURATION, NxcorePackage.Literals.TEMPORAL__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Temporal> getLowerBounds() {
		return (EList<Temporal>)eDynamicGet(NxcorePackage.TEMPORAL__LOWER_BOUNDS, NxcorePackage.Literals.TEMPORAL__LOWER_BOUNDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Temporal> getUpperBounds() {
		return (EList<Temporal>)eDynamicGet(NxcorePackage.TEMPORAL__UPPER_BOUNDS, NxcorePackage.Literals.TEMPORAL__UPPER_BOUNDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NxcorePackage.TEMPORAL__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case NxcorePackage.TEMPORAL__INSTANT:
				return getInstant();
			case NxcorePackage.TEMPORAL__DURATION:
				return getDuration();
			case NxcorePackage.TEMPORAL__LOWER_BOUNDS:
				return getLowerBounds();
			case NxcorePackage.TEMPORAL__UPPER_BOUNDS:
				return getUpperBounds();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NxcorePackage.TEMPORAL__BASE:
				setBase((Temporal)newValue);
				return;
			case NxcorePackage.TEMPORAL__INSTANT:
				setInstant((Instant)newValue);
				return;
			case NxcorePackage.TEMPORAL__DURATION:
				setDuration((Duration)newValue);
				return;
			case NxcorePackage.TEMPORAL__LOWER_BOUNDS:
				getLowerBounds().clear();
				getLowerBounds().addAll((Collection<? extends Temporal>)newValue);
				return;
			case NxcorePackage.TEMPORAL__UPPER_BOUNDS:
				getUpperBounds().clear();
				getUpperBounds().addAll((Collection<? extends Temporal>)newValue);
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
			case NxcorePackage.TEMPORAL__BASE:
				setBase((Temporal)null);
				return;
			case NxcorePackage.TEMPORAL__INSTANT:
				setInstant(INSTANT_EDEFAULT);
				return;
			case NxcorePackage.TEMPORAL__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case NxcorePackage.TEMPORAL__LOWER_BOUNDS:
				getLowerBounds().clear();
				return;
			case NxcorePackage.TEMPORAL__UPPER_BOUNDS:
				getUpperBounds().clear();
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
			case NxcorePackage.TEMPORAL__BASE:
				return basicGetBase() != null;
			case NxcorePackage.TEMPORAL__INSTANT:
				return INSTANT_EDEFAULT == null ? getInstant() != null : !INSTANT_EDEFAULT.equals(getInstant());
			case NxcorePackage.TEMPORAL__DURATION:
				return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
			case NxcorePackage.TEMPORAL__LOWER_BOUNDS:
				return !getLowerBounds().isEmpty();
			case NxcorePackage.TEMPORAL__UPPER_BOUNDS:
				return !getUpperBounds().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TemporalImpl
