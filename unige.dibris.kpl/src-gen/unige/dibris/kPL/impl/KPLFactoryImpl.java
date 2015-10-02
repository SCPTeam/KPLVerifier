/**
 */
package unige.dibris.kPL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import unige.dibris.kPL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KPLFactoryImpl extends EFactoryImpl implements KPLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KPLFactory init()
  {
    try
    {
      KPLFactory theKPLFactory = (KPLFactory)EPackage.Registry.INSTANCE.getEFactory(KPLPackage.eNS_URI);
      if (theKPLFactory != null)
      {
        return theKPLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new KPLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KPLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case KPLPackage.KERNEL: return createKernel();
      case KPLPackage.PROCEDURE: return createProcedure();
      case KPLPackage.STAT: return createStat();
      case KPLPackage.EXPR: return createExpr();
      case KPLPackage.DECL: return createDecl();
      case KPLPackage.BRANCH: return createBranch();
      case KPLPackage.LOOP: return createLoop();
      case KPLPackage.INVOKE: return createInvoke();
      case KPLPackage.ASSIGN: return createAssign();
      case KPLPackage.READ: return createRead();
      case KPLPackage.WRITE: return createWrite();
      case KPLPackage.BARRIER: return createBarrier();
      case KPLPackage.BLOCK: return createBlock();
      case KPLPackage.LSWITCH: return createLSwitch();
      case KPLPackage.GSWITCH: return createGSwitch();
      case KPLPackage.SKIP: return createSkip();
      case KPLPackage.BINARY_EXPR: return createBinaryExpr();
      case KPLPackage.VAR: return createVar();
      case KPLPackage.VAL: return createVal();
      case KPLPackage.GID: return createGid();
      case KPLPackage.LID: return createLid();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Kernel createKernel()
  {
    KernelImpl kernel = new KernelImpl();
    return kernel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Procedure createProcedure()
  {
    ProcedureImpl procedure = new ProcedureImpl();
    return procedure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stat createStat()
  {
    StatImpl stat = new StatImpl();
    return stat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decl createDecl()
  {
    DeclImpl decl = new DeclImpl();
    return decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Branch createBranch()
  {
    BranchImpl branch = new BranchImpl();
    return branch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Loop createLoop()
  {
    LoopImpl loop = new LoopImpl();
    return loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Invoke createInvoke()
  {
    InvokeImpl invoke = new InvokeImpl();
    return invoke;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assign createAssign()
  {
    AssignImpl assign = new AssignImpl();
    return assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Read createRead()
  {
    ReadImpl read = new ReadImpl();
    return read;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Write createWrite()
  {
    WriteImpl write = new WriteImpl();
    return write;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Barrier createBarrier()
  {
    BarrierImpl barrier = new BarrierImpl();
    return barrier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LSwitch createLSwitch()
  {
    LSwitchImpl lSwitch = new LSwitchImpl();
    return lSwitch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GSwitch createGSwitch()
  {
    GSwitchImpl gSwitch = new GSwitchImpl();
    return gSwitch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Skip createSkip()
  {
    SkipImpl skip = new SkipImpl();
    return skip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryExpr createBinaryExpr()
  {
    BinaryExprImpl binaryExpr = new BinaryExprImpl();
    return binaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var createVar()
  {
    VarImpl var = new VarImpl();
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Val createVal()
  {
    ValImpl val = new ValImpl();
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Gid createGid()
  {
    GidImpl gid = new GidImpl();
    return gid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lid createLid()
  {
    LidImpl lid = new LidImpl();
    return lid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KPLPackage getKPLPackage()
  {
    return (KPLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static KPLPackage getPackage()
  {
    return KPLPackage.eINSTANCE;
  }

} //KPLFactoryImpl
