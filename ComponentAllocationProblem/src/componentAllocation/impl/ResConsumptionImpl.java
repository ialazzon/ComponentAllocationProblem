/**
 */
package componentAllocation.impl;

import componentAllocation.CompUnit;
import componentAllocation.Component;
import componentAllocation.ComponentAllocationPackage;
import componentAllocation.ResConsumption;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Res Consumption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentAllocation.impl.ResConsumptionImpl#getCpuCons <em>Cpu Cons</em>}</li>
 *   <li>{@link componentAllocation.impl.ResConsumptionImpl#getMemoryCons <em>Memory Cons</em>}</li>
 *   <li>{@link componentAllocation.impl.ResConsumptionImpl#getPowerCons <em>Power Cons</em>}</li>
 *   <li>{@link componentAllocation.impl.ResConsumptionImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link componentAllocation.impl.ResConsumptionImpl#getCompUnit <em>Comp Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResConsumptionImpl extends MinimalEObjectImpl.Container implements ResConsumption {
	/**
	 * The default value of the '{@link #getCpuCons() <em>Cpu Cons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuCons()
	 * @generated
	 * @ordered
	 */
	protected static final double CPU_CONS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCpuCons() <em>Cpu Cons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuCons()
	 * @generated
	 * @ordered
	 */
	protected double cpuCons = CPU_CONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryCons() <em>Memory Cons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryCons()
	 * @generated
	 * @ordered
	 */
	protected static final double MEMORY_CONS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMemoryCons() <em>Memory Cons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryCons()
	 * @generated
	 * @ordered
	 */
	protected double memoryCons = MEMORY_CONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerCons() <em>Power Cons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerCons()
	 * @generated
	 * @ordered
	 */
	protected static final double POWER_CONS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPowerCons() <em>Power Cons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerCons()
	 * @generated
	 * @ordered
	 */
	protected double powerCons = POWER_CONS_EDEFAULT;

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
	protected ResConsumptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentAllocationPackage.Literals.RES_CONSUMPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCpuCons() {
		return cpuCons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuCons(double newCpuCons) {
		double oldCpuCons = cpuCons;
		cpuCons = newCpuCons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentAllocationPackage.RES_CONSUMPTION__CPU_CONS,
					oldCpuCons, cpuCons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMemoryCons() {
		return memoryCons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryCons(double newMemoryCons) {
		double oldMemoryCons = memoryCons;
		memoryCons = newMemoryCons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentAllocationPackage.RES_CONSUMPTION__MEMORY_CONS, oldMemoryCons, memoryCons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPowerCons() {
		return powerCons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerCons(double newPowerCons) {
		double oldPowerCons = powerCons;
		powerCons = newPowerCons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentAllocationPackage.RES_CONSUMPTION__POWER_CONS, oldPowerCons, powerCons));
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
							ComponentAllocationPackage.RES_CONSUMPTION__COMPONENT, oldComponent, component));
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
	public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs) {
		Component oldComponent = component;
		component = newComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ComponentAllocationPackage.RES_CONSUMPTION__COMPONENT, oldComponent, newComponent);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		if (newComponent != component) {
			NotificationChain msgs = null;
			if (component != null)
				msgs = ((InternalEObject) component).eInverseRemove(this,
						ComponentAllocationPackage.COMPONENT__RES_CONSUMPTIONS, Component.class, msgs);
			if (newComponent != null)
				msgs = ((InternalEObject) newComponent).eInverseAdd(this,
						ComponentAllocationPackage.COMPONENT__RES_CONSUMPTIONS, Component.class, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentAllocationPackage.RES_CONSUMPTION__COMPONENT,
					newComponent, newComponent));
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
							ComponentAllocationPackage.RES_CONSUMPTION__COMP_UNIT, oldCompUnit, compUnit));
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
	public NotificationChain basicSetCompUnit(CompUnit newCompUnit, NotificationChain msgs) {
		CompUnit oldCompUnit = compUnit;
		compUnit = newCompUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ComponentAllocationPackage.RES_CONSUMPTION__COMP_UNIT, oldCompUnit, newCompUnit);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompUnit(CompUnit newCompUnit) {
		if (newCompUnit != compUnit) {
			NotificationChain msgs = null;
			if (compUnit != null)
				msgs = ((InternalEObject) compUnit).eInverseRemove(this,
						ComponentAllocationPackage.COMP_UNIT__RES_CONSUMPTIONS, CompUnit.class, msgs);
			if (newCompUnit != null)
				msgs = ((InternalEObject) newCompUnit).eInverseAdd(this,
						ComponentAllocationPackage.COMP_UNIT__RES_CONSUMPTIONS, CompUnit.class, msgs);
			msgs = basicSetCompUnit(newCompUnit, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentAllocationPackage.RES_CONSUMPTION__COMP_UNIT,
					newCompUnit, newCompUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComponentAllocationPackage.RES_CONSUMPTION__COMPONENT:
			if (component != null)
				msgs = ((InternalEObject) component).eInverseRemove(this,
						ComponentAllocationPackage.COMPONENT__RES_CONSUMPTIONS, Component.class, msgs);
			return basicSetComponent((Component) otherEnd, msgs);
		case ComponentAllocationPackage.RES_CONSUMPTION__COMP_UNIT:
			if (compUnit != null)
				msgs = ((InternalEObject) compUnit).eInverseRemove(this,
						ComponentAllocationPackage.COMP_UNIT__RES_CONSUMPTIONS, CompUnit.class, msgs);
			return basicSetCompUnit((CompUnit) otherEnd, msgs);
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
		case ComponentAllocationPackage.RES_CONSUMPTION__COMPONENT:
			return basicSetComponent(null, msgs);
		case ComponentAllocationPackage.RES_CONSUMPTION__COMP_UNIT:
			return basicSetCompUnit(null, msgs);
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
		case ComponentAllocationPackage.RES_CONSUMPTION__CPU_CONS:
			return getCpuCons();
		case ComponentAllocationPackage.RES_CONSUMPTION__MEMORY_CONS:
			return getMemoryCons();
		case ComponentAllocationPackage.RES_CONSUMPTION__POWER_CONS:
			return getPowerCons();
		case ComponentAllocationPackage.RES_CONSUMPTION__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
		case ComponentAllocationPackage.RES_CONSUMPTION__COMP_UNIT:
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
		case ComponentAllocationPackage.RES_CONSUMPTION__CPU_CONS:
			setCpuCons((Double) newValue);
			return;
		case ComponentAllocationPackage.RES_CONSUMPTION__MEMORY_CONS:
			setMemoryCons((Double) newValue);
			return;
		case ComponentAllocationPackage.RES_CONSUMPTION__POWER_CONS:
			setPowerCons((Double) newValue);
			return;
		case ComponentAllocationPackage.RES_CONSUMPTION__COMPONENT:
			setComponent((Component) newValue);
			return;
		case ComponentAllocationPackage.RES_CONSUMPTION__COMP_UNIT:
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
		case ComponentAllocationPackage.RES_CONSUMPTION__CPU_CONS:
			setCpuCons(CPU_CONS_EDEFAULT);
			return;
		case ComponentAllocationPackage.RES_CONSUMPTION__MEMORY_CONS:
			setMemoryCons(MEMORY_CONS_EDEFAULT);
			return;
		case ComponentAllocationPackage.RES_CONSUMPTION__POWER_CONS:
			setPowerCons(POWER_CONS_EDEFAULT);
			return;
		case ComponentAllocationPackage.RES_CONSUMPTION__COMPONENT:
			setComponent((Component) null);
			return;
		case ComponentAllocationPackage.RES_CONSUMPTION__COMP_UNIT:
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
		case ComponentAllocationPackage.RES_CONSUMPTION__CPU_CONS:
			return cpuCons != CPU_CONS_EDEFAULT;
		case ComponentAllocationPackage.RES_CONSUMPTION__MEMORY_CONS:
			return memoryCons != MEMORY_CONS_EDEFAULT;
		case ComponentAllocationPackage.RES_CONSUMPTION__POWER_CONS:
			return powerCons != POWER_CONS_EDEFAULT;
		case ComponentAllocationPackage.RES_CONSUMPTION__COMPONENT:
			return component != null;
		case ComponentAllocationPackage.RES_CONSUMPTION__COMP_UNIT:
			return compUnit != null;
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
		result.append(" (cpuCons: ");
		result.append(cpuCons);
		result.append(", memoryCons: ");
		result.append(memoryCons);
		result.append(", powerCons: ");
		result.append(powerCons);
		result.append(')');
		return result.toString();
	}

} //ResConsumptionImpl
