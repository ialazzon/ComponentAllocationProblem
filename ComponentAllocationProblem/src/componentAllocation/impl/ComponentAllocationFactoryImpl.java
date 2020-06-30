/**
 */
package componentAllocation.impl;

import componentAllocation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentAllocationFactoryImpl extends EFactoryImpl implements ComponentAllocationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentAllocationFactory init() {
		try {
			ComponentAllocationFactory theComponentAllocationFactory = (ComponentAllocationFactory) EPackage.Registry.INSTANCE
					.getEFactory(ComponentAllocationPackage.eNS_URI);
			if (theComponentAllocationFactory != null) {
				return theComponentAllocationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentAllocationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentAllocationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ComponentAllocationPackage.COMPONENT:
			return createComponent();
		case ComponentAllocationPackage.COMP_UNIT:
			return createCompUnit();
		case ComponentAllocationPackage.TRADE_OFF_VECTOR:
			return createTradeOffVector();
		case ComponentAllocationPackage.RES_CONSUMPTION:
			return createResConsumption();
		case ComponentAllocationPackage.ALLOCATION_CONSTRAINT:
			return createAllocationConstraint();
		case ComponentAllocationPackage.ANTI_ALLOCATION_CONSTRAINT:
			return createAntiAllocationConstraint();
		case ComponentAllocationPackage.ALLOCATION_PROBLEM:
			return createAllocationProblem();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompUnit createCompUnit() {
		CompUnitImpl compUnit = new CompUnitImpl();
		return compUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TradeOffVector createTradeOffVector() {
		TradeOffVectorImpl tradeOffVector = new TradeOffVectorImpl();
		return tradeOffVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResConsumption createResConsumption() {
		ResConsumptionImpl resConsumption = new ResConsumptionImpl();
		return resConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationConstraint createAllocationConstraint() {
		AllocationConstraintImpl allocationConstraint = new AllocationConstraintImpl();
		return allocationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AntiAllocationConstraint createAntiAllocationConstraint() {
		AntiAllocationConstraintImpl antiAllocationConstraint = new AntiAllocationConstraintImpl();
		return antiAllocationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationProblem createAllocationProblem() {
		AllocationProblemImpl allocationProblem = new AllocationProblemImpl();
		return allocationProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentAllocationPackage getComponentAllocationPackage() {
		return (ComponentAllocationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentAllocationPackage getPackage() {
		return ComponentAllocationPackage.eINSTANCE;
	}

} //ComponentAllocationFactoryImpl
