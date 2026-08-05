/**
 */
package org.nasdanika.models.nxcore.impl;

import java.time.Duration;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.nxcore.NamedPeriod;
import org.nasdanika.models.nxcore.NxcorePackage;
import org.nasdanika.models.nxcore.Period;
import org.nasdanika.models.nxcore.Temporal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Period</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.nxcore.impl.NamedPeriodImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.impl.NamedPeriodImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.impl.NamedPeriodImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamedPeriodImpl extends NamedElementImpl implements NamedPeriod {
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
	protected NamedPeriodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NxcorePackage.Literals.NAMED_PERIOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getDuration() {
		return (Duration)eDynamicGet(NxcorePackage.NAMED_PERIOD__DURATION, NxcorePackage.Literals.PERIOD__DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(Duration newDuration) {
		eDynamicSet(NxcorePackage.NAMED_PERIOD__DURATION, NxcorePackage.Literals.PERIOD__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getStart() {
		return (Temporal)eDynamicGet(NxcorePackage.NAMED_PERIOD__START, NxcorePackage.Literals.PERIOD__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Temporal newStart, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStart, NxcorePackage.NAMED_PERIOD__START, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Temporal newStart) {
		eDynamicSet(NxcorePackage.NAMED_PERIOD__START, NxcorePackage.Literals.PERIOD__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal getEnd() {
		return (Temporal)eDynamicGet(NxcorePackage.NAMED_PERIOD__END, NxcorePackage.Literals.PERIOD__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Temporal newEnd, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEnd, NxcorePackage.NAMED_PERIOD__END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Temporal newEnd) {
		eDynamicSet(NxcorePackage.NAMED_PERIOD__END, NxcorePackage.Literals.PERIOD__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NxcorePackage.NAMED_PERIOD__START:
				return basicSetStart(null, msgs);
			case NxcorePackage.NAMED_PERIOD__END:
				return basicSetEnd(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NxcorePackage.NAMED_PERIOD__DURATION:
				return getDuration();
			case NxcorePackage.NAMED_PERIOD__START:
				return getStart();
			case NxcorePackage.NAMED_PERIOD__END:
				return getEnd();
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
			case NxcorePackage.NAMED_PERIOD__DURATION:
				setDuration((Duration)newValue);
				return;
			case NxcorePackage.NAMED_PERIOD__START:
				setStart((Temporal)newValue);
				return;
			case NxcorePackage.NAMED_PERIOD__END:
				setEnd((Temporal)newValue);
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
			case NxcorePackage.NAMED_PERIOD__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case NxcorePackage.NAMED_PERIOD__START:
				setStart((Temporal)null);
				return;
			case NxcorePackage.NAMED_PERIOD__END:
				setEnd((Temporal)null);
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
			case NxcorePackage.NAMED_PERIOD__DURATION:
				return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
			case NxcorePackage.NAMED_PERIOD__START:
				return getStart() != null;
			case NxcorePackage.NAMED_PERIOD__END:
				return getEnd() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Period.class) {
			switch (derivedFeatureID) {
				case NxcorePackage.NAMED_PERIOD__DURATION: return NxcorePackage.PERIOD__DURATION;
				case NxcorePackage.NAMED_PERIOD__START: return NxcorePackage.PERIOD__START;
				case NxcorePackage.NAMED_PERIOD__END: return NxcorePackage.PERIOD__END;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Period.class) {
			switch (baseFeatureID) {
				case NxcorePackage.PERIOD__DURATION: return NxcorePackage.NAMED_PERIOD__DURATION;
				case NxcorePackage.PERIOD__START: return NxcorePackage.NAMED_PERIOD__START;
				case NxcorePackage.PERIOD__END: return NxcorePackage.NAMED_PERIOD__END;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //NamedPeriodImpl
