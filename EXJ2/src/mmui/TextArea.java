/**
 */
package mmui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mmui.TextArea#getNbColonnes <em>Nb Colonnes</em>}</li>
 *   <li>{@link mmui.TextArea#getNbLignes <em>Nb Lignes</em>}</li>
 * </ul>
 * </p>
 *
 * @see mmui.MmuiPackage#getTextArea()
 * @model
 * @generated
 */
public interface TextArea extends ElementUI {
	/**
	 * Returns the value of the '<em><b>Nb Colonnes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Colonnes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Colonnes</em>' attribute.
	 * @see #setNbColonnes(int)
	 * @see mmui.MmuiPackage#getTextArea_NbColonnes()
	 * @model
	 * @generated
	 */
	int getNbColonnes();

	/**
	 * Sets the value of the '{@link mmui.TextArea#getNbColonnes <em>Nb Colonnes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Colonnes</em>' attribute.
	 * @see #getNbColonnes()
	 * @generated
	 */
	void setNbColonnes(int value);

	/**
	 * Returns the value of the '<em><b>Nb Lignes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Lignes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Lignes</em>' attribute.
	 * @see #setNbLignes(int)
	 * @see mmui.MmuiPackage#getTextArea_NbLignes()
	 * @model
	 * @generated
	 */
	int getNbLignes();

	/**
	 * Sets the value of the '{@link mmui.TextArea#getNbLignes <em>Nb Lignes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Lignes</em>' attribute.
	 * @see #getNbLignes()
	 * @generated
	 */
	void setNbLignes(int value);

} // TextArea
