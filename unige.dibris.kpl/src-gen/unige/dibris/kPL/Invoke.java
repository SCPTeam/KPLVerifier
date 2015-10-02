/**
 */
package unige.dibris.kPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unige.dibris.kPL.Invoke#getFun <em>Fun</em>}</li>
 *   <li>{@link unige.dibris.kPL.Invoke#getArg <em>Arg</em>}</li>
 * </ul>
 *
 * @see unige.dibris.kPL.KPLPackage#getInvoke()
 * @model
 * @generated
 */
public interface Invoke extends Stat
{
  /**
   * Returns the value of the '<em><b>Fun</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fun</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fun</em>' attribute.
   * @see #setFun(String)
   * @see unige.dibris.kPL.KPLPackage#getInvoke_Fun()
   * @model
   * @generated
   */
  String getFun();

  /**
   * Sets the value of the '{@link unige.dibris.kPL.Invoke#getFun <em>Fun</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fun</em>' attribute.
   * @see #getFun()
   * @generated
   */
  void setFun(String value);

  /**
   * Returns the value of the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' containment reference.
   * @see #setArg(Expr)
   * @see unige.dibris.kPL.KPLPackage#getInvoke_Arg()
   * @model containment="true"
   * @generated
   */
  Expr getArg();

  /**
   * Sets the value of the '{@link unige.dibris.kPL.Invoke#getArg <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' containment reference.
   * @see #getArg()
   * @generated
   */
  void setArg(Expr value);

} // Invoke
