/**
 */
package unige.dibris.kPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unige.dibris.kPL.Read#getName <em>Name</em>}</li>
 *   <li>{@link unige.dibris.kPL.Read#getLoc <em>Loc</em>}</li>
 * </ul>
 *
 * @see unige.dibris.kPL.KPLPackage#getRead()
 * @model
 * @generated
 */
public interface Read extends Stat
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see unige.dibris.kPL.KPLPackage#getRead_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link unige.dibris.kPL.Read#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see unige.dibris.kPL.KPLPackage#getRead_Loc()
   * @model
   * @generated
   */
  int getLoc();

  /**
   * Sets the value of the '{@link unige.dibris.kPL.Read#getLoc <em>Loc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loc</em>' attribute.
   * @see #getLoc()
   * @generated
   */
  void setLoc(int value);

} // Read
