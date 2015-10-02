/**
 */
package unige.dibris.kPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unige.dibris.kPL.Write#getLoc <em>Loc</em>}</li>
 *   <li>{@link unige.dibris.kPL.Write#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see unige.dibris.kPL.KPLPackage#getWrite()
 * @model
 * @generated
 */
public interface Write extends Stat
{
  /**
   * Returns the value of the '<em><b>Loc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loc</em>' attribute.
   * @see #setLoc(int)
   * @see unige.dibris.kPL.KPLPackage#getWrite_Loc()
   * @model
   * @generated
   */
  int getLoc();

  /**
   * Sets the value of the '{@link unige.dibris.kPL.Write#getLoc <em>Loc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loc</em>' attribute.
   * @see #getLoc()
   * @generated
   */
  void setLoc(int value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expr)
   * @see unige.dibris.kPL.KPLPackage#getWrite_Exp()
   * @model containment="true"
   * @generated
   */
  Expr getExp();

  /**
   * Sets the value of the '{@link unige.dibris.kPL.Write#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expr value);

} // Write
