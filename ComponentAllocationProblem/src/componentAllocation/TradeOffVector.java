/**
 */
package componentAllocation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trade Off Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentAllocation.TradeOffVector#getCpuFactor <em>Cpu Factor</em>}</li>
 *   <li>{@link componentAllocation.TradeOffVector#getMemoryFactor <em>Memory Factor</em>}</li>
 *   <li>{@link componentAllocation.TradeOffVector#getPowerFactor <em>Power Factor</em>}</li>
 * </ul>
 *
 * @see componentAllocation.ComponentAllocationPackage#getTradeOffVector()
 * @model
 * @generated
 */
public interface TradeOffVector extends EObject {
	/**
	 * Returns the value of the '<em><b>Cpu Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Factor</em>' attribute.
	 * @see #setCpuFactor(double)
	 * @see componentAllocation.ComponentAllocationPackage#getTradeOffVector_CpuFactor()
	 * @model
	 * @generated
	 */
	double getCpuFactor();

	/**
	 * Sets the value of the '{@link componentAllocation.TradeOffVector#getCpuFactor <em>Cpu Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Factor</em>' attribute.
	 * @see #getCpuFactor()
	 * @generated
	 */
	void setCpuFactor(double value);

	/**
	 * Returns the value of the '<em><b>Memory Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Factor</em>' attribute.
	 * @see #setMemoryFactor(double)
	 * @see componentAllocation.ComponentAllocationPackage#getTradeOffVector_MemoryFactor()
	 * @model
	 * @generated
	 */
	double getMemoryFactor();

	/**
	 * Sets the value of the '{@link componentAllocation.TradeOffVector#getMemoryFactor <em>Memory Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Factor</em>' attribute.
	 * @see #getMemoryFactor()
	 * @generated
	 */
	void setMemoryFactor(double value);

	/**
	 * Returns the value of the '<em><b>Power Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Factor</em>' attribute.
	 * @see #setPowerFactor(double)
	 * @see componentAllocation.ComponentAllocationPackage#getTradeOffVector_PowerFactor()
	 * @model
	 * @generated
	 */
	double getPowerFactor();

	/**
	 * Sets the value of the '{@link componentAllocation.TradeOffVector#getPowerFactor <em>Power Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Factor</em>' attribute.
	 * @see #getPowerFactor()
	 * @generated
	 */
	void setPowerFactor(double value);

} // TradeOffVector
