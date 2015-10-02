/**
 */
package unige.dibris.kPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unige.dibris.kPL.Decl#getVar <em>Var</em>}</li>
 *   <li>{@link unige.dibris.kPL.Decl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see unige.dibris.kPL.KPLPackage#getDecl()
 * @model
 * @generated
 */
public interface Decl extends Stat
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' attribute.
   * @see #setVar(String)
   * @see unige.dibris.kPL.KPLPackage#getDecl_Var()
   * @model
   * @generated
   */
  String getVar();

  /**
   * Sets the value of the '{@link unige.dibris.kPL.Decl#getVar <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' attribute.
   * @see #getVar()
   * @generated
   */
  void setVar(String value);

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
   * @see unige.dibris.kPL.KPLPackage#getDecl_Body()
   * @model containment="true"
   * @generated
   */
  Stat getBody();

  /**
   * Sets the value of the '{@link unige.dibris.kPL.Decl#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Stat value);

} // Decl
