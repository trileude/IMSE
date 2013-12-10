/**
 */
package mmui.impl;

import java.util.Collection;

import mmui.ElementUI;
import mmui.EnsembleQuestions;
import mmui.MmuiPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ensemble Questions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mmui.impl.EnsembleQuestionsImpl#getListeSousQuestion <em>Liste Sous Question</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnsembleQuestionsImpl extends ElementUIImpl implements EnsembleQuestions {
	/**
	 * The cached value of the '{@link #getListeSousQuestion() <em>Liste Sous Question</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListeSousQuestion()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementUI> listeSousQuestion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnsembleQuestionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MmuiPackage.Literals.ENSEMBLE_QUESTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementUI> getListeSousQuestion() {
		if (listeSousQuestion == null) {
			listeSousQuestion = new EObjectContainmentEList<ElementUI>(ElementUI.class, this, MmuiPackage.ENSEMBLE_QUESTIONS__LISTE_SOUS_QUESTION);
		}
		return listeSousQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MmuiPackage.ENSEMBLE_QUESTIONS__LISTE_SOUS_QUESTION:
				return ((InternalEList<?>)getListeSousQuestion()).basicRemove(otherEnd, msgs);
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
			case MmuiPackage.ENSEMBLE_QUESTIONS__LISTE_SOUS_QUESTION:
				return getListeSousQuestion();
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
			case MmuiPackage.ENSEMBLE_QUESTIONS__LISTE_SOUS_QUESTION:
				getListeSousQuestion().clear();
				getListeSousQuestion().addAll((Collection<? extends ElementUI>)newValue);
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
			case MmuiPackage.ENSEMBLE_QUESTIONS__LISTE_SOUS_QUESTION:
				getListeSousQuestion().clear();
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
			case MmuiPackage.ENSEMBLE_QUESTIONS__LISTE_SOUS_QUESTION:
				return listeSousQuestion != null && !listeSousQuestion.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnsembleQuestionsImpl
