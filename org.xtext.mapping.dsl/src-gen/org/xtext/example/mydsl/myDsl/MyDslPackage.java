/**
 */
package org.xtext.example.mydsl.myDsl;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ListeQuestionsImpl <em>Liste Questions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ListeQuestionsImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getListeQuestions()
   * @generated
   */
  int LISTE_QUESTIONS = 0;

  /**
   * The feature id for the '<em><b>Questions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTE_QUESTIONS__QUESTIONS = 0;

  /**
   * The number of structural features of the '<em>Liste Questions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTE_QUESTIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.QuestionImpl <em>Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.QuestionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getQuestion()
   * @generated
   */
  int QUESTION = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__ID = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__TYPE = 1;

  /**
   * The number of structural features of the '<em>Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ListeQuestions <em>Liste Questions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Liste Questions</em>'.
   * @see org.xtext.example.mydsl.myDsl.ListeQuestions
   * @generated
   */
  EClass getListeQuestions();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.ListeQuestions#getQuestions <em>Questions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Questions</em>'.
   * @see org.xtext.example.mydsl.myDsl.ListeQuestions#getQuestions()
   * @see #getListeQuestions()
   * @generated
   */
  EReference getListeQuestions_Questions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Question <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Question</em>'.
   * @see org.xtext.example.mydsl.myDsl.Question
   * @generated
   */
  EClass getQuestion();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Question#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.example.mydsl.myDsl.Question#getId()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Id();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Question#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Question#getType()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Type();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ListeQuestionsImpl <em>Liste Questions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ListeQuestionsImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getListeQuestions()
     * @generated
     */
    EClass LISTE_QUESTIONS = eINSTANCE.getListeQuestions();

    /**
     * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LISTE_QUESTIONS__QUESTIONS = eINSTANCE.getListeQuestions_Questions();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.QuestionImpl <em>Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.QuestionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getQuestion()
     * @generated
     */
    EClass QUESTION = eINSTANCE.getQuestion();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__ID = eINSTANCE.getQuestion_Id();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__TYPE = eINSTANCE.getQuestion_Type();

  }

} //MyDslPackage
