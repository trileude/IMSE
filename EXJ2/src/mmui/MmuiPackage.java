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
	 * The number of structural features of the '<em>Element UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_UI_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO__OPTIONS = ELEMENT_UI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Radio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_FEATURE_COUNT = ELEMENT_UI_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Nb Carac Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NB_CARAC_MAX = ELEMENT_UI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = ELEMENT_UI_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Nb Colonnes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__NB_COLONNES = ELEMENT_UI_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nb Lignes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA__NB_LIGNES = ELEMENT_UI_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_AREA_FEATURE_COUNT = ELEMENT_UI_FEATURE_COUNT + 2;

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
	int DROP_DOWN__OPTIONS = ELEMENT_UI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drop Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_FEATURE_COUNT = ELEMENT_UI_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Drop Down</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_DOWN_OPERATION_COUNT = ELEMENT_UI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mmui.impl.OptionsImpl <em>Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mmui.impl.OptionsImpl
	 * @see mmui.impl.MmuiPackageImpl#getOptions()
	 * @generated
	 */
	int OPTIONS = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_OPERATION_COUNT = 0;

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
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the reference list '{@link mmui.Radio#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Options</em>'.
	 * @see mmui.Radio#getOptions()
	 * @see #getRadio()
	 * @generated
	 */
	EReference getRadio_Options();

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
	 * Returns the meta object for the attribute '{@link mmui.Text#getNbCaracMax <em>Nb Carac Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Carac Max</em>'.
	 * @see mmui.Text#getNbCaracMax()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_NbCaracMax();

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
	 * Returns the meta object for the attribute '{@link mmui.TextArea#getNbColonnes <em>Nb Colonnes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Colonnes</em>'.
	 * @see mmui.TextArea#getNbColonnes()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_NbColonnes();

	/**
	 * Returns the meta object for the attribute '{@link mmui.TextArea#getNbLignes <em>Nb Lignes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Lignes</em>'.
	 * @see mmui.TextArea#getNbLignes()
	 * @see #getTextArea()
	 * @generated
	 */
	EAttribute getTextArea_NbLignes();

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
	 * Returns the meta object for the containment reference list '{@link mmui.DropDown#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see mmui.DropDown#getOptions()
	 * @see #getDropDown()
	 * @generated
	 */
	EReference getDropDown_Options();

	/**
	 * Returns the meta object for class '{@link mmui.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options</em>'.
	 * @see mmui.Options
	 * @generated
	 */
	EClass getOptions();

	/**
	 * Returns the meta object for the attribute '{@link mmui.Options#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mmui.Options#getValue()
	 * @see #getOptions()
	 * @generated
	 */
	EAttribute getOptions_Value();

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
		 * The meta object literal for the '<em><b>Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADIO__OPTIONS = eINSTANCE.getRadio_Options();

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
		 * The meta object literal for the '<em><b>Nb Carac Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__NB_CARAC_MAX = eINSTANCE.getText_NbCaracMax();

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
		 * The meta object literal for the '<em><b>Nb Colonnes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__NB_COLONNES = eINSTANCE.getTextArea_NbColonnes();

		/**
		 * The meta object literal for the '<em><b>Nb Lignes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_AREA__NB_LIGNES = eINSTANCE.getTextArea_NbLignes();

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
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROP_DOWN__OPTIONS = eINSTANCE.getDropDown_Options();

		/**
		 * The meta object literal for the '{@link mmui.impl.OptionsImpl <em>Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mmui.impl.OptionsImpl
		 * @see mmui.impl.MmuiPackageImpl#getOptions()
		 * @generated
		 */
		EClass OPTIONS = eINSTANCE.getOptions();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS__VALUE = eINSTANCE.getOptions_Value();

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

	}

} //MmuiPackage
