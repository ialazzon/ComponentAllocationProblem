/**
 */
package componentAllocation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see componentAllocation.ComponentAllocationFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentAllocationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "componentAllocation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/componentAllocation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "componentAllocation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentAllocationPackage eINSTANCE = componentAllocation.impl.ComponentAllocationPackageImpl.init();

	/**
	 * The meta object id for the '{@link componentAllocation.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentAllocation.impl.ComponentImpl
	 * @see componentAllocation.impl.ComponentAllocationPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Comp Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMP_NAME = 0;

	/**
	 * The feature id for the '<em><b>Res Consumptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__RES_CONSUMPTIONS = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentAllocation.impl.CompUnitImpl <em>Comp Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentAllocation.impl.CompUnitImpl
	 * @see componentAllocation.impl.ComponentAllocationPackageImpl#getCompUnit()
	 * @generated
	 */
	int COMP_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Cpu Avail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_UNIT__CPU_AVAIL = 0;

	/**
	 * The feature id for the '<em><b>Mem Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_UNIT__MEM_AVAILABLE = 1;

	/**
	 * The feature id for the '<em><b>Power Avail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_UNIT__POWER_AVAIL = 2;

	/**
	 * The feature id for the '<em><b>Comp Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_UNIT__COMP_UNIT_NAME = 3;

	/**
	 * The feature id for the '<em><b>Res Consumptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_UNIT__RES_CONSUMPTIONS = 4;

	/**
	 * The number of structural features of the '<em>Comp Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_UNIT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Comp Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentAllocation.impl.TradeOffVectorImpl <em>Trade Off Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentAllocation.impl.TradeOffVectorImpl
	 * @see componentAllocation.impl.ComponentAllocationPackageImpl#getTradeOffVector()
	 * @generated
	 */
	int TRADE_OFF_VECTOR = 2;

	/**
	 * The feature id for the '<em><b>Cpu Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_OFF_VECTOR__CPU_FACTOR = 0;

	/**
	 * The feature id for the '<em><b>Memory Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_OFF_VECTOR__MEMORY_FACTOR = 1;

	/**
	 * The feature id for the '<em><b>Power Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_OFF_VECTOR__POWER_FACTOR = 2;

	/**
	 * The number of structural features of the '<em>Trade Off Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_OFF_VECTOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Trade Off Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_OFF_VECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentAllocation.impl.ResConsumptionImpl <em>Res Consumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentAllocation.impl.ResConsumptionImpl
	 * @see componentAllocation.impl.ComponentAllocationPackageImpl#getResConsumption()
	 * @generated
	 */
	int RES_CONSUMPTION = 3;

	/**
	 * The feature id for the '<em><b>Cpu Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_CONSUMPTION__CPU_CONS = 0;

	/**
	 * The feature id for the '<em><b>Memory Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_CONSUMPTION__MEMORY_CONS = 1;

	/**
	 * The feature id for the '<em><b>Power Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_CONSUMPTION__POWER_CONS = 2;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_CONSUMPTION__COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Comp Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_CONSUMPTION__COMP_UNIT = 4;

	/**
	 * The number of structural features of the '<em>Res Consumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_CONSUMPTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Res Consumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_CONSUMPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentAllocation.impl.AllocationConstraintImpl <em>Allocation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentAllocation.impl.AllocationConstraintImpl
	 * @see componentAllocation.impl.ComponentAllocationPackageImpl#getAllocationConstraint()
	 * @generated
	 */
	int ALLOCATION_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONSTRAINT__COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Comp Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONSTRAINT__COMP_UNIT = 1;

	/**
	 * The number of structural features of the '<em>Allocation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Allocation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentAllocation.impl.AntiAllocationConstraintImpl <em>Anti Allocation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentAllocation.impl.AntiAllocationConstraintImpl
	 * @see componentAllocation.impl.ComponentAllocationPackageImpl#getAntiAllocationConstraint()
	 * @generated
	 */
	int ANTI_ALLOCATION_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Comp Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_ALLOCATION_CONSTRAINT__COMP_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_ALLOCATION_CONSTRAINT__COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>Anti Allocation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_ALLOCATION_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Anti Allocation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTI_ALLOCATION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link componentAllocation.impl.AllocationProblemImpl <em>Allocation Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see componentAllocation.impl.AllocationProblemImpl
	 * @see componentAllocation.impl.ComponentAllocationPackageImpl#getAllocationProblem()
	 * @generated
	 */
	int ALLOCATION_PROBLEM = 6;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_PROBLEM__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Trade Offvector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_PROBLEM__TRADE_OFFVECTOR = 1;

	/**
	 * The feature id for the '<em><b>Comp Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_PROBLEM__COMP_UNITS = 2;

	/**
	 * The feature id for the '<em><b>Allocation Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_PROBLEM__ALLOCATION_CONSTRAINTS = 3;

	/**
	 * The feature id for the '<em><b>Anti Allocation Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_PROBLEM__ANTI_ALLOCATION_CONSTRAINTS = 4;

	/**
	 * The feature id for the '<em><b>Res Consumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_PROBLEM__RES_CONSUMPTIONS = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_PROBLEM__ID = 6;

	/**
	 * The number of structural features of the '<em>Allocation Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_PROBLEM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Allocation Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_PROBLEM_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link componentAllocation.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see componentAllocation.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link componentAllocation.Component#getCompName <em>Comp Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comp Name</em>'.
	 * @see componentAllocation.Component#getCompName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_CompName();

	/**
	 * Returns the meta object for the reference list '{@link componentAllocation.Component#getResConsumptions <em>Res Consumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Res Consumptions</em>'.
	 * @see componentAllocation.Component#getResConsumptions()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ResConsumptions();

	/**
	 * Returns the meta object for class '{@link componentAllocation.CompUnit <em>Comp Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comp Unit</em>'.
	 * @see componentAllocation.CompUnit
	 * @generated
	 */
	EClass getCompUnit();

	/**
	 * Returns the meta object for the attribute '{@link componentAllocation.CompUnit#getCpuAvail <em>Cpu Avail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Avail</em>'.
	 * @see componentAllocation.CompUnit#getCpuAvail()
	 * @see #getCompUnit()
	 * @generated
	 */
	EAttribute getCompUnit_CpuAvail();

	/**
	 * Returns the meta object for the attribute '{@link componentAllocation.CompUnit#getMemAvailable <em>Mem Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mem Available</em>'.
	 * @see componentAllocation.CompUnit#getMemAvailable()
	 * @see #getCompUnit()
	 * @generated
	 */
	EAttribute getCompUnit_MemAvailable();

	/**
	 * Returns the meta object for the attribute '{@link componentAllocation.CompUnit#getPowerAvail <em>Power Avail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Avail</em>'.
	 * @see componentAllocation.CompUnit#getPowerAvail()
	 * @see #getCompUnit()
	 * @generated
	 */
	EAttribute getCompUnit_PowerAvail();

	/**
	 * Returns the meta object for the attribute '{@link componentAllocation.CompUnit#getCompUnitName <em>Comp Unit Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comp Unit Name</em>'.
	 * @see componentAllocation.CompUnit#getCompUnitName()
	 * @see #getCompUnit()
	 * @generated
	 */
	EAttribute getCompUnit_CompUnitName();

	/**
	 * Returns the meta object for the reference list '{@link componentAllocation.CompUnit#getResConsumptions <em>Res Consumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Res Consumptions</em>'.
	 * @see componentAllocation.CompUnit#getResConsumptions()
	 * @see #getCompUnit()
	 * @generated
	 */
	EReference getCompUnit_ResConsumptions();

	/**
	 * Returns the meta object for class '{@link componentAllocation.TradeOffVector <em>Trade Off Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trade Off Vector</em>'.
	 * @see componentAllocation.TradeOffVector
	 * @generated
	 */
	EClass getTradeOffVector();

	/**
	 * Returns the meta object for the attribute '{@link componentAllocation.TradeOffVector#getCpuFactor <em>Cpu Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Factor</em>'.
	 * @see componentAllocation.TradeOffVector#getCpuFactor()
	 * @see #getTradeOffVector()
	 * @generated
	 */
	EAttribute getTradeOffVector_CpuFactor();

	/**
	 * Returns the meta object for the attribute '{@link componentAllocation.TradeOffVector#getMemoryFactor <em>Memory Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Factor</em>'.
	 * @see componentAllocation.TradeOffVector#getMemoryFactor()
	 * @see #getTradeOffVector()
	 * @generated
	 */
	EAttribute getTradeOffVector_MemoryFactor();

	/**
	 * Returns the meta object for the attribute '{@link componentAllocation.TradeOffVector#getPowerFactor <em>Power Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Factor</em>'.
	 * @see componentAllocation.TradeOffVector#getPowerFactor()
	 * @see #getTradeOffVector()
	 * @generated
	 */
	EAttribute getTradeOffVector_PowerFactor();

	/**
	 * Returns the meta object for class '{@link componentAllocation.ResConsumption <em>Res Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Consumption</em>'.
	 * @see componentAllocation.ResConsumption
	 * @generated
	 */
	EClass getResConsumption();

	/**
	 * Returns the meta object for the attribute '{@link componentAllocation.ResConsumption#getCpuCons <em>Cpu Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Cons</em>'.
	 * @see componentAllocation.ResConsumption#getCpuCons()
	 * @see #getResConsumption()
	 * @generated
	 */
	EAttribute getResConsumption_CpuCons();

	/**
	 * Returns the meta object for the attribute '{@link componentAllocation.ResConsumption#getMemoryCons <em>Memory Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Cons</em>'.
	 * @see componentAllocation.ResConsumption#getMemoryCons()
	 * @see #getResConsumption()
	 * @generated
	 */
	EAttribute getResConsumption_MemoryCons();

	/**
	 * Returns the meta object for the attribute '{@link componentAllocation.ResConsumption#getPowerCons <em>Power Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Cons</em>'.
	 * @see componentAllocation.ResConsumption#getPowerCons()
	 * @see #getResConsumption()
	 * @generated
	 */
	EAttribute getResConsumption_PowerCons();

	/**
	 * Returns the meta object for the reference '{@link componentAllocation.ResConsumption#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see componentAllocation.ResConsumption#getComponent()
	 * @see #getResConsumption()
	 * @generated
	 */
	EReference getResConsumption_Component();

	/**
	 * Returns the meta object for the reference '{@link componentAllocation.ResConsumption#getCompUnit <em>Comp Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comp Unit</em>'.
	 * @see componentAllocation.ResConsumption#getCompUnit()
	 * @see #getResConsumption()
	 * @generated
	 */
	EReference getResConsumption_CompUnit();

	/**
	 * Returns the meta object for class '{@link componentAllocation.AllocationConstraint <em>Allocation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation Constraint</em>'.
	 * @see componentAllocation.AllocationConstraint
	 * @generated
	 */
	EClass getAllocationConstraint();

	/**
	 * Returns the meta object for the reference '{@link componentAllocation.AllocationConstraint#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see componentAllocation.AllocationConstraint#getComponent()
	 * @see #getAllocationConstraint()
	 * @generated
	 */
	EReference getAllocationConstraint_Component();

	/**
	 * Returns the meta object for the reference '{@link componentAllocation.AllocationConstraint#getCompUnit <em>Comp Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comp Unit</em>'.
	 * @see componentAllocation.AllocationConstraint#getCompUnit()
	 * @see #getAllocationConstraint()
	 * @generated
	 */
	EReference getAllocationConstraint_CompUnit();

	/**
	 * Returns the meta object for class '{@link componentAllocation.AntiAllocationConstraint <em>Anti Allocation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anti Allocation Constraint</em>'.
	 * @see componentAllocation.AntiAllocationConstraint
	 * @generated
	 */
	EClass getAntiAllocationConstraint();

	/**
	 * Returns the meta object for the reference '{@link componentAllocation.AntiAllocationConstraint#getCompUnit <em>Comp Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comp Unit</em>'.
	 * @see componentAllocation.AntiAllocationConstraint#getCompUnit()
	 * @see #getAntiAllocationConstraint()
	 * @generated
	 */
	EReference getAntiAllocationConstraint_CompUnit();

	/**
	 * Returns the meta object for the reference '{@link componentAllocation.AntiAllocationConstraint#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see componentAllocation.AntiAllocationConstraint#getComponent()
	 * @see #getAntiAllocationConstraint()
	 * @generated
	 */
	EReference getAntiAllocationConstraint_Component();

	/**
	 * Returns the meta object for class '{@link componentAllocation.AllocationProblem <em>Allocation Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation Problem</em>'.
	 * @see componentAllocation.AllocationProblem
	 * @generated
	 */
	EClass getAllocationProblem();

	/**
	 * Returns the meta object for the containment reference list '{@link componentAllocation.AllocationProblem#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see componentAllocation.AllocationProblem#getComponents()
	 * @see #getAllocationProblem()
	 * @generated
	 */
	EReference getAllocationProblem_Components();

	/**
	 * Returns the meta object for the containment reference '{@link componentAllocation.AllocationProblem#getTradeOffvector <em>Trade Offvector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trade Offvector</em>'.
	 * @see componentAllocation.AllocationProblem#getTradeOffvector()
	 * @see #getAllocationProblem()
	 * @generated
	 */
	EReference getAllocationProblem_TradeOffvector();

	/**
	 * Returns the meta object for the containment reference list '{@link componentAllocation.AllocationProblem#getCompUnits <em>Comp Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comp Units</em>'.
	 * @see componentAllocation.AllocationProblem#getCompUnits()
	 * @see #getAllocationProblem()
	 * @generated
	 */
	EReference getAllocationProblem_CompUnits();

	/**
	 * Returns the meta object for the containment reference list '{@link componentAllocation.AllocationProblem#getAllocationConstraints <em>Allocation Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allocation Constraints</em>'.
	 * @see componentAllocation.AllocationProblem#getAllocationConstraints()
	 * @see #getAllocationProblem()
	 * @generated
	 */
	EReference getAllocationProblem_AllocationConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link componentAllocation.AllocationProblem#getAntiAllocationConstraints <em>Anti Allocation Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anti Allocation Constraints</em>'.
	 * @see componentAllocation.AllocationProblem#getAntiAllocationConstraints()
	 * @see #getAllocationProblem()
	 * @generated
	 */
	EReference getAllocationProblem_AntiAllocationConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link componentAllocation.AllocationProblem#getResConsumptions <em>Res Consumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Res Consumptions</em>'.
	 * @see componentAllocation.AllocationProblem#getResConsumptions()
	 * @see #getAllocationProblem()
	 * @generated
	 */
	EReference getAllocationProblem_ResConsumptions();

	/**
	 * Returns the meta object for the attribute '{@link componentAllocation.AllocationProblem#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see componentAllocation.AllocationProblem#getID()
	 * @see #getAllocationProblem()
	 * @generated
	 */
	EAttribute getAllocationProblem_ID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentAllocationFactory getComponentAllocationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link componentAllocation.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentAllocation.impl.ComponentImpl
		 * @see componentAllocation.impl.ComponentAllocationPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Comp Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__COMP_NAME = eINSTANCE.getComponent_CompName();

		/**
		 * The meta object literal for the '<em><b>Res Consumptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__RES_CONSUMPTIONS = eINSTANCE.getComponent_ResConsumptions();

		/**
		 * The meta object literal for the '{@link componentAllocation.impl.CompUnitImpl <em>Comp Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentAllocation.impl.CompUnitImpl
		 * @see componentAllocation.impl.ComponentAllocationPackageImpl#getCompUnit()
		 * @generated
		 */
		EClass COMP_UNIT = eINSTANCE.getCompUnit();

		/**
		 * The meta object literal for the '<em><b>Cpu Avail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMP_UNIT__CPU_AVAIL = eINSTANCE.getCompUnit_CpuAvail();

		/**
		 * The meta object literal for the '<em><b>Mem Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMP_UNIT__MEM_AVAILABLE = eINSTANCE.getCompUnit_MemAvailable();

		/**
		 * The meta object literal for the '<em><b>Power Avail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMP_UNIT__POWER_AVAIL = eINSTANCE.getCompUnit_PowerAvail();

		/**
		 * The meta object literal for the '<em><b>Comp Unit Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMP_UNIT__COMP_UNIT_NAME = eINSTANCE.getCompUnit_CompUnitName();

		/**
		 * The meta object literal for the '<em><b>Res Consumptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_UNIT__RES_CONSUMPTIONS = eINSTANCE.getCompUnit_ResConsumptions();

		/**
		 * The meta object literal for the '{@link componentAllocation.impl.TradeOffVectorImpl <em>Trade Off Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentAllocation.impl.TradeOffVectorImpl
		 * @see componentAllocation.impl.ComponentAllocationPackageImpl#getTradeOffVector()
		 * @generated
		 */
		EClass TRADE_OFF_VECTOR = eINSTANCE.getTradeOffVector();

		/**
		 * The meta object literal for the '<em><b>Cpu Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADE_OFF_VECTOR__CPU_FACTOR = eINSTANCE.getTradeOffVector_CpuFactor();

		/**
		 * The meta object literal for the '<em><b>Memory Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADE_OFF_VECTOR__MEMORY_FACTOR = eINSTANCE.getTradeOffVector_MemoryFactor();

		/**
		 * The meta object literal for the '<em><b>Power Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADE_OFF_VECTOR__POWER_FACTOR = eINSTANCE.getTradeOffVector_PowerFactor();

		/**
		 * The meta object literal for the '{@link componentAllocation.impl.ResConsumptionImpl <em>Res Consumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentAllocation.impl.ResConsumptionImpl
		 * @see componentAllocation.impl.ComponentAllocationPackageImpl#getResConsumption()
		 * @generated
		 */
		EClass RES_CONSUMPTION = eINSTANCE.getResConsumption();

		/**
		 * The meta object literal for the '<em><b>Cpu Cons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_CONSUMPTION__CPU_CONS = eINSTANCE.getResConsumption_CpuCons();

		/**
		 * The meta object literal for the '<em><b>Memory Cons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_CONSUMPTION__MEMORY_CONS = eINSTANCE.getResConsumption_MemoryCons();

		/**
		 * The meta object literal for the '<em><b>Power Cons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_CONSUMPTION__POWER_CONS = eINSTANCE.getResConsumption_PowerCons();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_CONSUMPTION__COMPONENT = eINSTANCE.getResConsumption_Component();

		/**
		 * The meta object literal for the '<em><b>Comp Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_CONSUMPTION__COMP_UNIT = eINSTANCE.getResConsumption_CompUnit();

		/**
		 * The meta object literal for the '{@link componentAllocation.impl.AllocationConstraintImpl <em>Allocation Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentAllocation.impl.AllocationConstraintImpl
		 * @see componentAllocation.impl.ComponentAllocationPackageImpl#getAllocationConstraint()
		 * @generated
		 */
		EClass ALLOCATION_CONSTRAINT = eINSTANCE.getAllocationConstraint();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_CONSTRAINT__COMPONENT = eINSTANCE.getAllocationConstraint_Component();

		/**
		 * The meta object literal for the '<em><b>Comp Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_CONSTRAINT__COMP_UNIT = eINSTANCE.getAllocationConstraint_CompUnit();

		/**
		 * The meta object literal for the '{@link componentAllocation.impl.AntiAllocationConstraintImpl <em>Anti Allocation Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentAllocation.impl.AntiAllocationConstraintImpl
		 * @see componentAllocation.impl.ComponentAllocationPackageImpl#getAntiAllocationConstraint()
		 * @generated
		 */
		EClass ANTI_ALLOCATION_CONSTRAINT = eINSTANCE.getAntiAllocationConstraint();

		/**
		 * The meta object literal for the '<em><b>Comp Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTI_ALLOCATION_CONSTRAINT__COMP_UNIT = eINSTANCE.getAntiAllocationConstraint_CompUnit();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTI_ALLOCATION_CONSTRAINT__COMPONENT = eINSTANCE.getAntiAllocationConstraint_Component();

		/**
		 * The meta object literal for the '{@link componentAllocation.impl.AllocationProblemImpl <em>Allocation Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see componentAllocation.impl.AllocationProblemImpl
		 * @see componentAllocation.impl.ComponentAllocationPackageImpl#getAllocationProblem()
		 * @generated
		 */
		EClass ALLOCATION_PROBLEM = eINSTANCE.getAllocationProblem();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_PROBLEM__COMPONENTS = eINSTANCE.getAllocationProblem_Components();

		/**
		 * The meta object literal for the '<em><b>Trade Offvector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_PROBLEM__TRADE_OFFVECTOR = eINSTANCE.getAllocationProblem_TradeOffvector();

		/**
		 * The meta object literal for the '<em><b>Comp Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_PROBLEM__COMP_UNITS = eINSTANCE.getAllocationProblem_CompUnits();

		/**
		 * The meta object literal for the '<em><b>Allocation Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_PROBLEM__ALLOCATION_CONSTRAINTS = eINSTANCE.getAllocationProblem_AllocationConstraints();

		/**
		 * The meta object literal for the '<em><b>Anti Allocation Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_PROBLEM__ANTI_ALLOCATION_CONSTRAINTS = eINSTANCE
				.getAllocationProblem_AntiAllocationConstraints();

		/**
		 * The meta object literal for the '<em><b>Res Consumptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_PROBLEM__RES_CONSUMPTIONS = eINSTANCE.getAllocationProblem_ResConsumptions();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOCATION_PROBLEM__ID = eINSTANCE.getAllocationProblem_ID();

	}

} //ComponentAllocationPackage
