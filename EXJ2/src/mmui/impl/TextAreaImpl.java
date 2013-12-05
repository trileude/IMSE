/**
 */
package mmui.impl;

import mmui.MmuiPackage;
import mmui.TextArea;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mmui.impl.TextAreaImpl#getNbColonnes <em>Nb Colonnes</em>}</li>
 *   <li>{@link mmui.impl.TextAreaImpl#getNbLignes <em>Nb Lignes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextAreaImpl extends ElementUIImpl implements TextArea {
	/**
	 * The default value of the '{@link #getNbColonnes() <em>Nb Colonnes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbColonnes()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_COLONNES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbColonnes() <em>Nb Colonnes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbColonnes()
	 * @generated
	 * @ordered
	 */
	protected int nbColonnes = NB_COLONNES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbLignes() <em>Nb Lignes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbLignes()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_LIGNES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbLignes() <em>Nb Lignes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbLignes()
	 * @generated
	 * @ordered
	 */
	protected int nbLignes = NB_LIGNES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmuiPackage.Literals.TEXT_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbColonnes() {
		return nbColonnes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbColonnes(int newNbColonnes) {
		int oldNbColonnes = nbColonnes;
		nbColonnes = newNbColonnes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmuiPackage.TEXT_AREA__NB_COLONNES, oldNbColonnes, nbColonnes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbLignes() {
		return nbLignes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbLignes(int newNbLignes) {
		int oldNbLignes = nbLignes;
		nbLignes = newNbLignes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmuiPackage.TEXT_AREA__NB_LIGNES, oldNbLignes, nbLignes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MmuiPackage.TEXT_AREA__NB_COLONNES:
				return getNbColonnes();
			case MmuiPackage.TEXT_AREA__NB_LIGNES:
				return getNbLignes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MmuiPackage.TEXT_AREA__NB_COLONNES:
				setNbColonnes((Integer)newValue);
				return;
			case MmuiPackage.TEXT_AREA__NB_LIGNES:
				setNbLignes((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MmuiPackage.TEXT_AREA__NB_COLONNES:
				setNbColonnes(NB_COLONNES_EDEFAULT);
				return;
			case MmuiPackage.TEXT_AREA__NB_LIGNES:
				setNbLignes(NB_LIGNES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MmuiPackage.TEXT_AREA__NB_COLONNES:
				return nbColonnes != NB_COLONNES_EDEFAULT;
			case MmuiPackage.TEXT_AREA__NB_LIGNES:
				return nbLignes != NB_LIGNES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nbColonnes: ");
		result.append(nbColonnes);
		result.append(", nbLignes: ");
		result.append(nbLignes);
		result.append(')');
		return result.toString();
	}

} //TextAreaImpl
