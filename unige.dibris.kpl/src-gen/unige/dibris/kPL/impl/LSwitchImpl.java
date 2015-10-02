/**
 */
package unige.dibris.kPL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import unige.dibris.kPL.KPLPackage;
import unige.dibris.kPL.LSwitch;
import unige.dibris.kPL.Stat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LSwitch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link unige.dibris.kPL.impl.LSwitchImpl#getCases <em>Cases</em>}</li>
 *   <li>{@link unige.dibris.kPL.impl.LSwitchImpl#getStats <em>Stats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LSwitchImpl extends StatImpl implements LSwitch
{
  /**
   * The cached value of the '{@link #getCases() <em>Cases</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCases()
   * @generated
   * @ordered
   */
  protected EList<Integer> cases;

  /**
   * The cached value of the '{@link #getStats() <em>Stats</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStats()
   * @generated
   * @ordered
   */
  protected EList<Stat> stats;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LSwitchImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return KPLPackage.Literals.LSWITCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getCases()
  {
    if (cases == null)
    {
      cases = new EDataTypeEList<Integer>(Integer.class, this, KPLPackage.LSWITCH__CASES);
    }
    return cases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Stat> getStats()
  {
    if (stats == null)
    {
      stats = new EObjectContainmentEList<Stat>(Stat.class, this, KPLPackage.LSWITCH__STATS);
    }
    return stats;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case KPLPackage.LSWITCH__STATS:
        return ((InternalEList<?>)getStats()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case KPLPackage.LSWITCH__CASES:
        return getCases();
      case KPLPackage.LSWITCH__STATS:
        return getStats();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case KPLPackage.LSWITCH__CASES:
        getCases().clear();
        getCases().addAll((Collection<? extends Integer>)newValue);
        return;
      case KPLPackage.LSWITCH__STATS:
        getStats().clear();
        getStats().addAll((Collection<? extends Stat>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case KPLPackage.LSWITCH__CASES:
        getCases().clear();
        return;
      case KPLPackage.LSWITCH__STATS:
        getStats().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case KPLPackage.LSWITCH__CASES:
        return cases != null && !cases.isEmpty();
      case KPLPackage.LSWITCH__STATS:
        return stats != null && !stats.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (cases: ");
    result.append(cases);
    result.append(')');
    return result.toString();
  }

} //LSwitchImpl
