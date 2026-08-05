/**
 */
package org.nasdanika.models.nxcore.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.nxcore.Content;
import org.nasdanika.models.nxcore.Marked;
import org.nasdanika.models.nxcore.Marker;
import org.nasdanika.models.nxcore.NxcorePackage;
import org.nasdanika.models.nxcore.Section;
import org.nasdanika.models.nxcore.SourceEvaluator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Evaluator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.nxcore.impl.SourceEvaluatorImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.impl.SourceEvaluatorImpl#getDocRef <em>Doc Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.impl.SourceEvaluatorImpl#getDocFormat <em>Doc Format</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.impl.SourceEvaluatorImpl#getDocContents <em>Doc Contents</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.impl.SourceEvaluatorImpl#getDocSections <em>Doc Sections</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.impl.SourceEvaluatorImpl#getMarkers <em>Markers</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.impl.SourceEvaluatorImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.nasdanika.models.nxcore.impl.SourceEvaluatorImpl#getScriptRef <em>Script Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SourceEvaluatorImpl extends MinimalEObjectImpl.Container implements SourceEvaluator {
	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDocRef() <em>Doc Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocRef()
	 * @generated
	 * @ordered
	 */
	protected static final String DOC_REF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDocFormat() <em>Doc Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DOC_FORMAT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getScriptRef() <em>Script Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptRef()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_REF_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceEvaluatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NxcorePackage.Literals.SOURCE_EVALUATOR;
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
	public String getDocumentation() {
		return (String)eDynamicGet(NxcorePackage.SOURCE_EVALUATOR__DOCUMENTATION, NxcorePackage.Literals.DOCUMENTED__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentation(String newDocumentation) {
		eDynamicSet(NxcorePackage.SOURCE_EVALUATOR__DOCUMENTATION, NxcorePackage.Literals.DOCUMENTED__DOCUMENTATION, newDocumentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocRef() {
		return (String)eDynamicGet(NxcorePackage.SOURCE_EVALUATOR__DOC_REF, NxcorePackage.Literals.DOCUMENTED__DOC_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocRef(String newDocRef) {
		eDynamicSet(NxcorePackage.SOURCE_EVALUATOR__DOC_REF, NxcorePackage.Literals.DOCUMENTED__DOC_REF, newDocRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocFormat() {
		return (String)eDynamicGet(NxcorePackage.SOURCE_EVALUATOR__DOC_FORMAT, NxcorePackage.Literals.DOCUMENTED__DOC_FORMAT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocFormat(String newDocFormat) {
		eDynamicSet(NxcorePackage.SOURCE_EVALUATOR__DOC_FORMAT, NxcorePackage.Literals.DOCUMENTED__DOC_FORMAT, newDocFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Content> getDocContents() {
		return (EList<Content>)eDynamicGet(NxcorePackage.SOURCE_EVALUATOR__DOC_CONTENTS, NxcorePackage.Literals.DOCUMENTED__DOC_CONTENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Section> getDocSections() {
		return (EList<Section>)eDynamicGet(NxcorePackage.SOURCE_EVALUATOR__DOC_SECTIONS, NxcorePackage.Literals.DOCUMENTED__DOC_SECTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Marker> getMarkers() {
		return (EList<Marker>)eDynamicGet(NxcorePackage.SOURCE_EVALUATOR__MARKERS, NxcorePackage.Literals.MARKED__MARKERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScript() {
		return (String)eDynamicGet(NxcorePackage.SOURCE_EVALUATOR__SCRIPT, NxcorePackage.Literals.SOURCE_EVALUATOR__SCRIPT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScript(String newScript) {
		eDynamicSet(NxcorePackage.SOURCE_EVALUATOR__SCRIPT, NxcorePackage.Literals.SOURCE_EVALUATOR__SCRIPT, newScript);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScriptRef() {
		return (String)eDynamicGet(NxcorePackage.SOURCE_EVALUATOR__SCRIPT_REF, NxcorePackage.Literals.SOURCE_EVALUATOR__SCRIPT_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScriptRef(String newScriptRef) {
		eDynamicSet(NxcorePackage.SOURCE_EVALUATOR__SCRIPT_REF, NxcorePackage.Literals.SOURCE_EVALUATOR__SCRIPT_REF, newScriptRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T> T evaluate(Class<T> resultType, Map<String, Object> bindings) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T> T evaluate(final Class<T> resultType) {
		return this.<T>evaluate(resultType, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object evaluate(final Map<String, Object> bindings) {
		return this.<Object>evaluate(null, bindings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object evaluate() {
		return this.<Object>evaluate(null, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NxcorePackage.SOURCE_EVALUATOR__DOC_CONTENTS:
				return ((InternalEList<?>)getDocContents()).basicRemove(otherEnd, msgs);
			case NxcorePackage.SOURCE_EVALUATOR__DOC_SECTIONS:
				return ((InternalEList<?>)getDocSections()).basicRemove(otherEnd, msgs);
			case NxcorePackage.SOURCE_EVALUATOR__MARKERS:
				return ((InternalEList<?>)getMarkers()).basicRemove(otherEnd, msgs);
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
			case NxcorePackage.SOURCE_EVALUATOR__DOCUMENTATION:
				return getDocumentation();
			case NxcorePackage.SOURCE_EVALUATOR__DOC_REF:
				return getDocRef();
			case NxcorePackage.SOURCE_EVALUATOR__DOC_FORMAT:
				return getDocFormat();
			case NxcorePackage.SOURCE_EVALUATOR__DOC_CONTENTS:
				return getDocContents();
			case NxcorePackage.SOURCE_EVALUATOR__DOC_SECTIONS:
				return getDocSections();
			case NxcorePackage.SOURCE_EVALUATOR__MARKERS:
				return getMarkers();
			case NxcorePackage.SOURCE_EVALUATOR__SCRIPT:
				return getScript();
			case NxcorePackage.SOURCE_EVALUATOR__SCRIPT_REF:
				return getScriptRef();
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
			case NxcorePackage.SOURCE_EVALUATOR__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case NxcorePackage.SOURCE_EVALUATOR__DOC_REF:
				setDocRef((String)newValue);
				return;
			case NxcorePackage.SOURCE_EVALUATOR__DOC_FORMAT:
				setDocFormat((String)newValue);
				return;
			case NxcorePackage.SOURCE_EVALUATOR__DOC_CONTENTS:
				getDocContents().clear();
				getDocContents().addAll((Collection<? extends Content>)newValue);
				return;
			case NxcorePackage.SOURCE_EVALUATOR__DOC_SECTIONS:
				getDocSections().clear();
				getDocSections().addAll((Collection<? extends Section>)newValue);
				return;
			case NxcorePackage.SOURCE_EVALUATOR__MARKERS:
				getMarkers().clear();
				getMarkers().addAll((Collection<? extends Marker>)newValue);
				return;
			case NxcorePackage.SOURCE_EVALUATOR__SCRIPT:
				setScript((String)newValue);
				return;
			case NxcorePackage.SOURCE_EVALUATOR__SCRIPT_REF:
				setScriptRef((String)newValue);
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
			case NxcorePackage.SOURCE_EVALUATOR__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case NxcorePackage.SOURCE_EVALUATOR__DOC_REF:
				setDocRef(DOC_REF_EDEFAULT);
				return;
			case NxcorePackage.SOURCE_EVALUATOR__DOC_FORMAT:
				setDocFormat(DOC_FORMAT_EDEFAULT);
				return;
			case NxcorePackage.SOURCE_EVALUATOR__DOC_CONTENTS:
				getDocContents().clear();
				return;
			case NxcorePackage.SOURCE_EVALUATOR__DOC_SECTIONS:
				getDocSections().clear();
				return;
			case NxcorePackage.SOURCE_EVALUATOR__MARKERS:
				getMarkers().clear();
				return;
			case NxcorePackage.SOURCE_EVALUATOR__SCRIPT:
				setScript(SCRIPT_EDEFAULT);
				return;
			case NxcorePackage.SOURCE_EVALUATOR__SCRIPT_REF:
				setScriptRef(SCRIPT_REF_EDEFAULT);
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
			case NxcorePackage.SOURCE_EVALUATOR__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? getDocumentation() != null : !DOCUMENTATION_EDEFAULT.equals(getDocumentation());
			case NxcorePackage.SOURCE_EVALUATOR__DOC_REF:
				return DOC_REF_EDEFAULT == null ? getDocRef() != null : !DOC_REF_EDEFAULT.equals(getDocRef());
			case NxcorePackage.SOURCE_EVALUATOR__DOC_FORMAT:
				return DOC_FORMAT_EDEFAULT == null ? getDocFormat() != null : !DOC_FORMAT_EDEFAULT.equals(getDocFormat());
			case NxcorePackage.SOURCE_EVALUATOR__DOC_CONTENTS:
				return !getDocContents().isEmpty();
			case NxcorePackage.SOURCE_EVALUATOR__DOC_SECTIONS:
				return !getDocSections().isEmpty();
			case NxcorePackage.SOURCE_EVALUATOR__MARKERS:
				return !getMarkers().isEmpty();
			case NxcorePackage.SOURCE_EVALUATOR__SCRIPT:
				return SCRIPT_EDEFAULT == null ? getScript() != null : !SCRIPT_EDEFAULT.equals(getScript());
			case NxcorePackage.SOURCE_EVALUATOR__SCRIPT_REF:
				return SCRIPT_REF_EDEFAULT == null ? getScriptRef() != null : !SCRIPT_REF_EDEFAULT.equals(getScriptRef());
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
		if (baseClass == Marked.class) {
			switch (derivedFeatureID) {
				case NxcorePackage.SOURCE_EVALUATOR__MARKERS: return NxcorePackage.MARKED__MARKERS;
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
		if (baseClass == Marked.class) {
			switch (baseFeatureID) {
				case NxcorePackage.MARKED__MARKERS: return NxcorePackage.SOURCE_EVALUATOR__MARKERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings({"rawtypes", "unchecked" })
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case NxcorePackage.SOURCE_EVALUATOR___EVALUATE__CLASS_MAP:
				return evaluate((Class)arguments.get(0), (Map<String, Object>)arguments.get(1));
			case NxcorePackage.SOURCE_EVALUATOR___EVALUATE__CLASS:
				return evaluate((Class)arguments.get(0));
			case NxcorePackage.SOURCE_EVALUATOR___EVALUATE__MAP:
				return evaluate((Map<String, Object>)arguments.get(0));
			case NxcorePackage.SOURCE_EVALUATOR___EVALUATE:
				return evaluate();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SourceEvaluatorImpl
