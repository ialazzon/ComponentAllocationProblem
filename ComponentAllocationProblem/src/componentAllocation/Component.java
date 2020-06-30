/**
 */
package componentAllocation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentAllocation.Component#getCompName <em>Comp Name</em>}</li>
 *   <li>{@link componentAllocation.Component#getResConsumptions <em>Res Consumptions</em>}</li>
 * </ul>
 *
 * @see componentAllocation.ComponentAllocationPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Comp Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp Name</em>' attribute.
	 * @see #setCompName(String)
	 * @see componentAllocation.ComponentAllocationPackage#getComponent_CompName()
	 * @model
	 * @generated
	 */
	String getCompName();

	/**
	 * Sets the value of the '{@link componentAllocation.Component#getCompName <em>Comp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp Name</em>' attribute.
	 * @see #getCompName()
	 * @generated
	 */
	void setCompName(String value);

	/**
	 * Returns the value of the '<em><b>Res Consumptions</b></em>' reference list.
	 * The list contents are of type {@link componentAllocation.ResConsumption}.
	 * It is bidirectional and its opposite is '{@link componentAllocation.ResConsumption#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Consumptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Consumptions</em>' reference list.
	 * @see componentAllocation.ComponentAllocationPackage#getComponent_ResConsumptions()
	 * @see componentAllocation.ResConsumption#getComponent
	 * @model opposite="component"
	 * @generated
	 */
	EList<ResConsumption> getResConsumptions();

} // Component
