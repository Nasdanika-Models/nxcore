/**
 */
package org.nasdanika.models.nxcore.impl;

import java.time.Duration;
import java.time.Instant;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.nxcore.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NxcoreFactoryImpl extends EFactoryImpl implements NxcoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NxcoreFactory init() {
		try {
			NxcoreFactory theNxcoreFactory = (NxcoreFactory)EPackage.Registry.INSTANCE.getEFactory(NxcorePackage.eNS_URI);
			if (theNxcoreFactory != null) {
				return theNxcoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NxcoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NxcoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NxcorePackage.TEMPORAL: return createTemporal();
			case NxcorePackage.PERIOD: return createPeriod();
			case NxcorePackage.STRING_TO_STRING_MAP_ENTRY: return (EObject)createStringToStringMapEntry();
			case NxcorePackage.MARKER: return createMarker();
			case NxcorePackage.GIT_MARKER: return createGitMarker();
			case NxcorePackage.CONTENT: return createContent();
			case NxcorePackage.SECTION_REFERENCE: return createSectionReference();
			case NxcorePackage.SECTION: return createSection();
			case NxcorePackage.SPEL_EVALUATOR: return createSpelEvaluator();
			case NxcorePackage.SCRIPT_EVALUATOR: return createScriptEvaluator();
			case NxcorePackage.GROOVY_EVALUATOR: return createGroovyEvaluator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case NxcorePackage.INSTANT:
				return createInstantFromString(eDataType, initialValue);
			case NxcorePackage.DURATION:
				return createDurationFromString(eDataType, initialValue);
			case NxcorePackage.CLASS:
				return createClassFromString(eDataType, initialValue);
			case NxcorePackage.MAP:
				return createMapFromString(eDataType, initialValue);
			case NxcorePackage.OBJECT:
				return createObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case NxcorePackage.INSTANT:
				return convertInstantToString(eDataType, instanceValue);
			case NxcorePackage.DURATION:
				return convertDurationToString(eDataType, instanceValue);
			case NxcorePackage.CLASS:
				return convertClassToString(eDataType, instanceValue);
			case NxcorePackage.MAP:
				return convertMapToString(eDataType, instanceValue);
			case NxcorePackage.OBJECT:
				return convertObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal createTemporal() {
		TemporalImpl temporal = new TemporalImpl();
		return temporal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Period createPeriod() {
		PeriodImpl period = new PeriodImpl();
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createStringToStringMapEntry() {
		StringToStringMapEntryImpl stringToStringMapEntry = new StringToStringMapEntryImpl();
		return stringToStringMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Marker createMarker() {
		MarkerImpl marker = new MarkerImpl();
		return marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GitMarker createGitMarker() {
		GitMarkerImpl gitMarker = new GitMarkerImpl();
		return gitMarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Content createContent() {
		ContentImpl content = new ContentImpl();
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SectionReference createSectionReference() {
		SectionReferenceImpl sectionReference = new SectionReferenceImpl();
		return sectionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpelEvaluator createSpelEvaluator() {
		SpelEvaluatorImpl spelEvaluator = new SpelEvaluatorImpl();
		return spelEvaluator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScriptEvaluator createScriptEvaluator() {
		ScriptEvaluatorImpl scriptEvaluator = new ScriptEvaluatorImpl();
		return scriptEvaluator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroovyEvaluator createGroovyEvaluator() {
		GroovyEvaluatorImpl groovyEvaluator = new GroovyEvaluatorImpl();
		return groovyEvaluator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant createInstantFromString(EDataType eDataType, String initialValue) {
		return (Instant)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstantToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDurationFromString(EDataType eDataType, String initialValue) {
		return (Duration)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> createClassFromString(EDataType eDataType, String initialValue) {
		return (Class<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<?, ?> createMapFromString(EDataType eDataType, String initialValue) {
		return (Map<?, ?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createObjectFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NxcorePackage getNxcorePackage() {
		return (NxcorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NxcorePackage getPackage() {
		return NxcorePackage.eINSTANCE;
	}

} //NxcoreFactoryImpl
