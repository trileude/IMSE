/**
 */
package mmui.impl;

import mmui.MmuiPackage;
import mmui.Text;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mmui.impl.TextImpl#getNbCaracMax <em>Nb Carac Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextImpl extends ElementUIImpl implements Text {
	/**
	 * The default value of the '{@link #getNbCaracMax() <em>Nb Carac Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbCaracMax()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_CARAC_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbCaracMax() <em>Nb Carac Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbCaracMax()
	 * @generated
	 * @ordered
	 */
	protected int nbCaracMax = NB_CARAC_MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmuiPackage.Literals.TEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbCaracMax() {
		return nbCaracMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbCaracMax(int newNbCaracMax) {
		int oldNbCaracMax = nbCaracMax;
		nbCaracMax = newNbCaracMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmuiPackage.TEXT__NB_CARAC_MAX, oldNbCaracMax, nbCaracMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MmuiPackage.TEXT__NB_CARAC_MAX:
				return getNbCaracMax();
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
			case MmuiPackage.TEXT__NB_CARAC_MAX:
				setNbCaracMax((Integer)newValue);
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
			case MmuiPackage.TEXT__NB_CARAC_MAX:
				setNbCaracMax(NB_CARAC_MAX_EDEFAULT);
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
			case MmuiPackage.TEXT__NB_CARAC_MAX:
				return nbCaracMax != NB_CARAC_MAX_EDEFAULT;
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
		result.append(" (nbCaracMax: ");
		result.append(nbCaracMax);
		result.append(')');
		return result.toString();
	}

} //TextImpl
