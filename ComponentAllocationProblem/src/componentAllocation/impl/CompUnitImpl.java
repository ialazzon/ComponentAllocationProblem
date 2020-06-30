/**
 */
package componentAllocation.impl;

import componentAllocation.CompUnit;
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
 * An implementation of the model object '<em><b>Comp Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentAllocation.impl.CompUnitImpl#getCpuAvail <em>Cpu Avail</em>}</li>
 *   <li>{@link componentAllocation.impl.CompUnitImpl#getMemAvailable <em>Mem Available</em>}</li>
 *   <li>{@link componentAllocation.impl.CompUnitImpl#getPowerAvail <em>Power Avail</em>}</li>
 *   <li>{@link componentAllocation.impl.CompUnitImpl#getCompUnitName <em>Comp Unit Name</em>}</li>
 *   <li>{@link componentAllocation.impl.CompUnitImpl#getResConsumptions <em>Res Consumptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompUnitImpl extends MinimalEObjectImpl.Container implements CompUnit {
	/**
	 * The default value of the '{@link #getCpuAvail() <em>Cpu Avail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuAvail()
	 * @generated
	 * @ordered
	 */
	protected static final double CPU_AVAIL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCpuAvail() <em>Cpu Avail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuAvail()
	 * @generated
	 * @ordered
	 */
	protected double cpuAvail = CPU_AVAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemAvailable() <em>Mem Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final double MEM_AVAILABLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMemAvailable() <em>Mem Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemAvailable()
	 * @generated
	 * @ordered
	 */
	protected double memAvailable = MEM_AVAILABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerAvail() <em>Power Avail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerAvail()
	 * @generated
	 * @ordered
	 */
	protected static final double POWER_AVAIL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPowerAvail() <em>Power Avail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerAvail()
	 * @generated
	 * @ordered
	 */
	protected double powerAvail = POWER_AVAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompUnitName() <em>Comp Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompUnitName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMP_UNIT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompUnitName() <em>Comp Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompUnitName()
	 * @generated
	 * @ordered
	 */
	protected String compUnitName = COMP_UNIT_NAME_EDEFAULT;

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
	protected CompUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentAllocationPackage.Literals.COMP_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCpuAvail() {
		return cpuAvail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuAvail(double newCpuAvail) {
		double oldCpuAvail = cpuAvail;
		cpuAvail = newCpuAvail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentAllocationPackage.COMP_UNIT__CPU_AVAIL,
					oldCpuAvail, cpuAvail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMemAvailable() {
		return memAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemAvailable(double newMemAvailable) {
		double oldMemAvailable = memAvailable;
		memAvailable = newMemAvailable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentAllocationPackage.COMP_UNIT__MEM_AVAILABLE,
					oldMemAvailable, memAvailable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPowerAvail() {
		return powerAvail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerAvail(double newPowerAvail) {
		double oldPowerAvail = powerAvail;
		powerAvail = newPowerAvail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentAllocationPackage.COMP_UNIT__POWER_AVAIL,
					oldPowerAvail, powerAvail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompUnitName() {
		return compUnitName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompUnitName(String newCompUnitName) {
		String oldCompUnitName = compUnitName;
		compUnitName = newCompUnitName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentAllocationPackage.COMP_UNIT__COMP_UNIT_NAME,
					oldCompUnitName, compUnitName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResConsumption> getResConsumptions() {
		if (resConsumptions == null) {
			resConsumptions = new EObjectWithInverseResolvingEList<ResConsumption>(ResConsumption.class, this,
					ComponentAllocationPackage.COMP_UNIT__RES_CONSUMPTIONS,
					ComponentAllocationPackage.RES_CONSUMPTION__COMP_UNIT);
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
		case ComponentAllocationPackage.COMP_UNIT__RES_CONSUMPTIONS:
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
		case ComponentAllocationPackage.COMP_UNIT__RES_CONSUMPTIONS:
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
		case ComponentAllocationPackage.COMP_UNIT__CPU_AVAIL:
			return getCpuAvail();
		case ComponentAllocationPackage.COMP_UNIT__MEM_AVAILABLE:
			return getMemAvailable();
		case ComponentAllocationPackage.COMP_UNIT__POWER_AVAIL:
			return getPowerAvail();
		case ComponentAllocationPackage.COMP_UNIT__COMP_UNIT_NAME:
			return getCompUnitName();
		case ComponentAllocationPackage.COMP_UNIT__RES_CONSUMPTIONS:
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
		case ComponentAllocationPackage.COMP_UNIT__CPU_AVAIL:
			setCpuAvail((Double) newValue);
			return;
		case ComponentAllocationPackage.COMP_UNIT__MEM_AVAILABLE:
			setMemAvailable((Double) newValue);
			return;
		case ComponentAllocationPackage.COMP_UNIT__POWER_AVAIL:
			setPowerAvail((Double) newValue);
			return;
		case ComponentAllocationPackage.COMP_UNIT__COMP_UNIT_NAME:
			setCompUnitName((String) newValue);
			return;
		case ComponentAllocationPackage.COMP_UNIT__RES_CONSUMPTIONS:
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
		case ComponentAllocationPackage.COMP_UNIT__CPU_AVAIL:
			setCpuAvail(CPU_AVAIL_EDEFAULT);
			return;
		case ComponentAllocationPackage.COMP_UNIT__MEM_AVAILABLE:
			setMemAvailable(MEM_AVAILABLE_EDEFAULT);
			return;
		case ComponentAllocationPackage.COMP_UNIT__POWER_AVAIL:
			setPowerAvail(POWER_AVAIL_EDEFAULT);
			return;
		case ComponentAllocationPackage.COMP_UNIT__COMP_UNIT_NAME:
			setCompUnitName(COMP_UNIT_NAME_EDEFAULT);
			return;
		case ComponentAllocationPackage.COMP_UNIT__RES_CONSUMPTIONS:
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
		case ComponentAllocationPackage.COMP_UNIT__CPU_AVAIL:
			return cpuAvail != CPU_AVAIL_EDEFAULT;
		case ComponentAllocationPackage.COMP_UNIT__MEM_AVAILABLE:
			return memAvailable != MEM_AVAILABLE_EDEFAULT;
		case ComponentAllocationPackage.COMP_UNIT__POWER_AVAIL:
			return powerAvail != POWER_AVAIL_EDEFAULT;
		case ComponentAllocationPackage.COMP_UNIT__COMP_UNIT_NAME:
			return COMP_UNIT_NAME_EDEFAULT == null ? compUnitName != null
					: !COMP_UNIT_NAME_EDEFAULT.equals(compUnitName);
		case ComponentAllocationPackage.COMP_UNIT__RES_CONSUMPTIONS:
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
		result.append(" (cpuAvail: ");
		result.append(cpuAvail);
		result.append(", memAvailable: ");
		result.append(memAvailable);
		result.append(", powerAvail: ");
		result.append(powerAvail);
		result.append(", compUnitName: ");
		result.append(compUnitName);
		result.append(')');
		return result.toString();
	}

} //CompUnitImpl
