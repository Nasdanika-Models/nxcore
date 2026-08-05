/**
 */
package org.nasdanika.models.nxcore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.nxcore.NxcoreFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel featureDelegation='Dynamic' complianceLevel='21.0' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface NxcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nxcore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://nxcore.models.nasdanika.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.nxcore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NxcorePackage eINSTANCE = org.nasdanika.models.nxcore.impl.NxcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nxcore.Referrable <em>Referrable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nxcore.Referrable
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getReferrable()
	 * @generated
	 */
	int REFERRABLE = 0;

	/**
	 * The number of structural features of the '<em>Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE___COLLECT__OBJECT_EREFERENCE_ELIST = 0;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE___GET_REFERRERS__EREFERENCE = 1;

	/**
	 * The number of operations of the '<em>Referrable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERRABLE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nxcore.impl.TemporalImpl <em>Temporal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nxcore.impl.TemporalImpl
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getTemporal()
	 * @generated
	 */
	int TEMPORAL = 1;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__BASE = 0;

	/**
	 * The feature id for the '<em><b>Instant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__INSTANT = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__DURATION = 2;

	/**
	 * The feature id for the '<em><b>Lower Bounds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__LOWER_BOUNDS = 3;

	/**
	 * The feature id for the '<em><b>Upper Bounds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__UPPER_BOUNDS = 4;

	/**
	 * The number of structural features of the '<em>Temporal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Temporal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nxcore.impl.PeriodImpl <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nxcore.impl.PeriodImpl
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getPeriod()
	 * @generated
	 */
	int PERIOD = 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__START = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__END = 2;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nxcore.StringIdentity <em>String Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nxcore.StringIdentity
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getStringIdentity()
	 * @generated
	 */
	int STRING_IDENTITY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_IDENTITY__ID = REFERRABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_IDENTITY_FEATURE_COUNT = REFERRABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_IDENTITY___COLLECT__OBJECT_EREFERENCE_ELIST = REFERRABLE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_IDENTITY___GET_REFERRERS__EREFERENCE = REFERRABLE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>String Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_IDENTITY_OPERATION_COUNT = REFERRABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nxcore.impl.StringToStringMapEntryImpl <em>String To String Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nxcore.impl.StringToStringMapEntryImpl
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getStringToStringMapEntry()
	 * @generated
	 */
	int STRING_TO_STRING_MAP_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nxcore.impl.MarkerImpl <em>Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nxcore.impl.MarkerImpl
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getMarker()
	 * @generated
	 */
	int MARKER = 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER__DATE = 3;

	/**
	 * The number of structural features of the '<em>Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nxcore.impl.GitMarkerImpl <em>Git Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nxcore.impl.GitMarkerImpl
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getGitMarker()
	 * @generated
	 */
	int GIT_MARKER = 6;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER__LOCATION = MARKER__LOCATION;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER__POSITION = MARKER__POSITION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER__COMMENT = MARKER__COMMENT;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER__DATE = MARKER__DATE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER__PATH = MARKER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remotes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER__REMOTES = MARKER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER__BRANCH = MARKER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER__HEAD = MARKER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Head Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER__HEAD_REFS = MARKER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Git Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER_FEATURE_COUNT = MARKER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Git Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_MARKER_OPERATION_COUNT = MARKER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nxcore.Marked <em>Marked</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nxcore.Marked
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getMarked()
	 * @generated
	 */
	int MARKED = 7;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED__MARKERS = 0;

	/**
	 * The number of structural features of the '<em>Marked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Marked</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nxcore.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nxcore.impl.ContentImpl
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 8;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Content Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CONTENT_REF = 1;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CONTENT_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nxcore.impl.SectionReferenceImpl <em>Section Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nxcore.impl.SectionReferenceImpl
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getSectionReference()
	 * @generated
	 */
	int SECTION_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_REFERENCE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_REFERENCE__ID = 1;

	/**
	 * The number of structural features of the '<em>Section Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Section Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nxcore.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nxcore.impl.SectionImpl
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TITLE = SECTION_REFERENCE__TITLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ID = SECTION_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CHILDREN = SECTION_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CONTENTS = SECTION_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = SECTION_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = SECTION_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nxcore.Documented <em>Documented</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nxcore.Documented
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getDocumented()
	 * @generated
	 */
	int DOCUMENTED = 11;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED__DOC_REF = 1;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED__DOC_FORMAT = 2;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED__DOC_CONTENTS = 3;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED__DOC_SECTIONS = 4;

	/**
	 * The number of structural features of the '<em>Documented</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Documented</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nxcore.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nxcore.impl.ModelElementImpl
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ID = STRING_IDENTITY__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DOCUMENTATION = STRING_IDENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DOC_REF = STRING_IDENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DOC_FORMAT = STRING_IDENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DOC_CONTENTS = STRING_IDENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DOC_SECTIONS = STRING_IDENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__MARKERS = STRING_IDENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ICON = STRING_IDENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__URIS = STRING_IDENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = STRING_IDENTITY_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST = STRING_IDENTITY___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___GET_REFERRERS__EREFERENCE = STRING_IDENTITY___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = STRING_IDENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nxcore.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nxcore.impl.NamedElementImpl
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DOCUMENTATION = MODEL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DOC_REF = MODEL_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DOC_FORMAT = MODEL_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DOC_CONTENTS = MODEL_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DOC_SECTIONS = MODEL_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__MARKERS = MODEL_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ICON = MODEL_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__URIS = MODEL_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST = MODEL_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___GET_REFERRERS__EREFERENCE = MODEL_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nxcore.impl.NamedPeriodImpl <em>Named Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nxcore.impl.NamedPeriodImpl
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getNamedPeriod()
	 * @generated
	 */
	int NAMED_PERIOD = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__DOCUMENTATION = NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__DOC_REF = NAMED_ELEMENT__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__DOC_FORMAT = NAMED_ELEMENT__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__DOC_CONTENTS = NAMED_ELEMENT__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__DOC_SECTIONS = NAMED_ELEMENT__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__MARKERS = NAMED_ELEMENT__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__ICON = NAMED_ELEMENT__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__URIS = NAMED_ELEMENT__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__DURATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__START = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD__END = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Named Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST = NAMED_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD___GET_REFERRERS__EREFERENCE = NAMED_ELEMENT___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Named Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PERIOD_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nxcore.Evaluator <em>Evaluator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nxcore.Evaluator
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getEvaluator()
	 * @generated
	 */
	int EVALUATOR = 15;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR__DOCUMENTATION = DOCUMENTED__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR__DOC_REF = DOCUMENTED__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR__DOC_FORMAT = DOCUMENTED__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR__DOC_CONTENTS = DOCUMENTED__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR__DOC_SECTIONS = DOCUMENTED__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR__MARKERS = DOCUMENTED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR_FEATURE_COUNT = DOCUMENTED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR___EVALUATE__CLASS_MAP = DOCUMENTED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR___EVALUATE__CLASS = DOCUMENTED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR___EVALUATE__MAP = DOCUMENTED_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR___EVALUATE = DOCUMENTED_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR_OPERATION_COUNT = DOCUMENTED_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nxcore.impl.SourceEvaluatorImpl <em>Source Evaluator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nxcore.impl.SourceEvaluatorImpl
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getSourceEvaluator()
	 * @generated
	 */
	int SOURCE_EVALUATOR = 16;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR__DOCUMENTATION = EVALUATOR__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR__DOC_REF = EVALUATOR__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR__DOC_FORMAT = EVALUATOR__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR__DOC_CONTENTS = EVALUATOR__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR__DOC_SECTIONS = EVALUATOR__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR__MARKERS = EVALUATOR__MARKERS;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR__SCRIPT = EVALUATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR__SCRIPT_REF = EVALUATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Source Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR_FEATURE_COUNT = EVALUATOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR___EVALUATE__CLASS_MAP = EVALUATOR___EVALUATE__CLASS_MAP;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR___EVALUATE__CLASS = EVALUATOR___EVALUATE__CLASS;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR___EVALUATE__MAP = EVALUATOR___EVALUATE__MAP;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR___EVALUATE = EVALUATOR___EVALUATE;

	/**
	 * The number of operations of the '<em>Source Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_EVALUATOR_OPERATION_COUNT = EVALUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nxcore.impl.SpelEvaluatorImpl <em>Spel Evaluator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nxcore.impl.SpelEvaluatorImpl
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getSpelEvaluator()
	 * @generated
	 */
	int SPEL_EVALUATOR = 17;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR__DOCUMENTATION = EVALUATOR__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR__DOC_REF = EVALUATOR__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR__DOC_FORMAT = EVALUATOR__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR__DOC_CONTENTS = EVALUATOR__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR__DOC_SECTIONS = EVALUATOR__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR__MARKERS = EVALUATOR__MARKERS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR__EXPRESSION = EVALUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Spel Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR_FEATURE_COUNT = EVALUATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR___EVALUATE__CLASS_MAP = EVALUATOR___EVALUATE__CLASS_MAP;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR___EVALUATE__CLASS = EVALUATOR___EVALUATE__CLASS;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR___EVALUATE__MAP = EVALUATOR___EVALUATE__MAP;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR___EVALUATE = EVALUATOR___EVALUATE;

	/**
	 * The number of operations of the '<em>Spel Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEL_EVALUATOR_OPERATION_COUNT = EVALUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nxcore.impl.ScriptEvaluatorImpl <em>Script Evaluator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nxcore.impl.ScriptEvaluatorImpl
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getScriptEvaluator()
	 * @generated
	 */
	int SCRIPT_EVALUATOR = 18;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR__DOCUMENTATION = SOURCE_EVALUATOR__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR__DOC_REF = SOURCE_EVALUATOR__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR__DOC_FORMAT = SOURCE_EVALUATOR__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR__DOC_CONTENTS = SOURCE_EVALUATOR__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR__DOC_SECTIONS = SOURCE_EVALUATOR__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR__MARKERS = SOURCE_EVALUATOR__MARKERS;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR__SCRIPT = SOURCE_EVALUATOR__SCRIPT;

	/**
	 * The feature id for the '<em><b>Script Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR__SCRIPT_REF = SOURCE_EVALUATOR__SCRIPT_REF;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR__LANGUAGE = SOURCE_EVALUATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Script Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR_FEATURE_COUNT = SOURCE_EVALUATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR___EVALUATE__CLASS_MAP = SOURCE_EVALUATOR___EVALUATE__CLASS_MAP;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR___EVALUATE__CLASS = SOURCE_EVALUATOR___EVALUATE__CLASS;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR___EVALUATE__MAP = SOURCE_EVALUATOR___EVALUATE__MAP;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR___EVALUATE = SOURCE_EVALUATOR___EVALUATE;

	/**
	 * The number of operations of the '<em>Script Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_EVALUATOR_OPERATION_COUNT = SOURCE_EVALUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.nxcore.impl.GroovyEvaluatorImpl <em>Groovy Evaluator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.nxcore.impl.GroovyEvaluatorImpl
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getGroovyEvaluator()
	 * @generated
	 */
	int GROOVY_EVALUATOR = 19;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR__DOCUMENTATION = SOURCE_EVALUATOR__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR__DOC_REF = SOURCE_EVALUATOR__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR__DOC_FORMAT = SOURCE_EVALUATOR__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR__DOC_CONTENTS = SOURCE_EVALUATOR__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR__DOC_SECTIONS = SOURCE_EVALUATOR__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR__MARKERS = SOURCE_EVALUATOR__MARKERS;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR__SCRIPT = SOURCE_EVALUATOR__SCRIPT;

	/**
	 * The feature id for the '<em><b>Script Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR__SCRIPT_REF = SOURCE_EVALUATOR__SCRIPT_REF;

	/**
	 * The number of structural features of the '<em>Groovy Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR_FEATURE_COUNT = SOURCE_EVALUATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR___EVALUATE__CLASS_MAP = SOURCE_EVALUATOR___EVALUATE__CLASS_MAP;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR___EVALUATE__CLASS = SOURCE_EVALUATOR___EVALUATE__CLASS;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR___EVALUATE__MAP = SOURCE_EVALUATOR___EVALUATE__MAP;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR___EVALUATE = SOURCE_EVALUATOR___EVALUATE;

	/**
	 * The number of operations of the '<em>Groovy Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROOVY_EVALUATOR_OPERATION_COUNT = SOURCE_EVALUATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Instant</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.Instant
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getInstant()
	 * @generated
	 */
	int INSTANT = 20;

	/**
	 * The meta object id for the '<em>Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.Duration
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 21;

	/**
	 * The meta object id for the '<em>Class</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Class
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 22;

	/**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getMap()
	 * @generated
	 */
	int MAP = 23;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 24;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nxcore.Referrable <em>Referrable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referrable</em>'.
	 * @see org.nasdanika.models.nxcore.Referrable
	 * @generated
	 */
	EClass getReferrable();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.nxcore.Referrable#collect(java.lang.Object, org.eclipse.emf.ecore.EReference, org.eclipse.emf.common.util.EList) <em>Collect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect</em>' operation.
	 * @see org.nasdanika.models.nxcore.Referrable#collect(java.lang.Object, org.eclipse.emf.ecore.EReference, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getReferrable__Collect__Object_EReference_EList();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.nxcore.Referrable#getReferrers(org.eclipse.emf.ecore.EReference) <em>Get Referrers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Referrers</em>' operation.
	 * @see org.nasdanika.models.nxcore.Referrable#getReferrers(org.eclipse.emf.ecore.EReference)
	 * @generated
	 */
	EOperation getReferrable__GetReferrers__EReference();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nxcore.Temporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal</em>'.
	 * @see org.nasdanika.models.nxcore.Temporal
	 * @generated
	 */
	EClass getTemporal();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.nxcore.Temporal#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see org.nasdanika.models.nxcore.Temporal#getBase()
	 * @see #getTemporal()
	 * @generated
	 */
	EReference getTemporal_Base();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.Temporal#getInstant <em>Instant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instant</em>'.
	 * @see org.nasdanika.models.nxcore.Temporal#getInstant()
	 * @see #getTemporal()
	 * @generated
	 */
	EAttribute getTemporal_Instant();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.Temporal#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.nasdanika.models.nxcore.Temporal#getDuration()
	 * @see #getTemporal()
	 * @generated
	 */
	EAttribute getTemporal_Duration();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.nxcore.Temporal#getLowerBounds <em>Lower Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lower Bounds</em>'.
	 * @see org.nasdanika.models.nxcore.Temporal#getLowerBounds()
	 * @see #getTemporal()
	 * @generated
	 */
	EReference getTemporal_LowerBounds();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.nxcore.Temporal#getUpperBounds <em>Upper Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Upper Bounds</em>'.
	 * @see org.nasdanika.models.nxcore.Temporal#getUpperBounds()
	 * @see #getTemporal()
	 * @generated
	 */
	EReference getTemporal_UpperBounds();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nxcore.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see org.nasdanika.models.nxcore.Period
	 * @generated
	 */
	EClass getPeriod();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.Period#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.nasdanika.models.nxcore.Period#getDuration()
	 * @see #getPeriod()
	 * @generated
	 */
	EAttribute getPeriod_Duration();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.nxcore.Period#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see org.nasdanika.models.nxcore.Period#getStart()
	 * @see #getPeriod()
	 * @generated
	 */
	EReference getPeriod_Start();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.nxcore.Period#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see org.nasdanika.models.nxcore.Period#getEnd()
	 * @see #getPeriod()
	 * @generated
	 */
	EReference getPeriod_End();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nxcore.StringIdentity <em>String Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Identity</em>'.
	 * @see org.nasdanika.models.nxcore.StringIdentity
	 * @generated
	 */
	EClass getStringIdentity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.StringIdentity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.nxcore.StringIdentity#getId()
	 * @see #getStringIdentity()
	 * @generated
	 */
	EAttribute getStringIdentity_Id();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyUnique="false" keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueUnique="false" valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getStringToStringMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getStringToStringMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getStringToStringMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nxcore.Marker <em>Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marker</em>'.
	 * @see org.nasdanika.models.nxcore.Marker
	 * @generated
	 */
	EClass getMarker();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.Marker#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.nasdanika.models.nxcore.Marker#getLocation()
	 * @see #getMarker()
	 * @generated
	 */
	EAttribute getMarker_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.Marker#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.nasdanika.models.nxcore.Marker#getPosition()
	 * @see #getMarker()
	 * @generated
	 */
	EAttribute getMarker_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.Marker#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.nasdanika.models.nxcore.Marker#getComment()
	 * @see #getMarker()
	 * @generated
	 */
	EAttribute getMarker_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.Marker#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.nasdanika.models.nxcore.Marker#getDate()
	 * @see #getMarker()
	 * @generated
	 */
	EAttribute getMarker_Date();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nxcore.GitMarker <em>Git Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Git Marker</em>'.
	 * @see org.nasdanika.models.nxcore.GitMarker
	 * @generated
	 */
	EClass getGitMarker();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.GitMarker#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.nasdanika.models.nxcore.GitMarker#getPath()
	 * @see #getGitMarker()
	 * @generated
	 */
	EAttribute getGitMarker_Path();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.models.nxcore.GitMarker#getRemotes <em>Remotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Remotes</em>'.
	 * @see org.nasdanika.models.nxcore.GitMarker#getRemotes()
	 * @see #getGitMarker()
	 * @generated
	 */
	EReference getGitMarker_Remotes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.GitMarker#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch</em>'.
	 * @see org.nasdanika.models.nxcore.GitMarker#getBranch()
	 * @see #getGitMarker()
	 * @generated
	 */
	EAttribute getGitMarker_Branch();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.GitMarker#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Head</em>'.
	 * @see org.nasdanika.models.nxcore.GitMarker#getHead()
	 * @see #getGitMarker()
	 * @generated
	 */
	EAttribute getGitMarker_Head();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.nxcore.GitMarker#getHeadRefs <em>Head Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Head Refs</em>'.
	 * @see org.nasdanika.models.nxcore.GitMarker#getHeadRefs()
	 * @see #getGitMarker()
	 * @generated
	 */
	EAttribute getGitMarker_HeadRefs();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nxcore.Marked <em>Marked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marked</em>'.
	 * @see org.nasdanika.models.nxcore.Marked
	 * @generated
	 */
	EClass getMarked();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.nxcore.Marked#getMarkers <em>Markers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Markers</em>'.
	 * @see org.nasdanika.models.nxcore.Marked#getMarkers()
	 * @see #getMarked()
	 * @generated
	 */
	EReference getMarked_Markers();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nxcore.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see org.nasdanika.models.nxcore.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.Content#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.nasdanika.models.nxcore.Content#getContent()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.Content#getContentRef <em>Content Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Ref</em>'.
	 * @see org.nasdanika.models.nxcore.Content#getContentRef()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_ContentRef();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.Content#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see org.nasdanika.models.nxcore.Content#getContentType()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_ContentType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nxcore.SectionReference <em>Section Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Reference</em>'.
	 * @see org.nasdanika.models.nxcore.SectionReference
	 * @generated
	 */
	EClass getSectionReference();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.SectionReference#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.models.nxcore.SectionReference#getTitle()
	 * @see #getSectionReference()
	 * @generated
	 */
	EAttribute getSectionReference_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.SectionReference#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.nxcore.SectionReference#getId()
	 * @see #getSectionReference()
	 * @generated
	 */
	EAttribute getSectionReference_Id();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nxcore.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see org.nasdanika.models.nxcore.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.nxcore.Section#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.models.nxcore.Section#getChildren()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Children();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.nxcore.Section#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see org.nasdanika.models.nxcore.Section#getContents()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Contents();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nxcore.Documented <em>Documented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documented</em>'.
	 * @see org.nasdanika.models.nxcore.Documented
	 * @generated
	 */
	EClass getDocumented();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.Documented#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.nasdanika.models.nxcore.Documented#getDocumentation()
	 * @see #getDocumented()
	 * @generated
	 */
	EAttribute getDocumented_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.Documented#getDocRef <em>Doc Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc Ref</em>'.
	 * @see org.nasdanika.models.nxcore.Documented#getDocRef()
	 * @see #getDocumented()
	 * @generated
	 */
	EAttribute getDocumented_DocRef();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.Documented#getDocFormat <em>Doc Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc Format</em>'.
	 * @see org.nasdanika.models.nxcore.Documented#getDocFormat()
	 * @see #getDocumented()
	 * @generated
	 */
	EAttribute getDocumented_DocFormat();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.nxcore.Documented#getDocContents <em>Doc Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doc Contents</em>'.
	 * @see org.nasdanika.models.nxcore.Documented#getDocContents()
	 * @see #getDocumented()
	 * @generated
	 */
	EReference getDocumented_DocContents();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.nxcore.Documented#getDocSections <em>Doc Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doc Sections</em>'.
	 * @see org.nasdanika.models.nxcore.Documented#getDocSections()
	 * @see #getDocumented()
	 * @generated
	 */
	EReference getDocumented_DocSections();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nxcore.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.nasdanika.models.nxcore.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.ModelElement#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.nasdanika.models.nxcore.ModelElement#getIcon()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Icon();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.nxcore.ModelElement#getUris <em>Uris</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Uris</em>'.
	 * @see org.nasdanika.models.nxcore.ModelElement#getUris()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Uris();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nxcore.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.nasdanika.models.nxcore.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.nxcore.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nxcore.NamedPeriod <em>Named Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Period</em>'.
	 * @see org.nasdanika.models.nxcore.NamedPeriod
	 * @generated
	 */
	EClass getNamedPeriod();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nxcore.Evaluator <em>Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluator</em>'.
	 * @see org.nasdanika.models.nxcore.Evaluator
	 * @generated
	 */
	EClass getEvaluator();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.nxcore.Evaluator#evaluate(java.lang.Class, java.util.Map) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.nasdanika.models.nxcore.Evaluator#evaluate(java.lang.Class, java.util.Map)
	 * @generated
	 */
	EOperation getEvaluator__Evaluate__Class_Map();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.nxcore.Evaluator#evaluate(java.lang.Class) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.nasdanika.models.nxcore.Evaluator#evaluate(java.lang.Class)
	 * @generated
	 */
	EOperation getEvaluator__Evaluate__Class();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.nxcore.Evaluator#evaluate(java.util.Map) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.nasdanika.models.nxcore.Evaluator#evaluate(java.util.Map)
	 * @generated
	 */
	EOperation getEvaluator__Evaluate__Map();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.nxcore.Evaluator#evaluate() <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.nasdanika.models.nxcore.Evaluator#evaluate()
	 * @generated
	 */
	EOperation getEvaluator__Evaluate();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nxcore.SourceEvaluator <em>Source Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Evaluator</em>'.
	 * @see org.nasdanika.models.nxcore.SourceEvaluator
	 * @generated
	 */
	EClass getSourceEvaluator();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.SourceEvaluator#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see org.nasdanika.models.nxcore.SourceEvaluator#getScript()
	 * @see #getSourceEvaluator()
	 * @generated
	 */
	EAttribute getSourceEvaluator_Script();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.SourceEvaluator#getScriptRef <em>Script Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Ref</em>'.
	 * @see org.nasdanika.models.nxcore.SourceEvaluator#getScriptRef()
	 * @see #getSourceEvaluator()
	 * @generated
	 */
	EAttribute getSourceEvaluator_ScriptRef();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nxcore.SpelEvaluator <em>Spel Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spel Evaluator</em>'.
	 * @see org.nasdanika.models.nxcore.SpelEvaluator
	 * @generated
	 */
	EClass getSpelEvaluator();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.SpelEvaluator#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.nasdanika.models.nxcore.SpelEvaluator#getExpression()
	 * @see #getSpelEvaluator()
	 * @generated
	 */
	EAttribute getSpelEvaluator_Expression();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nxcore.ScriptEvaluator <em>Script Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Evaluator</em>'.
	 * @see org.nasdanika.models.nxcore.ScriptEvaluator
	 * @generated
	 */
	EClass getScriptEvaluator();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.nxcore.ScriptEvaluator#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.nasdanika.models.nxcore.ScriptEvaluator#getLanguage()
	 * @see #getScriptEvaluator()
	 * @generated
	 */
	EAttribute getScriptEvaluator_Language();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.nxcore.GroovyEvaluator <em>Groovy Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Groovy Evaluator</em>'.
	 * @see org.nasdanika.models.nxcore.GroovyEvaluator
	 * @generated
	 */
	EClass getGroovyEvaluator();

	/**
	 * Returns the meta object for data type '{@link java.time.Instant <em>Instant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Instant</em>'.
	 * @see java.time.Instant
	 * @model instanceClass="java.time.Instant"
	 * @generated
	 */
	EDataType getInstant();

	/**
	 * Returns the meta object for data type '{@link java.time.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Duration</em>'.
	 * @see java.time.Duration
	 * @model instanceClass="java.time.Duration"
	 * @generated
	 */
	EDataType getDuration();

	/**
	 * Returns the meta object for data type '{@link java.lang.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class</em>'.
	 * @see java.lang.Class
	 * @model instanceClass="java.lang.Class" typeParameters="T"
	 * @generated
	 */
	EDataType getClass_();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" typeParameters="K V"
	 * @generated
	 */
	EDataType getMap();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NxcoreFactory getNxcoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nxcore.Referrable <em>Referrable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nxcore.Referrable
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getReferrable()
		 * @generated
		 */
		EClass REFERRABLE = eINSTANCE.getReferrable();

		/**
		 * The meta object literal for the '<em><b>Collect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFERRABLE___COLLECT__OBJECT_EREFERENCE_ELIST = eINSTANCE.getReferrable__Collect__Object_EReference_EList();

		/**
		 * The meta object literal for the '<em><b>Get Referrers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFERRABLE___GET_REFERRERS__EREFERENCE = eINSTANCE.getReferrable__GetReferrers__EReference();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nxcore.impl.TemporalImpl <em>Temporal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nxcore.impl.TemporalImpl
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getTemporal()
		 * @generated
		 */
		EClass TEMPORAL = eINSTANCE.getTemporal();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL__BASE = eINSTANCE.getTemporal_Base();

		/**
		 * The meta object literal for the '<em><b>Instant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL__INSTANT = eINSTANCE.getTemporal_Instant();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL__DURATION = eINSTANCE.getTemporal_Duration();

		/**
		 * The meta object literal for the '<em><b>Lower Bounds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL__LOWER_BOUNDS = eINSTANCE.getTemporal_LowerBounds();

		/**
		 * The meta object literal for the '<em><b>Upper Bounds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL__UPPER_BOUNDS = eINSTANCE.getTemporal_UpperBounds();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nxcore.impl.PeriodImpl <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nxcore.impl.PeriodImpl
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getPeriod()
		 * @generated
		 */
		EClass PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD__DURATION = eINSTANCE.getPeriod_Duration();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIOD__START = eINSTANCE.getPeriod_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIOD__END = eINSTANCE.getPeriod_End();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nxcore.StringIdentity <em>String Identity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nxcore.StringIdentity
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getStringIdentity()
		 * @generated
		 */
		EClass STRING_IDENTITY = eINSTANCE.getStringIdentity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_IDENTITY__ID = eINSTANCE.getStringIdentity_Id();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nxcore.impl.StringToStringMapEntryImpl <em>String To String Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nxcore.impl.StringToStringMapEntryImpl
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getStringToStringMapEntry()
		 * @generated
		 */
		EClass STRING_TO_STRING_MAP_ENTRY = eINSTANCE.getStringToStringMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP_ENTRY__KEY = eINSTANCE.getStringToStringMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP_ENTRY__VALUE = eINSTANCE.getStringToStringMapEntry_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nxcore.impl.MarkerImpl <em>Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nxcore.impl.MarkerImpl
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getMarker()
		 * @generated
		 */
		EClass MARKER = eINSTANCE.getMarker();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER__LOCATION = eINSTANCE.getMarker_Location();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER__POSITION = eINSTANCE.getMarker_Position();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER__COMMENT = eINSTANCE.getMarker_Comment();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKER__DATE = eINSTANCE.getMarker_Date();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nxcore.impl.GitMarkerImpl <em>Git Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nxcore.impl.GitMarkerImpl
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getGitMarker()
		 * @generated
		 */
		EClass GIT_MARKER = eINSTANCE.getGitMarker();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_MARKER__PATH = eINSTANCE.getGitMarker_Path();

		/**
		 * The meta object literal for the '<em><b>Remotes</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIT_MARKER__REMOTES = eINSTANCE.getGitMarker_Remotes();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_MARKER__BRANCH = eINSTANCE.getGitMarker_Branch();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_MARKER__HEAD = eINSTANCE.getGitMarker_Head();

		/**
		 * The meta object literal for the '<em><b>Head Refs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_MARKER__HEAD_REFS = eINSTANCE.getGitMarker_HeadRefs();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nxcore.Marked <em>Marked</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nxcore.Marked
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getMarked()
		 * @generated
		 */
		EClass MARKED = eINSTANCE.getMarked();

		/**
		 * The meta object literal for the '<em><b>Markers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKED__MARKERS = eINSTANCE.getMarked_Markers();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nxcore.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nxcore.impl.ContentImpl
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__CONTENT = eINSTANCE.getContent_Content();

		/**
		 * The meta object literal for the '<em><b>Content Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__CONTENT_REF = eINSTANCE.getContent_ContentRef();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__CONTENT_TYPE = eINSTANCE.getContent_ContentType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nxcore.impl.SectionReferenceImpl <em>Section Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nxcore.impl.SectionReferenceImpl
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getSectionReference()
		 * @generated
		 */
		EClass SECTION_REFERENCE = eINSTANCE.getSectionReference();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_REFERENCE__TITLE = eINSTANCE.getSectionReference_Title();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_REFERENCE__ID = eINSTANCE.getSectionReference_Id();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nxcore.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nxcore.impl.SectionImpl
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__CHILDREN = eINSTANCE.getSection_Children();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__CONTENTS = eINSTANCE.getSection_Contents();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nxcore.Documented <em>Documented</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nxcore.Documented
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getDocumented()
		 * @generated
		 */
		EClass DOCUMENTED = eINSTANCE.getDocumented();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTED__DOCUMENTATION = eINSTANCE.getDocumented_Documentation();

		/**
		 * The meta object literal for the '<em><b>Doc Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTED__DOC_REF = eINSTANCE.getDocumented_DocRef();

		/**
		 * The meta object literal for the '<em><b>Doc Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTED__DOC_FORMAT = eINSTANCE.getDocumented_DocFormat();

		/**
		 * The meta object literal for the '<em><b>Doc Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTED__DOC_CONTENTS = eINSTANCE.getDocumented_DocContents();

		/**
		 * The meta object literal for the '<em><b>Doc Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTED__DOC_SECTIONS = eINSTANCE.getDocumented_DocSections();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nxcore.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nxcore.impl.ModelElementImpl
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__ICON = eINSTANCE.getModelElement_Icon();

		/**
		 * The meta object literal for the '<em><b>Uris</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__URIS = eINSTANCE.getModelElement_Uris();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nxcore.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nxcore.impl.NamedElementImpl
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nxcore.impl.NamedPeriodImpl <em>Named Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nxcore.impl.NamedPeriodImpl
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getNamedPeriod()
		 * @generated
		 */
		EClass NAMED_PERIOD = eINSTANCE.getNamedPeriod();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nxcore.Evaluator <em>Evaluator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nxcore.Evaluator
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getEvaluator()
		 * @generated
		 */
		EClass EVALUATOR = eINSTANCE.getEvaluator();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVALUATOR___EVALUATE__CLASS_MAP = eINSTANCE.getEvaluator__Evaluate__Class_Map();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVALUATOR___EVALUATE__CLASS = eINSTANCE.getEvaluator__Evaluate__Class();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVALUATOR___EVALUATE__MAP = eINSTANCE.getEvaluator__Evaluate__Map();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVALUATOR___EVALUATE = eINSTANCE.getEvaluator__Evaluate();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nxcore.impl.SourceEvaluatorImpl <em>Source Evaluator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nxcore.impl.SourceEvaluatorImpl
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getSourceEvaluator()
		 * @generated
		 */
		EClass SOURCE_EVALUATOR = eINSTANCE.getSourceEvaluator();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_EVALUATOR__SCRIPT = eINSTANCE.getSourceEvaluator_Script();

		/**
		 * The meta object literal for the '<em><b>Script Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_EVALUATOR__SCRIPT_REF = eINSTANCE.getSourceEvaluator_ScriptRef();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nxcore.impl.SpelEvaluatorImpl <em>Spel Evaluator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nxcore.impl.SpelEvaluatorImpl
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getSpelEvaluator()
		 * @generated
		 */
		EClass SPEL_EVALUATOR = eINSTANCE.getSpelEvaluator();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEL_EVALUATOR__EXPRESSION = eINSTANCE.getSpelEvaluator_Expression();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nxcore.impl.ScriptEvaluatorImpl <em>Script Evaluator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nxcore.impl.ScriptEvaluatorImpl
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getScriptEvaluator()
		 * @generated
		 */
		EClass SCRIPT_EVALUATOR = eINSTANCE.getScriptEvaluator();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_EVALUATOR__LANGUAGE = eINSTANCE.getScriptEvaluator_Language();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.nxcore.impl.GroovyEvaluatorImpl <em>Groovy Evaluator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.nxcore.impl.GroovyEvaluatorImpl
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getGroovyEvaluator()
		 * @generated
		 */
		EClass GROOVY_EVALUATOR = eINSTANCE.getGroovyEvaluator();

		/**
		 * The meta object literal for the '<em>Instant</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.Instant
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getInstant()
		 * @generated
		 */
		EDataType INSTANT = eINSTANCE.getInstant();

		/**
		 * The meta object literal for the '<em>Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.Duration
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getDuration()
		 * @generated
		 */
		EDataType DURATION = eINSTANCE.getDuration();

		/**
		 * The meta object literal for the '<em>Class</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Class
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getClass_()
		 * @generated
		 */
		EDataType CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getMap()
		 * @generated
		 */
		EDataType MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.nasdanika.models.nxcore.impl.NxcorePackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

	}

} //NxcorePackage
