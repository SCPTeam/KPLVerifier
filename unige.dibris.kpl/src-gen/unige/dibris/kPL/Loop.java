/**
 */
package unige.dibris.kPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unige.dibris.kPL.Loop#getGuard <em>Guard</em>}</li>
 *   <li>{@link unige.dibris.kPL.Loop#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see unige.dibris.kPL.KPLPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends Stat
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
   * @see unige.dibris.kPL.KPLPackage#getLoop_Guard()
   * @model containment="true"
   * @generated
   */
  Expr getGuard();

  /**
   * Sets the value of the '{@link unige.dibris.kPL.Loop#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(Expr value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Stat)
   * @see unige.dibris.kPL.KPLPackage#getLoop_Body()
   * @model containment="true"
   * @generated
   */
  Stat getBody();

  /**
   * Sets the value of the '{@link unige.dibris.kPL.Loop#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Stat value);

} // Loop
