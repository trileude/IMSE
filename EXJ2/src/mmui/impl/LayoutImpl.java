/**
 */
package mmui.impl;

import java.util.Collection;
import mmui.ElementUI;
import mmui.Layout;
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
 * An implementation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mmui.impl.LayoutImpl#getFirstElement <em>First Element</em>}</li>
 *   <li>{@link mmui.impl.LayoutImpl#getListeElementUI <em>Liste Element UI</em>}</li>
 *   <li>{@link mmui.impl.LayoutImpl#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayoutImpl extends MinimalEObjectImpl.Container implements Layout {
	/**
	 * The cached value of the '{@link #getFirstElement() <em>First Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstElement()
	 * @generated
	 * @ordered
	 */
	protected ElementUI firstElement;

	/**
	 * The cached value of the '{@link #getListeElementUI() <em>Liste Element UI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListeElementUI()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementUI> listeElementUI;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Layout next;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmuiPackage.Literals.LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementUI getFirstElement() {
		if (firstElement != null && firstElement.eIsProxy()) {
			InternalEObject oldFirstElement = (InternalEObject)firstElement;
			firstElement = (ElementUI)eResolveProxy(oldFirstElement);
			if (firstElement != oldFirstElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MmuiPackage.LAYOUT__FIRST_ELEMENT, oldFirstElement, firstElement));
			}
		}
		return firstElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementUI basicGetFirstElement() {
		return firstElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstElement(ElementUI newFirstElement) {
		ElementUI oldFirstElement = firstElement;
		firstElement = newFirstElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmuiPackage.LAYOUT__FIRST_ELEMENT, oldFirstElement, firstElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementUI> getListeElementUI() {
		if (listeElementUI == null) {
			listeElementUI = new EObjectContainmentEList<ElementUI>(ElementUI.class, this, MmuiPackage.LAYOUT__LISTE_ELEMENT_UI);
		}
		return listeElementUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (Layout)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MmuiPackage.LAYOUT__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(Layout newNext) {
		Layout oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MmuiPackage.LAYOUT__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MmuiPackage.LAYOUT__LISTE_ELEMENT_UI:
				return ((InternalEList<?>)getListeElementUI()).basicRemove(otherEnd, msgs);
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
			case MmuiPackage.LAYOUT__FIRST_ELEMENT:
				if (resolve) return getFirstElement();
				return basicGetFirstElement();
			case MmuiPackage.LAYOUT__LISTE_ELEMENT_UI:
				return getListeElementUI();
			case MmuiPackage.LAYOUT__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
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
			case MmuiPackage.LAYOUT__FIRST_ELEMENT:
				setFirstElement((ElementUI)newValue);
				return;
			case MmuiPackage.LAYOUT__LISTE_ELEMENT_UI:
				getListeElementUI().clear();
				getListeElementUI().addAll((Collection<? extends ElementUI>)newValue);
				return;
			case MmuiPackage.LAYOUT__NEXT:
				setNext((Layout)newValue);
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
			case MmuiPackage.LAYOUT__FIRST_ELEMENT:
				setFirstElement((ElementUI)null);
				return;
			case MmuiPackage.LAYOUT__LISTE_ELEMENT_UI:
				getListeElementUI().clear();
				return;
			case MmuiPackage.LAYOUT__NEXT:
				setNext((Layout)null);
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
			case MmuiPackage.LAYOUT__FIRST_ELEMENT:
				return firstElement != null;
			case MmuiPackage.LAYOUT__LISTE_ELEMENT_UI:
				return listeElementUI != null && !listeElementUI.isEmpty();
			case MmuiPackage.LAYOUT__NEXT:
				return next != null;
		}
		return super.eIsSet(featureID);
	}

} //LayoutImpl
