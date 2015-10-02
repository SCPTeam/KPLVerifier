/**
 */
package unige.dibris.kPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unige.dibris.kPL.Branch#getGuard <em>Guard</em>}</li>
 *   <li>{@link unige.dibris.kPL.Branch#getLeft <em>Left</em>}</li>
 *   <li>{@link unige.dibris.kPL.Branch#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see unige.dibris.kPL.KPLPackage#getBranch()
 * @model
 * @generated
 */
public interface Branch extends Stat
{
  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(Expr)
   * @see unige.dibris.kPL.KPLPackage#getBranch_Guard()
   * @model containment="true"
   * @generated
   */
  Expr getGuard();

  /**
   * Sets the value of the '{@link unige.dibris.kPL.Branch#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(Expr value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Stat)
   * @see unige.dibris.kPL.KPLPackage#getBranch_Left()
   * @model containment="true"
   * @generated
   */
  Stat getLeft();

  /**
   * Sets the value of the '{@link unige.dibris.kPL.Branch#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Stat value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Stat)
   * @see unige.dibris.kPL.KPLPackage#getBranch_Right()
   * @model containment="true"
   * @generated
   */
  Stat getRight();

  /**
   * Sets the value of the '{@link unige.dibris.kPL.Branch#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Stat value);

} // Branch
