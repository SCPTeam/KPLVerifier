/**
 */
package unige.dibris.kPL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unige.dibris.kPL.Block#getStats <em>Stats</em>}</li>
 * </ul>
 *
 * @see unige.dibris.kPL.KPLPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Stat
{
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
   * @see unige.dibris.kPL.KPLPackage#getBlock_Stats()
   * @model containment="true"
   * @generated
   */
  EList<Stat> getStats();

} // Block
