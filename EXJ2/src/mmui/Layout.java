/**
 */
package mmui;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mmui.Layout#getFirstElement <em>First Element</em>}</li>
 *   <li>{@link mmui.Layout#getListeElementUI <em>Liste Element UI</em>}</li>
 *   <li>{@link mmui.Layout#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see mmui.MmuiPackage#getLayout()
 * @model
 * @generated
 */
public interface Layout extends EObject {
	/**
	 * Returns the value of the '<em><b>First Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Element</em>' reference.
	 * @see #setFirstElement(ElementUI)
	 * @see mmui.MmuiPackage#getLayout_FirstElement()
	 * @model
	 * @generated
	 */
	ElementUI getFirstElement();

	/**
	 * Sets the value of the '{@link mmui.Layout#getFirstElement <em>First Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Element</em>' reference.
	 * @see #getFirstElement()
	 * @generated
	 */
	void setFirstElement(ElementUI value);

	/**
	 * Returns the value of the '<em><b>Liste Element UI</b></em>' containment reference list.
	 * The list contents are of type {@link mmui.ElementUI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liste Element UI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liste Element UI</em>' containment reference list.
	 * @see mmui.MmuiPackage#getLayout_ListeElementUI()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementUI> getListeElementUI();

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Layout)
	 * @see mmui.MmuiPackage#getLayout_Next()
	 * @model
	 * @generated
	 */
	Layout getNext();

	/**
	 * Sets the value of the '{@link mmui.Layout#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Layout value);

} // Layout
