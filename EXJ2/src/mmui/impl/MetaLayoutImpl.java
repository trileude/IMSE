/**
 */
package mmui.impl;

import java.util.Collection;

import mmui.Layout;
import mmui.MetaLayout;
import mmui.MmuiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mmui.impl.MetaLayoutImpl#getFirstElement <em>First Element</em>}</li>
 *   <li>{@link mmui.impl.MetaLayoutImpl#getListeLayout <em>Liste Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaLayoutImpl extends MinimalEObjectImpl.Container implements MetaLayout {
	/**
	 * The cached value of the '{@link #getFirstElement() <em>First Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstElement()
	 * @generated
	 * @ordered
	 */
	protected Layout firstElement;

	/**
	 * The cached value of the '{@link #getListeLayout() <em>Liste Layout</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListeLayout()
	 * @generated
	 * @ordered
	 */
	protected EList<Layout> listeLayout;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmuiPackage.Literals.META_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout getFirstElement() {
		if (firstElement != null && firstElement.eIsProxy()) {
			InternalEObject oldFirstElement = (InternalEObject)firstElement;
			firstElement = (Layout)eResolveProxy(oldFirstElement);
			if (firstElement != oldFirstElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MmuiPackage.META_LAYOUT__FIRST_ELEMENT, oldFirstElement, firstElement));
			}
		}
		return firstElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout basicGetFirstElement() {
		return firstElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstElement(Layout newFirstElement) {
		Layout oldFirstElement = firstElement;
		firstElement = newFirstElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmuiPackage.META_LAYOUT__FIRST_ELEMENT, oldFirstElement, firstElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layout> getListeLayout() {
		if (listeLayout == null) {
			listeLayout = new EObjectContainmentEList<Layout>(Layout.class, this, MmuiPackage.META_LAYOUT__LISTE_LAYOUT);
		}
		return listeLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MmuiPackage.META_LAYOUT__LISTE_LAYOUT:
				return ((InternalEList<?>)getListeLayout()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MmuiPackage.META_LAYOUT__FIRST_ELEMENT:
				if (resolve) return getFirstElement();
				return basicGetFirstElement();
			case MmuiPackage.META_LAYOUT__LISTE_LAYOUT:
				return getListeLayout();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MmuiPackage.META_LAYOUT__FIRST_ELEMENT:
				setFirstElement((Layout)newValue);
				return;
			case MmuiPackage.META_LAYOUT__LISTE_LAYOUT:
				getListeLayout().clear();
				getListeLayout().addAll((Collection<? extends Layout>)newValue);
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
			case MmuiPackage.META_LAYOUT__FIRST_ELEMENT:
				setFirstElement((Layout)null);
				return;
			case MmuiPackage.META_LAYOUT__LISTE_LAYOUT:
				getListeLayout().clear();
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
			case MmuiPackage.META_LAYOUT__FIRST_ELEMENT:
				return firstElement != null;
			case MmuiPackage.META_LAYOUT__LISTE_LAYOUT:
				return listeLayout != null && !listeLayout.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MetaLayoutImpl
