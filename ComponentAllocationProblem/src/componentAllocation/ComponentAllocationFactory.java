/**
 */
package componentAllocation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see componentAllocation.ComponentAllocationPackage
 * @generated
 */
public interface ComponentAllocationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentAllocationFactory eINSTANCE = componentAllocation.impl.ComponentAllocationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Comp Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comp Unit</em>'.
	 * @generated
	 */
	CompUnit createCompUnit();

	/**
	 * Returns a new object of class '<em>Trade Off Vector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trade Off Vector</em>'.
	 * @generated
	 */
	TradeOffVector createTradeOffVector();

	/**
	 * Returns a new object of class '<em>Res Consumption</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Res Consumption</em>'.
	 * @generated
	 */
	ResConsumption createResConsumption();

	/**
	 * Returns a new object of class '<em>Allocation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocation Constraint</em>'.
	 * @generated
	 */
	AllocationConstraint createAllocationConstraint();

	/**
	 * Returns a new object of class '<em>Anti Allocation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anti Allocation Constraint</em>'.
	 * @generated
	 */
	AntiAllocationConstraint createAntiAllocationConstraint();

	/**
	 * Returns a new object of class '<em>Allocation Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocation Problem</em>'.
	 * @generated
	 */
	AllocationProblem createAllocationProblem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentAllocationPackage getComponentAllocationPackage();

} //ComponentAllocationFactory
