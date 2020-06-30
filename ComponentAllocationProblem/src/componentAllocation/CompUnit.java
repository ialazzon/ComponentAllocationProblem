/**
 */
package componentAllocation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comp Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentAllocation.CompUnit#getCpuAvail <em>Cpu Avail</em>}</li>
 *   <li>{@link componentAllocation.CompUnit#getMemAvailable <em>Mem Available</em>}</li>
 *   <li>{@link componentAllocation.CompUnit#getPowerAvail <em>Power Avail</em>}</li>
 *   <li>{@link componentAllocation.CompUnit#getCompUnitName <em>Comp Unit Name</em>}</li>
 *   <li>{@link componentAllocation.CompUnit#getResConsumptions <em>Res Consumptions</em>}</li>
 * </ul>
 *
 * @see componentAllocation.ComponentAllocationPackage#getCompUnit()
 * @model
 * @generated
 */
public interface CompUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Cpu Avail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu Avail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Avail</em>' attribute.
	 * @see #setCpuAvail(double)
	 * @see componentAllocation.ComponentAllocationPackage#getCompUnit_CpuAvail()
	 * @model
	 * @generated
	 */
	double getCpuAvail();

	/**
	 * Sets the value of the '{@link componentAllocation.CompUnit#getCpuAvail <em>Cpu Avail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Avail</em>' attribute.
	 * @see #getCpuAvail()
	 * @generated
	 */
	void setCpuAvail(double value);

	/**
	 * Returns the value of the '<em><b>Mem Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mem Available</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem Available</em>' attribute.
	 * @see #setMemAvailable(double)
	 * @see componentAllocation.ComponentAllocationPackage#getCompUnit_MemAvailable()
	 * @model
	 * @generated
	 */
	double getMemAvailable();

	/**
	 * Sets the value of the '{@link componentAllocation.CompUnit#getMemAvailable <em>Mem Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mem Available</em>' attribute.
	 * @see #getMemAvailable()
	 * @generated
	 */
	void setMemAvailable(double value);

	/**
	 * Returns the value of the '<em><b>Power Avail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Avail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Avail</em>' attribute.
	 * @see #setPowerAvail(double)
	 * @see componentAllocation.ComponentAllocationPackage#getCompUnit_PowerAvail()
	 * @model
	 * @generated
	 */
	double getPowerAvail();

	/**
	 * Sets the value of the '{@link componentAllocation.CompUnit#getPowerAvail <em>Power Avail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Avail</em>' attribute.
	 * @see #getPowerAvail()
	 * @generated
	 */
	void setPowerAvail(double value);

	/**
	 * Returns the value of the '<em><b>Comp Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp Unit Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp Unit Name</em>' attribute.
	 * @see #setCompUnitName(String)
	 * @see componentAllocation.ComponentAllocationPackage#getCompUnit_CompUnitName()
	 * @model
	 * @generated
	 */
	String getCompUnitName();

	/**
	 * Sets the value of the '{@link componentAllocation.CompUnit#getCompUnitName <em>Comp Unit Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp Unit Name</em>' attribute.
	 * @see #getCompUnitName()
	 * @generated
	 */
	void setCompUnitName(String value);

	/**
	 * Returns the value of the '<em><b>Res Consumptions</b></em>' reference list.
	 * The list contents are of type {@link componentAllocation.ResConsumption}.
	 * It is bidirectional and its opposite is '{@link componentAllocation.ResConsumption#getCompUnit <em>Comp Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Consumptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Consumptions</em>' reference list.
	 * @see componentAllocation.ComponentAllocationPackage#getCompUnit_ResConsumptions()
	 * @see componentAllocation.ResConsumption#getCompUnit
	 * @model opposite="compUnit"
	 * @generated
	 */
	EList<ResConsumption> getResConsumptions();

} // CompUnit
