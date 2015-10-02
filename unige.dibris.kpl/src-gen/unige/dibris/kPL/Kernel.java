/**
 */
package unige.dibris.kPL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kernel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unige.dibris.kPL.Kernel#getN <em>N</em>}</li>
 *   <li>{@link unige.dibris.kPL.Kernel#getM <em>M</em>}</li>
 *   <li>{@link unige.dibris.kPL.Kernel#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link unige.dibris.kPL.Kernel#getMain <em>Main</em>}</li>
 * </ul>
 *
 * @see unige.dibris.kPL.KPLPackage#getKernel()
 * @model
 * @generated
 */
public interface Kernel extends EObject
{
  /**
   * Returns the value of the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' attribute.
   * @see #setN(int)
   * @see unige.dibris.kPL.KPLPackage#getKernel_N()
   * @model
   * @generated
   */
  int getN();

  /**
   * Sets the value of the '{@link unige.dibris.kPL.Kernel#getN <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' attribute.
   * @see #getN()
   * @generated
   */
  void setN(int value);

  /**
   * Returns the value of the '<em><b>M</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>M</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>M</em>' attribute.
   * @see #setM(int)
   * @see unige.dibris.kPL.KPLPackage#getKernel_M()
   * @model
   * @generated
   */
  int getM();

  /**
   * Sets the value of the '{@link unige.dibris.kPL.Kernel#getM <em>M</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>M</em>' attribute.
   * @see #getM()
   * @generated
   */
  void setM(int value);

  /**
   * Returns the value of the '<em><b>Procedures</b></em>' containment reference list.
   * The list contents are of type {@link unige.dibris.kPL.Procedure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedures</em>' containment reference list.
   * @see unige.dibris.kPL.KPLPackage#getKernel_Procedures()
   * @model containment="true"
   * @generated
   */
  EList<Procedure> getProcedures();

  /**
   * Returns the value of the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main</em>' containment reference.
   * @see #setMain(Stat)
   * @see unige.dibris.kPL.KPLPackage#getKernel_Main()
   * @model containment="true"
   * @generated
   */
  Stat getMain();

  /**
   * Sets the value of the '{@link unige.dibris.kPL.Kernel#getMain <em>Main</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main</em>' containment reference.
   * @see #getMain()
   * @generated
   */
  void setMain(Stat value);

} // Kernel
