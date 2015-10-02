/**
 */
package unige.dibris.kPL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unige.dibris.kPL.Procedure#getZ <em>Z</em>}</li>
 *   <li>{@link unige.dibris.kPL.Procedure#getX <em>X</em>}</li>
 *   <li>{@link unige.dibris.kPL.Procedure#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see unige.dibris.kPL.KPLPackage#getProcedure()
 * @model
 * @generated
 */
public interface Procedure extends EObject
{
  /**
   * Returns the value of the '<em><b>Z</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Z</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Z</em>' attribute.
   * @see #setZ(String)
   * @see unige.dibris.kPL.KPLPackage#getProcedure_Z()
   * @model
   * @generated
   */
  String getZ();

  /**
   * Sets the value of the '{@link unige.dibris.kPL.Procedure#getZ <em>Z</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Z</em>' attribute.
   * @see #getZ()
   * @generated
   */
  void setZ(String value);

  /**
   * Returns the value of the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>X</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' attribute.
   * @see #setX(String)
   * @see unige.dibris.kPL.KPLPackage#getProcedure_X()
   * @model
   * @generated
   */
  String getX();

  /**
   * Sets the value of the '{@link unige.dibris.kPL.Procedure#getX <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' attribute.
   * @see #getX()
   * @generated
   */
  void setX(String value);

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
   * @see unige.dibris.kPL.KPLPackage#getProcedure_Body()
   * @model containment="true"
   * @generated
   */
  Stat getBody();

  /**
   * Sets the value of the '{@link unige.dibris.kPL.Procedure#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Stat value);

} // Procedure
