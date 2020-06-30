/**
 */
package componentAllocation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Res Consumption</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentAllocation.ResConsumption#getCpuCons <em>Cpu Cons</em>}</li>
 *   <li>{@link componentAllocation.ResConsumption#getMemoryCons <em>Memory Cons</em>}</li>
 *   <li>{@link componentAllocation.ResConsumption#getPowerCons <em>Power Cons</em>}</li>
 *   <li>{@link componentAllocation.ResConsumption#getComponent <em>Component</em>}</li>
 *   <li>{@link componentAllocation.ResConsumption#getCompUnit <em>Comp Unit</em>}</li>
 * </ul>
 *
 * @see componentAllocation.ComponentAllocationPackage#getResConsumption()
 * @model
 * @generated
 */
public interface ResConsumption extends EObject {
	/**
	 * Returns the value of the '<em><b>Cpu Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu Cons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Cons</em>' attribute.
	 * @see #setCpuCons(double)
	 * @see componentAllocation.ComponentAllocationPackage#getResConsumption_CpuCons()
	 * @model
	 * @generated
	 */
	double getCpuCons();

	/**
	 * Sets the value of the '{@link componentAllocation.ResConsumption#getCpuCons <em>Cpu Cons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Cons</em>' attribute.
	 * @see #getCpuCons()
	 * @generated
	 */
	void setCpuCons(double value);

	/**
	 * Returns the value of the '<em><b>Memory Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Cons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Cons</em>' attribute.
	 * @see #setMemoryCons(double)
	 * @see componentAllocation.ComponentAllocationPackage#getResConsumption_MemoryCons()
	 * @model
	 * @generated
	 */
	double getMemoryCons();

	/**
	 * Sets the value of the '{@link componentAllocation.ResConsumption#getMemoryCons <em>Memory Cons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Cons</em>' attribute.
	 * @see #getMemoryCons()
	 * @generated
	 */
	void setMemoryCons(double value);

	/**
	 * Returns the value of the '<em><b>Power Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Cons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Cons</em>' attribute.
	 * @see #setPowerCons(double)
	 * @see componentAllocation.ComponentAllocationPackage#getResConsumption_PowerCons()
	 * @model
	 * @generated
	 */
	double getPowerCons();

	/**
	 * Sets the value of the '{@link componentAllocation.ResConsumption#getPowerCons <em>Power Cons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Cons</em>' attribute.
	 * @see #getPowerCons()
	 * @generated
	 */
	void setPowerCons(double value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link componentAllocation.Component#getResConsumptions <em>Res Consumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see componentAllocation.ComponentAllocationPackage#getResConsumption_Component()
	 * @see componentAllocation.Component#getResConsumptions
	 * @model opposite="resConsumptions" required="true"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link componentAllocation.ResConsumption#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Comp Unit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link componentAllocation.CompUnit#getResConsumptions <em>Res Consumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp Unit</em>' reference.
	 * @see #setCompUnit(CompUnit)
	 * @see componentAllocation.ComponentAllocationPackage#getResConsumption_CompUnit()
	 * @see componentAllocation.CompUnit#getResConsumptions
	 * @model opposite="resConsumptions" required="true"
	 * @generated
	 */
	CompUnit getCompUnit();

	/**
	 * Sets the value of the '{@link componentAllocation.ResConsumption#getCompUnit <em>Comp Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp Unit</em>' reference.
	 * @see #getCompUnit()
	 * @generated
	 */
	void setCompUnit(CompUnit value);

} // ResConsumption
