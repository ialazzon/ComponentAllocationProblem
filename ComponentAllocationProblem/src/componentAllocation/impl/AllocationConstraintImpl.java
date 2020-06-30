/**
 */
package componentAllocation.impl;

import componentAllocation.AllocationConstraint;
import componentAllocation.CompUnit;
import componentAllocation.Component;
import componentAllocation.ComponentAllocationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentAllocation.impl.AllocationConstraintImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link componentAllocation.impl.AllocationConstraintImpl#getCompUnit <em>Comp Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationConstraintImpl extends MinimalEObjectImpl.Container implements AllocationConstraint {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component component;

	/**
	 * The cached value of the '{@link #getCompUnit() <em>Comp Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompUnit()
	 * @generated
	 * @ordered
	 */
	protected CompUnit compUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentAllocationPackage.Literals.ALLOCATION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject) component;
			component = (Component) eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentAllocationPackage.ALLOCATION_CONSTRAINT__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		Component oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentAllocationPackage.ALLOCATION_CONSTRAINT__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompUnit getCompUnit() {
		if (compUnit != null && compUnit.eIsProxy()) {
			InternalEObject oldCompUnit = (InternalEObject) compUnit;
			compUnit = (CompUnit) eResolveProxy(oldCompUnit);
			if (compUnit != oldCompUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentAllocationPackage.ALLOCATION_CONSTRAINT__COMP_UNIT, oldCompUnit, compUnit));
			}
		}
		return compUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompUnit basicGetCompUnit() {
		return compUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompUnit(CompUnit newCompUnit) {
		CompUnit oldCompUnit = compUnit;
		compUnit = newCompUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentAllocationPackage.ALLOCATION_CONSTRAINT__COMP_UNIT, oldCompUnit, compUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComponentAllocationPackage.ALLOCATION_CONSTRAINT__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
		case ComponentAllocationPackage.ALLOCATION_CONSTRAINT__COMP_UNIT:
			if (resolve)
				return getCompUnit();
			return basicGetCompUnit();
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
		case ComponentAllocationPackage.ALLOCATION_CONSTRAINT__COMPONENT:
			setComponent((Component) newValue);
			return;
		case ComponentAllocationPackage.ALLOCATION_CONSTRAINT__COMP_UNIT:
			setCompUnit((CompUnit) newValue);
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
		case ComponentAllocationPackage.ALLOCATION_CONSTRAINT__COMPONENT:
			setComponent((Component) null);
			return;
		case ComponentAllocationPackage.ALLOCATION_CONSTRAINT__COMP_UNIT:
			setCompUnit((CompUnit) null);
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
		case ComponentAllocationPackage.ALLOCATION_CONSTRAINT__COMPONENT:
			return component != null;
		case ComponentAllocationPackage.ALLOCATION_CONSTRAINT__COMP_UNIT:
			return compUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //AllocationConstraintImpl
