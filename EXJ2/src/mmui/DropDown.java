/**
 */
package mmui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Down</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mmui.DropDown#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see mmui.MmuiPackage#getDropDown()
 * @model
 * @generated
 */
public interface DropDown extends ElementUI {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link mmui.Options}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see mmui.MmuiPackage#getDropDown_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<Options> getOptions();

} // DropDown
