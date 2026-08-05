/**
 */
package org.nasdanika.models.nxcore.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.nxcore.Content;
import org.nasdanika.models.nxcore.NxcorePackage;
import org.nasdanika.models.nxcore.Section;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.nxcore.impl.SectionImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.impl.SectionImpl#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends SectionReferenceImpl implements Section {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NxcorePackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Section> getChildren() {
		return (EList<Section>)eDynamicGet(NxcorePackage.SECTION__CHILDREN, NxcorePackage.Literals.SECTION__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Content> getContents() {
		return (EList<Content>)eDynamicGet(NxcorePackage.SECTION__CONTENTS, NxcorePackage.Literals.SECTION__CONTENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NxcorePackage.SECTION__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case NxcorePackage.SECTION__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
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
			case NxcorePackage.SECTION__CHILDREN:
				return getChildren();
			case NxcorePackage.SECTION__CONTENTS:
				return getContents();
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
			case NxcorePackage.SECTION__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Section>)newValue);
				return;
			case NxcorePackage.SECTION__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends Content>)newValue);
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
			case NxcorePackage.SECTION__CHILDREN:
				getChildren().clear();
				return;
			case NxcorePackage.SECTION__CONTENTS:
				getContents().clear();
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
			case NxcorePackage.SECTION__CHILDREN:
				return !getChildren().isEmpty();
			case NxcorePackage.SECTION__CONTENTS:
				return !getContents().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SectionImpl
