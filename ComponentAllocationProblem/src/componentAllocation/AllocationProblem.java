/**
 */
package componentAllocation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentAllocation.AllocationProblem#getComponents <em>Components</em>}</li>
 *   <li>{@link componentAllocation.AllocationProblem#getTradeOffvector <em>Trade Offvector</em>}</li>
 *   <li>{@link componentAllocation.AllocationProblem#getCompUnits <em>Comp Units</em>}</li>
 *   <li>{@link componentAllocation.AllocationProblem#getAllocationConstraints <em>Allocation Constraints</em>}</li>
 *   <li>{@link componentAllocation.AllocationProblem#getAntiAllocationConstraints <em>Anti Allocation Constraints</em>}</li>
 *   <li>{@link componentAllocation.AllocationProblem#getResConsumptions <em>Res Consumptions</em>}</li>
 *   <li>{@link componentAllocation.AllocationProblem#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see componentAllocation.ComponentAllocationPackage#getAllocationProblem()
 * @model
 * @generated
 */
public interface AllocationProblem extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link componentAllocation.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see componentAllocation.ComponentAllocationPackage#getAllocationProblem_Components()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Trade Offvector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trade Offvector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trade Offvector</em>' containment reference.
	 * @see #setTradeOffvector(TradeOffVector)
	 * @see componentAllocation.ComponentAllocationPackage#getAllocationProblem_TradeOffvector()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TradeOffVector getTradeOffvector();

	/**
	 * Sets the value of the '{@link componentAllocation.AllocationProblem#getTradeOffvector <em>Trade Offvector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trade Offvector</em>' containment reference.
	 * @see #getTradeOffvector()
	 * @generated
	 */
	void setTradeOffvector(TradeOffVector value);

	/**
	 * Returns the value of the '<em><b>Comp Units</b></em>' containment reference list.
	 * The list contents are of type {@link componentAllocation.CompUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp Units</em>' containment reference list.
	 * @see componentAllocation.ComponentAllocationPackage#getAllocationProblem_CompUnits()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CompUnit> getCompUnits();

	/**
	 * Returns the value of the '<em><b>Allocation Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link componentAllocation.AllocationConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Constraints</em>' containment reference list.
	 * @see componentAllocation.ComponentAllocationPackage#getAllocationProblem_AllocationConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<AllocationConstraint> getAllocationConstraints();

	/**
	 * Returns the value of the '<em><b>Anti Allocation Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link componentAllocation.AntiAllocationConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anti Allocation Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anti Allocation Constraints</em>' containment reference list.
	 * @see componentAllocation.ComponentAllocationPackage#getAllocationProblem_AntiAllocationConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<AntiAllocationConstraint> getAntiAllocationConstraints();

	/**
	 * Returns the value of the '<em><b>Res Consumptions</b></em>' containment reference list.
	 * The list contents are of type {@link componentAllocation.ResConsumption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Consumptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Consumptions</em>' containment reference list.
	 * @see componentAllocation.ComponentAllocationPackage#getAllocationProblem_ResConsumptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResConsumption> getResConsumptions();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see componentAllocation.ComponentAllocationPackage#getAllocationProblem_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link componentAllocation.AllocationProblem#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // AllocationProblem
