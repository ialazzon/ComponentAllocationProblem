/**
 */
package componentAllocation.impl;

import componentAllocation.Component;
import componentAllocation.ComponentAllocationPackage;
import componentAllocation.ResConsumption;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentAllocation.impl.ComponentImpl#getCompName <em>Comp Name</em>}</li>
 *   <li>{@link componentAllocation.impl.ComponentImpl#getResConsumptions <em>Res Consumptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The default value of the '{@link #getCompName() <em>Comp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompName() <em>Comp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompName()
	 * @generated
	 * @ordered
	 */
	protected String compName = COMP_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResConsumptions() <em>Res Consumptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResConsumptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ResConsumption> resConsumptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentAllocationPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompName() {
		return compName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompName(String newCompName) {
		String oldCompName = compName;
		compName = newCompName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentAllocationPackage.COMPONENT__COMP_NAME,
					oldCompName, compName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResConsumption> getResConsumptions() {
		if (resConsumptions == null) {
			resConsumptions = new EObjectWithInverseResolvingEList<ResConsumption>(ResConsumption.class, this,
					ComponentAllocationPackage.COMPONENT__RES_CONSUMPTIONS,
					ComponentAllocationPackage.RES_CONSUMPTION__COMPONENT);
		}
		return resConsumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComponentAllocationPackage.COMPONENT__RES_CONSUMPTIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getResConsumptions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComponentAllocationPackage.COMPONENT__RES_CONSUMPTIONS:
			return ((InternalEList<?>) getResConsumptions()).basicRemove(otherEnd, msgs);
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
		case ComponentAllocationPackage.COMPONENT__COMP_NAME:
			return getCompName();
		case ComponentAllocationPackage.COMPONENT__RES_CONSUMPTIONS:
			return getResConsumptions();
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
		case ComponentAllocationPackage.COMPONENT__COMP_NAME:
			setCompName((String) newValue);
			return;
		case ComponentAllocationPackage.COMPONENT__RES_CONSUMPTIONS:
			getResConsumptions().clear();
			getResConsumptions().addAll((Collection<? extends ResConsumption>) newValue);
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
		case ComponentAllocationPackage.COMPONENT__COMP_NAME:
			setCompName(COMP_NAME_EDEFAULT);
			return;
		case ComponentAllocationPackage.COMPONENT__RES_CONSUMPTIONS:
			getResConsumptions().clear();
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
		case ComponentAllocationPackage.COMPONENT__COMP_NAME:
			return COMP_NAME_EDEFAULT == null ? compName != null : !COMP_NAME_EDEFAULT.equals(compName);
		case ComponentAllocationPackage.COMPONENT__RES_CONSUMPTIONS:
			return resConsumptions != null && !resConsumptions.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (compName: ");
		result.append(compName);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
