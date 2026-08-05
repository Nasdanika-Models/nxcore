/**
 */
package org.nasdanika.models.nxcore.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.nxcore.GitMarker;
import org.nasdanika.models.nxcore.NxcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Git Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.nxcore.impl.GitMarkerImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.impl.GitMarkerImpl#getRemotes <em>Remotes</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.impl.GitMarkerImpl#getBranch <em>Branch</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.impl.GitMarkerImpl#getHead <em>Head</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.impl.GitMarkerImpl#getHeadRefs <em>Head Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GitMarkerImpl extends MinimalEObjectImpl.Container implements GitMarker {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBranch() <em>Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranch()
	 * @generated
	 * @ordered
	 */
	protected static final String BRANCH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHead() <em>Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHead()
	 * @generated
	 * @ordered
	 */
	protected static final String HEAD_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GitMarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NxcorePackage.Literals.GIT_MARKER;
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
	public String getPath() {
		return (String)eDynamicGet(NxcorePackage.GIT_MARKER__PATH, NxcorePackage.Literals.GIT_MARKER__PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		eDynamicSet(NxcorePackage.GIT_MARKER__PATH, NxcorePackage.Literals.GIT_MARKER__PATH, newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, String> getRemotes() {
		return (EMap<String, String>)eDynamicGet(NxcorePackage.GIT_MARKER__REMOTES, NxcorePackage.Literals.GIT_MARKER__REMOTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBranch() {
		return (String)eDynamicGet(NxcorePackage.GIT_MARKER__BRANCH, NxcorePackage.Literals.GIT_MARKER__BRANCH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBranch(String newBranch) {
		eDynamicSet(NxcorePackage.GIT_MARKER__BRANCH, NxcorePackage.Literals.GIT_MARKER__BRANCH, newBranch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHead() {
		return (String)eDynamicGet(NxcorePackage.GIT_MARKER__HEAD, NxcorePackage.Literals.GIT_MARKER__HEAD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHead(String newHead) {
		eDynamicSet(NxcorePackage.GIT_MARKER__HEAD, NxcorePackage.Literals.GIT_MARKER__HEAD, newHead);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getHeadRefs() {
		return (EList<String>)eDynamicGet(NxcorePackage.GIT_MARKER__HEAD_REFS, NxcorePackage.Literals.GIT_MARKER__HEAD_REFS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NxcorePackage.GIT_MARKER__REMOTES:
				return ((InternalEList<?>)getRemotes()).basicRemove(otherEnd, msgs);
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
			case NxcorePackage.GIT_MARKER__PATH:
				return getPath();
			case NxcorePackage.GIT_MARKER__REMOTES:
				if (coreType) return getRemotes();
				else return getRemotes().map();
			case NxcorePackage.GIT_MARKER__BRANCH:
				return getBranch();
			case NxcorePackage.GIT_MARKER__HEAD:
				return getHead();
			case NxcorePackage.GIT_MARKER__HEAD_REFS:
				return getHeadRefs();
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
			case NxcorePackage.GIT_MARKER__PATH:
				setPath((String)newValue);
				return;
			case NxcorePackage.GIT_MARKER__REMOTES:
				((EStructuralFeature.Setting)getRemotes()).set(newValue);
				return;
			case NxcorePackage.GIT_MARKER__BRANCH:
				setBranch((String)newValue);
				return;
			case NxcorePackage.GIT_MARKER__HEAD:
				setHead((String)newValue);
				return;
			case NxcorePackage.GIT_MARKER__HEAD_REFS:
				getHeadRefs().clear();
				getHeadRefs().addAll((Collection<? extends String>)newValue);
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
			case NxcorePackage.GIT_MARKER__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case NxcorePackage.GIT_MARKER__REMOTES:
				getRemotes().clear();
				return;
			case NxcorePackage.GIT_MARKER__BRANCH:
				setBranch(BRANCH_EDEFAULT);
				return;
			case NxcorePackage.GIT_MARKER__HEAD:
				setHead(HEAD_EDEFAULT);
				return;
			case NxcorePackage.GIT_MARKER__HEAD_REFS:
				getHeadRefs().clear();
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
			case NxcorePackage.GIT_MARKER__PATH:
				return PATH_EDEFAULT == null ? getPath() != null : !PATH_EDEFAULT.equals(getPath());
			case NxcorePackage.GIT_MARKER__REMOTES:
				return !getRemotes().isEmpty();
			case NxcorePackage.GIT_MARKER__BRANCH:
				return BRANCH_EDEFAULT == null ? getBranch() != null : !BRANCH_EDEFAULT.equals(getBranch());
			case NxcorePackage.GIT_MARKER__HEAD:
				return HEAD_EDEFAULT == null ? getHead() != null : !HEAD_EDEFAULT.equals(getHead());
			case NxcorePackage.GIT_MARKER__HEAD_REFS:
				return !getHeadRefs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GitMarkerImpl
