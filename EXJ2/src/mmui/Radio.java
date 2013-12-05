/**
 */
package mmui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mmui.Radio#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see mmui.MmuiPackage#getRadio()
 * @model
 * @generated
 */
public interface Radio extends ElementUI {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' reference list.
	 * The list contents are of type {@link mmui.Options}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' reference list.
	 * @see mmui.MmuiPackage#getRadio_Options()
	 * @model
	 * @generated
	 */
	EList<Options> getOptions();

} // Radio
