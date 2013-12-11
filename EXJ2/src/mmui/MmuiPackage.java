/**
 */
package mmui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see mmui.MmuiFactory
 * @model kind="package"
 * @generated
 */
public interface MmuiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mmui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "IMSE";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "IMSE";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MmuiPackage eINSTANCE = mmui.impl.MmuiPackageImpl.init();

	/**
	 * The meta object id for the '{@link mmui.impl.ElementUIImpl <em>Element UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmui.impl.ElementUIImpl
	 * @see mmui.impl.MmuiPackageImpl#getElementUI()
	 * @generated
	 */
	int ELEMENT_UI = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_UI__NEXT = 0;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_UI__QUESTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_UI__ID = 2;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_UI__OPTIONS = 3;

	/**
	 * The number of structural features of the '<em>Element UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_UI_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Element UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_UI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmui.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmui.impl.CheckBoxImpl
	 * @see mmui.impl.MmuiPackageImpl#getCheckBox()
	 * @generated
	 */
	int CHECK_BOX = 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__NEXT = ELEMENT_UI__NEXT;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__QUESTION = ELEMENT_UI__QUESTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__ID = ELEMENT_UI__ID;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__OPTIONS = ELEMENT_UI__OPTIONS;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = ELEMENT_UI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_OPERATION_COUNT = ELEMENT_UI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmui.impl.RadioImpl <em>Radio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmui.impl.RadioImpl
	 * @see mmui.impl.MmuiPackageImpl#getRadio()
	 * @generated
	 */
	int RADIO = 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO__NEXT = ELEMENT_UI__NEXT;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO__QUESTION = ELEMENT_UI__QUESTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO__ID = ELEMENT_UI__ID;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO__OPTIONS = ELEMENT_UI__OPTIONS;

	/**
	 * The number of structural features of the '<em>Radio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_FEATURE_COUNT = ELEMENT_UI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Radio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_OPERATION_COUNT = ELEMENT_UI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmui.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmui.impl.TextImpl
	 * @see mmui.impl.MmuiPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 3;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NEXT = ELEMENT_UI__NEXT;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__QUESTION = ELEMENT_UI__QUESTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ID = ELEMENT_UI__ID;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__OPTIONS = ELEMENT_UI__OPTIONS;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = ELEMENT_UI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = ELEMENT_UI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmui.impl.TextAreaImpl <em>Text Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmui.impl.TextAreaImpl
	 * @see mmui.impl.MmuiPackageImpl#getTextArea()
	 * @generated
	 */
	int TEXT_AREA = 4;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__NEXT = ELEMENT_UI__NEXT;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__QUESTION = ELEMENT_UI__QUESTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__ID = ELEMENT_UI__ID;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__OPTIONS = ELEMENT_UI__OPTIONS;

	/**
	 * The number of structural features of the '<em>Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FEATURE_COUNT = ELEMENT_UI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_OPERATION_COUNT = ELEMENT_UI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmui.impl.DropDownImpl <em>Drop Down</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmui.impl.DropDownImpl
	 * @see mmui.impl.MmuiPackageImpl#getDropDown()
	 * @generated
	 */
	int DROP_DOWN = 5;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN__NEXT = ELEMENT_UI__NEXT;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN__QUESTION = ELEMENT_UI__QUESTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN__ID = ELEMENT_UI__ID;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN__OPTIONS = ELEMENT_UI__OPTIONS;

	/**
	 * The number of structural features of the '<em>Drop Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_FEATURE_COUNT = ELEMENT_UI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Drop Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_OPERATION_COUNT = ELEMENT_UI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmui.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmui.impl.OptionImpl
	 * @see mmui.impl.MmuiPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mmui.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmui.impl.LayoutImpl
	 * @see mmui.impl.MmuiPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 7;

	/**
	 * The feature id for the '<em><b>First Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__FIRST_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Liste Element UI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__LISTE_ELEMENT_UI = 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NEXT = 2;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link mmui.impl.EnsembleQuestionsImpl <em>Ensemble Questions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmui.impl.EnsembleQuestionsImpl
	 * @see mmui.impl.MmuiPackageImpl#getEnsembleQuestions()
	 * @generated
	 */
	int ENSEMBLE_QUESTIONS = 8;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLE_QUESTIONS__NEXT = ELEMENT_UI__NEXT;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLE_QUESTIONS__QUESTION = ELEMENT_UI__QUESTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLE_QUESTIONS__ID = ELEMENT_UI__ID;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLE_QUESTIONS__OPTIONS = ELEMENT_UI__OPTIONS;

	/**
	 * The feature id for the '<em><b>Liste Sous Question</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLE_QUESTIONS__LISTE_SOUS_QUESTION = ELEMENT_UI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ensemble Questions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLE_QUESTIONS_FEATURE_COUNT = ELEMENT_UI_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ensemble Questions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLE_QUESTIONS_OPERATION_COUNT = ELEMENT_UI_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link mmui.impl.ErreurImpl <em>Erreur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmui.impl.ErreurImpl
	 * @see mmui.impl.MmuiPackageImpl#getErreur()
	 * @generated
	 */
	int ERREUR = 9;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERREUR__NEXT = ELEMENT_UI__NEXT;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERREUR__QUESTION = ELEMENT_UI__QUESTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERREUR__ID = ELEMENT_UI__ID;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERREUR__OPTIONS = ELEMENT_UI__OPTIONS;

	/**
	 * The number of structural features of the '<em>Erreur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERREUR_FEATURE_COUNT = ELEMENT_UI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Erreur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERREUR_OPERATION_COUNT = ELEMENT_UI_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link mmui.impl.MetaLayoutImpl <em>Meta Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmui.impl.MetaLayoutImpl
	 * @see mmui.impl.MmuiPackageImpl#getMetaLayout()
	 * @generated
	 */
	int META_LAYOUT = 10;

	/**
	 * The feature id for the '<em><b>First Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_LAYOUT__FIRST_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Liste Layout</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_LAYOUT__LISTE_LAYOUT = 1;

	/**
	 * The number of structural features of the '<em>Meta Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_LAYOUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Meta Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_LAYOUT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link mmui.ElementUI <em>Element UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element UI</em>'.
	 * @see mmui.ElementUI
	 * @generated
	 */
	EClass getElementUI();

	/**
	 * Returns the meta object for the reference '{@link mmui.ElementUI#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see mmui.ElementUI#getNext()
	 * @see #getElementUI()
	 * @generated
	 */
	EReference getElementUI_Next();

	/**
	 * Returns the meta object for the attribute '{@link mmui.ElementUI#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see mmui.ElementUI#getQuestion()
	 * @see #getElementUI()
	 * @generated
	 */
	EAttribute getElementUI_Question();

	/**
	 * Returns the meta object for the attribute '{@link mmui.ElementUI#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mmui.ElementUI#getId()
	 * @see #getElementUI()
	 * @generated
	 */
	EAttribute getElementUI_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link mmui.ElementUI#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see mmui.ElementUI#getOptions()
	 * @see #getElementUI()
	 * @generated
	 */
	EReference getElementUI_Options();

	/**
	 * Returns the meta object for class '{@link mmui.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see mmui.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the meta object for class '{@link mmui.Radio <em>Radio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio</em>'.
	 * @see mmui.Radio
	 * @generated
	 */
	EClass getRadio();

	/**
	 * Returns the meta object for class '{@link mmui.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see mmui.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for class '{@link mmui.TextArea <em>Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Area</em>'.
	 * @see mmui.TextArea
	 * @generated
	 */
	EClass getTextArea();

	/**
	 * Returns the meta object for class '{@link mmui.DropDown <em>Drop Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Down</em>'.
	 * @see mmui.DropDown
	 * @generated
	 */
	EClass getDropDown();

	/**
	 * Returns the meta object for class '{@link mmui.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see mmui.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link mmui.Option#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mmui.Option#getValue()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Value();

	/**
	 * Returns the meta object for class '{@link mmui.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see mmui.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the reference '{@link mmui.Layout#getFirstElement <em>First Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Element</em>'.
	 * @see mmui.Layout#getFirstElement()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_FirstElement();

	/**
	 * Returns the meta object for the containment reference list '{@link mmui.Layout#getListeElementUI <em>Liste Element UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Liste Element UI</em>'.
	 * @see mmui.Layout#getListeElementUI()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_ListeElementUI();

	/**
	 * Returns the meta object for the reference '{@link mmui.Layout#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see mmui.Layout#getNext()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Next();

	/**
	 * Returns the meta object for class '{@link mmui.EnsembleQuestions <em>Ensemble Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ensemble Questions</em>'.
	 * @see mmui.EnsembleQuestions
	 * @generated
	 */
	EClass getEnsembleQuestions();

	/**
	 * Returns the meta object for the containment reference list '{@link mmui.EnsembleQuestions#getListeSousQuestion <em>Liste Sous Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Liste Sous Question</em>'.
	 * @see mmui.EnsembleQuestions#getListeSousQuestion()
	 * @see #getEnsembleQuestions()
	 * @generated
	 */
	EReference getEnsembleQuestions_ListeSousQuestion();

	/**
	 * Returns the meta object for class '{@link mmui.Erreur <em>Erreur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erreur</em>'.
	 * @see mmui.Erreur
	 * @generated
	 */
	EClass getErreur();

	/**
	 * Returns the meta object for class '{@link mmui.MetaLayout <em>Meta Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Layout</em>'.
	 * @see mmui.MetaLayout
	 * @generated
	 */
	EClass getMetaLayout();

	/**
	 * Returns the meta object for the reference '{@link mmui.MetaLayout#getFirstElement <em>First Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Element</em>'.
	 * @see mmui.MetaLayout#getFirstElement()
	 * @see #getMetaLayout()
	 * @generated
	 */
	EReference getMetaLayout_FirstElement();

	/**
	 * Returns the meta object for the containment reference list '{@link mmui.MetaLayout#getListeLayout <em>Liste Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Liste Layout</em>'.
	 * @see mmui.MetaLayout#getListeLayout()
	 * @see #getMetaLayout()
	 * @generated
	 */
	EReference getMetaLayout_ListeLayout();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MmuiFactory getMmuiFactory();

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
		 * The meta object literal for the '{@link mmui.impl.ElementUIImpl <em>Element UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmui.impl.ElementUIImpl
		 * @see mmui.impl.MmuiPackageImpl#getElementUI()
		 * @generated
		 */
		EClass ELEMENT_UI = eINSTANCE.getElementUI();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_UI__NEXT = eINSTANCE.getElementUI_Next();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_UI__QUESTION = eINSTANCE.getElementUI_Question();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_UI__ID = eINSTANCE.getElementUI_Id();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_UI__OPTIONS = eINSTANCE.getElementUI_Options();

		/**
		 * The meta object literal for the '{@link mmui.impl.CheckBoxImpl <em>Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmui.impl.CheckBoxImpl
		 * @see mmui.impl.MmuiPackageImpl#getCheckBox()
		 * @generated
		 */
		EClass CHECK_BOX = eINSTANCE.getCheckBox();

		/**
		 * The meta object literal for the '{@link mmui.impl.RadioImpl <em>Radio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmui.impl.RadioImpl
		 * @see mmui.impl.MmuiPackageImpl#getRadio()
		 * @generated
		 */
		EClass RADIO = eINSTANCE.getRadio();

		/**
		 * The meta object literal for the '{@link mmui.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmui.impl.TextImpl
		 * @see mmui.impl.MmuiPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '{@link mmui.impl.TextAreaImpl <em>Text Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmui.impl.TextAreaImpl
		 * @see mmui.impl.MmuiPackageImpl#getTextArea()
		 * @generated
		 */
		EClass TEXT_AREA = eINSTANCE.getTextArea();

		/**
		 * The meta object literal for the '{@link mmui.impl.DropDownImpl <em>Drop Down</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmui.impl.DropDownImpl
		 * @see mmui.impl.MmuiPackageImpl#getDropDown()
		 * @generated
		 */
		EClass DROP_DOWN = eINSTANCE.getDropDown();

		/**
		 * The meta object literal for the '{@link mmui.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmui.impl.OptionImpl
		 * @see mmui.impl.MmuiPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__VALUE = eINSTANCE.getOption_Value();

		/**
		 * The meta object literal for the '{@link mmui.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmui.impl.LayoutImpl
		 * @see mmui.impl.MmuiPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>First Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__FIRST_ELEMENT = eINSTANCE.getLayout_FirstElement();

		/**
		 * The meta object literal for the '<em><b>Liste Element UI</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__LISTE_ELEMENT_UI = eINSTANCE.getLayout_ListeElementUI();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__NEXT = eINSTANCE.getLayout_Next();

		/**
		 * The meta object literal for the '{@link mmui.impl.EnsembleQuestionsImpl <em>Ensemble Questions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmui.impl.EnsembleQuestionsImpl
		 * @see mmui.impl.MmuiPackageImpl#getEnsembleQuestions()
		 * @generated
		 */
		EClass ENSEMBLE_QUESTIONS = eINSTANCE.getEnsembleQuestions();

		/**
		 * The meta object literal for the '<em><b>Liste Sous Question</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENSEMBLE_QUESTIONS__LISTE_SOUS_QUESTION = eINSTANCE.getEnsembleQuestions_ListeSousQuestion();

		/**
		 * The meta object literal for the '{@link mmui.impl.ErreurImpl <em>Erreur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmui.impl.ErreurImpl
		 * @see mmui.impl.MmuiPackageImpl#getErreur()
		 * @generated
		 */
		EClass ERREUR = eINSTANCE.getErreur();

		/**
		 * The meta object literal for the '{@link mmui.impl.MetaLayoutImpl <em>Meta Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmui.impl.MetaLayoutImpl
		 * @see mmui.impl.MmuiPackageImpl#getMetaLayout()
		 * @generated
		 */
		EClass META_LAYOUT = eINSTANCE.getMetaLayout();

		/**
		 * The meta object literal for the '<em><b>First Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_LAYOUT__FIRST_ELEMENT = eINSTANCE.getMetaLayout_FirstElement();

		/**
		 * The meta object literal for the '<em><b>Liste Layout</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_LAYOUT__LISTE_LAYOUT = eINSTANCE.getMetaLayout_ListeLayout();

	}

} //MmuiPackage
