/**
 */
package mmui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mmui.MetaLayout#getFirstElement <em>First Element</em>}</li>
 *   <li>{@link mmui.MetaLayout#getListeLayout <em>Liste Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see mmui.MmuiPackage#getMetaLayout()
 * @model
 * @generated
 */
public interface MetaLayout extends EObject {
	/**
	 * Returns the value of the '<em><b>First Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Element</em>' reference.
	 * @see #setFirstElement(Layout)
	 * @see mmui.MmuiPackage#getMetaLayout_FirstElement()
	 * @model
	 * @generated
	 */
	Layout getFirstElement();

	/**
	 * Sets the value of the '{@link mmui.MetaLayout#getFirstElement <em>First Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Element</em>' reference.
	 * @see #getFirstElement()
	 * @generated
	 */
	void setFirstElement(Layout value);

	/**
	 * Returns the value of the '<em><b>Liste Layout</b></em>' containment reference list.
	 * The list contents are of type {@link mmui.Layout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liste Layout</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liste Layout</em>' containment reference list.
	 * @see mmui.MmuiPackage#getMetaLayout_ListeLayout()
	 * @model containment="true"
	 * @generated
	 */
	EList<Layout> getListeLayout();

} // MetaLayout
