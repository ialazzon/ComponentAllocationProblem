/**
 */
package componentAllocation.impl;

import componentAllocation.AllocationConstraint;
import componentAllocation.AllocationProblem;
import componentAllocation.AntiAllocationConstraint;
import componentAllocation.CompUnit;
import componentAllocation.Component;
import componentAllocation.ComponentAllocationFactory;
import componentAllocation.ComponentAllocationPackage;
import componentAllocation.ResConsumption;
import componentAllocation.TradeOffVector;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentAllocationPackageImpl extends EPackageImpl implements ComponentAllocationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tradeOffVectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resConsumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antiAllocationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationProblemEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see componentAllocation.ComponentAllocationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentAllocationPackageImpl() {
		super(eNS_URI, ComponentAllocationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ComponentAllocationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentAllocationPackage init() {
		if (isInited)
			return (ComponentAllocationPackage) EPackage.Registry.INSTANCE
					.getEPackage(ComponentAllocationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredComponentAllocationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ComponentAllocationPackageImpl theComponentAllocationPackage = registeredComponentAllocationPackage instanceof ComponentAllocationPackageImpl
				? (ComponentAllocationPackageImpl) registeredComponentAllocationPackage
				: new ComponentAllocationPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theComponentAllocationPackage.createPackageContents();

		// Initialize created meta-data
		theComponentAllocationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentAllocationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentAllocationPackage.eNS_URI, theComponentAllocationPackage);
		return theComponentAllocationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_CompName() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ResConsumptions() {
		return (EReference) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompUnit() {
		return compUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompUnit_CpuAvail() {
		return (EAttribute) compUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompUnit_MemAvailable() {
		return (EAttribute) compUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompUnit_PowerAvail() {
		return (EAttribute) compUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompUnit_CompUnitName() {
		return (EAttribute) compUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompUnit_ResConsumptions() {
		return (EReference) compUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTradeOffVector() {
		return tradeOffVectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTradeOffVector_CpuFactor() {
		return (EAttribute) tradeOffVectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTradeOffVector_MemoryFactor() {
		return (EAttribute) tradeOffVectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTradeOffVector_PowerFactor() {
		return (EAttribute) tradeOffVectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResConsumption() {
		return resConsumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResConsumption_CpuCons() {
		return (EAttribute) resConsumptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResConsumption_MemoryCons() {
		return (EAttribute) resConsumptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResConsumption_PowerCons() {
		return (EAttribute) resConsumptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResConsumption_Component() {
		return (EReference) resConsumptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResConsumption_CompUnit() {
		return (EReference) resConsumptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationConstraint() {
		return allocationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationConstraint_Component() {
		return (EReference) allocationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationConstraint_CompUnit() {
		return (EReference) allocationConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAntiAllocationConstraint() {
		return antiAllocationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAntiAllocationConstraint_CompUnit() {
		return (EReference) antiAllocationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAntiAllocationConstraint_Component() {
		return (EReference) antiAllocationConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationProblem() {
		return allocationProblemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationProblem_Components() {
		return (EReference) allocationProblemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationProblem_TradeOffvector() {
		return (EReference) allocationProblemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationProblem_CompUnits() {
		return (EReference) allocationProblemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationProblem_AllocationConstraints() {
		return (EReference) allocationProblemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationProblem_AntiAllocationConstraints() {
		return (EReference) allocationProblemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationProblem_ResConsumptions() {
		return (EReference) allocationProblemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllocationProblem_ID() {
		return (EAttribute) allocationProblemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentAllocationFactory getComponentAllocationFactory() {
		return (ComponentAllocationFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__COMP_NAME);
		createEReference(componentEClass, COMPONENT__RES_CONSUMPTIONS);

		compUnitEClass = createEClass(COMP_UNIT);
		createEAttribute(compUnitEClass, COMP_UNIT__CPU_AVAIL);
		createEAttribute(compUnitEClass, COMP_UNIT__MEM_AVAILABLE);
		createEAttribute(compUnitEClass, COMP_UNIT__POWER_AVAIL);
		createEAttribute(compUnitEClass, COMP_UNIT__COMP_UNIT_NAME);
		createEReference(compUnitEClass, COMP_UNIT__RES_CONSUMPTIONS);

		tradeOffVectorEClass = createEClass(TRADE_OFF_VECTOR);
		createEAttribute(tradeOffVectorEClass, TRADE_OFF_VECTOR__CPU_FACTOR);
		createEAttribute(tradeOffVectorEClass, TRADE_OFF_VECTOR__MEMORY_FACTOR);
		createEAttribute(tradeOffVectorEClass, TRADE_OFF_VECTOR__POWER_FACTOR);

		resConsumptionEClass = createEClass(RES_CONSUMPTION);
		createEAttribute(resConsumptionEClass, RES_CONSUMPTION__CPU_CONS);
		createEAttribute(resConsumptionEClass, RES_CONSUMPTION__MEMORY_CONS);
		createEAttribute(resConsumptionEClass, RES_CONSUMPTION__POWER_CONS);
		createEReference(resConsumptionEClass, RES_CONSUMPTION__COMPONENT);
		createEReference(resConsumptionEClass, RES_CONSUMPTION__COMP_UNIT);

		allocationConstraintEClass = createEClass(ALLOCATION_CONSTRAINT);
		createEReference(allocationConstraintEClass, ALLOCATION_CONSTRAINT__COMPONENT);
		createEReference(allocationConstraintEClass, ALLOCATION_CONSTRAINT__COMP_UNIT);

		antiAllocationConstraintEClass = createEClass(ANTI_ALLOCATION_CONSTRAINT);
		createEReference(antiAllocationConstraintEClass, ANTI_ALLOCATION_CONSTRAINT__COMP_UNIT);
		createEReference(antiAllocationConstraintEClass, ANTI_ALLOCATION_CONSTRAINT__COMPONENT);

		allocationProblemEClass = createEClass(ALLOCATION_PROBLEM);
		createEReference(allocationProblemEClass, ALLOCATION_PROBLEM__COMPONENTS);
		createEReference(allocationProblemEClass, ALLOCATION_PROBLEM__TRADE_OFFVECTOR);
		createEReference(allocationProblemEClass, ALLOCATION_PROBLEM__COMP_UNITS);
		createEReference(allocationProblemEClass, ALLOCATION_PROBLEM__ALLOCATION_CONSTRAINTS);
		createEReference(allocationProblemEClass, ALLOCATION_PROBLEM__ANTI_ALLOCATION_CONSTRAINTS);
		createEReference(allocationProblemEClass, ALLOCATION_PROBLEM__RES_CONSUMPTIONS);
		createEAttribute(allocationProblemEClass, ALLOCATION_PROBLEM__ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_CompName(), ecorePackage.getEString(), "compName", null, 0, 1, Component.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ResConsumptions(), this.getResConsumption(), this.getResConsumption_Component(),
				"resConsumptions", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compUnitEClass, CompUnit.class, "CompUnit", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompUnit_CpuAvail(), ecorePackage.getEDouble(), "cpuAvail", null, 0, 1, CompUnit.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompUnit_MemAvailable(), ecorePackage.getEDouble(), "memAvailable", null, 0, 1,
				CompUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompUnit_PowerAvail(), ecorePackage.getEDouble(), "powerAvail", null, 0, 1, CompUnit.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompUnit_CompUnitName(), ecorePackage.getEString(), "compUnitName", null, 0, 1,
				CompUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCompUnit_ResConsumptions(), this.getResConsumption(), this.getResConsumption_CompUnit(),
				"resConsumptions", null, 0, -1, CompUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tradeOffVectorEClass, TradeOffVector.class, "TradeOffVector", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTradeOffVector_CpuFactor(), ecorePackage.getEDouble(), "cpuFactor", null, 0, 1,
				TradeOffVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradeOffVector_MemoryFactor(), ecorePackage.getEDouble(), "memoryFactor", null, 0, 1,
				TradeOffVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradeOffVector_PowerFactor(), ecorePackage.getEDouble(), "powerFactor", null, 0, 1,
				TradeOffVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(resConsumptionEClass, ResConsumption.class, "ResConsumption", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResConsumption_CpuCons(), ecorePackage.getEDouble(), "cpuCons", null, 0, 1,
				ResConsumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getResConsumption_MemoryCons(), ecorePackage.getEDouble(), "memoryCons", null, 0, 1,
				ResConsumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getResConsumption_PowerCons(), ecorePackage.getEDouble(), "powerCons", null, 0, 1,
				ResConsumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getResConsumption_Component(), this.getComponent(), this.getComponent_ResConsumptions(),
				"component", null, 1, 1, ResConsumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResConsumption_CompUnit(), this.getCompUnit(), this.getCompUnit_ResConsumptions(), "compUnit",
				null, 1, 1, ResConsumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationConstraintEClass, AllocationConstraint.class, "AllocationConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocationConstraint_Component(), this.getComponent(), null, "component", null, 1, 1,
				AllocationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationConstraint_CompUnit(), this.getCompUnit(), null, "compUnit", null, 1, 1,
				AllocationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(antiAllocationConstraintEClass, AntiAllocationConstraint.class, "AntiAllocationConstraint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAntiAllocationConstraint_CompUnit(), this.getCompUnit(), null, "compUnit", null, 1, 1,
				AntiAllocationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAntiAllocationConstraint_Component(), this.getComponent(), null, "component", null, 1, 1,
				AntiAllocationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationProblemEClass, AllocationProblem.class, "AllocationProblem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocationProblem_Components(), this.getComponent(), null, "components", null, 1, -1,
				AllocationProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationProblem_TradeOffvector(), this.getTradeOffVector(), null, "tradeOffvector", null, 1,
				1, AllocationProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationProblem_CompUnits(), this.getCompUnit(), null, "compUnits", null, 1, -1,
				AllocationProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationProblem_AllocationConstraints(), this.getAllocationConstraint(), null,
				"allocationConstraints", null, 0, -1, AllocationProblem.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationProblem_AntiAllocationConstraints(), this.getAntiAllocationConstraint(), null,
				"antiAllocationConstraints", null, 0, -1, AllocationProblem.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationProblem_ResConsumptions(), this.getResConsumption(), null, "resConsumptions", null,
				0, -1, AllocationProblem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAllocationProblem_ID(), ecorePackage.getEString(), "ID", null, 0, 1, AllocationProblem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ComponentAllocationPackageImpl
