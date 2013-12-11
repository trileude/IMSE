/**
 */
package mmui.impl;

import mmui.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MmuiFactoryImpl extends EFactoryImpl implements MmuiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MmuiFactory init() {
		try {
			MmuiFactory theMmuiFactory = (MmuiFactory)EPackage.Registry.INSTANCE.getEFactory(MmuiPackage.eNS_URI);
			if (theMmuiFactory != null) {
				return theMmuiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MmuiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MmuiFactoryImpl() {
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
			case MmuiPackage.ELEMENT_UI: return createElementUI();
			case MmuiPackage.CHECK_BOX: return createCheckBox();
			case MmuiPackage.RADIO: return createRadio();
			case MmuiPackage.TEXT: return createText();
			case MmuiPackage.TEXT_AREA: return createTextArea();
			case MmuiPackage.DROP_DOWN: return createDropDown();
			case MmuiPackage.OPTION: return createOption();
			case MmuiPackage.LAYOUT: return createLayout();
			case MmuiPackage.ENSEMBLE_QUESTIONS: return createEnsembleQuestions();
			case MmuiPackage.ERREUR: return createErreur();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementUI createElementUI() {
		ElementUIImpl elementUI = new ElementUIImpl();
		return elementUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckBox createCheckBox() {
		CheckBoxImpl checkBox = new CheckBoxImpl();
		return checkBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Radio createRadio() {
		RadioImpl radio = new RadioImpl();
		return radio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextArea createTextArea() {
		TextAreaImpl textArea = new TextAreaImpl();
		return textArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropDown createDropDown() {
		DropDownImpl dropDown = new DropDownImpl();
		return dropDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout createLayout() {
		LayoutImpl layout = new LayoutImpl();
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnsembleQuestions createEnsembleQuestions() {
		EnsembleQuestionsImpl ensembleQuestions = new EnsembleQuestionsImpl();
		return ensembleQuestions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Erreur createErreur() {
		ErreurImpl erreur = new ErreurImpl();
		return erreur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MmuiPackage getMmuiPackage() {
		return (MmuiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MmuiPackage getPackage() {
		return MmuiPackage.eINSTANCE;
	}

} //MmuiFactoryImpl
