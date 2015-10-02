/**
 */
package unige.dibris.kPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LSwitch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unige.dibris.kPL.LSwitch#getCases <em>Cases</em>}</li>
 *   <li>{@link unige.dibris.kPL.LSwitch#getStats <em>Stats</em>}</li>
 * </ul>
 *
 * @see unige.dibris.kPL.KPLPackage#getLSwitch()
 * @model
 * @generated
 */
public interface LSwitch extends Stat
{
  /**
   * Returns the value of the '<em><b>Cases</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' attribute list.
   * @see unige.dibris.kPL.KPLPackage#getLSwitch_Cases()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getCases();

  /**
   * Returns the value of the '<em><b>Stats</b></em>' containment reference list.
   * The list contents are of type {@link unige.dibris.kPL.Stat}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stats</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stats</em>' containment reference list.
   * @see unige.dibris.kPL.KPLPackage#getLSwitch_Stats()
   * @model containment="true"
   * @generated
   */
  EList<Stat> getStats();

} // LSwitch
