package unige.dibris.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import unige.dibris.services.KPLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKPLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'threads:'", "'group:'", "'main:'", "'procedure:'", "'local'", "'in'", "'if'", "'then'", "'else'", "'while'", "'do'", "'('", "')'", "':='", "'rd'", "'wr'", "','", "'barrier'", "'{'", "';'", "'}'", "'lswitch'", "':'", "'gswitch'", "'skip'", "'+'", "'-'", "'*'", "'/'", "'gid'", "'lid'"
    };
    public static final int RULE_ID=5;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalKPLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKPLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKPLParser.tokenNames; }
    public String getGrammarFileName() { return "../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g"; }



     	private KPLGrammarAccess grammarAccess;
     	
        public InternalKPLParser(TokenStream input, KPLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Kernel";	
       	}
       	
       	@Override
       	protected KPLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleKernel"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:67:1: entryRuleKernel returns [EObject current=null] : iv_ruleKernel= ruleKernel EOF ;
    public final EObject entryRuleKernel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKernel = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:68:2: (iv_ruleKernel= ruleKernel EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:69:2: iv_ruleKernel= ruleKernel EOF
            {
             newCompositeNode(grammarAccess.getKernelRule()); 
            pushFollow(FOLLOW_ruleKernel_in_entryRuleKernel75);
            iv_ruleKernel=ruleKernel();

            state._fsp--;

             current =iv_ruleKernel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKernel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKernel"


    // $ANTLR start "ruleKernel"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:76:1: ruleKernel returns [EObject current=null] : (otherlv_0= 'threads:' ( (lv_n_1_0= RULE_INT ) ) otherlv_2= 'group:' ( (lv_m_3_0= RULE_INT ) ) ( (lv_procedures_4_0= ruleProcedure ) )* otherlv_5= 'main:' ( (lv_main_6_0= ruleStatement ) ) ) ;
    public final EObject ruleKernel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_n_1_0=null;
        Token otherlv_2=null;
        Token lv_m_3_0=null;
        Token otherlv_5=null;
        EObject lv_procedures_4_0 = null;

        EObject lv_main_6_0 = null;


         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:79:28: ( (otherlv_0= 'threads:' ( (lv_n_1_0= RULE_INT ) ) otherlv_2= 'group:' ( (lv_m_3_0= RULE_INT ) ) ( (lv_procedures_4_0= ruleProcedure ) )* otherlv_5= 'main:' ( (lv_main_6_0= ruleStatement ) ) ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:80:1: (otherlv_0= 'threads:' ( (lv_n_1_0= RULE_INT ) ) otherlv_2= 'group:' ( (lv_m_3_0= RULE_INT ) ) ( (lv_procedures_4_0= ruleProcedure ) )* otherlv_5= 'main:' ( (lv_main_6_0= ruleStatement ) ) )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:80:1: (otherlv_0= 'threads:' ( (lv_n_1_0= RULE_INT ) ) otherlv_2= 'group:' ( (lv_m_3_0= RULE_INT ) ) ( (lv_procedures_4_0= ruleProcedure ) )* otherlv_5= 'main:' ( (lv_main_6_0= ruleStatement ) ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:80:3: otherlv_0= 'threads:' ( (lv_n_1_0= RULE_INT ) ) otherlv_2= 'group:' ( (lv_m_3_0= RULE_INT ) ) ( (lv_procedures_4_0= ruleProcedure ) )* otherlv_5= 'main:' ( (lv_main_6_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleKernel122); 

                	newLeafNode(otherlv_0, grammarAccess.getKernelAccess().getThreadsKeyword_0());
                
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:84:1: ( (lv_n_1_0= RULE_INT ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:85:1: (lv_n_1_0= RULE_INT )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:85:1: (lv_n_1_0= RULE_INT )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:86:3: lv_n_1_0= RULE_INT
            {
            lv_n_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleKernel139); 

            			newLeafNode(lv_n_1_0, grammarAccess.getKernelAccess().getNINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKernelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"n",
                    		lv_n_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleKernel156); 

                	newLeafNode(otherlv_2, grammarAccess.getKernelAccess().getGroupKeyword_2());
                
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:106:1: ( (lv_m_3_0= RULE_INT ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:107:1: (lv_m_3_0= RULE_INT )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:107:1: (lv_m_3_0= RULE_INT )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:108:3: lv_m_3_0= RULE_INT
            {
            lv_m_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleKernel173); 

            			newLeafNode(lv_m_3_0, grammarAccess.getKernelAccess().getMINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKernelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"m",
                    		lv_m_3_0, 
                    		"INT");
            	    

            }


            }

            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:124:2: ( (lv_procedures_4_0= ruleProcedure ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:125:1: (lv_procedures_4_0= ruleProcedure )
            	    {
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:125:1: (lv_procedures_4_0= ruleProcedure )
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:126:3: lv_procedures_4_0= ruleProcedure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKernelAccess().getProceduresProcedureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProcedure_in_ruleKernel199);
            	    lv_procedures_4_0=ruleProcedure();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKernelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"procedures",
            	            		lv_procedures_4_0, 
            	            		"Procedure");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleKernel212); 

                	newLeafNode(otherlv_5, grammarAccess.getKernelAccess().getMainKeyword_5());
                
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:146:1: ( (lv_main_6_0= ruleStatement ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:147:1: (lv_main_6_0= ruleStatement )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:147:1: (lv_main_6_0= ruleStatement )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:148:3: lv_main_6_0= ruleStatement
            {
             
            	        newCompositeNode(grammarAccess.getKernelAccess().getMainStatementParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleKernel233);
            lv_main_6_0=ruleStatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getKernelRule());
            	        }
                   		set(
                   			current, 
                   			"main",
                    		lv_main_6_0, 
                    		"Statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKernel"


    // $ANTLR start "entryRuleProcedure"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:172:1: entryRuleProcedure returns [EObject current=null] : iv_ruleProcedure= ruleProcedure EOF ;
    public final EObject entryRuleProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedure = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:173:2: (iv_ruleProcedure= ruleProcedure EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:174:2: iv_ruleProcedure= ruleProcedure EOF
            {
             newCompositeNode(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_ruleProcedure_in_entryRuleProcedure269);
            iv_ruleProcedure=ruleProcedure();

            state._fsp--;

             current =iv_ruleProcedure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedure279); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:181:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'procedure:' ( (lv_z_1_0= RULE_ID ) ) ( (lv_x_2_0= RULE_ID ) ) ( (lv_body_3_0= ruleStatement ) ) ) ;
    public final EObject ruleProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_z_1_0=null;
        Token lv_x_2_0=null;
        EObject lv_body_3_0 = null;


         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:184:28: ( (otherlv_0= 'procedure:' ( (lv_z_1_0= RULE_ID ) ) ( (lv_x_2_0= RULE_ID ) ) ( (lv_body_3_0= ruleStatement ) ) ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:185:1: (otherlv_0= 'procedure:' ( (lv_z_1_0= RULE_ID ) ) ( (lv_x_2_0= RULE_ID ) ) ( (lv_body_3_0= ruleStatement ) ) )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:185:1: (otherlv_0= 'procedure:' ( (lv_z_1_0= RULE_ID ) ) ( (lv_x_2_0= RULE_ID ) ) ( (lv_body_3_0= ruleStatement ) ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:185:3: otherlv_0= 'procedure:' ( (lv_z_1_0= RULE_ID ) ) ( (lv_x_2_0= RULE_ID ) ) ( (lv_body_3_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleProcedure316); 

                	newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getProcedureKeyword_0());
                
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:189:1: ( (lv_z_1_0= RULE_ID ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:190:1: (lv_z_1_0= RULE_ID )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:190:1: (lv_z_1_0= RULE_ID )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:191:3: lv_z_1_0= RULE_ID
            {
            lv_z_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcedure333); 

            			newLeafNode(lv_z_1_0, grammarAccess.getProcedureAccess().getZIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcedureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"z",
                    		lv_z_1_0, 
                    		"ID");
            	    

            }


            }

            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:207:2: ( (lv_x_2_0= RULE_ID ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:208:1: (lv_x_2_0= RULE_ID )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:208:1: (lv_x_2_0= RULE_ID )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:209:3: lv_x_2_0= RULE_ID
            {
            lv_x_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProcedure355); 

            			newLeafNode(lv_x_2_0, grammarAccess.getProcedureAccess().getXIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProcedureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"x",
                    		lv_x_2_0, 
                    		"ID");
            	    

            }


            }

            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:225:2: ( (lv_body_3_0= ruleStatement ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:226:1: (lv_body_3_0= ruleStatement )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:226:1: (lv_body_3_0= ruleStatement )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:227:3: lv_body_3_0= ruleStatement
            {
             
            	        newCompositeNode(grammarAccess.getProcedureAccess().getBodyStatementParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleProcedure381);
            lv_body_3_0=ruleStatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProcedureRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_3_0, 
                    		"Statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleStatement"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:251:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:252:2: (iv_ruleStatement= ruleStatement EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:253:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement417);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement427); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:260:1: ruleStatement returns [EObject current=null] : (this_Decl_0= ruleDecl | this_Branch_1= ruleBranch | this_Loop_2= ruleLoop | this_Invoke_3= ruleInvoke | this_Assign_4= ruleAssign | this_Read_5= ruleRead | this_Write_6= ruleWrite | this_Barrier_7= ruleBarrier | this_Block_8= ruleBlock | this_LSwitch_9= ruleLSwitch | this_GSwitch_10= ruleGSwitch | this_Skip_11= ruleSkip ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Decl_0 = null;

        EObject this_Branch_1 = null;

        EObject this_Loop_2 = null;

        EObject this_Invoke_3 = null;

        EObject this_Assign_4 = null;

        EObject this_Read_5 = null;

        EObject this_Write_6 = null;

        EObject this_Barrier_7 = null;

        EObject this_Block_8 = null;

        EObject this_LSwitch_9 = null;

        EObject this_GSwitch_10 = null;

        EObject this_Skip_11 = null;


         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:263:28: ( (this_Decl_0= ruleDecl | this_Branch_1= ruleBranch | this_Loop_2= ruleLoop | this_Invoke_3= ruleInvoke | this_Assign_4= ruleAssign | this_Read_5= ruleRead | this_Write_6= ruleWrite | this_Barrier_7= ruleBarrier | this_Block_8= ruleBlock | this_LSwitch_9= ruleLSwitch | this_GSwitch_10= ruleGSwitch | this_Skip_11= ruleSkip ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:264:1: (this_Decl_0= ruleDecl | this_Branch_1= ruleBranch | this_Loop_2= ruleLoop | this_Invoke_3= ruleInvoke | this_Assign_4= ruleAssign | this_Read_5= ruleRead | this_Write_6= ruleWrite | this_Barrier_7= ruleBarrier | this_Block_8= ruleBlock | this_LSwitch_9= ruleLSwitch | this_GSwitch_10= ruleGSwitch | this_Skip_11= ruleSkip )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:264:1: (this_Decl_0= ruleDecl | this_Branch_1= ruleBranch | this_Loop_2= ruleLoop | this_Invoke_3= ruleInvoke | this_Assign_4= ruleAssign | this_Read_5= ruleRead | this_Write_6= ruleWrite | this_Barrier_7= ruleBarrier | this_Block_8= ruleBlock | this_LSwitch_9= ruleLSwitch | this_GSwitch_10= ruleGSwitch | this_Skip_11= ruleSkip )
            int alt2=12;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:265:5: this_Decl_0= ruleDecl
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getDeclParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDecl_in_ruleStatement474);
                    this_Decl_0=ruleDecl();

                    state._fsp--;

                     
                            current = this_Decl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:275:5: this_Branch_1= ruleBranch
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getBranchParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBranch_in_ruleStatement501);
                    this_Branch_1=ruleBranch();

                    state._fsp--;

                     
                            current = this_Branch_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:285:5: this_Loop_2= ruleLoop
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getLoopParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLoop_in_ruleStatement528);
                    this_Loop_2=ruleLoop();

                    state._fsp--;

                     
                            current = this_Loop_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:295:5: this_Invoke_3= ruleInvoke
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getInvokeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleInvoke_in_ruleStatement555);
                    this_Invoke_3=ruleInvoke();

                    state._fsp--;

                     
                            current = this_Invoke_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:305:5: this_Assign_4= ruleAssign
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getAssignParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleAssign_in_ruleStatement582);
                    this_Assign_4=ruleAssign();

                    state._fsp--;

                     
                            current = this_Assign_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:315:5: this_Read_5= ruleRead
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getReadParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleRead_in_ruleStatement609);
                    this_Read_5=ruleRead();

                    state._fsp--;

                     
                            current = this_Read_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:325:5: this_Write_6= ruleWrite
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getWriteParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleWrite_in_ruleStatement636);
                    this_Write_6=ruleWrite();

                    state._fsp--;

                     
                            current = this_Write_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:335:5: this_Barrier_7= ruleBarrier
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getBarrierParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleBarrier_in_ruleStatement663);
                    this_Barrier_7=ruleBarrier();

                    state._fsp--;

                     
                            current = this_Barrier_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:345:5: this_Block_8= ruleBlock
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getBlockParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleBlock_in_ruleStatement690);
                    this_Block_8=ruleBlock();

                    state._fsp--;

                     
                            current = this_Block_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:355:5: this_LSwitch_9= ruleLSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getLSwitchParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleLSwitch_in_ruleStatement717);
                    this_LSwitch_9=ruleLSwitch();

                    state._fsp--;

                     
                            current = this_LSwitch_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:365:5: this_GSwitch_10= ruleGSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getGSwitchParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleGSwitch_in_ruleStatement744);
                    this_GSwitch_10=ruleGSwitch();

                    state._fsp--;

                     
                            current = this_GSwitch_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:375:5: this_Skip_11= ruleSkip
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getSkipParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleSkip_in_ruleStatement771);
                    this_Skip_11=ruleSkip();

                    state._fsp--;

                     
                            current = this_Skip_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleDecl"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:391:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:392:2: (iv_ruleDecl= ruleDecl EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:393:2: iv_ruleDecl= ruleDecl EOF
            {
             newCompositeNode(grammarAccess.getDeclRule()); 
            pushFollow(FOLLOW_ruleDecl_in_entryRuleDecl806);
            iv_ruleDecl=ruleDecl();

            state._fsp--;

             current =iv_ruleDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecl816); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecl"


    // $ANTLR start "ruleDecl"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:400:1: ruleDecl returns [EObject current=null] : ( () otherlv_1= 'local' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_body_4_0= ruleStatement ) ) ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_var_2_0=null;
        Token otherlv_3=null;
        EObject lv_body_4_0 = null;


         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:403:28: ( ( () otherlv_1= 'local' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_body_4_0= ruleStatement ) ) ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:404:1: ( () otherlv_1= 'local' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_body_4_0= ruleStatement ) ) )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:404:1: ( () otherlv_1= 'local' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_body_4_0= ruleStatement ) ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:404:2: () otherlv_1= 'local' ( (lv_var_2_0= RULE_ID ) ) otherlv_3= 'in' ( (lv_body_4_0= ruleStatement ) )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:404:2: ()
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:405:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeclAccess().getDeclAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleDecl862); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclAccess().getLocalKeyword_1());
                
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:414:1: ( (lv_var_2_0= RULE_ID ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:415:1: (lv_var_2_0= RULE_ID )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:415:1: (lv_var_2_0= RULE_ID )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:416:3: lv_var_2_0= RULE_ID
            {
            lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecl879); 

            			newLeafNode(lv_var_2_0, grammarAccess.getDeclAccess().getVarIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"var",
                    		lv_var_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleDecl896); 

                	newLeafNode(otherlv_3, grammarAccess.getDeclAccess().getInKeyword_3());
                
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:436:1: ( (lv_body_4_0= ruleStatement ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:437:1: (lv_body_4_0= ruleStatement )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:437:1: (lv_body_4_0= ruleStatement )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:438:3: lv_body_4_0= ruleStatement
            {
             
            	        newCompositeNode(grammarAccess.getDeclAccess().getBodyStatementParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleDecl917);
            lv_body_4_0=ruleStatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_4_0, 
                    		"Statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecl"


    // $ANTLR start "entryRuleBranch"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:462:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:463:2: (iv_ruleBranch= ruleBranch EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:464:2: iv_ruleBranch= ruleBranch EOF
            {
             newCompositeNode(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_ruleBranch_in_entryRuleBranch953);
            iv_ruleBranch=ruleBranch();

            state._fsp--;

             current =iv_ruleBranch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBranch963); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBranch"


    // $ANTLR start "ruleBranch"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:471:1: ruleBranch returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_left_4_0= ruleStatement ) ) otherlv_5= 'else' ( (lv_right_6_0= ruleStatement ) ) ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_guard_2_0 = null;

        EObject lv_left_4_0 = null;

        EObject lv_right_6_0 = null;


         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:474:28: ( ( () otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_left_4_0= ruleStatement ) ) otherlv_5= 'else' ( (lv_right_6_0= ruleStatement ) ) ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:475:1: ( () otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_left_4_0= ruleStatement ) ) otherlv_5= 'else' ( (lv_right_6_0= ruleStatement ) ) )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:475:1: ( () otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_left_4_0= ruleStatement ) ) otherlv_5= 'else' ( (lv_right_6_0= ruleStatement ) ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:475:2: () otherlv_1= 'if' ( (lv_guard_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_left_4_0= ruleStatement ) ) otherlv_5= 'else' ( (lv_right_6_0= ruleStatement ) )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:475:2: ()
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:476:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBranchAccess().getBranchAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleBranch1009); 

                	newLeafNode(otherlv_1, grammarAccess.getBranchAccess().getIfKeyword_1());
                
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:485:1: ( (lv_guard_2_0= ruleExpression ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:486:1: (lv_guard_2_0= ruleExpression )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:486:1: (lv_guard_2_0= ruleExpression )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:487:3: lv_guard_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getBranchAccess().getGuardExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleBranch1030);
            lv_guard_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBranchRule());
            	        }
                   		set(
                   			current, 
                   			"guard",
                    		lv_guard_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleBranch1042); 

                	newLeafNode(otherlv_3, grammarAccess.getBranchAccess().getThenKeyword_3());
                
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:507:1: ( (lv_left_4_0= ruleStatement ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:508:1: (lv_left_4_0= ruleStatement )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:508:1: (lv_left_4_0= ruleStatement )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:509:3: lv_left_4_0= ruleStatement
            {
             
            	        newCompositeNode(grammarAccess.getBranchAccess().getLeftStatementParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleBranch1063);
            lv_left_4_0=ruleStatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBranchRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_4_0, 
                    		"Statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleBranch1075); 

                	newLeafNode(otherlv_5, grammarAccess.getBranchAccess().getElseKeyword_5());
                
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:529:1: ( (lv_right_6_0= ruleStatement ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:530:1: (lv_right_6_0= ruleStatement )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:530:1: (lv_right_6_0= ruleStatement )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:531:3: lv_right_6_0= ruleStatement
            {
             
            	        newCompositeNode(grammarAccess.getBranchAccess().getRightStatementParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleBranch1096);
            lv_right_6_0=ruleStatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBranchRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_6_0, 
                    		"Statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBranch"


    // $ANTLR start "entryRuleLoop"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:555:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:556:2: (iv_ruleLoop= ruleLoop EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:557:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_ruleLoop_in_entryRuleLoop1132);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoop1142); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:564:1: ruleLoop returns [EObject current=null] : ( () otherlv_1= 'while' ( (lv_guard_2_0= ruleExpression ) ) otherlv_3= 'do' ( (lv_body_4_0= ruleStatement ) ) ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_guard_2_0 = null;

        EObject lv_body_4_0 = null;


         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:567:28: ( ( () otherlv_1= 'while' ( (lv_guard_2_0= ruleExpression ) ) otherlv_3= 'do' ( (lv_body_4_0= ruleStatement ) ) ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:568:1: ( () otherlv_1= 'while' ( (lv_guard_2_0= ruleExpression ) ) otherlv_3= 'do' ( (lv_body_4_0= ruleStatement ) ) )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:568:1: ( () otherlv_1= 'while' ( (lv_guard_2_0= ruleExpression ) ) otherlv_3= 'do' ( (lv_body_4_0= ruleStatement ) ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:568:2: () otherlv_1= 'while' ( (lv_guard_2_0= ruleExpression ) ) otherlv_3= 'do' ( (lv_body_4_0= ruleStatement ) )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:568:2: ()
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:569:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLoopAccess().getLoopAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleLoop1188); 

                	newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getWhileKeyword_1());
                
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:578:1: ( (lv_guard_2_0= ruleExpression ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:579:1: (lv_guard_2_0= ruleExpression )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:579:1: (lv_guard_2_0= ruleExpression )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:580:3: lv_guard_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getLoopAccess().getGuardExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleLoop1209);
            lv_guard_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLoopRule());
            	        }
                   		set(
                   			current, 
                   			"guard",
                    		lv_guard_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleLoop1221); 

                	newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getDoKeyword_3());
                
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:600:1: ( (lv_body_4_0= ruleStatement ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:601:1: (lv_body_4_0= ruleStatement )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:601:1: (lv_body_4_0= ruleStatement )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:602:3: lv_body_4_0= ruleStatement
            {
             
            	        newCompositeNode(grammarAccess.getLoopAccess().getBodyStatementParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleLoop1242);
            lv_body_4_0=ruleStatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLoopRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_4_0, 
                    		"Statement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleInvoke"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:626:1: entryRuleInvoke returns [EObject current=null] : iv_ruleInvoke= ruleInvoke EOF ;
    public final EObject entryRuleInvoke() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvoke = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:627:2: (iv_ruleInvoke= ruleInvoke EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:628:2: iv_ruleInvoke= ruleInvoke EOF
            {
             newCompositeNode(grammarAccess.getInvokeRule()); 
            pushFollow(FOLLOW_ruleInvoke_in_entryRuleInvoke1278);
            iv_ruleInvoke=ruleInvoke();

            state._fsp--;

             current =iv_ruleInvoke; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvoke1288); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvoke"


    // $ANTLR start "ruleInvoke"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:635:1: ruleInvoke returns [EObject current=null] : ( () ( (lv_fun_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_arg_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleInvoke() throws RecognitionException {
        EObject current = null;

        Token lv_fun_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_arg_3_0 = null;


         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:638:28: ( ( () ( (lv_fun_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_arg_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:639:1: ( () ( (lv_fun_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_arg_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:639:1: ( () ( (lv_fun_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_arg_3_0= ruleExpression ) ) otherlv_4= ')' )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:639:2: () ( (lv_fun_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_arg_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:639:2: ()
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:640:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInvokeAccess().getInvokeAction_0(),
                        current);
                

            }

            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:645:2: ( (lv_fun_1_0= RULE_ID ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:646:1: (lv_fun_1_0= RULE_ID )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:646:1: (lv_fun_1_0= RULE_ID )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:647:3: lv_fun_1_0= RULE_ID
            {
            lv_fun_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInvoke1339); 

            			newLeafNode(lv_fun_1_0, grammarAccess.getInvokeAccess().getFunIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInvokeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"fun",
                    		lv_fun_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleInvoke1356); 

                	newLeafNode(otherlv_2, grammarAccess.getInvokeAccess().getLeftParenthesisKeyword_2());
                
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:667:1: ( (lv_arg_3_0= ruleExpression ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:668:1: (lv_arg_3_0= ruleExpression )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:668:1: (lv_arg_3_0= ruleExpression )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:669:3: lv_arg_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getArgExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleInvoke1377);
            lv_arg_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvokeRule());
            	        }
                   		set(
                   			current, 
                   			"arg",
                    		lv_arg_3_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleInvoke1389); 

                	newLeafNode(otherlv_4, grammarAccess.getInvokeAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvoke"


    // $ANTLR start "entryRuleAssign"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:697:1: entryRuleAssign returns [EObject current=null] : iv_ruleAssign= ruleAssign EOF ;
    public final EObject entryRuleAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssign = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:698:2: (iv_ruleAssign= ruleAssign EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:699:2: iv_ruleAssign= ruleAssign EOF
            {
             newCompositeNode(grammarAccess.getAssignRule()); 
            pushFollow(FOLLOW_ruleAssign_in_entryRuleAssign1425);
            iv_ruleAssign=ruleAssign();

            state._fsp--;

             current =iv_ruleAssign; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssign1435); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssign"


    // $ANTLR start "ruleAssign"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:706:1: ruleAssign returns [EObject current=null] : ( () ( (lv_var_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_exp_3_0= ruleExpression ) ) ) ;
    public final EObject ruleAssign() throws RecognitionException {
        EObject current = null;

        Token lv_var_1_0=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;


         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:709:28: ( ( () ( (lv_var_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_exp_3_0= ruleExpression ) ) ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:710:1: ( () ( (lv_var_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_exp_3_0= ruleExpression ) ) )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:710:1: ( () ( (lv_var_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_exp_3_0= ruleExpression ) ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:710:2: () ( (lv_var_1_0= RULE_ID ) ) otherlv_2= ':=' ( (lv_exp_3_0= ruleExpression ) )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:710:2: ()
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:711:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAssignAccess().getAssignAction_0(),
                        current);
                

            }

            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:716:2: ( (lv_var_1_0= RULE_ID ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:717:1: (lv_var_1_0= RULE_ID )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:717:1: (lv_var_1_0= RULE_ID )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:718:3: lv_var_1_0= RULE_ID
            {
            lv_var_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssign1486); 

            			newLeafNode(lv_var_1_0, grammarAccess.getAssignAccess().getVarIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"var",
                    		lv_var_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleAssign1503); 

                	newLeafNode(otherlv_2, grammarAccess.getAssignAccess().getColonEqualsSignKeyword_2());
                
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:738:1: ( (lv_exp_3_0= ruleExpression ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:739:1: (lv_exp_3_0= ruleExpression )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:739:1: (lv_exp_3_0= ruleExpression )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:740:3: lv_exp_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssignAccess().getExpExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleAssign1524);
            lv_exp_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_3_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssign"


    // $ANTLR start "entryRuleRead"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:764:1: entryRuleRead returns [EObject current=null] : iv_ruleRead= ruleRead EOF ;
    public final EObject entryRuleRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRead = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:765:2: (iv_ruleRead= ruleRead EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:766:2: iv_ruleRead= ruleRead EOF
            {
             newCompositeNode(grammarAccess.getReadRule()); 
            pushFollow(FOLLOW_ruleRead_in_entryRuleRead1560);
            iv_ruleRead=ruleRead();

            state._fsp--;

             current =iv_ruleRead; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRead1570); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRead"


    // $ANTLR start "ruleRead"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:773:1: ruleRead returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' otherlv_3= 'rd' otherlv_4= '(' ( (lv_loc_5_0= RULE_INT ) ) otherlv_6= ')' ) ;
    public final EObject ruleRead() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_loc_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:776:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' otherlv_3= 'rd' otherlv_4= '(' ( (lv_loc_5_0= RULE_INT ) ) otherlv_6= ')' ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:777:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' otherlv_3= 'rd' otherlv_4= '(' ( (lv_loc_5_0= RULE_INT ) ) otherlv_6= ')' )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:777:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' otherlv_3= 'rd' otherlv_4= '(' ( (lv_loc_5_0= RULE_INT ) ) otherlv_6= ')' )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:777:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' otherlv_3= 'rd' otherlv_4= '(' ( (lv_loc_5_0= RULE_INT ) ) otherlv_6= ')'
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:777:2: ()
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:778:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReadAccess().getReadAction_0(),
                        current);
                

            }

            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:783:2: ( (lv_name_1_0= RULE_ID ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:784:1: (lv_name_1_0= RULE_ID )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:784:1: (lv_name_1_0= RULE_ID )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:785:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRead1621); 

            			newLeafNode(lv_name_1_0, grammarAccess.getReadAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReadRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleRead1638); 

                	newLeafNode(otherlv_2, grammarAccess.getReadAccess().getColonEqualsSignKeyword_2());
                
            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleRead1650); 

                	newLeafNode(otherlv_3, grammarAccess.getReadAccess().getRdKeyword_3());
                
            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleRead1662); 

                	newLeafNode(otherlv_4, grammarAccess.getReadAccess().getLeftParenthesisKeyword_4());
                
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:813:1: ( (lv_loc_5_0= RULE_INT ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:814:1: (lv_loc_5_0= RULE_INT )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:814:1: (lv_loc_5_0= RULE_INT )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:815:3: lv_loc_5_0= RULE_INT
            {
            lv_loc_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRead1679); 

            			newLeafNode(lv_loc_5_0, grammarAccess.getReadAccess().getLocINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReadRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"loc",
                    		lv_loc_5_0, 
                    		"INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleRead1696); 

                	newLeafNode(otherlv_6, grammarAccess.getReadAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRead"


    // $ANTLR start "entryRuleWrite"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:843:1: entryRuleWrite returns [EObject current=null] : iv_ruleWrite= ruleWrite EOF ;
    public final EObject entryRuleWrite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWrite = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:844:2: (iv_ruleWrite= ruleWrite EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:845:2: iv_ruleWrite= ruleWrite EOF
            {
             newCompositeNode(grammarAccess.getWriteRule()); 
            pushFollow(FOLLOW_ruleWrite_in_entryRuleWrite1732);
            iv_ruleWrite=ruleWrite();

            state._fsp--;

             current =iv_ruleWrite; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWrite1742); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWrite"


    // $ANTLR start "ruleWrite"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:852:1: ruleWrite returns [EObject current=null] : ( () otherlv_1= 'wr' otherlv_2= '(' ( (lv_loc_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleWrite() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_loc_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_exp_5_0 = null;


         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:855:28: ( ( () otherlv_1= 'wr' otherlv_2= '(' ( (lv_loc_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= ')' ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:856:1: ( () otherlv_1= 'wr' otherlv_2= '(' ( (lv_loc_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= ')' )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:856:1: ( () otherlv_1= 'wr' otherlv_2= '(' ( (lv_loc_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= ')' )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:856:2: () otherlv_1= 'wr' otherlv_2= '(' ( (lv_loc_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= ')'
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:856:2: ()
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:857:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getWriteAccess().getWriteAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleWrite1788); 

                	newLeafNode(otherlv_1, grammarAccess.getWriteAccess().getWrKeyword_1());
                
            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleWrite1800); 

                	newLeafNode(otherlv_2, grammarAccess.getWriteAccess().getLeftParenthesisKeyword_2());
                
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:870:1: ( (lv_loc_3_0= RULE_INT ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:871:1: (lv_loc_3_0= RULE_INT )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:871:1: (lv_loc_3_0= RULE_INT )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:872:3: lv_loc_3_0= RULE_INT
            {
            lv_loc_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWrite1817); 

            			newLeafNode(lv_loc_3_0, grammarAccess.getWriteAccess().getLocINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWriteRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"loc",
                    		lv_loc_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleWrite1834); 

                	newLeafNode(otherlv_4, grammarAccess.getWriteAccess().getCommaKeyword_4());
                
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:892:1: ( (lv_exp_5_0= ruleExpression ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:893:1: (lv_exp_5_0= ruleExpression )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:893:1: (lv_exp_5_0= ruleExpression )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:894:3: lv_exp_5_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getWriteAccess().getExpExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleWrite1855);
            lv_exp_5_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWriteRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_5_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleWrite1867); 

                	newLeafNode(otherlv_6, grammarAccess.getWriteAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWrite"


    // $ANTLR start "entryRuleBarrier"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:922:1: entryRuleBarrier returns [EObject current=null] : iv_ruleBarrier= ruleBarrier EOF ;
    public final EObject entryRuleBarrier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBarrier = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:923:2: (iv_ruleBarrier= ruleBarrier EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:924:2: iv_ruleBarrier= ruleBarrier EOF
            {
             newCompositeNode(grammarAccess.getBarrierRule()); 
            pushFollow(FOLLOW_ruleBarrier_in_entryRuleBarrier1903);
            iv_ruleBarrier=ruleBarrier();

            state._fsp--;

             current =iv_ruleBarrier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBarrier1913); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBarrier"


    // $ANTLR start "ruleBarrier"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:931:1: ruleBarrier returns [EObject current=null] : ( () otherlv_1= 'barrier' ) ;
    public final EObject ruleBarrier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:934:28: ( ( () otherlv_1= 'barrier' ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:935:1: ( () otherlv_1= 'barrier' )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:935:1: ( () otherlv_1= 'barrier' )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:935:2: () otherlv_1= 'barrier'
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:935:2: ()
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:936:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBarrierAccess().getBarrierAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleBarrier1959); 

                	newLeafNode(otherlv_1, grammarAccess.getBarrierAccess().getBarrierKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBarrier"


    // $ANTLR start "entryRuleBlock"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:953:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:954:2: (iv_ruleBlock= ruleBlock EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:955:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock1995);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock2005); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:962:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_stats_2_0= ruleStatement ) ) otherlv_3= ';' )+ otherlv_4= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_stats_2_0 = null;


         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:965:28: ( ( () otherlv_1= '{' ( ( (lv_stats_2_0= ruleStatement ) ) otherlv_3= ';' )+ otherlv_4= '}' ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:966:1: ( () otherlv_1= '{' ( ( (lv_stats_2_0= ruleStatement ) ) otherlv_3= ';' )+ otherlv_4= '}' )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:966:1: ( () otherlv_1= '{' ( ( (lv_stats_2_0= ruleStatement ) ) otherlv_3= ';' )+ otherlv_4= '}' )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:966:2: () otherlv_1= '{' ( ( (lv_stats_2_0= ruleStatement ) ) otherlv_3= ';' )+ otherlv_4= '}'
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:966:2: ()
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:967:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlockAccess().getBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleBlock2051); 

                	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
                
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:976:1: ( ( (lv_stats_2_0= ruleStatement ) ) otherlv_3= ';' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==15||LA3_0==17||LA3_0==20||LA3_0==26||(LA3_0>=28 && LA3_0<=29)||LA3_0==32||(LA3_0>=34 && LA3_0<=35)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:976:2: ( (lv_stats_2_0= ruleStatement ) ) otherlv_3= ';'
            	    {
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:976:2: ( (lv_stats_2_0= ruleStatement ) )
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:977:1: (lv_stats_2_0= ruleStatement )
            	    {
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:977:1: (lv_stats_2_0= ruleStatement )
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:978:3: lv_stats_2_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlockAccess().getStatsStatementParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleBlock2073);
            	    lv_stats_2_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stats",
            	            		lv_stats_2_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleBlock2085); 

            	        	newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getSemicolonKeyword_2_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleBlock2099); 

                	newLeafNode(otherlv_4, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleLSwitch"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1010:1: entryRuleLSwitch returns [EObject current=null] : iv_ruleLSwitch= ruleLSwitch EOF ;
    public final EObject entryRuleLSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLSwitch = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1011:2: (iv_ruleLSwitch= ruleLSwitch EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1012:2: iv_ruleLSwitch= ruleLSwitch EOF
            {
             newCompositeNode(grammarAccess.getLSwitchRule()); 
            pushFollow(FOLLOW_ruleLSwitch_in_entryRuleLSwitch2135);
            iv_ruleLSwitch=ruleLSwitch();

            state._fsp--;

             current =iv_ruleLSwitch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLSwitch2145); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLSwitch"


    // $ANTLR start "ruleLSwitch"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1019:1: ruleLSwitch returns [EObject current=null] : ( () otherlv_1= 'lswitch' ( ( (lv_cases_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_stats_4_0= ruleStatement ) ) )+ ) ;
    public final EObject ruleLSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_cases_2_0=null;
        Token otherlv_3=null;
        EObject lv_stats_4_0 = null;


         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1022:28: ( ( () otherlv_1= 'lswitch' ( ( (lv_cases_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_stats_4_0= ruleStatement ) ) )+ ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1023:1: ( () otherlv_1= 'lswitch' ( ( (lv_cases_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_stats_4_0= ruleStatement ) ) )+ )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1023:1: ( () otherlv_1= 'lswitch' ( ( (lv_cases_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_stats_4_0= ruleStatement ) ) )+ )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1023:2: () otherlv_1= 'lswitch' ( ( (lv_cases_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_stats_4_0= ruleStatement ) ) )+
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1023:2: ()
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1024:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLSwitchAccess().getLSwitchAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleLSwitch2191); 

                	newLeafNode(otherlv_1, grammarAccess.getLSwitchAccess().getLswitchKeyword_1());
                
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1033:1: ( ( (lv_cases_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_stats_4_0= ruleStatement ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1033:2: ( (lv_cases_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_stats_4_0= ruleStatement ) )
            	    {
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1033:2: ( (lv_cases_2_0= RULE_INT ) )
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1034:1: (lv_cases_2_0= RULE_INT )
            	    {
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1034:1: (lv_cases_2_0= RULE_INT )
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1035:3: lv_cases_2_0= RULE_INT
            	    {
            	    lv_cases_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLSwitch2209); 

            	    			newLeafNode(lv_cases_2_0, grammarAccess.getLSwitchAccess().getCasesINTTerminalRuleCall_2_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getLSwitchRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"cases",
            	            		lv_cases_2_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleLSwitch2226); 

            	        	newLeafNode(otherlv_3, grammarAccess.getLSwitchAccess().getColonKeyword_2_1());
            	        
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1055:1: ( (lv_stats_4_0= ruleStatement ) )
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1056:1: (lv_stats_4_0= ruleStatement )
            	    {
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1056:1: (lv_stats_4_0= ruleStatement )
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1057:3: lv_stats_4_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLSwitchAccess().getStatsStatementParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleLSwitch2247);
            	    lv_stats_4_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLSwitchRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stats",
            	            		lv_stats_4_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLSwitch"


    // $ANTLR start "entryRuleGSwitch"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1081:1: entryRuleGSwitch returns [EObject current=null] : iv_ruleGSwitch= ruleGSwitch EOF ;
    public final EObject entryRuleGSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSwitch = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1082:2: (iv_ruleGSwitch= ruleGSwitch EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1083:2: iv_ruleGSwitch= ruleGSwitch EOF
            {
             newCompositeNode(grammarAccess.getGSwitchRule()); 
            pushFollow(FOLLOW_ruleGSwitch_in_entryRuleGSwitch2285);
            iv_ruleGSwitch=ruleGSwitch();

            state._fsp--;

             current =iv_ruleGSwitch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGSwitch2295); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSwitch"


    // $ANTLR start "ruleGSwitch"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1090:1: ruleGSwitch returns [EObject current=null] : ( () otherlv_1= 'gswitch' ( ( (lv_cases_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_stats_4_0= ruleStatement ) ) )+ ) ;
    public final EObject ruleGSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_cases_2_0=null;
        Token otherlv_3=null;
        EObject lv_stats_4_0 = null;


         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1093:28: ( ( () otherlv_1= 'gswitch' ( ( (lv_cases_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_stats_4_0= ruleStatement ) ) )+ ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1094:1: ( () otherlv_1= 'gswitch' ( ( (lv_cases_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_stats_4_0= ruleStatement ) ) )+ )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1094:1: ( () otherlv_1= 'gswitch' ( ( (lv_cases_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_stats_4_0= ruleStatement ) ) )+ )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1094:2: () otherlv_1= 'gswitch' ( ( (lv_cases_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_stats_4_0= ruleStatement ) ) )+
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1094:2: ()
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1095:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGSwitchAccess().getGSwitchAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleGSwitch2341); 

                	newLeafNode(otherlv_1, grammarAccess.getGSwitchAccess().getGswitchKeyword_1());
                
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1104:1: ( ( (lv_cases_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_stats_4_0= ruleStatement ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_INT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1104:2: ( (lv_cases_2_0= RULE_INT ) ) otherlv_3= ':' ( (lv_stats_4_0= ruleStatement ) )
            	    {
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1104:2: ( (lv_cases_2_0= RULE_INT ) )
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1105:1: (lv_cases_2_0= RULE_INT )
            	    {
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1105:1: (lv_cases_2_0= RULE_INT )
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1106:3: lv_cases_2_0= RULE_INT
            	    {
            	    lv_cases_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGSwitch2359); 

            	    			newLeafNode(lv_cases_2_0, grammarAccess.getGSwitchAccess().getCasesINTTerminalRuleCall_2_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGSwitchRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"cases",
            	            		lv_cases_2_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleGSwitch2376); 

            	        	newLeafNode(otherlv_3, grammarAccess.getGSwitchAccess().getColonKeyword_2_1());
            	        
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1126:1: ( (lv_stats_4_0= ruleStatement ) )
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1127:1: (lv_stats_4_0= ruleStatement )
            	    {
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1127:1: (lv_stats_4_0= ruleStatement )
            	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1128:3: lv_stats_4_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGSwitchAccess().getStatsStatementParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleGSwitch2397);
            	    lv_stats_4_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGSwitchRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stats",
            	            		lv_stats_4_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGSwitch"


    // $ANTLR start "entryRuleSkip"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1152:1: entryRuleSkip returns [EObject current=null] : iv_ruleSkip= ruleSkip EOF ;
    public final EObject entryRuleSkip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkip = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1153:2: (iv_ruleSkip= ruleSkip EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1154:2: iv_ruleSkip= ruleSkip EOF
            {
             newCompositeNode(grammarAccess.getSkipRule()); 
            pushFollow(FOLLOW_ruleSkip_in_entryRuleSkip2435);
            iv_ruleSkip=ruleSkip();

            state._fsp--;

             current =iv_ruleSkip; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkip2445); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSkip"


    // $ANTLR start "ruleSkip"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1161:1: ruleSkip returns [EObject current=null] : ( () otherlv_1= 'skip' ) ;
    public final EObject ruleSkip() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1164:28: ( ( () otherlv_1= 'skip' ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1165:1: ( () otherlv_1= 'skip' )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1165:1: ( () otherlv_1= 'skip' )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1165:2: () otherlv_1= 'skip'
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1165:2: ()
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1166:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSkipAccess().getSkipAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleSkip2491); 

                	newLeafNode(otherlv_1, grammarAccess.getSkipAccess().getSkipKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSkip"


    // $ANTLR start "entryRuleExpression"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1183:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1184:2: (iv_ruleExpression= ruleExpression EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1185:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2527);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2537); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1192:1: ruleExpression returns [EObject current=null] : this_Add_0= ruleAdd ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Add_0 = null;


         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1195:28: (this_Add_0= ruleAdd )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1197:5: this_Add_0= ruleAdd
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getAddParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleAdd_in_ruleExpression2583);
            this_Add_0=ruleAdd();

            state._fsp--;

             
                    current = this_Add_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAdd"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1213:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1214:2: (iv_ruleAdd= ruleAdd EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1215:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_ruleAdd_in_entryRuleAdd2617);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdd2627); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1222:1: ruleAdd returns [EObject current=null] : (this_Mul_0= ruleMul | ( () ( () ( ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) ) ) ( (lv_right_4_0= ruleMul ) ) )* ) ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token lv_op_3_1=null;
        Token lv_op_3_2=null;
        EObject this_Mul_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1225:28: ( (this_Mul_0= ruleMul | ( () ( () ( ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) ) ) ( (lv_right_4_0= ruleMul ) ) )* ) ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1226:1: (this_Mul_0= ruleMul | ( () ( () ( ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) ) ) ( (lv_right_4_0= ruleMul ) ) )* ) )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1226:1: (this_Mul_0= ruleMul | ( () ( () ( ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) ) ) ( (lv_right_4_0= ruleMul ) ) )* ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1227:5: this_Mul_0= ruleMul
                    {
                     
                            newCompositeNode(grammarAccess.getAddAccess().getMulParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMul_in_ruleAdd2674);
                    this_Mul_0=ruleMul();

                    state._fsp--;

                     
                            current = this_Mul_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1236:6: ( () ( () ( ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) ) ) ( (lv_right_4_0= ruleMul ) ) )* )
                    {
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1236:6: ( () ( () ( ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) ) ) ( (lv_right_4_0= ruleMul ) ) )* )
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1236:7: () ( () ( ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) ) ) ( (lv_right_4_0= ruleMul ) ) )*
                    {
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1236:7: ()
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1237:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAddAccess().getBinaryExprAction_1_0(),
                                current);
                        

                    }

                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1242:2: ( () ( ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) ) ) ( (lv_right_4_0= ruleMul ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=36 && LA7_0<=37)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1242:3: () ( ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) ) ) ( (lv_right_4_0= ruleMul ) )
                    	    {
                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1242:3: ()
                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1243:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getAddAccess().getBinaryExprLeftAction_1_1_0(),
                    	                current);
                    	        

                    	    }

                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1248:2: ( ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) ) )
                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1249:1: ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) )
                    	    {
                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1249:1: ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) )
                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1250:1: (lv_op_3_1= '+' | lv_op_3_2= '-' )
                    	    {
                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1250:1: (lv_op_3_1= '+' | lv_op_3_2= '-' )
                    	    int alt6=2;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==36) ) {
                    	        alt6=1;
                    	    }
                    	    else if ( (LA6_0==37) ) {
                    	        alt6=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 6, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1251:3: lv_op_3_1= '+'
                    	            {
                    	            lv_op_3_1=(Token)match(input,36,FOLLOW_36_in_ruleAdd2719); 

                    	                    newLeafNode(lv_op_3_1, grammarAccess.getAddAccess().getOpPlusSignKeyword_1_1_1_0_0());
                    	                

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getAddRule());
                    	            	        }
                    	                   		setWithLastConsumed(current, "op", lv_op_3_1, null);
                    	            	    

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1263:8: lv_op_3_2= '-'
                    	            {
                    	            lv_op_3_2=(Token)match(input,37,FOLLOW_37_in_ruleAdd2748); 

                    	                    newLeafNode(lv_op_3_2, grammarAccess.getAddAccess().getOpHyphenMinusKeyword_1_1_1_0_1());
                    	                

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getAddRule());
                    	            	        }
                    	                   		setWithLastConsumed(current, "op", lv_op_3_2, null);
                    	            	    

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1278:2: ( (lv_right_4_0= ruleMul ) )
                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1279:1: (lv_right_4_0= ruleMul )
                    	    {
                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1279:1: (lv_right_4_0= ruleMul )
                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1280:3: lv_right_4_0= ruleMul
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAddAccess().getRightMulParserRuleCall_1_1_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMul_in_ruleAdd2785);
                    	    lv_right_4_0=ruleMul();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAddRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"right",
                    	            		lv_right_4_0, 
                    	            		"Mul");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleMul"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1304:1: entryRuleMul returns [EObject current=null] : iv_ruleMul= ruleMul EOF ;
    public final EObject entryRuleMul() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMul = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1305:2: (iv_ruleMul= ruleMul EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1306:2: iv_ruleMul= ruleMul EOF
            {
             newCompositeNode(grammarAccess.getMulRule()); 
            pushFollow(FOLLOW_ruleMul_in_entryRuleMul2824);
            iv_ruleMul=ruleMul();

            state._fsp--;

             current =iv_ruleMul; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMul2834); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMul"


    // $ANTLR start "ruleMul"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1313:1: ruleMul returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( () ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ( (lv_right_4_0= rulePrimaryExpression ) ) )* ) ) ;
    public final EObject ruleMul() throws RecognitionException {
        EObject current = null;

        Token lv_op_3_1=null;
        Token lv_op_3_2=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1316:28: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( () ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ( (lv_right_4_0= rulePrimaryExpression ) ) )* ) ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1317:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( () ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ( (lv_right_4_0= rulePrimaryExpression ) ) )* ) )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1317:1: (this_PrimaryExpression_0= rulePrimaryExpression | ( () ( () ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ( (lv_right_4_0= rulePrimaryExpression ) ) )* ) )
            int alt11=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 22:
            case 40:
            case 41:
                {
                alt11=1;
                }
                break;
            case RULE_INT:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==33) ) {
                    alt11=2;
                }
                else if ( (LA11_2==EOF||LA11_2==RULE_INT||(LA11_2>=13 && LA11_2<=14)||(LA11_2>=18 && LA11_2<=19)||LA11_2==21||LA11_2==23||LA11_2==30||(LA11_2>=36 && LA11_2<=37)) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case 13:
            case 14:
            case 18:
            case 19:
            case 21:
            case 23:
            case 30:
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt11=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1318:5: this_PrimaryExpression_0= rulePrimaryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getMulAccess().getPrimaryExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMul2881);
                    this_PrimaryExpression_0=rulePrimaryExpression();

                    state._fsp--;

                     
                            current = this_PrimaryExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1327:6: ( () ( () ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ( (lv_right_4_0= rulePrimaryExpression ) ) )* )
                    {
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1327:6: ( () ( () ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ( (lv_right_4_0= rulePrimaryExpression ) ) )* )
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1327:7: () ( () ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ( (lv_right_4_0= rulePrimaryExpression ) ) )*
                    {
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1327:7: ()
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1328:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMulAccess().getBinaryExprAction_1_0(),
                                current);
                        

                    }

                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1333:2: ( () ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ( (lv_right_4_0= rulePrimaryExpression ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=38 && LA10_0<=39)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1333:3: () ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) ) ( (lv_right_4_0= rulePrimaryExpression ) )
                    	    {
                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1333:3: ()
                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1334:5: 
                    	    {

                    	            current = forceCreateModelElementAndSet(
                    	                grammarAccess.getMulAccess().getBinaryExprLeftAction_1_1_0(),
                    	                current);
                    	        

                    	    }

                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1339:2: ( ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) ) )
                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1340:1: ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) )
                    	    {
                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1340:1: ( (lv_op_3_1= '*' | lv_op_3_2= '/' ) )
                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1341:1: (lv_op_3_1= '*' | lv_op_3_2= '/' )
                    	    {
                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1341:1: (lv_op_3_1= '*' | lv_op_3_2= '/' )
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==38) ) {
                    	        alt9=1;
                    	    }
                    	    else if ( (LA9_0==39) ) {
                    	        alt9=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 9, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1342:3: lv_op_3_1= '*'
                    	            {
                    	            lv_op_3_1=(Token)match(input,38,FOLLOW_38_in_ruleMul2926); 

                    	                    newLeafNode(lv_op_3_1, grammarAccess.getMulAccess().getOpAsteriskKeyword_1_1_1_0_0());
                    	                

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getMulRule());
                    	            	        }
                    	                   		setWithLastConsumed(current, "op", lv_op_3_1, null);
                    	            	    

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1354:8: lv_op_3_2= '/'
                    	            {
                    	            lv_op_3_2=(Token)match(input,39,FOLLOW_39_in_ruleMul2955); 

                    	                    newLeafNode(lv_op_3_2, grammarAccess.getMulAccess().getOpSolidusKeyword_1_1_1_0_1());
                    	                

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getMulRule());
                    	            	        }
                    	                   		setWithLastConsumed(current, "op", lv_op_3_2, null);
                    	            	    

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1369:2: ( (lv_right_4_0= rulePrimaryExpression ) )
                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1370:1: (lv_right_4_0= rulePrimaryExpression )
                    	    {
                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1370:1: (lv_right_4_0= rulePrimaryExpression )
                    	    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1371:3: lv_right_4_0= rulePrimaryExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMulAccess().getRightPrimaryExpressionParserRuleCall_1_1_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMul2992);
                    	    lv_right_4_0=rulePrimaryExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMulRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"right",
                    	            		lv_right_4_0, 
                    	            		"PrimaryExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMul"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1395:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1396:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1397:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3031);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression3041); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1404:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Var_3= ruleVar | this_Val_4= ruleVal | this_Gid_5= ruleGid | this_Lid_6= ruleLid ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_Var_3 = null;

        EObject this_Val_4 = null;

        EObject this_Gid_5 = null;

        EObject this_Lid_6 = null;


         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1407:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Var_3= ruleVar | this_Val_4= ruleVal | this_Gid_5= ruleGid | this_Lid_6= ruleLid ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1408:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Var_3= ruleVar | this_Val_4= ruleVal | this_Gid_5= ruleGid | this_Lid_6= ruleLid )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1408:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Var_3= ruleVar | this_Val_4= ruleVal | this_Gid_5= ruleGid | this_Lid_6= ruleLid )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt12=1;
                }
                break;
            case RULE_ID:
                {
                alt12=2;
                }
                break;
            case RULE_INT:
                {
                alt12=3;
                }
                break;
            case 40:
                {
                alt12=4;
                }
                break;
            case 41:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1408:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1408:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1408:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_22_in_rulePrimaryExpression3079); 

                        	newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression3101);
                    this_Expression_1=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_1; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_rulePrimaryExpression3112); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1427:5: this_Var_3= ruleVar
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVarParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVar_in_rulePrimaryExpression3141);
                    this_Var_3=ruleVar();

                    state._fsp--;

                     
                            current = this_Var_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1437:5: this_Val_4= ruleVal
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleVal_in_rulePrimaryExpression3168);
                    this_Val_4=ruleVal();

                    state._fsp--;

                     
                            current = this_Val_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1447:5: this_Gid_5= ruleGid
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getGidParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleGid_in_rulePrimaryExpression3195);
                    this_Gid_5=ruleGid();

                    state._fsp--;

                     
                            current = this_Gid_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1457:5: this_Lid_6= ruleLid
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLidParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleLid_in_rulePrimaryExpression3222);
                    this_Lid_6=ruleLid();

                    state._fsp--;

                     
                            current = this_Lid_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleVar"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1473:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1474:2: (iv_ruleVar= ruleVar EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1475:2: iv_ruleVar= ruleVar EOF
            {
             newCompositeNode(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar3257);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar3267); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1482:1: ruleVar returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1485:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1486:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1486:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1486:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1486:2: ()
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1487:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getVarAccess().getVarAction_0(),
                        current);
                

            }

            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1492:2: ( (lv_name_1_0= RULE_ID ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1493:1: (lv_name_1_0= RULE_ID )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1493:1: (lv_name_1_0= RULE_ID )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1494:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVar3318); 

            			newLeafNode(lv_name_1_0, grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVarRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleVal"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1518:1: entryRuleVal returns [EObject current=null] : iv_ruleVal= ruleVal EOF ;
    public final EObject entryRuleVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVal = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1519:2: (iv_ruleVal= ruleVal EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1520:2: iv_ruleVal= ruleVal EOF
            {
             newCompositeNode(grammarAccess.getValRule()); 
            pushFollow(FOLLOW_ruleVal_in_entryRuleVal3359);
            iv_ruleVal=ruleVal();

            state._fsp--;

             current =iv_ruleVal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVal3369); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVal"


    // $ANTLR start "ruleVal"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1527:1: ruleVal returns [EObject current=null] : ( () ( (lv_val_1_0= RULE_INT ) ) ) ;
    public final EObject ruleVal() throws RecognitionException {
        EObject current = null;

        Token lv_val_1_0=null;

         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1530:28: ( ( () ( (lv_val_1_0= RULE_INT ) ) ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1531:1: ( () ( (lv_val_1_0= RULE_INT ) ) )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1531:1: ( () ( (lv_val_1_0= RULE_INT ) ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1531:2: () ( (lv_val_1_0= RULE_INT ) )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1531:2: ()
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1532:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getValAccess().getValAction_0(),
                        current);
                

            }

            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1537:2: ( (lv_val_1_0= RULE_INT ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1538:1: (lv_val_1_0= RULE_INT )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1538:1: (lv_val_1_0= RULE_INT )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1539:3: lv_val_1_0= RULE_INT
            {
            lv_val_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVal3420); 

            			newLeafNode(lv_val_1_0, grammarAccess.getValAccess().getValINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getValRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"val",
                    		lv_val_1_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVal"


    // $ANTLR start "entryRuleGid"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1563:1: entryRuleGid returns [EObject current=null] : iv_ruleGid= ruleGid EOF ;
    public final EObject entryRuleGid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGid = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1564:2: (iv_ruleGid= ruleGid EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1565:2: iv_ruleGid= ruleGid EOF
            {
             newCompositeNode(grammarAccess.getGidRule()); 
            pushFollow(FOLLOW_ruleGid_in_entryRuleGid3461);
            iv_ruleGid=ruleGid();

            state._fsp--;

             current =iv_ruleGid; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGid3471); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGid"


    // $ANTLR start "ruleGid"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1572:1: ruleGid returns [EObject current=null] : ( () otherlv_1= 'gid' ) ;
    public final EObject ruleGid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1575:28: ( ( () otherlv_1= 'gid' ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1576:1: ( () otherlv_1= 'gid' )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1576:1: ( () otherlv_1= 'gid' )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1576:2: () otherlv_1= 'gid'
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1576:2: ()
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1577:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGidAccess().getGidAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleGid3517); 

                	newLeafNode(otherlv_1, grammarAccess.getGidAccess().getGidKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGid"


    // $ANTLR start "entryRuleLid"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1594:1: entryRuleLid returns [EObject current=null] : iv_ruleLid= ruleLid EOF ;
    public final EObject entryRuleLid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLid = null;


        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1595:2: (iv_ruleLid= ruleLid EOF )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1596:2: iv_ruleLid= ruleLid EOF
            {
             newCompositeNode(grammarAccess.getLidRule()); 
            pushFollow(FOLLOW_ruleLid_in_entryRuleLid3553);
            iv_ruleLid=ruleLid();

            state._fsp--;

             current =iv_ruleLid; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLid3563); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLid"


    // $ANTLR start "ruleLid"
    // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1603:1: ruleLid returns [EObject current=null] : ( () otherlv_1= 'lid' ) ;
    public final EObject ruleLid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1606:28: ( ( () otherlv_1= 'lid' ) )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1607:1: ( () otherlv_1= 'lid' )
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1607:1: ( () otherlv_1= 'lid' )
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1607:2: () otherlv_1= 'lid'
            {
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1607:2: ()
            // ../unige.dibris.kpl/src-gen/unige/dibris/parser/antlr/internal/InternalKPL.g:1608:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLidAccess().getLidAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleLid3609); 

                	newLeafNode(otherlv_1, grammarAccess.getLidAccess().getLidKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLid"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA2_eotS =
        "\17\uffff";
    static final String DFA2_eofS =
        "\13\uffff\1\15\3\uffff";
    static final String DFA2_minS =
        "\1\5\3\uffff\1\26\6\uffff\1\4\3\uffff";
    static final String DFA2_maxS =
        "\1\43\3\uffff\1\30\6\uffff\1\51\3\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\uffff\1\4\1\5\1\6";
    static final String DFA2_specialS =
        "\17\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\4\11\uffff\1\1\1\uffff\1\2\2\uffff\1\3\5\uffff\1\5\1\uffff\1\6\1\7\2\uffff\1\10\1\uffff\1\11\1\12",
            "",
            "",
            "",
            "\1\14\1\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\15\7\uffff\2\15\4\uffff\1\15\2\uffff\1\15\2\uffff\1\16\4\uffff\1\15\5\uffff\6\15",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "264:1: (this_Decl_0= ruleDecl | this_Branch_1= ruleBranch | this_Loop_2= ruleLoop | this_Invoke_3= ruleInvoke | this_Assign_4= ruleAssign | this_Read_5= ruleRead | this_Write_6= ruleWrite | this_Barrier_7= ruleBarrier | this_Block_8= ruleBlock | this_LSwitch_9= ruleLSwitch | this_GSwitch_10= ruleGSwitch | this_Skip_11= ruleSkip )";
        }
    }
    static final String DFA8_eotS =
        "\14\uffff";
    static final String DFA8_eofS =
        "\1\6\13\uffff";
    static final String DFA8_minS =
        "\1\4\13\uffff";
    static final String DFA8_maxS =
        "\1\51\13\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\12\1\1\2";
    static final String DFA8_specialS =
        "\14\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\1\1\7\uffff\1\7\1\10\3\uffff\1\3\1\11\1\uffff\1\4\1\1\1\5\6\uffff\1\12\5\uffff\2\13\4\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1226:1: (this_Mul_0= ruleMul | ( () ( () ( ( (lv_op_3_1= '+' | lv_op_3_2= '-' ) ) ) ( (lv_right_4_0= ruleMul ) ) )* ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleKernel_in_entryRuleKernel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKernel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleKernel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleKernel139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleKernel156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleKernel173 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleProcedure_in_ruleKernel199 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleKernel212 = new BitSet(new long[]{0x0000000D34128020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleKernel233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_entryRuleProcedure269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedure279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleProcedure316 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcedure333 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProcedure355 = new BitSet(new long[]{0x0000000D34128020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleProcedure381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_ruleStatement474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranch_in_ruleStatement501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoop_in_ruleStatement528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvoke_in_ruleStatement555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssign_in_ruleStatement582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRead_in_ruleStatement609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWrite_in_ruleStatement636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBarrier_in_ruleStatement663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleStatement690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLSwitch_in_ruleStatement717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGSwitch_in_ruleStatement744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_ruleStatement771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_entryRuleDecl806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecl816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDecl862 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecl879 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDecl896 = new BitSet(new long[]{0x0000000D34128020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleDecl917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranch_in_entryRuleBranch953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBranch963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBranch1009 = new BitSet(new long[]{0x000003F000400030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBranch1030 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBranch1042 = new BitSet(new long[]{0x0000000D34128020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleBranch1063 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBranch1075 = new BitSet(new long[]{0x0000000D34128020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleBranch1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoop_in_entryRuleLoop1132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoop1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleLoop1188 = new BitSet(new long[]{0x000003F000400030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLoop1209 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleLoop1221 = new BitSet(new long[]{0x0000000D34128020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleLoop1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvoke_in_entryRuleInvoke1278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvoke1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInvoke1339 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleInvoke1356 = new BitSet(new long[]{0x000003F000400030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInvoke1377 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleInvoke1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssign_in_entryRuleAssign1425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssign1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssign1486 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAssign1503 = new BitSet(new long[]{0x000003F000400030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssign1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRead_in_entryRuleRead1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRead1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRead1621 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleRead1638 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleRead1650 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRead1662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRead1679 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRead1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWrite_in_entryRuleWrite1732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWrite1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleWrite1788 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleWrite1800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWrite1817 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleWrite1834 = new BitSet(new long[]{0x000003F000400030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleWrite1855 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleWrite1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBarrier_in_entryRuleBarrier1903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBarrier1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBarrier1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock1995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleBlock2051 = new BitSet(new long[]{0x0000000D34128020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleBlock2073 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleBlock2085 = new BitSet(new long[]{0x0000000DB4128020L});
    public static final BitSet FOLLOW_31_in_ruleBlock2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLSwitch_in_entryRuleLSwitch2135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLSwitch2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleLSwitch2191 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLSwitch2209 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleLSwitch2226 = new BitSet(new long[]{0x0000000D34128020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleLSwitch2247 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleGSwitch_in_entryRuleGSwitch2285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGSwitch2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleGSwitch2341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGSwitch2359 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleGSwitch2376 = new BitSet(new long[]{0x0000000D34128020L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleGSwitch2397 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleSkip_in_entryRuleSkip2435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkip2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSkip2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdd_in_ruleExpression2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdd_in_entryRuleAdd2617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdd2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMul_in_ruleAdd2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAdd2719 = new BitSet(new long[]{0x000003F000400030L});
    public static final BitSet FOLLOW_37_in_ruleAdd2748 = new BitSet(new long[]{0x000003F000400030L});
    public static final BitSet FOLLOW_ruleMul_in_ruleAdd2785 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleMul_in_entryRuleMul2824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMul2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMul2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleMul2926 = new BitSet(new long[]{0x0000030000400030L});
    public static final BitSet FOLLOW_39_in_ruleMul2955 = new BitSet(new long[]{0x0000030000400030L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMul2992 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePrimaryExpression3079 = new BitSet(new long[]{0x000003F000400030L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression3101 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePrimaryExpression3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rulePrimaryExpression3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVal_in_rulePrimaryExpression3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGid_in_rulePrimaryExpression3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLid_in_rulePrimaryExpression3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar3257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVar3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVal_in_entryRuleVal3359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVal3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVal3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGid_in_entryRuleGid3461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGid3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleGid3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLid_in_entryRuleLid3553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLid3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleLid3609 = new BitSet(new long[]{0x0000000000000002L});

}