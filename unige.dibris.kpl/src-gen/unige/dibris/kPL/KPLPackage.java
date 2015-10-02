/**
 */
package unige.dibris.kPL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see unige.dibris.kPL.KPLFactory
 * @model kind="package"
 * @generated
 */
public interface KPLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "kPL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dibris.unige/kpl/KPL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "kPL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KPLPackage eINSTANCE = unige.dibris.kPL.impl.KPLPackageImpl.init();

  /**
   * The meta object id for the '{@link unige.dibris.kPL.impl.KernelImpl <em>Kernel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unige.dibris.kPL.impl.KernelImpl
   * @see unige.dibris.kPL.impl.KPLPackageImpl#getKernel()
   * @generated
   */
  int KERNEL = 0;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KERNEL__N = 0;

  /**
   * The feature id for the '<em><b>M</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KERNEL__M = 1;

  /**
   * The feature id for the '<em><b>Procedures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KERNEL__PROCEDURES = 2;

  /**
   * The feature id for the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KERNEL__MAIN = 3;

  /**
   * The number of structural features of the '<em>Kernel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KERNEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link unige.dibris.kPL.impl.ProcedureImpl <em>Procedure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unige.dibris.kPL.impl.ProcedureImpl
   * @see unige.dibris.kPL.impl.KPLPackageImpl#getProcedure()
   * @generated
   */
  int PROCEDURE = 1;

  /**
   * The feature id for the '<em><b>Z</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__Z = 0;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__X = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE__BODY = 2;

  /**
   * The number of structural features of the '<em>Procedure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link unige.dibris.kPL.impl.StatImpl <em>Stat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unige.dibris.kPL.impl.StatImpl
   * @see unige.dibris.kPL.impl.KPLPackageImpl#getStat()
   * @generated
   */
  int STAT = 2;

  /**
   * The number of structural features of the '<em>Stat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link unige.dibris.kPL.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unige.dibris.kPL.impl.ExprImpl
   * @see unige.dibris.kPL.impl.KPLPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 3;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link unige.dibris.kPL.impl.DeclImpl <em>Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unige.dibris.kPL.impl.DeclImpl
   * @see unige.dibris.kPL.impl.KPLPackageImpl#getDecl()
   * @generated
   */
  int DECL = 4;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL__VAR = STAT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL__BODY = STAT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECL_FEATURE_COUNT = STAT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link unige.dibris.kPL.impl.BranchImpl <em>Branch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unige.dibris.kPL.impl.BranchImpl
   * @see unige.dibris.kPL.impl.KPLPackageImpl#getBranch()
   * @generated
   */
  int BRANCH = 5;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__GUARD = STAT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__LEFT = STAT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__RIGHT = STAT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Branch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_FEATURE_COUNT = STAT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link unige.dibris.kPL.impl.LoopImpl <em>Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unige.dibris.kPL.impl.LoopImpl
   * @see unige.dibris.kPL.impl.KPLPackageImpl#getLoop()
   * @generated
   */
  int LOOP = 6;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__GUARD = STAT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP__BODY = STAT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_FEATURE_COUNT = STAT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link unige.dibris.kPL.impl.InvokeImpl <em>Invoke</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unige.dibris.kPL.impl.InvokeImpl
   * @see unige.dibris.kPL.impl.KPLPackageImpl#getInvoke()
   * @generated
   */
  int INVOKE = 7;

  /**
   * The feature id for the '<em><b>Fun</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE__FUN = STAT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE__ARG = STAT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Invoke</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE_FEATURE_COUNT = STAT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link unige.dibris.kPL.impl.AssignImpl <em>Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unige.dibris.kPL.impl.AssignImpl
   * @see unige.dibris.kPL.impl.KPLPackageImpl#getAssign()
   * @generated
   */
  int ASSIGN = 8;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN__VAR = STAT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN__EXP = STAT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_FEATURE_COUNT = STAT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link unige.dibris.kPL.impl.ReadImpl <em>Read</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unige.dibris.kPL.impl.ReadImpl
   * @see unige.dibris.kPL.impl.KPLPackageImpl#getRead()
   * @generated
   */
  int READ = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ__NAME = STAT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Loc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ__LOC = STAT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Read</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_FEATURE_COUNT = STAT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link unige.dibris.kPL.impl.WriteImpl <em>Write</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unige.dibris.kPL.impl.WriteImpl
   * @see unige.dibris.kPL.impl.KPLPackageImpl#getWrite()
   * @generated
   */
  int WRITE = 10;

  /**
   * The feature id for the '<em><b>Loc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE__LOC = STAT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE__EXP = STAT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Write</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_FEATURE_COUNT = STAT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link unige.dibris.kPL.impl.BarrierImpl <em>Barrier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unige.dibris.kPL.impl.BarrierImpl
   * @see unige.dibris.kPL.impl.KPLPackageImpl#getBarrier()
   * @generated
   */
  int BARRIER = 11;

  /**
   * The number of structural features of the '<em>Barrier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BARRIER_FEATURE_COUNT = STAT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link unige.dibris.kPL.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unige.dibris.kPL.impl.BlockImpl
   * @see unige.dibris.kPL.impl.KPLPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 12;

  /**
   * The feature id for the '<em><b>Stats</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STATS = STAT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = STAT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link unige.dibris.kPL.impl.LSwitchImpl <em>LSwitch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unige.dibris.kPL.impl.LSwitchImpl
   * @see unige.dibris.kPL.impl.KPLPackageImpl#getLSwitch()
   * @generated
   */
  int LSWITCH = 13;

  /**
   * The feature id for the '<em><b>Cases</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LSWITCH__CASES = STAT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stats</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LSWITCH__STATS = STAT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>LSwitch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LSWITCH_FEATURE_COUNT = STAT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link unige.dibris.kPL.impl.GSwitchImpl <em>GSwitch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unige.dibris.kPL.impl.GSwitchImpl
   * @see unige.dibris.kPL.impl.KPLPackageImpl#getGSwitch()
   * @generated
   */
  int GSWITCH = 14;

  /**
   * The feature id for the '<em><b>Cases</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GSWITCH__CASES = STAT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stats</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GSWITCH__STATS = STAT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>GSwitch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GSWITCH_FEATURE_COUNT = STAT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link unige.dibris.kPL.impl.SkipImpl <em>Skip</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unige.dibris.kPL.impl.SkipImpl
   * @see unige.dibris.kPL.impl.KPLPackageImpl#getSkip()
   * @generated
   */
  int SKIP = 15;

  /**
   * The number of structural features of the '<em>Skip</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKIP_FEATURE_COUNT = STAT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link unige.dibris.kPL.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unige.dibris.kPL.impl.BinaryExprImpl
   * @see unige.dibris.kPL.impl.KPLPackageImpl#getBinaryExpr()
   * @generated
   */
  int BINARY_EXPR = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR__LEFT = EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR__OP = EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR__RIGHT = EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Binary Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link unige.dibris.kPL.impl.VarImpl <em>Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unige.dibris.kPL.impl.VarImpl
   * @see unige.dibris.kPL.impl.KPLPackageImpl#getVar()
   * @generated
   */
  int VAR = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__NAME = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link unige.dibris.kPL.impl.ValImpl <em>Val</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unige.dibris.kPL.impl.ValImpl
   * @see unige.dibris.kPL.impl.KPLPackageImpl#getVal()
   * @generated
   */
  int VAL = 18;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAL__VAL = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Val</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAL_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link unige.dibris.kPL.impl.GidImpl <em>Gid</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unige.dibris.kPL.impl.GidImpl
   * @see unige.dibris.kPL.impl.KPLPackageImpl#getGid()
   * @generated
   */
  int GID = 19;

  /**
   * The number of structural features of the '<em>Gid</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GID_FEATURE_COUNT = EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link unige.dibris.kPL.impl.LidImpl <em>Lid</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see unige.dibris.kPL.impl.LidImpl
   * @see unige.dibris.kPL.impl.KPLPackageImpl#getLid()
   * @generated
   */
  int LID = 20;

  /**
   * The number of structural features of the '<em>Lid</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LID_FEATURE_COUNT = EXPR_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link unige.dibris.kPL.Kernel <em>Kernel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kernel</em>'.
   * @see unige.dibris.kPL.Kernel
   * @generated
   */
  EClass getKernel();

  /**
   * Returns the meta object for the attribute '{@link unige.dibris.kPL.Kernel#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>N</em>'.
   * @see unige.dibris.kPL.Kernel#getN()
   * @see #getKernel()
   * @generated
   */
  EAttribute getKernel_N();

  /**
   * Returns the meta object for the attribute '{@link unige.dibris.kPL.Kernel#getM <em>M</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>M</em>'.
   * @see unige.dibris.kPL.Kernel#getM()
   * @see #getKernel()
   * @generated
   */
  EAttribute getKernel_M();

  /**
   * Returns the meta object for the containment reference list '{@link unige.dibris.kPL.Kernel#getProcedures <em>Procedures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Procedures</em>'.
   * @see unige.dibris.kPL.Kernel#getProcedures()
   * @see #getKernel()
   * @generated
   */
  EReference getKernel_Procedures();

  /**
   * Returns the meta object for the containment reference '{@link unige.dibris.kPL.Kernel#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main</em>'.
   * @see unige.dibris.kPL.Kernel#getMain()
   * @see #getKernel()
   * @generated
   */
  EReference getKernel_Main();

  /**
   * Returns the meta object for class '{@link unige.dibris.kPL.Procedure <em>Procedure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Procedure</em>'.
   * @see unige.dibris.kPL.Procedure
   * @generated
   */
  EClass getProcedure();

  /**
   * Returns the meta object for the attribute '{@link unige.dibris.kPL.Procedure#getZ <em>Z</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Z</em>'.
   * @see unige.dibris.kPL.Procedure#getZ()
   * @see #getProcedure()
   * @generated
   */
  EAttribute getProcedure_Z();

  /**
   * Returns the meta object for the attribute '{@link unige.dibris.kPL.Procedure#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see unige.dibris.kPL.Procedure#getX()
   * @see #getProcedure()
   * @generated
   */
  EAttribute getProcedure_X();

  /**
   * Returns the meta object for the containment reference '{@link unige.dibris.kPL.Procedure#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see unige.dibris.kPL.Procedure#getBody()
   * @see #getProcedure()
   * @generated
   */
  EReference getProcedure_Body();

  /**
   * Returns the meta object for class '{@link unige.dibris.kPL.Stat <em>Stat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stat</em>'.
   * @see unige.dibris.kPL.Stat
   * @generated
   */
  EClass getStat();

  /**
   * Returns the meta object for class '{@link unige.dibris.kPL.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see unige.dibris.kPL.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for class '{@link unige.dibris.kPL.Decl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decl</em>'.
   * @see unige.dibris.kPL.Decl
   * @generated
   */
  EClass getDecl();

  /**
   * Returns the meta object for the attribute '{@link unige.dibris.kPL.Decl#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see unige.dibris.kPL.Decl#getVar()
   * @see #getDecl()
   * @generated
   */
  EAttribute getDecl_Var();

  /**
   * Returns the meta object for the containment reference '{@link unige.dibris.kPL.Decl#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see unige.dibris.kPL.Decl#getBody()
   * @see #getDecl()
   * @generated
   */
  EReference getDecl_Body();

  /**
   * Returns the meta object for class '{@link unige.dibris.kPL.Branch <em>Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Branch</em>'.
   * @see unige.dibris.kPL.Branch
   * @generated
   */
  EClass getBranch();

  /**
   * Returns the meta object for the containment reference '{@link unige.dibris.kPL.Branch#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see unige.dibris.kPL.Branch#getGuard()
   * @see #getBranch()
   * @generated
   */
  EReference getBranch_Guard();

  /**
   * Returns the meta object for the containment reference '{@link unige.dibris.kPL.Branch#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see unige.dibris.kPL.Branch#getLeft()
   * @see #getBranch()
   * @generated
   */
  EReference getBranch_Left();

  /**
   * Returns the meta object for the containment reference '{@link unige.dibris.kPL.Branch#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see unige.dibris.kPL.Branch#getRight()
   * @see #getBranch()
   * @generated
   */
  EReference getBranch_Right();

  /**
   * Returns the meta object for class '{@link unige.dibris.kPL.Loop <em>Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop</em>'.
   * @see unige.dibris.kPL.Loop
   * @generated
   */
  EClass getLoop();

  /**
   * Returns the meta object for the containment reference '{@link unige.dibris.kPL.Loop#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see unige.dibris.kPL.Loop#getGuard()
   * @see #getLoop()
   * @generated
   */
  EReference getLoop_Guard();

  /**
   * Returns the meta object for the containment reference '{@link unige.dibris.kPL.Loop#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see unige.dibris.kPL.Loop#getBody()
   * @see #getLoop()
   * @generated
   */
  EReference getLoop_Body();

  /**
   * Returns the meta object for class '{@link unige.dibris.kPL.Invoke <em>Invoke</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invoke</em>'.
   * @see unige.dibris.kPL.Invoke
   * @generated
   */
  EClass getInvoke();

  /**
   * Returns the meta object for the attribute '{@link unige.dibris.kPL.Invoke#getFun <em>Fun</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fun</em>'.
   * @see unige.dibris.kPL.Invoke#getFun()
   * @see #getInvoke()
   * @generated
   */
  EAttribute getInvoke_Fun();

  /**
   * Returns the meta object for the containment reference '{@link unige.dibris.kPL.Invoke#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see unige.dibris.kPL.Invoke#getArg()
   * @see #getInvoke()
   * @generated
   */
  EReference getInvoke_Arg();

  /**
   * Returns the meta object for class '{@link unige.dibris.kPL.Assign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assign</em>'.
   * @see unige.dibris.kPL.Assign
   * @generated
   */
  EClass getAssign();

  /**
   * Returns the meta object for the attribute '{@link unige.dibris.kPL.Assign#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see unige.dibris.kPL.Assign#getVar()
   * @see #getAssign()
   * @generated
   */
  EAttribute getAssign_Var();

  /**
   * Returns the meta object for the containment reference '{@link unige.dibris.kPL.Assign#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see unige.dibris.kPL.Assign#getExp()
   * @see #getAssign()
   * @generated
   */
  EReference getAssign_Exp();

  /**
   * Returns the meta object for class '{@link unige.dibris.kPL.Read <em>Read</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Read</em>'.
   * @see unige.dibris.kPL.Read
   * @generated
   */
  EClass getRead();

  /**
   * Returns the meta object for the attribute '{@link unige.dibris.kPL.Read#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see unige.dibris.kPL.Read#getName()
   * @see #getRead()
   * @generated
   */
  EAttribute getRead_Name();

  /**
   * Returns the meta object for the attribute '{@link unige.dibris.kPL.Read#getLoc <em>Loc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Loc</em>'.
   * @see unige.dibris.kPL.Read#getLoc()
   * @see #getRead()
   * @generated
   */
  EAttribute getRead_Loc();

  /**
   * Returns the meta object for class '{@link unige.dibris.kPL.Write <em>Write</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Write</em>'.
   * @see unige.dibris.kPL.Write
   * @generated
   */
  EClass getWrite();

  /**
   * Returns the meta object for the attribute '{@link unige.dibris.kPL.Write#getLoc <em>Loc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Loc</em>'.
   * @see unige.dibris.kPL.Write#getLoc()
   * @see #getWrite()
   * @generated
   */
  EAttribute getWrite_Loc();

  /**
   * Returns the meta object for the containment reference '{@link unige.dibris.kPL.Write#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see unige.dibris.kPL.Write#getExp()
   * @see #getWrite()
   * @generated
   */
  EReference getWrite_Exp();

  /**
   * Returns the meta object for class '{@link unige.dibris.kPL.Barrier <em>Barrier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Barrier</em>'.
   * @see unige.dibris.kPL.Barrier
   * @generated
   */
  EClass getBarrier();

  /**
   * Returns the meta object for class '{@link unige.dibris.kPL.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see unige.dibris.kPL.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference list '{@link unige.dibris.kPL.Block#getStats <em>Stats</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stats</em>'.
   * @see unige.dibris.kPL.Block#getStats()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Stats();

  /**
   * Returns the meta object for class '{@link unige.dibris.kPL.LSwitch <em>LSwitch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LSwitch</em>'.
   * @see unige.dibris.kPL.LSwitch
   * @generated
   */
  EClass getLSwitch();

  /**
   * Returns the meta object for the attribute list '{@link unige.dibris.kPL.LSwitch#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Cases</em>'.
   * @see unige.dibris.kPL.LSwitch#getCases()
   * @see #getLSwitch()
   * @generated
   */
  EAttribute getLSwitch_Cases();

  /**
   * Returns the meta object for the containment reference list '{@link unige.dibris.kPL.LSwitch#getStats <em>Stats</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stats</em>'.
   * @see unige.dibris.kPL.LSwitch#getStats()
   * @see #getLSwitch()
   * @generated
   */
  EReference getLSwitch_Stats();

  /**
   * Returns the meta object for class '{@link unige.dibris.kPL.GSwitch <em>GSwitch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GSwitch</em>'.
   * @see unige.dibris.kPL.GSwitch
   * @generated
   */
  EClass getGSwitch();

  /**
   * Returns the meta object for the attribute list '{@link unige.dibris.kPL.GSwitch#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Cases</em>'.
   * @see unige.dibris.kPL.GSwitch#getCases()
   * @see #getGSwitch()
   * @generated
   */
  EAttribute getGSwitch_Cases();

  /**
   * Returns the meta object for the containment reference list '{@link unige.dibris.kPL.GSwitch#getStats <em>Stats</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stats</em>'.
   * @see unige.dibris.kPL.GSwitch#getStats()
   * @see #getGSwitch()
   * @generated
   */
  EReference getGSwitch_Stats();

  /**
   * Returns the meta object for class '{@link unige.dibris.kPL.Skip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Skip</em>'.
   * @see unige.dibris.kPL.Skip
   * @generated
   */
  EClass getSkip();

  /**
   * Returns the meta object for class '{@link unige.dibris.kPL.BinaryExpr <em>Binary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Expr</em>'.
   * @see unige.dibris.kPL.BinaryExpr
   * @generated
   */
  EClass getBinaryExpr();

  /**
   * Returns the meta object for the containment reference '{@link unige.dibris.kPL.BinaryExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see unige.dibris.kPL.BinaryExpr#getLeft()
   * @see #getBinaryExpr()
   * @generated
   */
  EReference getBinaryExpr_Left();

  /**
   * Returns the meta object for the attribute '{@link unige.dibris.kPL.BinaryExpr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see unige.dibris.kPL.BinaryExpr#getOp()
   * @see #getBinaryExpr()
   * @generated
   */
  EAttribute getBinaryExpr_Op();

  /**
   * Returns the meta object for the containment reference '{@link unige.dibris.kPL.BinaryExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see unige.dibris.kPL.BinaryExpr#getRight()
   * @see #getBinaryExpr()
   * @generated
   */
  EReference getBinaryExpr_Right();

  /**
   * Returns the meta object for class '{@link unige.dibris.kPL.Var <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var</em>'.
   * @see unige.dibris.kPL.Var
   * @generated
   */
  EClass getVar();

  /**
   * Returns the meta object for the attribute '{@link unige.dibris.kPL.Var#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see unige.dibris.kPL.Var#getName()
   * @see #getVar()
   * @generated
   */
  EAttribute getVar_Name();

  /**
   * Returns the meta object for class '{@link unige.dibris.kPL.Val <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Val</em>'.
   * @see unige.dibris.kPL.Val
   * @generated
   */
  EClass getVal();

  /**
   * Returns the meta object for the attribute '{@link unige.dibris.kPL.Val#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see unige.dibris.kPL.Val#getVal()
   * @see #getVal()
   * @generated
   */
  EAttribute getVal_Val();

  /**
   * Returns the meta object for class '{@link unige.dibris.kPL.Gid <em>Gid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gid</em>'.
   * @see unige.dibris.kPL.Gid
   * @generated
   */
  EClass getGid();

  /**
   * Returns the meta object for class '{@link unige.dibris.kPL.Lid <em>Lid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lid</em>'.
   * @see unige.dibris.kPL.Lid
   * @generated
   */
  EClass getLid();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  KPLFactory getKPLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link unige.dibris.kPL.impl.KernelImpl <em>Kernel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unige.dibris.kPL.impl.KernelImpl
     * @see unige.dibris.kPL.impl.KPLPackageImpl#getKernel()
     * @generated
     */
    EClass KERNEL = eINSTANCE.getKernel();

    /**
     * The meta object literal for the '<em><b>N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KERNEL__N = eINSTANCE.getKernel_N();

    /**
     * The meta object literal for the '<em><b>M</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KERNEL__M = eINSTANCE.getKernel_M();

    /**
     * The meta object literal for the '<em><b>Procedures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KERNEL__PROCEDURES = eINSTANCE.getKernel_Procedures();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KERNEL__MAIN = eINSTANCE.getKernel_Main();

    /**
     * The meta object literal for the '{@link unige.dibris.kPL.impl.ProcedureImpl <em>Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unige.dibris.kPL.impl.ProcedureImpl
     * @see unige.dibris.kPL.impl.KPLPackageImpl#getProcedure()
     * @generated
     */
    EClass PROCEDURE = eINSTANCE.getProcedure();

    /**
     * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE__Z = eINSTANCE.getProcedure_Z();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCEDURE__X = eINSTANCE.getProcedure_X();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE__BODY = eINSTANCE.getProcedure_Body();

    /**
     * The meta object literal for the '{@link unige.dibris.kPL.impl.StatImpl <em>Stat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unige.dibris.kPL.impl.StatImpl
     * @see unige.dibris.kPL.impl.KPLPackageImpl#getStat()
     * @generated
     */
    EClass STAT = eINSTANCE.getStat();

    /**
     * The meta object literal for the '{@link unige.dibris.kPL.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unige.dibris.kPL.impl.ExprImpl
     * @see unige.dibris.kPL.impl.KPLPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '{@link unige.dibris.kPL.impl.DeclImpl <em>Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unige.dibris.kPL.impl.DeclImpl
     * @see unige.dibris.kPL.impl.KPLPackageImpl#getDecl()
     * @generated
     */
    EClass DECL = eINSTANCE.getDecl();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECL__VAR = eINSTANCE.getDecl_Var();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECL__BODY = eINSTANCE.getDecl_Body();

    /**
     * The meta object literal for the '{@link unige.dibris.kPL.impl.BranchImpl <em>Branch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unige.dibris.kPL.impl.BranchImpl
     * @see unige.dibris.kPL.impl.KPLPackageImpl#getBranch()
     * @generated
     */
    EClass BRANCH = eINSTANCE.getBranch();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRANCH__GUARD = eINSTANCE.getBranch_Guard();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRANCH__LEFT = eINSTANCE.getBranch_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRANCH__RIGHT = eINSTANCE.getBranch_Right();

    /**
     * The meta object literal for the '{@link unige.dibris.kPL.impl.LoopImpl <em>Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unige.dibris.kPL.impl.LoopImpl
     * @see unige.dibris.kPL.impl.KPLPackageImpl#getLoop()
     * @generated
     */
    EClass LOOP = eINSTANCE.getLoop();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__GUARD = eINSTANCE.getLoop_Guard();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP__BODY = eINSTANCE.getLoop_Body();

    /**
     * The meta object literal for the '{@link unige.dibris.kPL.impl.InvokeImpl <em>Invoke</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unige.dibris.kPL.impl.InvokeImpl
     * @see unige.dibris.kPL.impl.KPLPackageImpl#getInvoke()
     * @generated
     */
    EClass INVOKE = eINSTANCE.getInvoke();

    /**
     * The meta object literal for the '<em><b>Fun</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INVOKE__FUN = eINSTANCE.getInvoke_Fun();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOKE__ARG = eINSTANCE.getInvoke_Arg();

    /**
     * The meta object literal for the '{@link unige.dibris.kPL.impl.AssignImpl <em>Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unige.dibris.kPL.impl.AssignImpl
     * @see unige.dibris.kPL.impl.KPLPackageImpl#getAssign()
     * @generated
     */
    EClass ASSIGN = eINSTANCE.getAssign();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGN__VAR = eINSTANCE.getAssign_Var();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN__EXP = eINSTANCE.getAssign_Exp();

    /**
     * The meta object literal for the '{@link unige.dibris.kPL.impl.ReadImpl <em>Read</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unige.dibris.kPL.impl.ReadImpl
     * @see unige.dibris.kPL.impl.KPLPackageImpl#getRead()
     * @generated
     */
    EClass READ = eINSTANCE.getRead();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READ__NAME = eINSTANCE.getRead_Name();

    /**
     * The meta object literal for the '<em><b>Loc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READ__LOC = eINSTANCE.getRead_Loc();

    /**
     * The meta object literal for the '{@link unige.dibris.kPL.impl.WriteImpl <em>Write</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unige.dibris.kPL.impl.WriteImpl
     * @see unige.dibris.kPL.impl.KPLPackageImpl#getWrite()
     * @generated
     */
    EClass WRITE = eINSTANCE.getWrite();

    /**
     * The meta object literal for the '<em><b>Loc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WRITE__LOC = eINSTANCE.getWrite_Loc();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WRITE__EXP = eINSTANCE.getWrite_Exp();

    /**
     * The meta object literal for the '{@link unige.dibris.kPL.impl.BarrierImpl <em>Barrier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unige.dibris.kPL.impl.BarrierImpl
     * @see unige.dibris.kPL.impl.KPLPackageImpl#getBarrier()
     * @generated
     */
    EClass BARRIER = eINSTANCE.getBarrier();

    /**
     * The meta object literal for the '{@link unige.dibris.kPL.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unige.dibris.kPL.impl.BlockImpl
     * @see unige.dibris.kPL.impl.KPLPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Stats</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__STATS = eINSTANCE.getBlock_Stats();

    /**
     * The meta object literal for the '{@link unige.dibris.kPL.impl.LSwitchImpl <em>LSwitch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unige.dibris.kPL.impl.LSwitchImpl
     * @see unige.dibris.kPL.impl.KPLPackageImpl#getLSwitch()
     * @generated
     */
    EClass LSWITCH = eINSTANCE.getLSwitch();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LSWITCH__CASES = eINSTANCE.getLSwitch_Cases();

    /**
     * The meta object literal for the '<em><b>Stats</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LSWITCH__STATS = eINSTANCE.getLSwitch_Stats();

    /**
     * The meta object literal for the '{@link unige.dibris.kPL.impl.GSwitchImpl <em>GSwitch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unige.dibris.kPL.impl.GSwitchImpl
     * @see unige.dibris.kPL.impl.KPLPackageImpl#getGSwitch()
     * @generated
     */
    EClass GSWITCH = eINSTANCE.getGSwitch();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GSWITCH__CASES = eINSTANCE.getGSwitch_Cases();

    /**
     * The meta object literal for the '<em><b>Stats</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GSWITCH__STATS = eINSTANCE.getGSwitch_Stats();

    /**
     * The meta object literal for the '{@link unige.dibris.kPL.impl.SkipImpl <em>Skip</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unige.dibris.kPL.impl.SkipImpl
     * @see unige.dibris.kPL.impl.KPLPackageImpl#getSkip()
     * @generated
     */
    EClass SKIP = eINSTANCE.getSkip();

    /**
     * The meta object literal for the '{@link unige.dibris.kPL.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unige.dibris.kPL.impl.BinaryExprImpl
     * @see unige.dibris.kPL.impl.KPLPackageImpl#getBinaryExpr()
     * @generated
     */
    EClass BINARY_EXPR = eINSTANCE.getBinaryExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXPR__LEFT = eINSTANCE.getBinaryExpr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_EXPR__OP = eINSTANCE.getBinaryExpr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXPR__RIGHT = eINSTANCE.getBinaryExpr_Right();

    /**
     * The meta object literal for the '{@link unige.dibris.kPL.impl.VarImpl <em>Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unige.dibris.kPL.impl.VarImpl
     * @see unige.dibris.kPL.impl.KPLPackageImpl#getVar()
     * @generated
     */
    EClass VAR = eINSTANCE.getVar();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR__NAME = eINSTANCE.getVar_Name();

    /**
     * The meta object literal for the '{@link unige.dibris.kPL.impl.ValImpl <em>Val</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unige.dibris.kPL.impl.ValImpl
     * @see unige.dibris.kPL.impl.KPLPackageImpl#getVal()
     * @generated
     */
    EClass VAL = eINSTANCE.getVal();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAL__VAL = eINSTANCE.getVal_Val();

    /**
     * The meta object literal for the '{@link unige.dibris.kPL.impl.GidImpl <em>Gid</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unige.dibris.kPL.impl.GidImpl
     * @see unige.dibris.kPL.impl.KPLPackageImpl#getGid()
     * @generated
     */
    EClass GID = eINSTANCE.getGid();

    /**
     * The meta object literal for the '{@link unige.dibris.kPL.impl.LidImpl <em>Lid</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see unige.dibris.kPL.impl.LidImpl
     * @see unige.dibris.kPL.impl.KPLPackageImpl#getLid()
     * @generated
     */
    EClass LID = eINSTANCE.getLid();

  }

} //KPLPackage
