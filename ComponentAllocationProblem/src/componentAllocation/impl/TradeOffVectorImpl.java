/**
 */
package componentAllocation.impl;

import componentAllocation.ComponentAllocationPackage;
import componentAllocation.TradeOffVector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trade Off Vector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentAllocation.impl.TradeOffVectorImpl#getCpuFactor <em>Cpu Factor</em>}</li>
 *   <li>{@link componentAllocation.impl.TradeOffVectorImpl#getMemoryFactor <em>Memory Factor</em>}</li>
 *   <li>{@link componentAllocation.impl.TradeOffVectorImpl#getPowerFactor <em>Power Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TradeOffVectorImpl extends MinimalEObjectImpl.Container implements TradeOffVector {
	/**
	 * The default value of the '{@link #getCpuFactor() <em>Cpu Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double CPU_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCpuFactor() <em>Cpu Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuFactor()
	 * @generated
	 * @ordered
	 */
	protected double cpuFactor = CPU_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryFactor() <em>Memory Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double MEMORY_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMemoryFactor() <em>Memory Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryFactor()
	 * @generated
	 * @ordered
	 */
	protected double memoryFactor = MEMORY_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerFactor() <em>Power Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double POWER_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPowerFactor() <em>Power Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerFactor()
	 * @generated
	 * @ordered
	 */
	protected double powerFactor = POWER_FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TradeOffVectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentAllocationPackage.Literals.TRADE_OFF_VECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCpuFactor() {
		return cpuFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuFactor(double newCpuFactor) {
		double oldCpuFactor = cpuFactor;
		cpuFactor = newCpuFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentAllocationPackage.TRADE_OFF_VECTOR__CPU_FACTOR, oldCpuFactor, cpuFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMemoryFactor() {
		return memoryFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryFactor(double newMemoryFactor) {
		double oldMemoryFactor = memoryFactor;
		memoryFactor = newMemoryFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentAllocationPackage.TRADE_OFF_VECTOR__MEMORY_FACTOR, oldMemoryFactor, memoryFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPowerFactor() {
		return powerFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerFactor(double newPowerFactor) {
		double oldPowerFactor = powerFactor;
		powerFactor = newPowerFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentAllocationPackage.TRADE_OFF_VECTOR__POWER_FACTOR, oldPowerFactor, powerFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComponentAllocationPackage.TRADE_OFF_VECTOR__CPU_FACTOR:
			return getCpuFactor();
		case ComponentAllocationPackage.TRADE_OFF_VECTOR__MEMORY_FACTOR:
			return getMemoryFactor();
		case ComponentAllocationPackage.TRADE_OFF_VECTOR__POWER_FACTOR:
			return getPowerFactor();
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
		case ComponentAllocationPackage.TRADE_OFF_VECTOR__CPU_FACTOR:
			setCpuFactor((Double) newValue);
			return;
		case ComponentAllocationPackage.TRADE_OFF_VECTOR__MEMORY_FACTOR:
			setMemoryFactor((Double) newValue);
			return;
		case ComponentAllocationPackage.TRADE_OFF_VECTOR__POWER_FACTOR:
			setPowerFactor((Double) newValue);
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
		case ComponentAllocationPackage.TRADE_OFF_VECTOR__CPU_FACTOR:
			setCpuFactor(CPU_FACTOR_EDEFAULT);
			return;
		case ComponentAllocationPackage.TRADE_OFF_VECTOR__MEMORY_FACTOR:
			setMemoryFactor(MEMORY_FACTOR_EDEFAULT);
			return;
		case ComponentAllocationPackage.TRADE_OFF_VECTOR__POWER_FACTOR:
			setPowerFactor(POWER_FACTOR_EDEFAULT);
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
		case ComponentAllocationPackage.TRADE_OFF_VECTOR__CPU_FACTOR:
			return cpuFactor != CPU_FACTOR_EDEFAULT;
		case ComponentAllocationPackage.TRADE_OFF_VECTOR__MEMORY_FACTOR:
			return memoryFactor != MEMORY_FACTOR_EDEFAULT;
		case ComponentAllocationPackage.TRADE_OFF_VECTOR__POWER_FACTOR:
			return powerFactor != POWER_FACTOR_EDEFAULT;
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
		result.append(" (cpuFactor: ");
		result.append(cpuFactor);
		result.append(", memoryFactor: ");
		result.append(memoryFactor);
		result.append(", powerFactor: ");
		result.append(powerFactor);
		result.append(')');
		return result.toString();
	}

} //TradeOffVectorImpl
