/**
 */
package componentAllocation.impl;

import componentAllocation.AllocationConstraint;
import componentAllocation.AllocationProblem;
import componentAllocation.AntiAllocationConstraint;
import componentAllocation.CompUnit;
import componentAllocation.Component;
import componentAllocation.ComponentAllocationPackage;
import componentAllocation.ResConsumption;
import componentAllocation.TradeOffVector;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Allocation Problem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentAllocation.impl.AllocationProblemImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link componentAllocation.impl.AllocationProblemImpl#getTradeOffvector <em>Trade Offvector</em>}</li>
 *   <li>{@link componentAllocation.impl.AllocationProblemImpl#getCompUnits <em>Comp Units</em>}</li>
 *   <li>{@link componentAllocation.impl.AllocationProblemImpl#getAllocationConstraints <em>Allocation Constraints</em>}</li>
 *   <li>{@link componentAllocation.impl.AllocationProblemImpl#getAntiAllocationConstraints <em>Anti Allocation Constraints</em>}</li>
 *   <li>{@link componentAllocation.impl.AllocationProblemImpl#getResConsumptions <em>Res Consumptions</em>}</li>
 *   <li>{@link componentAllocation.impl.AllocationProblemImpl#getID <em>ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationProblemImpl extends MinimalEObjectImpl.Container implements AllocationProblem {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getTradeOffvector() <em>Trade Offvector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradeOffvector()
	 * @generated
	 * @ordered
	 */
	protected TradeOffVector tradeOffvector;

	/**
	 * The cached value of the '{@link #getCompUnits() <em>Comp Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<CompUnit> compUnits;

	/**
	 * The cached value of the '{@link #getAllocationConstraints() <em>Allocation Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<AllocationConstraint> allocationConstraints;

	/**
	 * The cached value of the '{@link #getAntiAllocationConstraints() <em>Anti Allocation Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntiAllocationConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<AntiAllocationConstraint> antiAllocationConstraints;

	/**
	 * The cached value of the '{@link #getResConsumptions() <em>Res Consumptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResConsumptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ResConsumption> resConsumptions;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationProblemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentAllocationPackage.Literals.ALLOCATION_PROBLEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this,
					ComponentAllocationPackage.ALLOCATION_PROBLEM__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TradeOffVector getTradeOffvector() {
		return tradeOffvector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTradeOffvector(TradeOffVector newTradeOffvector, NotificationChain msgs) {
		TradeOffVector oldTradeOffvector = tradeOffvector;
		tradeOffvector = newTradeOffvector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ComponentAllocationPackage.ALLOCATION_PROBLEM__TRADE_OFFVECTOR, oldTradeOffvector,
					newTradeOffvector);
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
	public void setTradeOffvector(TradeOffVector newTradeOffvector) {
		if (newTradeOffvector != tradeOffvector) {
			NotificationChain msgs = null;
			if (tradeOffvector != null)
				msgs = ((InternalEObject) tradeOffvector).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ComponentAllocationPackage.ALLOCATION_PROBLEM__TRADE_OFFVECTOR, null,
						msgs);
			if (newTradeOffvector != null)
				msgs = ((InternalEObject) newTradeOffvector).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ComponentAllocationPackage.ALLOCATION_PROBLEM__TRADE_OFFVECTOR, null,
						msgs);
			msgs = basicSetTradeOffvector(newTradeOffvector, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentAllocationPackage.ALLOCATION_PROBLEM__TRADE_OFFVECTOR, newTradeOffvector,
					newTradeOffvector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompUnit> getCompUnits() {
		if (compUnits == null) {
			compUnits = new EObjectContainmentEList<CompUnit>(CompUnit.class, this,
					ComponentAllocationPackage.ALLOCATION_PROBLEM__COMP_UNITS);
		}
		return compUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllocationConstraint> getAllocationConstraints() {
		if (allocationConstraints == null) {
			allocationConstraints = new EObjectContainmentEList<AllocationConstraint>(AllocationConstraint.class, this,
					ComponentAllocationPackage.ALLOCATION_PROBLEM__ALLOCATION_CONSTRAINTS);
		}
		return allocationConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AntiAllocationConstraint> getAntiAllocationConstraints() {
		if (antiAllocationConstraints == null) {
			antiAllocationConstraints = new EObjectContainmentEList<AntiAllocationConstraint>(
					AntiAllocationConstraint.class, this,
					ComponentAllocationPackage.ALLOCATION_PROBLEM__ANTI_ALLOCATION_CONSTRAINTS);
		}
		return antiAllocationConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResConsumption> getResConsumptions() {
		if (resConsumptions == null) {
			resConsumptions = new EObjectContainmentEList<ResConsumption>(ResConsumption.class, this,
					ComponentAllocationPackage.ALLOCATION_PROBLEM__RES_CONSUMPTIONS);
		}
		return resConsumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentAllocationPackage.ALLOCATION_PROBLEM__ID,
					oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__TRADE_OFFVECTOR:
			return basicSetTradeOffvector(null, msgs);
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__COMP_UNITS:
			return ((InternalEList<?>) getCompUnits()).basicRemove(otherEnd, msgs);
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__ALLOCATION_CONSTRAINTS:
			return ((InternalEList<?>) getAllocationConstraints()).basicRemove(otherEnd, msgs);
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__ANTI_ALLOCATION_CONSTRAINTS:
			return ((InternalEList<?>) getAntiAllocationConstraints()).basicRemove(otherEnd, msgs);
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__RES_CONSUMPTIONS:
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
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__COMPONENTS:
			return getComponents();
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__TRADE_OFFVECTOR:
			return getTradeOffvector();
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__COMP_UNITS:
			return getCompUnits();
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__ALLOCATION_CONSTRAINTS:
			return getAllocationConstraints();
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__ANTI_ALLOCATION_CONSTRAINTS:
			return getAntiAllocationConstraints();
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__RES_CONSUMPTIONS:
			return getResConsumptions();
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__ID:
			return getID();
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
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends Component>) newValue);
			return;
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__TRADE_OFFVECTOR:
			setTradeOffvector((TradeOffVector) newValue);
			return;
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__COMP_UNITS:
			getCompUnits().clear();
			getCompUnits().addAll((Collection<? extends CompUnit>) newValue);
			return;
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__ALLOCATION_CONSTRAINTS:
			getAllocationConstraints().clear();
			getAllocationConstraints().addAll((Collection<? extends AllocationConstraint>) newValue);
			return;
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__ANTI_ALLOCATION_CONSTRAINTS:
			getAntiAllocationConstraints().clear();
			getAntiAllocationConstraints().addAll((Collection<? extends AntiAllocationConstraint>) newValue);
			return;
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__RES_CONSUMPTIONS:
			getResConsumptions().clear();
			getResConsumptions().addAll((Collection<? extends ResConsumption>) newValue);
			return;
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__ID:
			setID((String) newValue);
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
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__COMPONENTS:
			getComponents().clear();
			return;
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__TRADE_OFFVECTOR:
			setTradeOffvector((TradeOffVector) null);
			return;
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__COMP_UNITS:
			getCompUnits().clear();
			return;
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__ALLOCATION_CONSTRAINTS:
			getAllocationConstraints().clear();
			return;
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__ANTI_ALLOCATION_CONSTRAINTS:
			getAntiAllocationConstraints().clear();
			return;
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__RES_CONSUMPTIONS:
			getResConsumptions().clear();
			return;
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__ID:
			setID(ID_EDEFAULT);
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
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__COMPONENTS:
			return components != null && !components.isEmpty();
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__TRADE_OFFVECTOR:
			return tradeOffvector != null;
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__COMP_UNITS:
			return compUnits != null && !compUnits.isEmpty();
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__ALLOCATION_CONSTRAINTS:
			return allocationConstraints != null && !allocationConstraints.isEmpty();
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__ANTI_ALLOCATION_CONSTRAINTS:
			return antiAllocationConstraints != null && !antiAllocationConstraints.isEmpty();
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__RES_CONSUMPTIONS:
			return resConsumptions != null && !resConsumptions.isEmpty();
		case ComponentAllocationPackage.ALLOCATION_PROBLEM__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //AllocationProblemImpl
