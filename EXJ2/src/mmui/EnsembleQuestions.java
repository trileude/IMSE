/**
 */
package mmui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ensemble Questions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mmui.EnsembleQuestions#getListeSousQuestion <em>Liste Sous Question</em>}</li>
 * </ul>
 * </p>
 *
 * @see mmui.MmuiPackage#getEnsembleQuestions()
 * @model
 * @generated
 */
public interface EnsembleQuestions extends ElementUI {
	/**
	 * Returns the value of the '<em><b>Liste Sous Question</b></em>' containment reference list.
	 * The list contents are of type {@link mmui.ElementUI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liste Sous Question</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liste Sous Question</em>' containment reference list.
	 * @see mmui.MmuiPackage#getEnsembleQuestions_ListeSousQuestion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ElementUI> getListeSousQuestion();

} // EnsembleQuestions
