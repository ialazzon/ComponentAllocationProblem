/**
 */
package componentAllocation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentAllocation.AllocationConstraint#getComponent <em>Component</em>}</li>
 *   <li>{@link componentAllocation.AllocationConstraint#getCompUnit <em>Comp Unit</em>}</li>
 * </ul>
 *
 * @see componentAllocation.ComponentAllocationPackage#getAllocationConstraint()
 * @model
 * @generated
 */
public interface AllocationConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see componentAllocation.ComponentAllocationPackage#getAllocationConstraint_Component()
	 * @model required="true"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link componentAllocation.AllocationConstraint#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Comp Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp Unit</em>' reference.
	 * @see #setCompUnit(CompUnit)
	 * @see componentAllocation.ComponentAllocationPackage#getAllocationConstraint_CompUnit()
	 * @model required="true"
	 * @generated
	 */
	CompUnit getCompUnit();

	/**
	 * Sets the value of the '{@link componentAllocation.AllocationConstraint#getCompUnit <em>Comp Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp Unit</em>' reference.
	 * @see #getCompUnit()
	 * @generated
	 */
	void setCompUnit(CompUnit value);

} // AllocationConstraint
