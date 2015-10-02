package unige.dibris.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import unige.dibris.services.KPLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKPLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'threads:'", "'group:'", "'main:'", "'procedure:'", "'local'", "'in'", "'if'", "'then'", "'else'", "'while'", "'do'", "'('", "')'", "':='", "'rd'", "'wr'", "','", "'barrier'", "'{'", "'}'", "';'", "'lswitch'", "':'", "'gswitch'", "'skip'", "'gid'", "'lid'"
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
    public String getGrammarFileName() { return "../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g"; }


     
     	private KPLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(KPLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleKernel"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:60:1: entryRuleKernel : ruleKernel EOF ;
    public final void entryRuleKernel() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:61:1: ( ruleKernel EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:62:1: ruleKernel EOF
            {
             before(grammarAccess.getKernelRule()); 
            pushFollow(FOLLOW_ruleKernel_in_entryRuleKernel61);
            ruleKernel();

            state._fsp--;

             after(grammarAccess.getKernelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKernel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKernel"


    // $ANTLR start "ruleKernel"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:69:1: ruleKernel : ( ( rule__Kernel__Group__0 ) ) ;
    public final void ruleKernel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:73:2: ( ( ( rule__Kernel__Group__0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:74:1: ( ( rule__Kernel__Group__0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:74:1: ( ( rule__Kernel__Group__0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:75:1: ( rule__Kernel__Group__0 )
            {
             before(grammarAccess.getKernelAccess().getGroup()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:76:1: ( rule__Kernel__Group__0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:76:2: rule__Kernel__Group__0
            {
            pushFollow(FOLLOW_rule__Kernel__Group__0_in_ruleKernel94);
            rule__Kernel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKernelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKernel"


    // $ANTLR start "entryRuleProcedure"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:88:1: entryRuleProcedure : ruleProcedure EOF ;
    public final void entryRuleProcedure() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:89:1: ( ruleProcedure EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:90:1: ruleProcedure EOF
            {
             before(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_ruleProcedure_in_entryRuleProcedure121);
            ruleProcedure();

            state._fsp--;

             after(grammarAccess.getProcedureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcedure128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:97:1: ruleProcedure : ( ( rule__Procedure__Group__0 ) ) ;
    public final void ruleProcedure() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:101:2: ( ( ( rule__Procedure__Group__0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:102:1: ( ( rule__Procedure__Group__0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:102:1: ( ( rule__Procedure__Group__0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:103:1: ( rule__Procedure__Group__0 )
            {
             before(grammarAccess.getProcedureAccess().getGroup()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:104:1: ( rule__Procedure__Group__0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:104:2: rule__Procedure__Group__0
            {
            pushFollow(FOLLOW_rule__Procedure__Group__0_in_ruleProcedure154);
            rule__Procedure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleStatement"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:116:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:117:1: ( ruleStatement EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:118:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement181);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:125:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:129:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:130:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:130:1: ( ( rule__Statement__Alternatives ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:131:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:132:1: ( rule__Statement__Alternatives )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:132:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement214);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleDecl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:144:1: entryRuleDecl : ruleDecl EOF ;
    public final void entryRuleDecl() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:145:1: ( ruleDecl EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:146:1: ruleDecl EOF
            {
             before(grammarAccess.getDeclRule()); 
            pushFollow(FOLLOW_ruleDecl_in_entryRuleDecl241);
            ruleDecl();

            state._fsp--;

             after(grammarAccess.getDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecl248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecl"


    // $ANTLR start "ruleDecl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:153:1: ruleDecl : ( ( rule__Decl__Group__0 ) ) ;
    public final void ruleDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:157:2: ( ( ( rule__Decl__Group__0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:158:1: ( ( rule__Decl__Group__0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:158:1: ( ( rule__Decl__Group__0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:159:1: ( rule__Decl__Group__0 )
            {
             before(grammarAccess.getDeclAccess().getGroup()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:160:1: ( rule__Decl__Group__0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:160:2: rule__Decl__Group__0
            {
            pushFollow(FOLLOW_rule__Decl__Group__0_in_ruleDecl274);
            rule__Decl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecl"


    // $ANTLR start "entryRuleBranch"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:172:1: entryRuleBranch : ruleBranch EOF ;
    public final void entryRuleBranch() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:173:1: ( ruleBranch EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:174:1: ruleBranch EOF
            {
             before(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_ruleBranch_in_entryRuleBranch301);
            ruleBranch();

            state._fsp--;

             after(grammarAccess.getBranchRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBranch308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBranch"


    // $ANTLR start "ruleBranch"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:181:1: ruleBranch : ( ( rule__Branch__Group__0 ) ) ;
    public final void ruleBranch() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:185:2: ( ( ( rule__Branch__Group__0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:186:1: ( ( rule__Branch__Group__0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:186:1: ( ( rule__Branch__Group__0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:187:1: ( rule__Branch__Group__0 )
            {
             before(grammarAccess.getBranchAccess().getGroup()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:188:1: ( rule__Branch__Group__0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:188:2: rule__Branch__Group__0
            {
            pushFollow(FOLLOW_rule__Branch__Group__0_in_ruleBranch334);
            rule__Branch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBranchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBranch"


    // $ANTLR start "entryRuleLoop"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:200:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:201:1: ( ruleLoop EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:202:1: ruleLoop EOF
            {
             before(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_ruleLoop_in_entryRuleLoop361);
            ruleLoop();

            state._fsp--;

             after(grammarAccess.getLoopRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoop368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:209:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:213:2: ( ( ( rule__Loop__Group__0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:214:1: ( ( rule__Loop__Group__0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:214:1: ( ( rule__Loop__Group__0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:215:1: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:216:1: ( rule__Loop__Group__0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:216:2: rule__Loop__Group__0
            {
            pushFollow(FOLLOW_rule__Loop__Group__0_in_ruleLoop394);
            rule__Loop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleInvoke"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:228:1: entryRuleInvoke : ruleInvoke EOF ;
    public final void entryRuleInvoke() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:229:1: ( ruleInvoke EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:230:1: ruleInvoke EOF
            {
             before(grammarAccess.getInvokeRule()); 
            pushFollow(FOLLOW_ruleInvoke_in_entryRuleInvoke421);
            ruleInvoke();

            state._fsp--;

             after(grammarAccess.getInvokeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvoke428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInvoke"


    // $ANTLR start "ruleInvoke"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:237:1: ruleInvoke : ( ( rule__Invoke__Group__0 ) ) ;
    public final void ruleInvoke() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:241:2: ( ( ( rule__Invoke__Group__0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:242:1: ( ( rule__Invoke__Group__0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:242:1: ( ( rule__Invoke__Group__0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:243:1: ( rule__Invoke__Group__0 )
            {
             before(grammarAccess.getInvokeAccess().getGroup()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:244:1: ( rule__Invoke__Group__0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:244:2: rule__Invoke__Group__0
            {
            pushFollow(FOLLOW_rule__Invoke__Group__0_in_ruleInvoke454);
            rule__Invoke__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInvokeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInvoke"


    // $ANTLR start "entryRuleAssign"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:256:1: entryRuleAssign : ruleAssign EOF ;
    public final void entryRuleAssign() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:257:1: ( ruleAssign EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:258:1: ruleAssign EOF
            {
             before(grammarAccess.getAssignRule()); 
            pushFollow(FOLLOW_ruleAssign_in_entryRuleAssign481);
            ruleAssign();

            state._fsp--;

             after(grammarAccess.getAssignRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssign488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssign"


    // $ANTLR start "ruleAssign"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:265:1: ruleAssign : ( ( rule__Assign__Group__0 ) ) ;
    public final void ruleAssign() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:269:2: ( ( ( rule__Assign__Group__0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:270:1: ( ( rule__Assign__Group__0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:270:1: ( ( rule__Assign__Group__0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:271:1: ( rule__Assign__Group__0 )
            {
             before(grammarAccess.getAssignAccess().getGroup()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:272:1: ( rule__Assign__Group__0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:272:2: rule__Assign__Group__0
            {
            pushFollow(FOLLOW_rule__Assign__Group__0_in_ruleAssign514);
            rule__Assign__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssign"


    // $ANTLR start "entryRuleRead"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:284:1: entryRuleRead : ruleRead EOF ;
    public final void entryRuleRead() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:285:1: ( ruleRead EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:286:1: ruleRead EOF
            {
             before(grammarAccess.getReadRule()); 
            pushFollow(FOLLOW_ruleRead_in_entryRuleRead541);
            ruleRead();

            state._fsp--;

             after(grammarAccess.getReadRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRead548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRead"


    // $ANTLR start "ruleRead"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:293:1: ruleRead : ( ( rule__Read__Group__0 ) ) ;
    public final void ruleRead() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:297:2: ( ( ( rule__Read__Group__0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:298:1: ( ( rule__Read__Group__0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:298:1: ( ( rule__Read__Group__0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:299:1: ( rule__Read__Group__0 )
            {
             before(grammarAccess.getReadAccess().getGroup()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:300:1: ( rule__Read__Group__0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:300:2: rule__Read__Group__0
            {
            pushFollow(FOLLOW_rule__Read__Group__0_in_ruleRead574);
            rule__Read__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRead"


    // $ANTLR start "entryRuleWrite"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:312:1: entryRuleWrite : ruleWrite EOF ;
    public final void entryRuleWrite() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:313:1: ( ruleWrite EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:314:1: ruleWrite EOF
            {
             before(grammarAccess.getWriteRule()); 
            pushFollow(FOLLOW_ruleWrite_in_entryRuleWrite601);
            ruleWrite();

            state._fsp--;

             after(grammarAccess.getWriteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWrite608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWrite"


    // $ANTLR start "ruleWrite"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:321:1: ruleWrite : ( ( rule__Write__Group__0 ) ) ;
    public final void ruleWrite() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:325:2: ( ( ( rule__Write__Group__0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:326:1: ( ( rule__Write__Group__0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:326:1: ( ( rule__Write__Group__0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:327:1: ( rule__Write__Group__0 )
            {
             before(grammarAccess.getWriteAccess().getGroup()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:328:1: ( rule__Write__Group__0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:328:2: rule__Write__Group__0
            {
            pushFollow(FOLLOW_rule__Write__Group__0_in_ruleWrite634);
            rule__Write__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWriteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWrite"


    // $ANTLR start "entryRuleBarrier"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:340:1: entryRuleBarrier : ruleBarrier EOF ;
    public final void entryRuleBarrier() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:341:1: ( ruleBarrier EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:342:1: ruleBarrier EOF
            {
             before(grammarAccess.getBarrierRule()); 
            pushFollow(FOLLOW_ruleBarrier_in_entryRuleBarrier661);
            ruleBarrier();

            state._fsp--;

             after(grammarAccess.getBarrierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBarrier668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBarrier"


    // $ANTLR start "ruleBarrier"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:349:1: ruleBarrier : ( ( rule__Barrier__Group__0 ) ) ;
    public final void ruleBarrier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:353:2: ( ( ( rule__Barrier__Group__0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:354:1: ( ( rule__Barrier__Group__0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:354:1: ( ( rule__Barrier__Group__0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:355:1: ( rule__Barrier__Group__0 )
            {
             before(grammarAccess.getBarrierAccess().getGroup()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:356:1: ( rule__Barrier__Group__0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:356:2: rule__Barrier__Group__0
            {
            pushFollow(FOLLOW_rule__Barrier__Group__0_in_ruleBarrier694);
            rule__Barrier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBarrierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBarrier"


    // $ANTLR start "entryRuleBlock"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:368:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:369:1: ( ruleBlock EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:370:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock721);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:377:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:381:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:382:1: ( ( rule__Block__Group__0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:382:1: ( ( rule__Block__Group__0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:383:1: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:384:1: ( rule__Block__Group__0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:384:2: rule__Block__Group__0
            {
            pushFollow(FOLLOW_rule__Block__Group__0_in_ruleBlock754);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleLSwitch"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:396:1: entryRuleLSwitch : ruleLSwitch EOF ;
    public final void entryRuleLSwitch() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:397:1: ( ruleLSwitch EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:398:1: ruleLSwitch EOF
            {
             before(grammarAccess.getLSwitchRule()); 
            pushFollow(FOLLOW_ruleLSwitch_in_entryRuleLSwitch781);
            ruleLSwitch();

            state._fsp--;

             after(grammarAccess.getLSwitchRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLSwitch788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLSwitch"


    // $ANTLR start "ruleLSwitch"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:405:1: ruleLSwitch : ( ( rule__LSwitch__Group__0 ) ) ;
    public final void ruleLSwitch() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:409:2: ( ( ( rule__LSwitch__Group__0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:410:1: ( ( rule__LSwitch__Group__0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:410:1: ( ( rule__LSwitch__Group__0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:411:1: ( rule__LSwitch__Group__0 )
            {
             before(grammarAccess.getLSwitchAccess().getGroup()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:412:1: ( rule__LSwitch__Group__0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:412:2: rule__LSwitch__Group__0
            {
            pushFollow(FOLLOW_rule__LSwitch__Group__0_in_ruleLSwitch814);
            rule__LSwitch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLSwitchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLSwitch"


    // $ANTLR start "entryRuleGSwitch"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:424:1: entryRuleGSwitch : ruleGSwitch EOF ;
    public final void entryRuleGSwitch() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:425:1: ( ruleGSwitch EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:426:1: ruleGSwitch EOF
            {
             before(grammarAccess.getGSwitchRule()); 
            pushFollow(FOLLOW_ruleGSwitch_in_entryRuleGSwitch841);
            ruleGSwitch();

            state._fsp--;

             after(grammarAccess.getGSwitchRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGSwitch848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGSwitch"


    // $ANTLR start "ruleGSwitch"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:433:1: ruleGSwitch : ( ( rule__GSwitch__Group__0 ) ) ;
    public final void ruleGSwitch() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:437:2: ( ( ( rule__GSwitch__Group__0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:438:1: ( ( rule__GSwitch__Group__0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:438:1: ( ( rule__GSwitch__Group__0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:439:1: ( rule__GSwitch__Group__0 )
            {
             before(grammarAccess.getGSwitchAccess().getGroup()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:440:1: ( rule__GSwitch__Group__0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:440:2: rule__GSwitch__Group__0
            {
            pushFollow(FOLLOW_rule__GSwitch__Group__0_in_ruleGSwitch874);
            rule__GSwitch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGSwitchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGSwitch"


    // $ANTLR start "entryRuleSkip"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:452:1: entryRuleSkip : ruleSkip EOF ;
    public final void entryRuleSkip() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:453:1: ( ruleSkip EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:454:1: ruleSkip EOF
            {
             before(grammarAccess.getSkipRule()); 
            pushFollow(FOLLOW_ruleSkip_in_entryRuleSkip901);
            ruleSkip();

            state._fsp--;

             after(grammarAccess.getSkipRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkip908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSkip"


    // $ANTLR start "ruleSkip"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:461:1: ruleSkip : ( ( rule__Skip__Group__0 ) ) ;
    public final void ruleSkip() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:465:2: ( ( ( rule__Skip__Group__0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:466:1: ( ( rule__Skip__Group__0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:466:1: ( ( rule__Skip__Group__0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:467:1: ( rule__Skip__Group__0 )
            {
             before(grammarAccess.getSkipAccess().getGroup()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:468:1: ( rule__Skip__Group__0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:468:2: rule__Skip__Group__0
            {
            pushFollow(FOLLOW_rule__Skip__Group__0_in_ruleSkip934);
            rule__Skip__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSkipAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSkip"


    // $ANTLR start "entryRuleExpression"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:480:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:481:1: ( ruleExpression EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:482:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression961);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:489:1: ruleExpression : ( ruleAdd ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:493:2: ( ( ruleAdd ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:494:1: ( ruleAdd )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:494:1: ( ruleAdd )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:495:1: ruleAdd
            {
             before(grammarAccess.getExpressionAccess().getAddParserRuleCall()); 
            pushFollow(FOLLOW_ruleAdd_in_ruleExpression994);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getAddParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAdd"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:508:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:509:1: ( ruleAdd EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:510:1: ruleAdd EOF
            {
             before(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_ruleAdd_in_entryRuleAdd1020);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getAddRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdd1027); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:517:1: ruleAdd : ( ( rule__Add__Alternatives ) ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:521:2: ( ( ( rule__Add__Alternatives ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:522:1: ( ( rule__Add__Alternatives ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:522:1: ( ( rule__Add__Alternatives ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:523:1: ( rule__Add__Alternatives )
            {
             before(grammarAccess.getAddAccess().getAlternatives()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:524:1: ( rule__Add__Alternatives )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:524:2: rule__Add__Alternatives
            {
            pushFollow(FOLLOW_rule__Add__Alternatives_in_ruleAdd1053);
            rule__Add__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleMul"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:536:1: entryRuleMul : ruleMul EOF ;
    public final void entryRuleMul() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:537:1: ( ruleMul EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:538:1: ruleMul EOF
            {
             before(grammarAccess.getMulRule()); 
            pushFollow(FOLLOW_ruleMul_in_entryRuleMul1080);
            ruleMul();

            state._fsp--;

             after(grammarAccess.getMulRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMul1087); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMul"


    // $ANTLR start "ruleMul"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:545:1: ruleMul : ( ( rule__Mul__Alternatives ) ) ;
    public final void ruleMul() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:549:2: ( ( ( rule__Mul__Alternatives ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:550:1: ( ( rule__Mul__Alternatives ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:550:1: ( ( rule__Mul__Alternatives ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:551:1: ( rule__Mul__Alternatives )
            {
             before(grammarAccess.getMulAccess().getAlternatives()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:552:1: ( rule__Mul__Alternatives )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:552:2: rule__Mul__Alternatives
            {
            pushFollow(FOLLOW_rule__Mul__Alternatives_in_ruleMul1113);
            rule__Mul__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMulAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMul"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:564:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:565:1: ( rulePrimaryExpression EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:566:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1140);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression1147); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:573:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:577:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:578:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:578:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:579:1: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:580:1: ( rule__PrimaryExpression__Alternatives )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:580:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression1173);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleVar"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:592:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:593:1: ( ruleVar EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:594:1: ruleVar EOF
            {
             before(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar1200);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getVarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar1207); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:601:1: ruleVar : ( ( rule__Var__Group__0 ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:605:2: ( ( ( rule__Var__Group__0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:606:1: ( ( rule__Var__Group__0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:606:1: ( ( rule__Var__Group__0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:607:1: ( rule__Var__Group__0 )
            {
             before(grammarAccess.getVarAccess().getGroup()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:608:1: ( rule__Var__Group__0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:608:2: rule__Var__Group__0
            {
            pushFollow(FOLLOW_rule__Var__Group__0_in_ruleVar1233);
            rule__Var__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleVal"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:620:1: entryRuleVal : ruleVal EOF ;
    public final void entryRuleVal() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:621:1: ( ruleVal EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:622:1: ruleVal EOF
            {
             before(grammarAccess.getValRule()); 
            pushFollow(FOLLOW_ruleVal_in_entryRuleVal1260);
            ruleVal();

            state._fsp--;

             after(grammarAccess.getValRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVal1267); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVal"


    // $ANTLR start "ruleVal"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:629:1: ruleVal : ( ( rule__Val__Group__0 ) ) ;
    public final void ruleVal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:633:2: ( ( ( rule__Val__Group__0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:634:1: ( ( rule__Val__Group__0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:634:1: ( ( rule__Val__Group__0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:635:1: ( rule__Val__Group__0 )
            {
             before(grammarAccess.getValAccess().getGroup()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:636:1: ( rule__Val__Group__0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:636:2: rule__Val__Group__0
            {
            pushFollow(FOLLOW_rule__Val__Group__0_in_ruleVal1293);
            rule__Val__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVal"


    // $ANTLR start "entryRuleGid"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:648:1: entryRuleGid : ruleGid EOF ;
    public final void entryRuleGid() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:649:1: ( ruleGid EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:650:1: ruleGid EOF
            {
             before(grammarAccess.getGidRule()); 
            pushFollow(FOLLOW_ruleGid_in_entryRuleGid1320);
            ruleGid();

            state._fsp--;

             after(grammarAccess.getGidRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGid1327); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGid"


    // $ANTLR start "ruleGid"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:657:1: ruleGid : ( ( rule__Gid__Group__0 ) ) ;
    public final void ruleGid() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:661:2: ( ( ( rule__Gid__Group__0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:662:1: ( ( rule__Gid__Group__0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:662:1: ( ( rule__Gid__Group__0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:663:1: ( rule__Gid__Group__0 )
            {
             before(grammarAccess.getGidAccess().getGroup()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:664:1: ( rule__Gid__Group__0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:664:2: rule__Gid__Group__0
            {
            pushFollow(FOLLOW_rule__Gid__Group__0_in_ruleGid1353);
            rule__Gid__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGidAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGid"


    // $ANTLR start "entryRuleLid"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:676:1: entryRuleLid : ruleLid EOF ;
    public final void entryRuleLid() throws RecognitionException {
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:677:1: ( ruleLid EOF )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:678:1: ruleLid EOF
            {
             before(grammarAccess.getLidRule()); 
            pushFollow(FOLLOW_ruleLid_in_entryRuleLid1380);
            ruleLid();

            state._fsp--;

             after(grammarAccess.getLidRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLid1387); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLid"


    // $ANTLR start "ruleLid"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:685:1: ruleLid : ( ( rule__Lid__Group__0 ) ) ;
    public final void ruleLid() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:689:2: ( ( ( rule__Lid__Group__0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:690:1: ( ( rule__Lid__Group__0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:690:1: ( ( rule__Lid__Group__0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:691:1: ( rule__Lid__Group__0 )
            {
             before(grammarAccess.getLidAccess().getGroup()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:692:1: ( rule__Lid__Group__0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:692:2: rule__Lid__Group__0
            {
            pushFollow(FOLLOW_rule__Lid__Group__0_in_ruleLid1413);
            rule__Lid__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLidAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLid"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:704:1: rule__Statement__Alternatives : ( ( ruleDecl ) | ( ruleBranch ) | ( ruleLoop ) | ( ruleInvoke ) | ( ruleAssign ) | ( ruleRead ) | ( ruleWrite ) | ( ruleBarrier ) | ( ruleBlock ) | ( ruleLSwitch ) | ( ruleGSwitch ) | ( ruleSkip ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:708:1: ( ( ruleDecl ) | ( ruleBranch ) | ( ruleLoop ) | ( ruleInvoke ) | ( ruleAssign ) | ( ruleRead ) | ( ruleWrite ) | ( ruleBarrier ) | ( ruleBlock ) | ( ruleLSwitch ) | ( ruleGSwitch ) | ( ruleSkip ) )
            int alt1=12;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:709:1: ( ruleDecl )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:709:1: ( ruleDecl )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:710:1: ruleDecl
                    {
                     before(grammarAccess.getStatementAccess().getDeclParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDecl_in_rule__Statement__Alternatives1449);
                    ruleDecl();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDeclParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:715:6: ( ruleBranch )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:715:6: ( ruleBranch )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:716:1: ruleBranch
                    {
                     before(grammarAccess.getStatementAccess().getBranchParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBranch_in_rule__Statement__Alternatives1466);
                    ruleBranch();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getBranchParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:721:6: ( ruleLoop )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:721:6: ( ruleLoop )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:722:1: ruleLoop
                    {
                     before(grammarAccess.getStatementAccess().getLoopParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleLoop_in_rule__Statement__Alternatives1483);
                    ruleLoop();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getLoopParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:727:6: ( ruleInvoke )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:727:6: ( ruleInvoke )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:728:1: ruleInvoke
                    {
                     before(grammarAccess.getStatementAccess().getInvokeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleInvoke_in_rule__Statement__Alternatives1500);
                    ruleInvoke();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getInvokeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:733:6: ( ruleAssign )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:733:6: ( ruleAssign )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:734:1: ruleAssign
                    {
                     before(grammarAccess.getStatementAccess().getAssignParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleAssign_in_rule__Statement__Alternatives1517);
                    ruleAssign();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAssignParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:739:6: ( ruleRead )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:739:6: ( ruleRead )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:740:1: ruleRead
                    {
                     before(grammarAccess.getStatementAccess().getReadParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleRead_in_rule__Statement__Alternatives1534);
                    ruleRead();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getReadParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:745:6: ( ruleWrite )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:745:6: ( ruleWrite )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:746:1: ruleWrite
                    {
                     before(grammarAccess.getStatementAccess().getWriteParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleWrite_in_rule__Statement__Alternatives1551);
                    ruleWrite();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getWriteParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:751:6: ( ruleBarrier )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:751:6: ( ruleBarrier )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:752:1: ruleBarrier
                    {
                     before(grammarAccess.getStatementAccess().getBarrierParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleBarrier_in_rule__Statement__Alternatives1568);
                    ruleBarrier();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getBarrierParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:757:6: ( ruleBlock )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:757:6: ( ruleBlock )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:758:1: ruleBlock
                    {
                     before(grammarAccess.getStatementAccess().getBlockParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleBlock_in_rule__Statement__Alternatives1585);
                    ruleBlock();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getBlockParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:763:6: ( ruleLSwitch )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:763:6: ( ruleLSwitch )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:764:1: ruleLSwitch
                    {
                     before(grammarAccess.getStatementAccess().getLSwitchParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleLSwitch_in_rule__Statement__Alternatives1602);
                    ruleLSwitch();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getLSwitchParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:769:6: ( ruleGSwitch )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:769:6: ( ruleGSwitch )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:770:1: ruleGSwitch
                    {
                     before(grammarAccess.getStatementAccess().getGSwitchParserRuleCall_10()); 
                    pushFollow(FOLLOW_ruleGSwitch_in_rule__Statement__Alternatives1619);
                    ruleGSwitch();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getGSwitchParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:775:6: ( ruleSkip )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:775:6: ( ruleSkip )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:776:1: ruleSkip
                    {
                     before(grammarAccess.getStatementAccess().getSkipParserRuleCall_11()); 
                    pushFollow(FOLLOW_ruleSkip_in_rule__Statement__Alternatives1636);
                    ruleSkip();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSkipParserRuleCall_11()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Add__Alternatives"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:786:1: rule__Add__Alternatives : ( ( ruleMul ) | ( ( rule__Add__Group_1__0 ) ) );
    public final void rule__Add__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:790:1: ( ( ruleMul ) | ( ( rule__Add__Group_1__0 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:791:1: ( ruleMul )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:791:1: ( ruleMul )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:792:1: ruleMul
                    {
                     before(grammarAccess.getAddAccess().getMulParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMul_in_rule__Add__Alternatives1668);
                    ruleMul();

                    state._fsp--;

                     after(grammarAccess.getAddAccess().getMulParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:797:6: ( ( rule__Add__Group_1__0 ) )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:797:6: ( ( rule__Add__Group_1__0 ) )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:798:1: ( rule__Add__Group_1__0 )
                    {
                     before(grammarAccess.getAddAccess().getGroup_1()); 
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:799:1: ( rule__Add__Group_1__0 )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:799:2: rule__Add__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Add__Group_1__0_in_rule__Add__Alternatives1685);
                    rule__Add__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Alternatives"


    // $ANTLR start "rule__Add__OpAlternatives_1_1_1_0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:808:1: rule__Add__OpAlternatives_1_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Add__OpAlternatives_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:812:1: ( ( '+' ) | ( '-' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:813:1: ( '+' )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:813:1: ( '+' )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:814:1: '+'
                    {
                     before(grammarAccess.getAddAccess().getOpPlusSignKeyword_1_1_1_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Add__OpAlternatives_1_1_1_01719); 
                     after(grammarAccess.getAddAccess().getOpPlusSignKeyword_1_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:821:6: ( '-' )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:821:6: ( '-' )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:822:1: '-'
                    {
                     before(grammarAccess.getAddAccess().getOpHyphenMinusKeyword_1_1_1_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Add__OpAlternatives_1_1_1_01739); 
                     after(grammarAccess.getAddAccess().getOpHyphenMinusKeyword_1_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__OpAlternatives_1_1_1_0"


    // $ANTLR start "rule__Mul__Alternatives"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:834:1: rule__Mul__Alternatives : ( ( rulePrimaryExpression ) | ( ( rule__Mul__Group_1__0 ) ) );
    public final void rule__Mul__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:838:1: ( ( rulePrimaryExpression ) | ( ( rule__Mul__Group_1__0 ) ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 26:
            case 40:
            case 41:
                {
                alt4=1;
                }
                break;
            case RULE_INT:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==37) ) {
                    alt4=2;
                }
                else if ( (LA4_2==EOF||LA4_2==RULE_INT||(LA4_2>=11 && LA4_2<=12)||(LA4_2>=17 && LA4_2<=18)||(LA4_2>=22 && LA4_2<=23)||LA4_2==25||LA4_2==27||LA4_2==35) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
            case 18:
            case 22:
            case 23:
            case 25:
            case 27:
            case 35:
                {
                alt4=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:839:1: ( rulePrimaryExpression )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:839:1: ( rulePrimaryExpression )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:840:1: rulePrimaryExpression
                    {
                     before(grammarAccess.getMulAccess().getPrimaryExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Mul__Alternatives1773);
                    rulePrimaryExpression();

                    state._fsp--;

                     after(grammarAccess.getMulAccess().getPrimaryExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:845:6: ( ( rule__Mul__Group_1__0 ) )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:845:6: ( ( rule__Mul__Group_1__0 ) )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:846:1: ( rule__Mul__Group_1__0 )
                    {
                     before(grammarAccess.getMulAccess().getGroup_1()); 
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:847:1: ( rule__Mul__Group_1__0 )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:847:2: rule__Mul__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Mul__Group_1__0_in_rule__Mul__Alternatives1790);
                    rule__Mul__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMulAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mul__Alternatives"


    // $ANTLR start "rule__Mul__OpAlternatives_1_1_1_0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:856:1: rule__Mul__OpAlternatives_1_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Mul__OpAlternatives_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:860:1: ( ( '*' ) | ( '/' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:861:1: ( '*' )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:861:1: ( '*' )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:862:1: '*'
                    {
                     before(grammarAccess.getMulAccess().getOpAsteriskKeyword_1_1_1_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__Mul__OpAlternatives_1_1_1_01824); 
                     after(grammarAccess.getMulAccess().getOpAsteriskKeyword_1_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:869:6: ( '/' )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:869:6: ( '/' )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:870:1: '/'
                    {
                     before(grammarAccess.getMulAccess().getOpSolidusKeyword_1_1_1_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__Mul__OpAlternatives_1_1_1_01844); 
                     after(grammarAccess.getMulAccess().getOpSolidusKeyword_1_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mul__OpAlternatives_1_1_1_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:882:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleVar ) | ( ruleVal ) | ( ruleGid ) | ( ruleLid ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:886:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleVar ) | ( ruleVal ) | ( ruleGid ) | ( ruleLid ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case RULE_INT:
                {
                alt6=3;
                }
                break;
            case 40:
                {
                alt6=4;
                }
                break;
            case 41:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:887:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:887:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:888:1: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:889:1: ( rule__PrimaryExpression__Group_0__0 )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:889:2: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives1878);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:893:6: ( ruleVar )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:893:6: ( ruleVar )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:894:1: ruleVar
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getVarParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVar_in_rule__PrimaryExpression__Alternatives1896);
                    ruleVar();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getVarParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:899:6: ( ruleVal )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:899:6: ( ruleVal )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:900:1: ruleVal
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getValParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleVal_in_rule__PrimaryExpression__Alternatives1913);
                    ruleVal();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getValParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:905:6: ( ruleGid )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:905:6: ( ruleGid )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:906:1: ruleGid
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGidParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleGid_in_rule__PrimaryExpression__Alternatives1930);
                    ruleGid();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getGidParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:911:6: ( ruleLid )
                    {
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:911:6: ( ruleLid )
                    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:912:1: ruleLid
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getLidParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleLid_in_rule__PrimaryExpression__Alternatives1947);
                    ruleLid();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getLidParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__Kernel__Group__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:924:1: rule__Kernel__Group__0 : rule__Kernel__Group__0__Impl rule__Kernel__Group__1 ;
    public final void rule__Kernel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:928:1: ( rule__Kernel__Group__0__Impl rule__Kernel__Group__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:929:2: rule__Kernel__Group__0__Impl rule__Kernel__Group__1
            {
            pushFollow(FOLLOW_rule__Kernel__Group__0__Impl_in_rule__Kernel__Group__01977);
            rule__Kernel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kernel__Group__1_in_rule__Kernel__Group__01980);
            rule__Kernel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kernel__Group__0"


    // $ANTLR start "rule__Kernel__Group__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:936:1: rule__Kernel__Group__0__Impl : ( 'threads:' ) ;
    public final void rule__Kernel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:940:1: ( ( 'threads:' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:941:1: ( 'threads:' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:941:1: ( 'threads:' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:942:1: 'threads:'
            {
             before(grammarAccess.getKernelAccess().getThreadsKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Kernel__Group__0__Impl2008); 
             after(grammarAccess.getKernelAccess().getThreadsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kernel__Group__0__Impl"


    // $ANTLR start "rule__Kernel__Group__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:955:1: rule__Kernel__Group__1 : rule__Kernel__Group__1__Impl rule__Kernel__Group__2 ;
    public final void rule__Kernel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:959:1: ( rule__Kernel__Group__1__Impl rule__Kernel__Group__2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:960:2: rule__Kernel__Group__1__Impl rule__Kernel__Group__2
            {
            pushFollow(FOLLOW_rule__Kernel__Group__1__Impl_in_rule__Kernel__Group__12039);
            rule__Kernel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kernel__Group__2_in_rule__Kernel__Group__12042);
            rule__Kernel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kernel__Group__1"


    // $ANTLR start "rule__Kernel__Group__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:967:1: rule__Kernel__Group__1__Impl : ( ( rule__Kernel__NAssignment_1 ) ) ;
    public final void rule__Kernel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:971:1: ( ( ( rule__Kernel__NAssignment_1 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:972:1: ( ( rule__Kernel__NAssignment_1 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:972:1: ( ( rule__Kernel__NAssignment_1 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:973:1: ( rule__Kernel__NAssignment_1 )
            {
             before(grammarAccess.getKernelAccess().getNAssignment_1()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:974:1: ( rule__Kernel__NAssignment_1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:974:2: rule__Kernel__NAssignment_1
            {
            pushFollow(FOLLOW_rule__Kernel__NAssignment_1_in_rule__Kernel__Group__1__Impl2069);
            rule__Kernel__NAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKernelAccess().getNAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kernel__Group__1__Impl"


    // $ANTLR start "rule__Kernel__Group__2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:984:1: rule__Kernel__Group__2 : rule__Kernel__Group__2__Impl rule__Kernel__Group__3 ;
    public final void rule__Kernel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:988:1: ( rule__Kernel__Group__2__Impl rule__Kernel__Group__3 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:989:2: rule__Kernel__Group__2__Impl rule__Kernel__Group__3
            {
            pushFollow(FOLLOW_rule__Kernel__Group__2__Impl_in_rule__Kernel__Group__22099);
            rule__Kernel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kernel__Group__3_in_rule__Kernel__Group__22102);
            rule__Kernel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kernel__Group__2"


    // $ANTLR start "rule__Kernel__Group__2__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:996:1: rule__Kernel__Group__2__Impl : ( 'group:' ) ;
    public final void rule__Kernel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1000:1: ( ( 'group:' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1001:1: ( 'group:' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1001:1: ( 'group:' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1002:1: 'group:'
            {
             before(grammarAccess.getKernelAccess().getGroupKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Kernel__Group__2__Impl2130); 
             after(grammarAccess.getKernelAccess().getGroupKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kernel__Group__2__Impl"


    // $ANTLR start "rule__Kernel__Group__3"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1015:1: rule__Kernel__Group__3 : rule__Kernel__Group__3__Impl rule__Kernel__Group__4 ;
    public final void rule__Kernel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1019:1: ( rule__Kernel__Group__3__Impl rule__Kernel__Group__4 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1020:2: rule__Kernel__Group__3__Impl rule__Kernel__Group__4
            {
            pushFollow(FOLLOW_rule__Kernel__Group__3__Impl_in_rule__Kernel__Group__32161);
            rule__Kernel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kernel__Group__4_in_rule__Kernel__Group__32164);
            rule__Kernel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kernel__Group__3"


    // $ANTLR start "rule__Kernel__Group__3__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1027:1: rule__Kernel__Group__3__Impl : ( ( rule__Kernel__MAssignment_3 ) ) ;
    public final void rule__Kernel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1031:1: ( ( ( rule__Kernel__MAssignment_3 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1032:1: ( ( rule__Kernel__MAssignment_3 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1032:1: ( ( rule__Kernel__MAssignment_3 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1033:1: ( rule__Kernel__MAssignment_3 )
            {
             before(grammarAccess.getKernelAccess().getMAssignment_3()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1034:1: ( rule__Kernel__MAssignment_3 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1034:2: rule__Kernel__MAssignment_3
            {
            pushFollow(FOLLOW_rule__Kernel__MAssignment_3_in_rule__Kernel__Group__3__Impl2191);
            rule__Kernel__MAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getKernelAccess().getMAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kernel__Group__3__Impl"


    // $ANTLR start "rule__Kernel__Group__4"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1044:1: rule__Kernel__Group__4 : rule__Kernel__Group__4__Impl rule__Kernel__Group__5 ;
    public final void rule__Kernel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1048:1: ( rule__Kernel__Group__4__Impl rule__Kernel__Group__5 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1049:2: rule__Kernel__Group__4__Impl rule__Kernel__Group__5
            {
            pushFollow(FOLLOW_rule__Kernel__Group__4__Impl_in_rule__Kernel__Group__42221);
            rule__Kernel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kernel__Group__5_in_rule__Kernel__Group__42224);
            rule__Kernel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kernel__Group__4"


    // $ANTLR start "rule__Kernel__Group__4__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1056:1: rule__Kernel__Group__4__Impl : ( ( rule__Kernel__ProceduresAssignment_4 )* ) ;
    public final void rule__Kernel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1060:1: ( ( ( rule__Kernel__ProceduresAssignment_4 )* ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1061:1: ( ( rule__Kernel__ProceduresAssignment_4 )* )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1061:1: ( ( rule__Kernel__ProceduresAssignment_4 )* )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1062:1: ( rule__Kernel__ProceduresAssignment_4 )*
            {
             before(grammarAccess.getKernelAccess().getProceduresAssignment_4()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1063:1: ( rule__Kernel__ProceduresAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1063:2: rule__Kernel__ProceduresAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Kernel__ProceduresAssignment_4_in_rule__Kernel__Group__4__Impl2251);
            	    rule__Kernel__ProceduresAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getKernelAccess().getProceduresAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kernel__Group__4__Impl"


    // $ANTLR start "rule__Kernel__Group__5"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1073:1: rule__Kernel__Group__5 : rule__Kernel__Group__5__Impl rule__Kernel__Group__6 ;
    public final void rule__Kernel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1077:1: ( rule__Kernel__Group__5__Impl rule__Kernel__Group__6 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1078:2: rule__Kernel__Group__5__Impl rule__Kernel__Group__6
            {
            pushFollow(FOLLOW_rule__Kernel__Group__5__Impl_in_rule__Kernel__Group__52282);
            rule__Kernel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Kernel__Group__6_in_rule__Kernel__Group__52285);
            rule__Kernel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kernel__Group__5"


    // $ANTLR start "rule__Kernel__Group__5__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1085:1: rule__Kernel__Group__5__Impl : ( 'main:' ) ;
    public final void rule__Kernel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1089:1: ( ( 'main:' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1090:1: ( 'main:' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1090:1: ( 'main:' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1091:1: 'main:'
            {
             before(grammarAccess.getKernelAccess().getMainKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__Kernel__Group__5__Impl2313); 
             after(grammarAccess.getKernelAccess().getMainKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kernel__Group__5__Impl"


    // $ANTLR start "rule__Kernel__Group__6"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1104:1: rule__Kernel__Group__6 : rule__Kernel__Group__6__Impl ;
    public final void rule__Kernel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1108:1: ( rule__Kernel__Group__6__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1109:2: rule__Kernel__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Kernel__Group__6__Impl_in_rule__Kernel__Group__62344);
            rule__Kernel__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kernel__Group__6"


    // $ANTLR start "rule__Kernel__Group__6__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1115:1: rule__Kernel__Group__6__Impl : ( ( rule__Kernel__MainAssignment_6 ) ) ;
    public final void rule__Kernel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1119:1: ( ( ( rule__Kernel__MainAssignment_6 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1120:1: ( ( rule__Kernel__MainAssignment_6 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1120:1: ( ( rule__Kernel__MainAssignment_6 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1121:1: ( rule__Kernel__MainAssignment_6 )
            {
             before(grammarAccess.getKernelAccess().getMainAssignment_6()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1122:1: ( rule__Kernel__MainAssignment_6 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1122:2: rule__Kernel__MainAssignment_6
            {
            pushFollow(FOLLOW_rule__Kernel__MainAssignment_6_in_rule__Kernel__Group__6__Impl2371);
            rule__Kernel__MainAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getKernelAccess().getMainAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kernel__Group__6__Impl"


    // $ANTLR start "rule__Procedure__Group__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1146:1: rule__Procedure__Group__0 : rule__Procedure__Group__0__Impl rule__Procedure__Group__1 ;
    public final void rule__Procedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1150:1: ( rule__Procedure__Group__0__Impl rule__Procedure__Group__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1151:2: rule__Procedure__Group__0__Impl rule__Procedure__Group__1
            {
            pushFollow(FOLLOW_rule__Procedure__Group__0__Impl_in_rule__Procedure__Group__02415);
            rule__Procedure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__1_in_rule__Procedure__Group__02418);
            rule__Procedure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__0"


    // $ANTLR start "rule__Procedure__Group__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1158:1: rule__Procedure__Group__0__Impl : ( 'procedure:' ) ;
    public final void rule__Procedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1162:1: ( ( 'procedure:' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1163:1: ( 'procedure:' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1163:1: ( 'procedure:' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1164:1: 'procedure:'
            {
             before(grammarAccess.getProcedureAccess().getProcedureKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Procedure__Group__0__Impl2446); 
             after(grammarAccess.getProcedureAccess().getProcedureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__0__Impl"


    // $ANTLR start "rule__Procedure__Group__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1177:1: rule__Procedure__Group__1 : rule__Procedure__Group__1__Impl rule__Procedure__Group__2 ;
    public final void rule__Procedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1181:1: ( rule__Procedure__Group__1__Impl rule__Procedure__Group__2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1182:2: rule__Procedure__Group__1__Impl rule__Procedure__Group__2
            {
            pushFollow(FOLLOW_rule__Procedure__Group__1__Impl_in_rule__Procedure__Group__12477);
            rule__Procedure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__2_in_rule__Procedure__Group__12480);
            rule__Procedure__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__1"


    // $ANTLR start "rule__Procedure__Group__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1189:1: rule__Procedure__Group__1__Impl : ( ( rule__Procedure__ZAssignment_1 ) ) ;
    public final void rule__Procedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1193:1: ( ( ( rule__Procedure__ZAssignment_1 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1194:1: ( ( rule__Procedure__ZAssignment_1 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1194:1: ( ( rule__Procedure__ZAssignment_1 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1195:1: ( rule__Procedure__ZAssignment_1 )
            {
             before(grammarAccess.getProcedureAccess().getZAssignment_1()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1196:1: ( rule__Procedure__ZAssignment_1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1196:2: rule__Procedure__ZAssignment_1
            {
            pushFollow(FOLLOW_rule__Procedure__ZAssignment_1_in_rule__Procedure__Group__1__Impl2507);
            rule__Procedure__ZAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getZAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__1__Impl"


    // $ANTLR start "rule__Procedure__Group__2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1206:1: rule__Procedure__Group__2 : rule__Procedure__Group__2__Impl rule__Procedure__Group__3 ;
    public final void rule__Procedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1210:1: ( rule__Procedure__Group__2__Impl rule__Procedure__Group__3 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1211:2: rule__Procedure__Group__2__Impl rule__Procedure__Group__3
            {
            pushFollow(FOLLOW_rule__Procedure__Group__2__Impl_in_rule__Procedure__Group__22537);
            rule__Procedure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Procedure__Group__3_in_rule__Procedure__Group__22540);
            rule__Procedure__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__2"


    // $ANTLR start "rule__Procedure__Group__2__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1218:1: rule__Procedure__Group__2__Impl : ( ( rule__Procedure__XAssignment_2 ) ) ;
    public final void rule__Procedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1222:1: ( ( ( rule__Procedure__XAssignment_2 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1223:1: ( ( rule__Procedure__XAssignment_2 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1223:1: ( ( rule__Procedure__XAssignment_2 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1224:1: ( rule__Procedure__XAssignment_2 )
            {
             before(grammarAccess.getProcedureAccess().getXAssignment_2()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1225:1: ( rule__Procedure__XAssignment_2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1225:2: rule__Procedure__XAssignment_2
            {
            pushFollow(FOLLOW_rule__Procedure__XAssignment_2_in_rule__Procedure__Group__2__Impl2567);
            rule__Procedure__XAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getXAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__2__Impl"


    // $ANTLR start "rule__Procedure__Group__3"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1235:1: rule__Procedure__Group__3 : rule__Procedure__Group__3__Impl ;
    public final void rule__Procedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1239:1: ( rule__Procedure__Group__3__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1240:2: rule__Procedure__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Procedure__Group__3__Impl_in_rule__Procedure__Group__32597);
            rule__Procedure__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__3"


    // $ANTLR start "rule__Procedure__Group__3__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1246:1: rule__Procedure__Group__3__Impl : ( ( rule__Procedure__BodyAssignment_3 ) ) ;
    public final void rule__Procedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1250:1: ( ( ( rule__Procedure__BodyAssignment_3 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1251:1: ( ( rule__Procedure__BodyAssignment_3 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1251:1: ( ( rule__Procedure__BodyAssignment_3 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1252:1: ( rule__Procedure__BodyAssignment_3 )
            {
             before(grammarAccess.getProcedureAccess().getBodyAssignment_3()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1253:1: ( rule__Procedure__BodyAssignment_3 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1253:2: rule__Procedure__BodyAssignment_3
            {
            pushFollow(FOLLOW_rule__Procedure__BodyAssignment_3_in_rule__Procedure__Group__3__Impl2624);
            rule__Procedure__BodyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getBodyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__Group__3__Impl"


    // $ANTLR start "rule__Decl__Group__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1271:1: rule__Decl__Group__0 : rule__Decl__Group__0__Impl rule__Decl__Group__1 ;
    public final void rule__Decl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1275:1: ( rule__Decl__Group__0__Impl rule__Decl__Group__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1276:2: rule__Decl__Group__0__Impl rule__Decl__Group__1
            {
            pushFollow(FOLLOW_rule__Decl__Group__0__Impl_in_rule__Decl__Group__02662);
            rule__Decl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decl__Group__1_in_rule__Decl__Group__02665);
            rule__Decl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group__0"


    // $ANTLR start "rule__Decl__Group__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1283:1: rule__Decl__Group__0__Impl : ( () ) ;
    public final void rule__Decl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1287:1: ( ( () ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1288:1: ( () )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1288:1: ( () )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1289:1: ()
            {
             before(grammarAccess.getDeclAccess().getDeclAction_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1290:1: ()
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1292:1: 
            {
            }

             after(grammarAccess.getDeclAccess().getDeclAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group__0__Impl"


    // $ANTLR start "rule__Decl__Group__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1302:1: rule__Decl__Group__1 : rule__Decl__Group__1__Impl rule__Decl__Group__2 ;
    public final void rule__Decl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1306:1: ( rule__Decl__Group__1__Impl rule__Decl__Group__2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1307:2: rule__Decl__Group__1__Impl rule__Decl__Group__2
            {
            pushFollow(FOLLOW_rule__Decl__Group__1__Impl_in_rule__Decl__Group__12723);
            rule__Decl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decl__Group__2_in_rule__Decl__Group__12726);
            rule__Decl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group__1"


    // $ANTLR start "rule__Decl__Group__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1314:1: rule__Decl__Group__1__Impl : ( 'local' ) ;
    public final void rule__Decl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1318:1: ( ( 'local' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1319:1: ( 'local' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1319:1: ( 'local' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1320:1: 'local'
            {
             before(grammarAccess.getDeclAccess().getLocalKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Decl__Group__1__Impl2754); 
             after(grammarAccess.getDeclAccess().getLocalKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group__1__Impl"


    // $ANTLR start "rule__Decl__Group__2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1333:1: rule__Decl__Group__2 : rule__Decl__Group__2__Impl rule__Decl__Group__3 ;
    public final void rule__Decl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1337:1: ( rule__Decl__Group__2__Impl rule__Decl__Group__3 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1338:2: rule__Decl__Group__2__Impl rule__Decl__Group__3
            {
            pushFollow(FOLLOW_rule__Decl__Group__2__Impl_in_rule__Decl__Group__22785);
            rule__Decl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decl__Group__3_in_rule__Decl__Group__22788);
            rule__Decl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group__2"


    // $ANTLR start "rule__Decl__Group__2__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1345:1: rule__Decl__Group__2__Impl : ( ( rule__Decl__VarAssignment_2 ) ) ;
    public final void rule__Decl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1349:1: ( ( ( rule__Decl__VarAssignment_2 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1350:1: ( ( rule__Decl__VarAssignment_2 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1350:1: ( ( rule__Decl__VarAssignment_2 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1351:1: ( rule__Decl__VarAssignment_2 )
            {
             before(grammarAccess.getDeclAccess().getVarAssignment_2()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1352:1: ( rule__Decl__VarAssignment_2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1352:2: rule__Decl__VarAssignment_2
            {
            pushFollow(FOLLOW_rule__Decl__VarAssignment_2_in_rule__Decl__Group__2__Impl2815);
            rule__Decl__VarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeclAccess().getVarAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group__2__Impl"


    // $ANTLR start "rule__Decl__Group__3"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1362:1: rule__Decl__Group__3 : rule__Decl__Group__3__Impl rule__Decl__Group__4 ;
    public final void rule__Decl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1366:1: ( rule__Decl__Group__3__Impl rule__Decl__Group__4 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1367:2: rule__Decl__Group__3__Impl rule__Decl__Group__4
            {
            pushFollow(FOLLOW_rule__Decl__Group__3__Impl_in_rule__Decl__Group__32845);
            rule__Decl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Decl__Group__4_in_rule__Decl__Group__32848);
            rule__Decl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group__3"


    // $ANTLR start "rule__Decl__Group__3__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1374:1: rule__Decl__Group__3__Impl : ( 'in' ) ;
    public final void rule__Decl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1378:1: ( ( 'in' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1379:1: ( 'in' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1379:1: ( 'in' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1380:1: 'in'
            {
             before(grammarAccess.getDeclAccess().getInKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__Decl__Group__3__Impl2876); 
             after(grammarAccess.getDeclAccess().getInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group__3__Impl"


    // $ANTLR start "rule__Decl__Group__4"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1393:1: rule__Decl__Group__4 : rule__Decl__Group__4__Impl ;
    public final void rule__Decl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1397:1: ( rule__Decl__Group__4__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1398:2: rule__Decl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Decl__Group__4__Impl_in_rule__Decl__Group__42907);
            rule__Decl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group__4"


    // $ANTLR start "rule__Decl__Group__4__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1404:1: rule__Decl__Group__4__Impl : ( ( rule__Decl__BodyAssignment_4 ) ) ;
    public final void rule__Decl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1408:1: ( ( ( rule__Decl__BodyAssignment_4 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1409:1: ( ( rule__Decl__BodyAssignment_4 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1409:1: ( ( rule__Decl__BodyAssignment_4 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1410:1: ( rule__Decl__BodyAssignment_4 )
            {
             before(grammarAccess.getDeclAccess().getBodyAssignment_4()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1411:1: ( rule__Decl__BodyAssignment_4 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1411:2: rule__Decl__BodyAssignment_4
            {
            pushFollow(FOLLOW_rule__Decl__BodyAssignment_4_in_rule__Decl__Group__4__Impl2934);
            rule__Decl__BodyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDeclAccess().getBodyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__Group__4__Impl"


    // $ANTLR start "rule__Branch__Group__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1431:1: rule__Branch__Group__0 : rule__Branch__Group__0__Impl rule__Branch__Group__1 ;
    public final void rule__Branch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1435:1: ( rule__Branch__Group__0__Impl rule__Branch__Group__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1436:2: rule__Branch__Group__0__Impl rule__Branch__Group__1
            {
            pushFollow(FOLLOW_rule__Branch__Group__0__Impl_in_rule__Branch__Group__02974);
            rule__Branch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Branch__Group__1_in_rule__Branch__Group__02977);
            rule__Branch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__0"


    // $ANTLR start "rule__Branch__Group__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1443:1: rule__Branch__Group__0__Impl : ( () ) ;
    public final void rule__Branch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1447:1: ( ( () ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1448:1: ( () )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1448:1: ( () )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1449:1: ()
            {
             before(grammarAccess.getBranchAccess().getBranchAction_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1450:1: ()
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1452:1: 
            {
            }

             after(grammarAccess.getBranchAccess().getBranchAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__0__Impl"


    // $ANTLR start "rule__Branch__Group__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1462:1: rule__Branch__Group__1 : rule__Branch__Group__1__Impl rule__Branch__Group__2 ;
    public final void rule__Branch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1466:1: ( rule__Branch__Group__1__Impl rule__Branch__Group__2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1467:2: rule__Branch__Group__1__Impl rule__Branch__Group__2
            {
            pushFollow(FOLLOW_rule__Branch__Group__1__Impl_in_rule__Branch__Group__13035);
            rule__Branch__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Branch__Group__2_in_rule__Branch__Group__13038);
            rule__Branch__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__1"


    // $ANTLR start "rule__Branch__Group__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1474:1: rule__Branch__Group__1__Impl : ( 'if' ) ;
    public final void rule__Branch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1478:1: ( ( 'if' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1479:1: ( 'if' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1479:1: ( 'if' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1480:1: 'if'
            {
             before(grammarAccess.getBranchAccess().getIfKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Branch__Group__1__Impl3066); 
             after(grammarAccess.getBranchAccess().getIfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__1__Impl"


    // $ANTLR start "rule__Branch__Group__2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1493:1: rule__Branch__Group__2 : rule__Branch__Group__2__Impl rule__Branch__Group__3 ;
    public final void rule__Branch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1497:1: ( rule__Branch__Group__2__Impl rule__Branch__Group__3 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1498:2: rule__Branch__Group__2__Impl rule__Branch__Group__3
            {
            pushFollow(FOLLOW_rule__Branch__Group__2__Impl_in_rule__Branch__Group__23097);
            rule__Branch__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Branch__Group__3_in_rule__Branch__Group__23100);
            rule__Branch__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__2"


    // $ANTLR start "rule__Branch__Group__2__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1505:1: rule__Branch__Group__2__Impl : ( ( rule__Branch__GuardAssignment_2 ) ) ;
    public final void rule__Branch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1509:1: ( ( ( rule__Branch__GuardAssignment_2 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1510:1: ( ( rule__Branch__GuardAssignment_2 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1510:1: ( ( rule__Branch__GuardAssignment_2 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1511:1: ( rule__Branch__GuardAssignment_2 )
            {
             before(grammarAccess.getBranchAccess().getGuardAssignment_2()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1512:1: ( rule__Branch__GuardAssignment_2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1512:2: rule__Branch__GuardAssignment_2
            {
            pushFollow(FOLLOW_rule__Branch__GuardAssignment_2_in_rule__Branch__Group__2__Impl3127);
            rule__Branch__GuardAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBranchAccess().getGuardAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__2__Impl"


    // $ANTLR start "rule__Branch__Group__3"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1522:1: rule__Branch__Group__3 : rule__Branch__Group__3__Impl rule__Branch__Group__4 ;
    public final void rule__Branch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1526:1: ( rule__Branch__Group__3__Impl rule__Branch__Group__4 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1527:2: rule__Branch__Group__3__Impl rule__Branch__Group__4
            {
            pushFollow(FOLLOW_rule__Branch__Group__3__Impl_in_rule__Branch__Group__33157);
            rule__Branch__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Branch__Group__4_in_rule__Branch__Group__33160);
            rule__Branch__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__3"


    // $ANTLR start "rule__Branch__Group__3__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1534:1: rule__Branch__Group__3__Impl : ( 'then' ) ;
    public final void rule__Branch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1538:1: ( ( 'then' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1539:1: ( 'then' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1539:1: ( 'then' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1540:1: 'then'
            {
             before(grammarAccess.getBranchAccess().getThenKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Branch__Group__3__Impl3188); 
             after(grammarAccess.getBranchAccess().getThenKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__3__Impl"


    // $ANTLR start "rule__Branch__Group__4"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1553:1: rule__Branch__Group__4 : rule__Branch__Group__4__Impl rule__Branch__Group__5 ;
    public final void rule__Branch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1557:1: ( rule__Branch__Group__4__Impl rule__Branch__Group__5 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1558:2: rule__Branch__Group__4__Impl rule__Branch__Group__5
            {
            pushFollow(FOLLOW_rule__Branch__Group__4__Impl_in_rule__Branch__Group__43219);
            rule__Branch__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Branch__Group__5_in_rule__Branch__Group__43222);
            rule__Branch__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__4"


    // $ANTLR start "rule__Branch__Group__4__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1565:1: rule__Branch__Group__4__Impl : ( ( rule__Branch__LeftAssignment_4 ) ) ;
    public final void rule__Branch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1569:1: ( ( ( rule__Branch__LeftAssignment_4 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1570:1: ( ( rule__Branch__LeftAssignment_4 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1570:1: ( ( rule__Branch__LeftAssignment_4 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1571:1: ( rule__Branch__LeftAssignment_4 )
            {
             before(grammarAccess.getBranchAccess().getLeftAssignment_4()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1572:1: ( rule__Branch__LeftAssignment_4 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1572:2: rule__Branch__LeftAssignment_4
            {
            pushFollow(FOLLOW_rule__Branch__LeftAssignment_4_in_rule__Branch__Group__4__Impl3249);
            rule__Branch__LeftAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBranchAccess().getLeftAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__4__Impl"


    // $ANTLR start "rule__Branch__Group__5"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1582:1: rule__Branch__Group__5 : rule__Branch__Group__5__Impl rule__Branch__Group__6 ;
    public final void rule__Branch__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1586:1: ( rule__Branch__Group__5__Impl rule__Branch__Group__6 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1587:2: rule__Branch__Group__5__Impl rule__Branch__Group__6
            {
            pushFollow(FOLLOW_rule__Branch__Group__5__Impl_in_rule__Branch__Group__53279);
            rule__Branch__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Branch__Group__6_in_rule__Branch__Group__53282);
            rule__Branch__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__5"


    // $ANTLR start "rule__Branch__Group__5__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1594:1: rule__Branch__Group__5__Impl : ( 'else' ) ;
    public final void rule__Branch__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1598:1: ( ( 'else' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1599:1: ( 'else' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1599:1: ( 'else' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1600:1: 'else'
            {
             before(grammarAccess.getBranchAccess().getElseKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__Branch__Group__5__Impl3310); 
             after(grammarAccess.getBranchAccess().getElseKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__5__Impl"


    // $ANTLR start "rule__Branch__Group__6"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1613:1: rule__Branch__Group__6 : rule__Branch__Group__6__Impl ;
    public final void rule__Branch__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1617:1: ( rule__Branch__Group__6__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1618:2: rule__Branch__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Branch__Group__6__Impl_in_rule__Branch__Group__63341);
            rule__Branch__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__6"


    // $ANTLR start "rule__Branch__Group__6__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1624:1: rule__Branch__Group__6__Impl : ( ( rule__Branch__RightAssignment_6 ) ) ;
    public final void rule__Branch__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1628:1: ( ( ( rule__Branch__RightAssignment_6 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1629:1: ( ( rule__Branch__RightAssignment_6 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1629:1: ( ( rule__Branch__RightAssignment_6 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1630:1: ( rule__Branch__RightAssignment_6 )
            {
             before(grammarAccess.getBranchAccess().getRightAssignment_6()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1631:1: ( rule__Branch__RightAssignment_6 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1631:2: rule__Branch__RightAssignment_6
            {
            pushFollow(FOLLOW_rule__Branch__RightAssignment_6_in_rule__Branch__Group__6__Impl3368);
            rule__Branch__RightAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBranchAccess().getRightAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__Group__6__Impl"


    // $ANTLR start "rule__Loop__Group__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1655:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1659:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1660:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_rule__Loop__Group__0__Impl_in_rule__Loop__Group__03412);
            rule__Loop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Loop__Group__1_in_rule__Loop__Group__03415);
            rule__Loop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__0"


    // $ANTLR start "rule__Loop__Group__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1667:1: rule__Loop__Group__0__Impl : ( () ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1671:1: ( ( () ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1672:1: ( () )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1672:1: ( () )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1673:1: ()
            {
             before(grammarAccess.getLoopAccess().getLoopAction_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1674:1: ()
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1676:1: 
            {
            }

             after(grammarAccess.getLoopAccess().getLoopAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__0__Impl"


    // $ANTLR start "rule__Loop__Group__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1686:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1690:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1691:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
            {
            pushFollow(FOLLOW_rule__Loop__Group__1__Impl_in_rule__Loop__Group__13473);
            rule__Loop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Loop__Group__2_in_rule__Loop__Group__13476);
            rule__Loop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__1"


    // $ANTLR start "rule__Loop__Group__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1698:1: rule__Loop__Group__1__Impl : ( 'while' ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1702:1: ( ( 'while' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1703:1: ( 'while' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1703:1: ( 'while' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1704:1: 'while'
            {
             before(grammarAccess.getLoopAccess().getWhileKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Loop__Group__1__Impl3504); 
             after(grammarAccess.getLoopAccess().getWhileKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__1__Impl"


    // $ANTLR start "rule__Loop__Group__2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1717:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl rule__Loop__Group__3 ;
    public final void rule__Loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1721:1: ( rule__Loop__Group__2__Impl rule__Loop__Group__3 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1722:2: rule__Loop__Group__2__Impl rule__Loop__Group__3
            {
            pushFollow(FOLLOW_rule__Loop__Group__2__Impl_in_rule__Loop__Group__23535);
            rule__Loop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Loop__Group__3_in_rule__Loop__Group__23538);
            rule__Loop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__2"


    // $ANTLR start "rule__Loop__Group__2__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1729:1: rule__Loop__Group__2__Impl : ( ( rule__Loop__GuardAssignment_2 ) ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1733:1: ( ( ( rule__Loop__GuardAssignment_2 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1734:1: ( ( rule__Loop__GuardAssignment_2 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1734:1: ( ( rule__Loop__GuardAssignment_2 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1735:1: ( rule__Loop__GuardAssignment_2 )
            {
             before(grammarAccess.getLoopAccess().getGuardAssignment_2()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1736:1: ( rule__Loop__GuardAssignment_2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1736:2: rule__Loop__GuardAssignment_2
            {
            pushFollow(FOLLOW_rule__Loop__GuardAssignment_2_in_rule__Loop__Group__2__Impl3565);
            rule__Loop__GuardAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getGuardAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__2__Impl"


    // $ANTLR start "rule__Loop__Group__3"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1746:1: rule__Loop__Group__3 : rule__Loop__Group__3__Impl rule__Loop__Group__4 ;
    public final void rule__Loop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1750:1: ( rule__Loop__Group__3__Impl rule__Loop__Group__4 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1751:2: rule__Loop__Group__3__Impl rule__Loop__Group__4
            {
            pushFollow(FOLLOW_rule__Loop__Group__3__Impl_in_rule__Loop__Group__33595);
            rule__Loop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Loop__Group__4_in_rule__Loop__Group__33598);
            rule__Loop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__3"


    // $ANTLR start "rule__Loop__Group__3__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1758:1: rule__Loop__Group__3__Impl : ( 'do' ) ;
    public final void rule__Loop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1762:1: ( ( 'do' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1763:1: ( 'do' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1763:1: ( 'do' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1764:1: 'do'
            {
             before(grammarAccess.getLoopAccess().getDoKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Loop__Group__3__Impl3626); 
             after(grammarAccess.getLoopAccess().getDoKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__3__Impl"


    // $ANTLR start "rule__Loop__Group__4"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1777:1: rule__Loop__Group__4 : rule__Loop__Group__4__Impl ;
    public final void rule__Loop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1781:1: ( rule__Loop__Group__4__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1782:2: rule__Loop__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Loop__Group__4__Impl_in_rule__Loop__Group__43657);
            rule__Loop__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__4"


    // $ANTLR start "rule__Loop__Group__4__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1788:1: rule__Loop__Group__4__Impl : ( ( rule__Loop__BodyAssignment_4 ) ) ;
    public final void rule__Loop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1792:1: ( ( ( rule__Loop__BodyAssignment_4 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1793:1: ( ( rule__Loop__BodyAssignment_4 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1793:1: ( ( rule__Loop__BodyAssignment_4 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1794:1: ( rule__Loop__BodyAssignment_4 )
            {
             before(grammarAccess.getLoopAccess().getBodyAssignment_4()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1795:1: ( rule__Loop__BodyAssignment_4 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1795:2: rule__Loop__BodyAssignment_4
            {
            pushFollow(FOLLOW_rule__Loop__BodyAssignment_4_in_rule__Loop__Group__4__Impl3684);
            rule__Loop__BodyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getBodyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Group__4__Impl"


    // $ANTLR start "rule__Invoke__Group__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1815:1: rule__Invoke__Group__0 : rule__Invoke__Group__0__Impl rule__Invoke__Group__1 ;
    public final void rule__Invoke__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1819:1: ( rule__Invoke__Group__0__Impl rule__Invoke__Group__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1820:2: rule__Invoke__Group__0__Impl rule__Invoke__Group__1
            {
            pushFollow(FOLLOW_rule__Invoke__Group__0__Impl_in_rule__Invoke__Group__03724);
            rule__Invoke__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Invoke__Group__1_in_rule__Invoke__Group__03727);
            rule__Invoke__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invoke__Group__0"


    // $ANTLR start "rule__Invoke__Group__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1827:1: rule__Invoke__Group__0__Impl : ( () ) ;
    public final void rule__Invoke__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1831:1: ( ( () ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1832:1: ( () )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1832:1: ( () )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1833:1: ()
            {
             before(grammarAccess.getInvokeAccess().getInvokeAction_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1834:1: ()
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1836:1: 
            {
            }

             after(grammarAccess.getInvokeAccess().getInvokeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invoke__Group__0__Impl"


    // $ANTLR start "rule__Invoke__Group__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1846:1: rule__Invoke__Group__1 : rule__Invoke__Group__1__Impl rule__Invoke__Group__2 ;
    public final void rule__Invoke__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1850:1: ( rule__Invoke__Group__1__Impl rule__Invoke__Group__2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1851:2: rule__Invoke__Group__1__Impl rule__Invoke__Group__2
            {
            pushFollow(FOLLOW_rule__Invoke__Group__1__Impl_in_rule__Invoke__Group__13785);
            rule__Invoke__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Invoke__Group__2_in_rule__Invoke__Group__13788);
            rule__Invoke__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invoke__Group__1"


    // $ANTLR start "rule__Invoke__Group__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1858:1: rule__Invoke__Group__1__Impl : ( ( rule__Invoke__FunAssignment_1 ) ) ;
    public final void rule__Invoke__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1862:1: ( ( ( rule__Invoke__FunAssignment_1 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1863:1: ( ( rule__Invoke__FunAssignment_1 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1863:1: ( ( rule__Invoke__FunAssignment_1 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1864:1: ( rule__Invoke__FunAssignment_1 )
            {
             before(grammarAccess.getInvokeAccess().getFunAssignment_1()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1865:1: ( rule__Invoke__FunAssignment_1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1865:2: rule__Invoke__FunAssignment_1
            {
            pushFollow(FOLLOW_rule__Invoke__FunAssignment_1_in_rule__Invoke__Group__1__Impl3815);
            rule__Invoke__FunAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInvokeAccess().getFunAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invoke__Group__1__Impl"


    // $ANTLR start "rule__Invoke__Group__2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1875:1: rule__Invoke__Group__2 : rule__Invoke__Group__2__Impl rule__Invoke__Group__3 ;
    public final void rule__Invoke__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1879:1: ( rule__Invoke__Group__2__Impl rule__Invoke__Group__3 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1880:2: rule__Invoke__Group__2__Impl rule__Invoke__Group__3
            {
            pushFollow(FOLLOW_rule__Invoke__Group__2__Impl_in_rule__Invoke__Group__23845);
            rule__Invoke__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Invoke__Group__3_in_rule__Invoke__Group__23848);
            rule__Invoke__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invoke__Group__2"


    // $ANTLR start "rule__Invoke__Group__2__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1887:1: rule__Invoke__Group__2__Impl : ( '(' ) ;
    public final void rule__Invoke__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1891:1: ( ( '(' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1892:1: ( '(' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1892:1: ( '(' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1893:1: '('
            {
             before(grammarAccess.getInvokeAccess().getLeftParenthesisKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Invoke__Group__2__Impl3876); 
             after(grammarAccess.getInvokeAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invoke__Group__2__Impl"


    // $ANTLR start "rule__Invoke__Group__3"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1906:1: rule__Invoke__Group__3 : rule__Invoke__Group__3__Impl rule__Invoke__Group__4 ;
    public final void rule__Invoke__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1910:1: ( rule__Invoke__Group__3__Impl rule__Invoke__Group__4 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1911:2: rule__Invoke__Group__3__Impl rule__Invoke__Group__4
            {
            pushFollow(FOLLOW_rule__Invoke__Group__3__Impl_in_rule__Invoke__Group__33907);
            rule__Invoke__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Invoke__Group__4_in_rule__Invoke__Group__33910);
            rule__Invoke__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invoke__Group__3"


    // $ANTLR start "rule__Invoke__Group__3__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1918:1: rule__Invoke__Group__3__Impl : ( ( rule__Invoke__ArgAssignment_3 ) ) ;
    public final void rule__Invoke__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1922:1: ( ( ( rule__Invoke__ArgAssignment_3 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1923:1: ( ( rule__Invoke__ArgAssignment_3 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1923:1: ( ( rule__Invoke__ArgAssignment_3 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1924:1: ( rule__Invoke__ArgAssignment_3 )
            {
             before(grammarAccess.getInvokeAccess().getArgAssignment_3()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1925:1: ( rule__Invoke__ArgAssignment_3 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1925:2: rule__Invoke__ArgAssignment_3
            {
            pushFollow(FOLLOW_rule__Invoke__ArgAssignment_3_in_rule__Invoke__Group__3__Impl3937);
            rule__Invoke__ArgAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInvokeAccess().getArgAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invoke__Group__3__Impl"


    // $ANTLR start "rule__Invoke__Group__4"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1935:1: rule__Invoke__Group__4 : rule__Invoke__Group__4__Impl ;
    public final void rule__Invoke__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1939:1: ( rule__Invoke__Group__4__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1940:2: rule__Invoke__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Invoke__Group__4__Impl_in_rule__Invoke__Group__43967);
            rule__Invoke__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invoke__Group__4"


    // $ANTLR start "rule__Invoke__Group__4__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1946:1: rule__Invoke__Group__4__Impl : ( ')' ) ;
    public final void rule__Invoke__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1950:1: ( ( ')' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1951:1: ( ')' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1951:1: ( ')' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1952:1: ')'
            {
             before(grammarAccess.getInvokeAccess().getRightParenthesisKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Invoke__Group__4__Impl3995); 
             after(grammarAccess.getInvokeAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invoke__Group__4__Impl"


    // $ANTLR start "rule__Assign__Group__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1975:1: rule__Assign__Group__0 : rule__Assign__Group__0__Impl rule__Assign__Group__1 ;
    public final void rule__Assign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1979:1: ( rule__Assign__Group__0__Impl rule__Assign__Group__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1980:2: rule__Assign__Group__0__Impl rule__Assign__Group__1
            {
            pushFollow(FOLLOW_rule__Assign__Group__0__Impl_in_rule__Assign__Group__04036);
            rule__Assign__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assign__Group__1_in_rule__Assign__Group__04039);
            rule__Assign__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__0"


    // $ANTLR start "rule__Assign__Group__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1987:1: rule__Assign__Group__0__Impl : ( () ) ;
    public final void rule__Assign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1991:1: ( ( () ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1992:1: ( () )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1992:1: ( () )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1993:1: ()
            {
             before(grammarAccess.getAssignAccess().getAssignAction_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1994:1: ()
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:1996:1: 
            {
            }

             after(grammarAccess.getAssignAccess().getAssignAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__0__Impl"


    // $ANTLR start "rule__Assign__Group__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2006:1: rule__Assign__Group__1 : rule__Assign__Group__1__Impl rule__Assign__Group__2 ;
    public final void rule__Assign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2010:1: ( rule__Assign__Group__1__Impl rule__Assign__Group__2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2011:2: rule__Assign__Group__1__Impl rule__Assign__Group__2
            {
            pushFollow(FOLLOW_rule__Assign__Group__1__Impl_in_rule__Assign__Group__14097);
            rule__Assign__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assign__Group__2_in_rule__Assign__Group__14100);
            rule__Assign__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__1"


    // $ANTLR start "rule__Assign__Group__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2018:1: rule__Assign__Group__1__Impl : ( ( rule__Assign__VarAssignment_1 ) ) ;
    public final void rule__Assign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2022:1: ( ( ( rule__Assign__VarAssignment_1 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2023:1: ( ( rule__Assign__VarAssignment_1 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2023:1: ( ( rule__Assign__VarAssignment_1 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2024:1: ( rule__Assign__VarAssignment_1 )
            {
             before(grammarAccess.getAssignAccess().getVarAssignment_1()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2025:1: ( rule__Assign__VarAssignment_1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2025:2: rule__Assign__VarAssignment_1
            {
            pushFollow(FOLLOW_rule__Assign__VarAssignment_1_in_rule__Assign__Group__1__Impl4127);
            rule__Assign__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignAccess().getVarAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__1__Impl"


    // $ANTLR start "rule__Assign__Group__2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2035:1: rule__Assign__Group__2 : rule__Assign__Group__2__Impl rule__Assign__Group__3 ;
    public final void rule__Assign__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2039:1: ( rule__Assign__Group__2__Impl rule__Assign__Group__3 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2040:2: rule__Assign__Group__2__Impl rule__Assign__Group__3
            {
            pushFollow(FOLLOW_rule__Assign__Group__2__Impl_in_rule__Assign__Group__24157);
            rule__Assign__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assign__Group__3_in_rule__Assign__Group__24160);
            rule__Assign__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__2"


    // $ANTLR start "rule__Assign__Group__2__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2047:1: rule__Assign__Group__2__Impl : ( ':=' ) ;
    public final void rule__Assign__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2051:1: ( ( ':=' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2052:1: ( ':=' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2052:1: ( ':=' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2053:1: ':='
            {
             before(grammarAccess.getAssignAccess().getColonEqualsSignKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Assign__Group__2__Impl4188); 
             after(grammarAccess.getAssignAccess().getColonEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__2__Impl"


    // $ANTLR start "rule__Assign__Group__3"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2066:1: rule__Assign__Group__3 : rule__Assign__Group__3__Impl ;
    public final void rule__Assign__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2070:1: ( rule__Assign__Group__3__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2071:2: rule__Assign__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Assign__Group__3__Impl_in_rule__Assign__Group__34219);
            rule__Assign__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__3"


    // $ANTLR start "rule__Assign__Group__3__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2077:1: rule__Assign__Group__3__Impl : ( ( rule__Assign__ExpAssignment_3 ) ) ;
    public final void rule__Assign__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2081:1: ( ( ( rule__Assign__ExpAssignment_3 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2082:1: ( ( rule__Assign__ExpAssignment_3 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2082:1: ( ( rule__Assign__ExpAssignment_3 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2083:1: ( rule__Assign__ExpAssignment_3 )
            {
             before(grammarAccess.getAssignAccess().getExpAssignment_3()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2084:1: ( rule__Assign__ExpAssignment_3 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2084:2: rule__Assign__ExpAssignment_3
            {
            pushFollow(FOLLOW_rule__Assign__ExpAssignment_3_in_rule__Assign__Group__3__Impl4246);
            rule__Assign__ExpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssignAccess().getExpAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__Group__3__Impl"


    // $ANTLR start "rule__Read__Group__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2102:1: rule__Read__Group__0 : rule__Read__Group__0__Impl rule__Read__Group__1 ;
    public final void rule__Read__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2106:1: ( rule__Read__Group__0__Impl rule__Read__Group__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2107:2: rule__Read__Group__0__Impl rule__Read__Group__1
            {
            pushFollow(FOLLOW_rule__Read__Group__0__Impl_in_rule__Read__Group__04284);
            rule__Read__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Read__Group__1_in_rule__Read__Group__04287);
            rule__Read__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__0"


    // $ANTLR start "rule__Read__Group__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2114:1: rule__Read__Group__0__Impl : ( () ) ;
    public final void rule__Read__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2118:1: ( ( () ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2119:1: ( () )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2119:1: ( () )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2120:1: ()
            {
             before(grammarAccess.getReadAccess().getReadAction_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2121:1: ()
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2123:1: 
            {
            }

             after(grammarAccess.getReadAccess().getReadAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__0__Impl"


    // $ANTLR start "rule__Read__Group__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2133:1: rule__Read__Group__1 : rule__Read__Group__1__Impl rule__Read__Group__2 ;
    public final void rule__Read__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2137:1: ( rule__Read__Group__1__Impl rule__Read__Group__2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2138:2: rule__Read__Group__1__Impl rule__Read__Group__2
            {
            pushFollow(FOLLOW_rule__Read__Group__1__Impl_in_rule__Read__Group__14345);
            rule__Read__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Read__Group__2_in_rule__Read__Group__14348);
            rule__Read__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__1"


    // $ANTLR start "rule__Read__Group__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2145:1: rule__Read__Group__1__Impl : ( ( rule__Read__NameAssignment_1 ) ) ;
    public final void rule__Read__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2149:1: ( ( ( rule__Read__NameAssignment_1 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2150:1: ( ( rule__Read__NameAssignment_1 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2150:1: ( ( rule__Read__NameAssignment_1 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2151:1: ( rule__Read__NameAssignment_1 )
            {
             before(grammarAccess.getReadAccess().getNameAssignment_1()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2152:1: ( rule__Read__NameAssignment_1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2152:2: rule__Read__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Read__NameAssignment_1_in_rule__Read__Group__1__Impl4375);
            rule__Read__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__1__Impl"


    // $ANTLR start "rule__Read__Group__2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2162:1: rule__Read__Group__2 : rule__Read__Group__2__Impl rule__Read__Group__3 ;
    public final void rule__Read__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2166:1: ( rule__Read__Group__2__Impl rule__Read__Group__3 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2167:2: rule__Read__Group__2__Impl rule__Read__Group__3
            {
            pushFollow(FOLLOW_rule__Read__Group__2__Impl_in_rule__Read__Group__24405);
            rule__Read__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Read__Group__3_in_rule__Read__Group__24408);
            rule__Read__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__2"


    // $ANTLR start "rule__Read__Group__2__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2174:1: rule__Read__Group__2__Impl : ( ':=' ) ;
    public final void rule__Read__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2178:1: ( ( ':=' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2179:1: ( ':=' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2179:1: ( ':=' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2180:1: ':='
            {
             before(grammarAccess.getReadAccess().getColonEqualsSignKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Read__Group__2__Impl4436); 
             after(grammarAccess.getReadAccess().getColonEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__2__Impl"


    // $ANTLR start "rule__Read__Group__3"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2193:1: rule__Read__Group__3 : rule__Read__Group__3__Impl rule__Read__Group__4 ;
    public final void rule__Read__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2197:1: ( rule__Read__Group__3__Impl rule__Read__Group__4 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2198:2: rule__Read__Group__3__Impl rule__Read__Group__4
            {
            pushFollow(FOLLOW_rule__Read__Group__3__Impl_in_rule__Read__Group__34467);
            rule__Read__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Read__Group__4_in_rule__Read__Group__34470);
            rule__Read__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__3"


    // $ANTLR start "rule__Read__Group__3__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2205:1: rule__Read__Group__3__Impl : ( 'rd' ) ;
    public final void rule__Read__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2209:1: ( ( 'rd' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2210:1: ( 'rd' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2210:1: ( 'rd' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2211:1: 'rd'
            {
             before(grammarAccess.getReadAccess().getRdKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__Read__Group__3__Impl4498); 
             after(grammarAccess.getReadAccess().getRdKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__3__Impl"


    // $ANTLR start "rule__Read__Group__4"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2224:1: rule__Read__Group__4 : rule__Read__Group__4__Impl rule__Read__Group__5 ;
    public final void rule__Read__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2228:1: ( rule__Read__Group__4__Impl rule__Read__Group__5 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2229:2: rule__Read__Group__4__Impl rule__Read__Group__5
            {
            pushFollow(FOLLOW_rule__Read__Group__4__Impl_in_rule__Read__Group__44529);
            rule__Read__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Read__Group__5_in_rule__Read__Group__44532);
            rule__Read__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__4"


    // $ANTLR start "rule__Read__Group__4__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2236:1: rule__Read__Group__4__Impl : ( '(' ) ;
    public final void rule__Read__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2240:1: ( ( '(' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2241:1: ( '(' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2241:1: ( '(' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2242:1: '('
            {
             before(grammarAccess.getReadAccess().getLeftParenthesisKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__Read__Group__4__Impl4560); 
             after(grammarAccess.getReadAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__4__Impl"


    // $ANTLR start "rule__Read__Group__5"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2255:1: rule__Read__Group__5 : rule__Read__Group__5__Impl rule__Read__Group__6 ;
    public final void rule__Read__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2259:1: ( rule__Read__Group__5__Impl rule__Read__Group__6 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2260:2: rule__Read__Group__5__Impl rule__Read__Group__6
            {
            pushFollow(FOLLOW_rule__Read__Group__5__Impl_in_rule__Read__Group__54591);
            rule__Read__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Read__Group__6_in_rule__Read__Group__54594);
            rule__Read__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__5"


    // $ANTLR start "rule__Read__Group__5__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2267:1: rule__Read__Group__5__Impl : ( ( rule__Read__LocAssignment_5 ) ) ;
    public final void rule__Read__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2271:1: ( ( ( rule__Read__LocAssignment_5 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2272:1: ( ( rule__Read__LocAssignment_5 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2272:1: ( ( rule__Read__LocAssignment_5 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2273:1: ( rule__Read__LocAssignment_5 )
            {
             before(grammarAccess.getReadAccess().getLocAssignment_5()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2274:1: ( rule__Read__LocAssignment_5 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2274:2: rule__Read__LocAssignment_5
            {
            pushFollow(FOLLOW_rule__Read__LocAssignment_5_in_rule__Read__Group__5__Impl4621);
            rule__Read__LocAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getLocAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__5__Impl"


    // $ANTLR start "rule__Read__Group__6"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2284:1: rule__Read__Group__6 : rule__Read__Group__6__Impl ;
    public final void rule__Read__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2288:1: ( rule__Read__Group__6__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2289:2: rule__Read__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Read__Group__6__Impl_in_rule__Read__Group__64651);
            rule__Read__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__6"


    // $ANTLR start "rule__Read__Group__6__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2295:1: rule__Read__Group__6__Impl : ( ')' ) ;
    public final void rule__Read__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2299:1: ( ( ')' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2300:1: ( ')' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2300:1: ( ')' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2301:1: ')'
            {
             before(grammarAccess.getReadAccess().getRightParenthesisKeyword_6()); 
            match(input,27,FOLLOW_27_in_rule__Read__Group__6__Impl4679); 
             after(grammarAccess.getReadAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__6__Impl"


    // $ANTLR start "rule__Write__Group__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2328:1: rule__Write__Group__0 : rule__Write__Group__0__Impl rule__Write__Group__1 ;
    public final void rule__Write__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2332:1: ( rule__Write__Group__0__Impl rule__Write__Group__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2333:2: rule__Write__Group__0__Impl rule__Write__Group__1
            {
            pushFollow(FOLLOW_rule__Write__Group__0__Impl_in_rule__Write__Group__04724);
            rule__Write__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Write__Group__1_in_rule__Write__Group__04727);
            rule__Write__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__Group__0"


    // $ANTLR start "rule__Write__Group__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2340:1: rule__Write__Group__0__Impl : ( () ) ;
    public final void rule__Write__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2344:1: ( ( () ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2345:1: ( () )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2345:1: ( () )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2346:1: ()
            {
             before(grammarAccess.getWriteAccess().getWriteAction_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2347:1: ()
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2349:1: 
            {
            }

             after(grammarAccess.getWriteAccess().getWriteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__Group__0__Impl"


    // $ANTLR start "rule__Write__Group__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2359:1: rule__Write__Group__1 : rule__Write__Group__1__Impl rule__Write__Group__2 ;
    public final void rule__Write__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2363:1: ( rule__Write__Group__1__Impl rule__Write__Group__2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2364:2: rule__Write__Group__1__Impl rule__Write__Group__2
            {
            pushFollow(FOLLOW_rule__Write__Group__1__Impl_in_rule__Write__Group__14785);
            rule__Write__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Write__Group__2_in_rule__Write__Group__14788);
            rule__Write__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__Group__1"


    // $ANTLR start "rule__Write__Group__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2371:1: rule__Write__Group__1__Impl : ( 'wr' ) ;
    public final void rule__Write__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2375:1: ( ( 'wr' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2376:1: ( 'wr' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2376:1: ( 'wr' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2377:1: 'wr'
            {
             before(grammarAccess.getWriteAccess().getWrKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__Write__Group__1__Impl4816); 
             after(grammarAccess.getWriteAccess().getWrKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__Group__1__Impl"


    // $ANTLR start "rule__Write__Group__2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2390:1: rule__Write__Group__2 : rule__Write__Group__2__Impl rule__Write__Group__3 ;
    public final void rule__Write__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2394:1: ( rule__Write__Group__2__Impl rule__Write__Group__3 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2395:2: rule__Write__Group__2__Impl rule__Write__Group__3
            {
            pushFollow(FOLLOW_rule__Write__Group__2__Impl_in_rule__Write__Group__24847);
            rule__Write__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Write__Group__3_in_rule__Write__Group__24850);
            rule__Write__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__Group__2"


    // $ANTLR start "rule__Write__Group__2__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2402:1: rule__Write__Group__2__Impl : ( '(' ) ;
    public final void rule__Write__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2406:1: ( ( '(' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2407:1: ( '(' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2407:1: ( '(' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2408:1: '('
            {
             before(grammarAccess.getWriteAccess().getLeftParenthesisKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Write__Group__2__Impl4878); 
             after(grammarAccess.getWriteAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__Group__2__Impl"


    // $ANTLR start "rule__Write__Group__3"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2421:1: rule__Write__Group__3 : rule__Write__Group__3__Impl rule__Write__Group__4 ;
    public final void rule__Write__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2425:1: ( rule__Write__Group__3__Impl rule__Write__Group__4 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2426:2: rule__Write__Group__3__Impl rule__Write__Group__4
            {
            pushFollow(FOLLOW_rule__Write__Group__3__Impl_in_rule__Write__Group__34909);
            rule__Write__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Write__Group__4_in_rule__Write__Group__34912);
            rule__Write__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__Group__3"


    // $ANTLR start "rule__Write__Group__3__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2433:1: rule__Write__Group__3__Impl : ( ( rule__Write__LocAssignment_3 ) ) ;
    public final void rule__Write__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2437:1: ( ( ( rule__Write__LocAssignment_3 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2438:1: ( ( rule__Write__LocAssignment_3 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2438:1: ( ( rule__Write__LocAssignment_3 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2439:1: ( rule__Write__LocAssignment_3 )
            {
             before(grammarAccess.getWriteAccess().getLocAssignment_3()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2440:1: ( rule__Write__LocAssignment_3 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2440:2: rule__Write__LocAssignment_3
            {
            pushFollow(FOLLOW_rule__Write__LocAssignment_3_in_rule__Write__Group__3__Impl4939);
            rule__Write__LocAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWriteAccess().getLocAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__Group__3__Impl"


    // $ANTLR start "rule__Write__Group__4"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2450:1: rule__Write__Group__4 : rule__Write__Group__4__Impl rule__Write__Group__5 ;
    public final void rule__Write__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2454:1: ( rule__Write__Group__4__Impl rule__Write__Group__5 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2455:2: rule__Write__Group__4__Impl rule__Write__Group__5
            {
            pushFollow(FOLLOW_rule__Write__Group__4__Impl_in_rule__Write__Group__44969);
            rule__Write__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Write__Group__5_in_rule__Write__Group__44972);
            rule__Write__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__Group__4"


    // $ANTLR start "rule__Write__Group__4__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2462:1: rule__Write__Group__4__Impl : ( ',' ) ;
    public final void rule__Write__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2466:1: ( ( ',' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2467:1: ( ',' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2467:1: ( ',' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2468:1: ','
            {
             before(grammarAccess.getWriteAccess().getCommaKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__Write__Group__4__Impl5000); 
             after(grammarAccess.getWriteAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__Group__4__Impl"


    // $ANTLR start "rule__Write__Group__5"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2481:1: rule__Write__Group__5 : rule__Write__Group__5__Impl rule__Write__Group__6 ;
    public final void rule__Write__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2485:1: ( rule__Write__Group__5__Impl rule__Write__Group__6 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2486:2: rule__Write__Group__5__Impl rule__Write__Group__6
            {
            pushFollow(FOLLOW_rule__Write__Group__5__Impl_in_rule__Write__Group__55031);
            rule__Write__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Write__Group__6_in_rule__Write__Group__55034);
            rule__Write__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__Group__5"


    // $ANTLR start "rule__Write__Group__5__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2493:1: rule__Write__Group__5__Impl : ( ( rule__Write__ExpAssignment_5 ) ) ;
    public final void rule__Write__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2497:1: ( ( ( rule__Write__ExpAssignment_5 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2498:1: ( ( rule__Write__ExpAssignment_5 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2498:1: ( ( rule__Write__ExpAssignment_5 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2499:1: ( rule__Write__ExpAssignment_5 )
            {
             before(grammarAccess.getWriteAccess().getExpAssignment_5()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2500:1: ( rule__Write__ExpAssignment_5 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2500:2: rule__Write__ExpAssignment_5
            {
            pushFollow(FOLLOW_rule__Write__ExpAssignment_5_in_rule__Write__Group__5__Impl5061);
            rule__Write__ExpAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWriteAccess().getExpAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__Group__5__Impl"


    // $ANTLR start "rule__Write__Group__6"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2510:1: rule__Write__Group__6 : rule__Write__Group__6__Impl ;
    public final void rule__Write__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2514:1: ( rule__Write__Group__6__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2515:2: rule__Write__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Write__Group__6__Impl_in_rule__Write__Group__65091);
            rule__Write__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__Group__6"


    // $ANTLR start "rule__Write__Group__6__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2521:1: rule__Write__Group__6__Impl : ( ')' ) ;
    public final void rule__Write__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2525:1: ( ( ')' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2526:1: ( ')' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2526:1: ( ')' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2527:1: ')'
            {
             before(grammarAccess.getWriteAccess().getRightParenthesisKeyword_6()); 
            match(input,27,FOLLOW_27_in_rule__Write__Group__6__Impl5119); 
             after(grammarAccess.getWriteAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__Group__6__Impl"


    // $ANTLR start "rule__Barrier__Group__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2554:1: rule__Barrier__Group__0 : rule__Barrier__Group__0__Impl rule__Barrier__Group__1 ;
    public final void rule__Barrier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2558:1: ( rule__Barrier__Group__0__Impl rule__Barrier__Group__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2559:2: rule__Barrier__Group__0__Impl rule__Barrier__Group__1
            {
            pushFollow(FOLLOW_rule__Barrier__Group__0__Impl_in_rule__Barrier__Group__05164);
            rule__Barrier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Barrier__Group__1_in_rule__Barrier__Group__05167);
            rule__Barrier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__Group__0"


    // $ANTLR start "rule__Barrier__Group__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2566:1: rule__Barrier__Group__0__Impl : ( () ) ;
    public final void rule__Barrier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2570:1: ( ( () ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2571:1: ( () )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2571:1: ( () )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2572:1: ()
            {
             before(grammarAccess.getBarrierAccess().getBarrierAction_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2573:1: ()
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2575:1: 
            {
            }

             after(grammarAccess.getBarrierAccess().getBarrierAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__Group__0__Impl"


    // $ANTLR start "rule__Barrier__Group__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2585:1: rule__Barrier__Group__1 : rule__Barrier__Group__1__Impl ;
    public final void rule__Barrier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2589:1: ( rule__Barrier__Group__1__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2590:2: rule__Barrier__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Barrier__Group__1__Impl_in_rule__Barrier__Group__15225);
            rule__Barrier__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__Group__1"


    // $ANTLR start "rule__Barrier__Group__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2596:1: rule__Barrier__Group__1__Impl : ( 'barrier' ) ;
    public final void rule__Barrier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2600:1: ( ( 'barrier' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2601:1: ( 'barrier' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2601:1: ( 'barrier' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2602:1: 'barrier'
            {
             before(grammarAccess.getBarrierAccess().getBarrierKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Barrier__Group__1__Impl5253); 
             after(grammarAccess.getBarrierAccess().getBarrierKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Barrier__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2619:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2623:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2624:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__05288);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__05291);
            rule__Block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2631:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2635:1: ( ( () ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2636:1: ( () )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2636:1: ( () )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2637:1: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2638:1: ()
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2640:1: 
            {
            }

             after(grammarAccess.getBlockAccess().getBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2650:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2654:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2655:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__15349);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__2_in_rule__Block__Group__15352);
            rule__Block__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2662:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2666:1: ( ( '{' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2667:1: ( '{' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2667:1: ( '{' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2668:1: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Block__Group__1__Impl5380); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2681:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2685:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2686:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__25411);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__3_in_rule__Block__Group__25414);
            rule__Block__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2693:1: rule__Block__Group__2__Impl : ( ( ( rule__Block__Group_2__0 ) ) ( ( rule__Block__Group_2__0 )* ) ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2697:1: ( ( ( ( rule__Block__Group_2__0 ) ) ( ( rule__Block__Group_2__0 )* ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2698:1: ( ( ( rule__Block__Group_2__0 ) ) ( ( rule__Block__Group_2__0 )* ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2698:1: ( ( ( rule__Block__Group_2__0 ) ) ( ( rule__Block__Group_2__0 )* ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2699:1: ( ( rule__Block__Group_2__0 ) ) ( ( rule__Block__Group_2__0 )* )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2699:1: ( ( rule__Block__Group_2__0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2700:1: ( rule__Block__Group_2__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup_2()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2701:1: ( rule__Block__Group_2__0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2701:2: rule__Block__Group_2__0
            {
            pushFollow(FOLLOW_rule__Block__Group_2__0_in_rule__Block__Group__2__Impl5443);
            rule__Block__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup_2()); 

            }

            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2704:1: ( ( rule__Block__Group_2__0 )* )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2705:1: ( rule__Block__Group_2__0 )*
            {
             before(grammarAccess.getBlockAccess().getGroup_2()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2706:1: ( rule__Block__Group_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==19||LA8_0==21||LA8_0==24||LA8_0==30||(LA8_0>=32 && LA8_0<=33)||LA8_0==36||(LA8_0>=38 && LA8_0<=39)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2706:2: rule__Block__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Block__Group_2__0_in_rule__Block__Group__2__Impl5455);
            	    rule__Block__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getGroup_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2717:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2721:1: ( rule__Block__Group__3__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2722:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__35488);
            rule__Block__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2728:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2732:1: ( ( '}' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2733:1: ( '}' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2733:1: ( '}' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2734:1: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__Block__Group__3__Impl5516); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Block__Group_2__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2755:1: rule__Block__Group_2__0 : rule__Block__Group_2__0__Impl rule__Block__Group_2__1 ;
    public final void rule__Block__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2759:1: ( rule__Block__Group_2__0__Impl rule__Block__Group_2__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2760:2: rule__Block__Group_2__0__Impl rule__Block__Group_2__1
            {
            pushFollow(FOLLOW_rule__Block__Group_2__0__Impl_in_rule__Block__Group_2__05555);
            rule__Block__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group_2__1_in_rule__Block__Group_2__05558);
            rule__Block__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_2__0"


    // $ANTLR start "rule__Block__Group_2__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2767:1: rule__Block__Group_2__0__Impl : ( ( rule__Block__StatsAssignment_2_0 ) ) ;
    public final void rule__Block__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2771:1: ( ( ( rule__Block__StatsAssignment_2_0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2772:1: ( ( rule__Block__StatsAssignment_2_0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2772:1: ( ( rule__Block__StatsAssignment_2_0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2773:1: ( rule__Block__StatsAssignment_2_0 )
            {
             before(grammarAccess.getBlockAccess().getStatsAssignment_2_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2774:1: ( rule__Block__StatsAssignment_2_0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2774:2: rule__Block__StatsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Block__StatsAssignment_2_0_in_rule__Block__Group_2__0__Impl5585);
            rule__Block__StatsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getStatsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_2__0__Impl"


    // $ANTLR start "rule__Block__Group_2__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2784:1: rule__Block__Group_2__1 : rule__Block__Group_2__1__Impl ;
    public final void rule__Block__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2788:1: ( rule__Block__Group_2__1__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2789:2: rule__Block__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group_2__1__Impl_in_rule__Block__Group_2__15615);
            rule__Block__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_2__1"


    // $ANTLR start "rule__Block__Group_2__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2795:1: rule__Block__Group_2__1__Impl : ( ';' ) ;
    public final void rule__Block__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2799:1: ( ( ';' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2800:1: ( ';' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2800:1: ( ';' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2801:1: ';'
            {
             before(grammarAccess.getBlockAccess().getSemicolonKeyword_2_1()); 
            match(input,35,FOLLOW_35_in_rule__Block__Group_2__1__Impl5643); 
             after(grammarAccess.getBlockAccess().getSemicolonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_2__1__Impl"


    // $ANTLR start "rule__LSwitch__Group__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2818:1: rule__LSwitch__Group__0 : rule__LSwitch__Group__0__Impl rule__LSwitch__Group__1 ;
    public final void rule__LSwitch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2822:1: ( rule__LSwitch__Group__0__Impl rule__LSwitch__Group__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2823:2: rule__LSwitch__Group__0__Impl rule__LSwitch__Group__1
            {
            pushFollow(FOLLOW_rule__LSwitch__Group__0__Impl_in_rule__LSwitch__Group__05678);
            rule__LSwitch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LSwitch__Group__1_in_rule__LSwitch__Group__05681);
            rule__LSwitch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LSwitch__Group__0"


    // $ANTLR start "rule__LSwitch__Group__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2830:1: rule__LSwitch__Group__0__Impl : ( () ) ;
    public final void rule__LSwitch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2834:1: ( ( () ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2835:1: ( () )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2835:1: ( () )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2836:1: ()
            {
             before(grammarAccess.getLSwitchAccess().getLSwitchAction_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2837:1: ()
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2839:1: 
            {
            }

             after(grammarAccess.getLSwitchAccess().getLSwitchAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LSwitch__Group__0__Impl"


    // $ANTLR start "rule__LSwitch__Group__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2849:1: rule__LSwitch__Group__1 : rule__LSwitch__Group__1__Impl rule__LSwitch__Group__2 ;
    public final void rule__LSwitch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2853:1: ( rule__LSwitch__Group__1__Impl rule__LSwitch__Group__2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2854:2: rule__LSwitch__Group__1__Impl rule__LSwitch__Group__2
            {
            pushFollow(FOLLOW_rule__LSwitch__Group__1__Impl_in_rule__LSwitch__Group__15739);
            rule__LSwitch__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LSwitch__Group__2_in_rule__LSwitch__Group__15742);
            rule__LSwitch__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LSwitch__Group__1"


    // $ANTLR start "rule__LSwitch__Group__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2861:1: rule__LSwitch__Group__1__Impl : ( 'lswitch' ) ;
    public final void rule__LSwitch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2865:1: ( ( 'lswitch' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2866:1: ( 'lswitch' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2866:1: ( 'lswitch' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2867:1: 'lswitch'
            {
             before(grammarAccess.getLSwitchAccess().getLswitchKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__LSwitch__Group__1__Impl5770); 
             after(grammarAccess.getLSwitchAccess().getLswitchKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LSwitch__Group__1__Impl"


    // $ANTLR start "rule__LSwitch__Group__2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2880:1: rule__LSwitch__Group__2 : rule__LSwitch__Group__2__Impl ;
    public final void rule__LSwitch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2884:1: ( rule__LSwitch__Group__2__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2885:2: rule__LSwitch__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LSwitch__Group__2__Impl_in_rule__LSwitch__Group__25801);
            rule__LSwitch__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LSwitch__Group__2"


    // $ANTLR start "rule__LSwitch__Group__2__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2891:1: rule__LSwitch__Group__2__Impl : ( ( ( rule__LSwitch__Group_2__0 ) ) ( ( rule__LSwitch__Group_2__0 )* ) ) ;
    public final void rule__LSwitch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2895:1: ( ( ( ( rule__LSwitch__Group_2__0 ) ) ( ( rule__LSwitch__Group_2__0 )* ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2896:1: ( ( ( rule__LSwitch__Group_2__0 ) ) ( ( rule__LSwitch__Group_2__0 )* ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2896:1: ( ( ( rule__LSwitch__Group_2__0 ) ) ( ( rule__LSwitch__Group_2__0 )* ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2897:1: ( ( rule__LSwitch__Group_2__0 ) ) ( ( rule__LSwitch__Group_2__0 )* )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2897:1: ( ( rule__LSwitch__Group_2__0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2898:1: ( rule__LSwitch__Group_2__0 )
            {
             before(grammarAccess.getLSwitchAccess().getGroup_2()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2899:1: ( rule__LSwitch__Group_2__0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2899:2: rule__LSwitch__Group_2__0
            {
            pushFollow(FOLLOW_rule__LSwitch__Group_2__0_in_rule__LSwitch__Group__2__Impl5830);
            rule__LSwitch__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getLSwitchAccess().getGroup_2()); 

            }

            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2902:1: ( ( rule__LSwitch__Group_2__0 )* )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2903:1: ( rule__LSwitch__Group_2__0 )*
            {
             before(grammarAccess.getLSwitchAccess().getGroup_2()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2904:1: ( rule__LSwitch__Group_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_INT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2904:2: rule__LSwitch__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__LSwitch__Group_2__0_in_rule__LSwitch__Group__2__Impl5842);
            	    rule__LSwitch__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getLSwitchAccess().getGroup_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LSwitch__Group__2__Impl"


    // $ANTLR start "rule__LSwitch__Group_2__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2921:1: rule__LSwitch__Group_2__0 : rule__LSwitch__Group_2__0__Impl rule__LSwitch__Group_2__1 ;
    public final void rule__LSwitch__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2925:1: ( rule__LSwitch__Group_2__0__Impl rule__LSwitch__Group_2__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2926:2: rule__LSwitch__Group_2__0__Impl rule__LSwitch__Group_2__1
            {
            pushFollow(FOLLOW_rule__LSwitch__Group_2__0__Impl_in_rule__LSwitch__Group_2__05881);
            rule__LSwitch__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LSwitch__Group_2__1_in_rule__LSwitch__Group_2__05884);
            rule__LSwitch__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LSwitch__Group_2__0"


    // $ANTLR start "rule__LSwitch__Group_2__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2933:1: rule__LSwitch__Group_2__0__Impl : ( ( rule__LSwitch__CasesAssignment_2_0 ) ) ;
    public final void rule__LSwitch__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2937:1: ( ( ( rule__LSwitch__CasesAssignment_2_0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2938:1: ( ( rule__LSwitch__CasesAssignment_2_0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2938:1: ( ( rule__LSwitch__CasesAssignment_2_0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2939:1: ( rule__LSwitch__CasesAssignment_2_0 )
            {
             before(grammarAccess.getLSwitchAccess().getCasesAssignment_2_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2940:1: ( rule__LSwitch__CasesAssignment_2_0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2940:2: rule__LSwitch__CasesAssignment_2_0
            {
            pushFollow(FOLLOW_rule__LSwitch__CasesAssignment_2_0_in_rule__LSwitch__Group_2__0__Impl5911);
            rule__LSwitch__CasesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getLSwitchAccess().getCasesAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LSwitch__Group_2__0__Impl"


    // $ANTLR start "rule__LSwitch__Group_2__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2950:1: rule__LSwitch__Group_2__1 : rule__LSwitch__Group_2__1__Impl rule__LSwitch__Group_2__2 ;
    public final void rule__LSwitch__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2954:1: ( rule__LSwitch__Group_2__1__Impl rule__LSwitch__Group_2__2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2955:2: rule__LSwitch__Group_2__1__Impl rule__LSwitch__Group_2__2
            {
            pushFollow(FOLLOW_rule__LSwitch__Group_2__1__Impl_in_rule__LSwitch__Group_2__15941);
            rule__LSwitch__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LSwitch__Group_2__2_in_rule__LSwitch__Group_2__15944);
            rule__LSwitch__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LSwitch__Group_2__1"


    // $ANTLR start "rule__LSwitch__Group_2__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2962:1: rule__LSwitch__Group_2__1__Impl : ( ':' ) ;
    public final void rule__LSwitch__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2966:1: ( ( ':' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2967:1: ( ':' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2967:1: ( ':' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2968:1: ':'
            {
             before(grammarAccess.getLSwitchAccess().getColonKeyword_2_1()); 
            match(input,37,FOLLOW_37_in_rule__LSwitch__Group_2__1__Impl5972); 
             after(grammarAccess.getLSwitchAccess().getColonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LSwitch__Group_2__1__Impl"


    // $ANTLR start "rule__LSwitch__Group_2__2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2981:1: rule__LSwitch__Group_2__2 : rule__LSwitch__Group_2__2__Impl ;
    public final void rule__LSwitch__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2985:1: ( rule__LSwitch__Group_2__2__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2986:2: rule__LSwitch__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__LSwitch__Group_2__2__Impl_in_rule__LSwitch__Group_2__26003);
            rule__LSwitch__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LSwitch__Group_2__2"


    // $ANTLR start "rule__LSwitch__Group_2__2__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2992:1: rule__LSwitch__Group_2__2__Impl : ( ( rule__LSwitch__StatsAssignment_2_2 ) ) ;
    public final void rule__LSwitch__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2996:1: ( ( ( rule__LSwitch__StatsAssignment_2_2 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2997:1: ( ( rule__LSwitch__StatsAssignment_2_2 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2997:1: ( ( rule__LSwitch__StatsAssignment_2_2 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2998:1: ( rule__LSwitch__StatsAssignment_2_2 )
            {
             before(grammarAccess.getLSwitchAccess().getStatsAssignment_2_2()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2999:1: ( rule__LSwitch__StatsAssignment_2_2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:2999:2: rule__LSwitch__StatsAssignment_2_2
            {
            pushFollow(FOLLOW_rule__LSwitch__StatsAssignment_2_2_in_rule__LSwitch__Group_2__2__Impl6030);
            rule__LSwitch__StatsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getLSwitchAccess().getStatsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LSwitch__Group_2__2__Impl"


    // $ANTLR start "rule__GSwitch__Group__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3015:1: rule__GSwitch__Group__0 : rule__GSwitch__Group__0__Impl rule__GSwitch__Group__1 ;
    public final void rule__GSwitch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3019:1: ( rule__GSwitch__Group__0__Impl rule__GSwitch__Group__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3020:2: rule__GSwitch__Group__0__Impl rule__GSwitch__Group__1
            {
            pushFollow(FOLLOW_rule__GSwitch__Group__0__Impl_in_rule__GSwitch__Group__06066);
            rule__GSwitch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GSwitch__Group__1_in_rule__GSwitch__Group__06069);
            rule__GSwitch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSwitch__Group__0"


    // $ANTLR start "rule__GSwitch__Group__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3027:1: rule__GSwitch__Group__0__Impl : ( () ) ;
    public final void rule__GSwitch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3031:1: ( ( () ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3032:1: ( () )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3032:1: ( () )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3033:1: ()
            {
             before(grammarAccess.getGSwitchAccess().getGSwitchAction_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3034:1: ()
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3036:1: 
            {
            }

             after(grammarAccess.getGSwitchAccess().getGSwitchAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSwitch__Group__0__Impl"


    // $ANTLR start "rule__GSwitch__Group__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3046:1: rule__GSwitch__Group__1 : rule__GSwitch__Group__1__Impl rule__GSwitch__Group__2 ;
    public final void rule__GSwitch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3050:1: ( rule__GSwitch__Group__1__Impl rule__GSwitch__Group__2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3051:2: rule__GSwitch__Group__1__Impl rule__GSwitch__Group__2
            {
            pushFollow(FOLLOW_rule__GSwitch__Group__1__Impl_in_rule__GSwitch__Group__16127);
            rule__GSwitch__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GSwitch__Group__2_in_rule__GSwitch__Group__16130);
            rule__GSwitch__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSwitch__Group__1"


    // $ANTLR start "rule__GSwitch__Group__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3058:1: rule__GSwitch__Group__1__Impl : ( 'gswitch' ) ;
    public final void rule__GSwitch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3062:1: ( ( 'gswitch' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3063:1: ( 'gswitch' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3063:1: ( 'gswitch' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3064:1: 'gswitch'
            {
             before(grammarAccess.getGSwitchAccess().getGswitchKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__GSwitch__Group__1__Impl6158); 
             after(grammarAccess.getGSwitchAccess().getGswitchKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSwitch__Group__1__Impl"


    // $ANTLR start "rule__GSwitch__Group__2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3077:1: rule__GSwitch__Group__2 : rule__GSwitch__Group__2__Impl ;
    public final void rule__GSwitch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3081:1: ( rule__GSwitch__Group__2__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3082:2: rule__GSwitch__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__GSwitch__Group__2__Impl_in_rule__GSwitch__Group__26189);
            rule__GSwitch__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSwitch__Group__2"


    // $ANTLR start "rule__GSwitch__Group__2__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3088:1: rule__GSwitch__Group__2__Impl : ( ( ( rule__GSwitch__Group_2__0 ) ) ( ( rule__GSwitch__Group_2__0 )* ) ) ;
    public final void rule__GSwitch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3092:1: ( ( ( ( rule__GSwitch__Group_2__0 ) ) ( ( rule__GSwitch__Group_2__0 )* ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3093:1: ( ( ( rule__GSwitch__Group_2__0 ) ) ( ( rule__GSwitch__Group_2__0 )* ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3093:1: ( ( ( rule__GSwitch__Group_2__0 ) ) ( ( rule__GSwitch__Group_2__0 )* ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3094:1: ( ( rule__GSwitch__Group_2__0 ) ) ( ( rule__GSwitch__Group_2__0 )* )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3094:1: ( ( rule__GSwitch__Group_2__0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3095:1: ( rule__GSwitch__Group_2__0 )
            {
             before(grammarAccess.getGSwitchAccess().getGroup_2()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3096:1: ( rule__GSwitch__Group_2__0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3096:2: rule__GSwitch__Group_2__0
            {
            pushFollow(FOLLOW_rule__GSwitch__Group_2__0_in_rule__GSwitch__Group__2__Impl6218);
            rule__GSwitch__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getGSwitchAccess().getGroup_2()); 

            }

            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3099:1: ( ( rule__GSwitch__Group_2__0 )* )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3100:1: ( rule__GSwitch__Group_2__0 )*
            {
             before(grammarAccess.getGSwitchAccess().getGroup_2()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3101:1: ( rule__GSwitch__Group_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_INT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3101:2: rule__GSwitch__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__GSwitch__Group_2__0_in_rule__GSwitch__Group__2__Impl6230);
            	    rule__GSwitch__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getGSwitchAccess().getGroup_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSwitch__Group__2__Impl"


    // $ANTLR start "rule__GSwitch__Group_2__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3118:1: rule__GSwitch__Group_2__0 : rule__GSwitch__Group_2__0__Impl rule__GSwitch__Group_2__1 ;
    public final void rule__GSwitch__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3122:1: ( rule__GSwitch__Group_2__0__Impl rule__GSwitch__Group_2__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3123:2: rule__GSwitch__Group_2__0__Impl rule__GSwitch__Group_2__1
            {
            pushFollow(FOLLOW_rule__GSwitch__Group_2__0__Impl_in_rule__GSwitch__Group_2__06269);
            rule__GSwitch__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GSwitch__Group_2__1_in_rule__GSwitch__Group_2__06272);
            rule__GSwitch__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSwitch__Group_2__0"


    // $ANTLR start "rule__GSwitch__Group_2__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3130:1: rule__GSwitch__Group_2__0__Impl : ( ( rule__GSwitch__CasesAssignment_2_0 ) ) ;
    public final void rule__GSwitch__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3134:1: ( ( ( rule__GSwitch__CasesAssignment_2_0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3135:1: ( ( rule__GSwitch__CasesAssignment_2_0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3135:1: ( ( rule__GSwitch__CasesAssignment_2_0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3136:1: ( rule__GSwitch__CasesAssignment_2_0 )
            {
             before(grammarAccess.getGSwitchAccess().getCasesAssignment_2_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3137:1: ( rule__GSwitch__CasesAssignment_2_0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3137:2: rule__GSwitch__CasesAssignment_2_0
            {
            pushFollow(FOLLOW_rule__GSwitch__CasesAssignment_2_0_in_rule__GSwitch__Group_2__0__Impl6299);
            rule__GSwitch__CasesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getGSwitchAccess().getCasesAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSwitch__Group_2__0__Impl"


    // $ANTLR start "rule__GSwitch__Group_2__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3147:1: rule__GSwitch__Group_2__1 : rule__GSwitch__Group_2__1__Impl rule__GSwitch__Group_2__2 ;
    public final void rule__GSwitch__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3151:1: ( rule__GSwitch__Group_2__1__Impl rule__GSwitch__Group_2__2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3152:2: rule__GSwitch__Group_2__1__Impl rule__GSwitch__Group_2__2
            {
            pushFollow(FOLLOW_rule__GSwitch__Group_2__1__Impl_in_rule__GSwitch__Group_2__16329);
            rule__GSwitch__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GSwitch__Group_2__2_in_rule__GSwitch__Group_2__16332);
            rule__GSwitch__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSwitch__Group_2__1"


    // $ANTLR start "rule__GSwitch__Group_2__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3159:1: rule__GSwitch__Group_2__1__Impl : ( ':' ) ;
    public final void rule__GSwitch__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3163:1: ( ( ':' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3164:1: ( ':' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3164:1: ( ':' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3165:1: ':'
            {
             before(grammarAccess.getGSwitchAccess().getColonKeyword_2_1()); 
            match(input,37,FOLLOW_37_in_rule__GSwitch__Group_2__1__Impl6360); 
             after(grammarAccess.getGSwitchAccess().getColonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSwitch__Group_2__1__Impl"


    // $ANTLR start "rule__GSwitch__Group_2__2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3178:1: rule__GSwitch__Group_2__2 : rule__GSwitch__Group_2__2__Impl ;
    public final void rule__GSwitch__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3182:1: ( rule__GSwitch__Group_2__2__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3183:2: rule__GSwitch__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__GSwitch__Group_2__2__Impl_in_rule__GSwitch__Group_2__26391);
            rule__GSwitch__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSwitch__Group_2__2"


    // $ANTLR start "rule__GSwitch__Group_2__2__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3189:1: rule__GSwitch__Group_2__2__Impl : ( ( rule__GSwitch__StatsAssignment_2_2 ) ) ;
    public final void rule__GSwitch__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3193:1: ( ( ( rule__GSwitch__StatsAssignment_2_2 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3194:1: ( ( rule__GSwitch__StatsAssignment_2_2 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3194:1: ( ( rule__GSwitch__StatsAssignment_2_2 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3195:1: ( rule__GSwitch__StatsAssignment_2_2 )
            {
             before(grammarAccess.getGSwitchAccess().getStatsAssignment_2_2()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3196:1: ( rule__GSwitch__StatsAssignment_2_2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3196:2: rule__GSwitch__StatsAssignment_2_2
            {
            pushFollow(FOLLOW_rule__GSwitch__StatsAssignment_2_2_in_rule__GSwitch__Group_2__2__Impl6418);
            rule__GSwitch__StatsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getGSwitchAccess().getStatsAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSwitch__Group_2__2__Impl"


    // $ANTLR start "rule__Skip__Group__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3212:1: rule__Skip__Group__0 : rule__Skip__Group__0__Impl rule__Skip__Group__1 ;
    public final void rule__Skip__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3216:1: ( rule__Skip__Group__0__Impl rule__Skip__Group__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3217:2: rule__Skip__Group__0__Impl rule__Skip__Group__1
            {
            pushFollow(FOLLOW_rule__Skip__Group__0__Impl_in_rule__Skip__Group__06454);
            rule__Skip__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Skip__Group__1_in_rule__Skip__Group__06457);
            rule__Skip__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skip__Group__0"


    // $ANTLR start "rule__Skip__Group__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3224:1: rule__Skip__Group__0__Impl : ( () ) ;
    public final void rule__Skip__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3228:1: ( ( () ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3229:1: ( () )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3229:1: ( () )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3230:1: ()
            {
             before(grammarAccess.getSkipAccess().getSkipAction_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3231:1: ()
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3233:1: 
            {
            }

             after(grammarAccess.getSkipAccess().getSkipAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skip__Group__0__Impl"


    // $ANTLR start "rule__Skip__Group__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3243:1: rule__Skip__Group__1 : rule__Skip__Group__1__Impl ;
    public final void rule__Skip__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3247:1: ( rule__Skip__Group__1__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3248:2: rule__Skip__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Skip__Group__1__Impl_in_rule__Skip__Group__16515);
            rule__Skip__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skip__Group__1"


    // $ANTLR start "rule__Skip__Group__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3254:1: rule__Skip__Group__1__Impl : ( 'skip' ) ;
    public final void rule__Skip__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3258:1: ( ( 'skip' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3259:1: ( 'skip' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3259:1: ( 'skip' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3260:1: 'skip'
            {
             before(grammarAccess.getSkipAccess().getSkipKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__Skip__Group__1__Impl6543); 
             after(grammarAccess.getSkipAccess().getSkipKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skip__Group__1__Impl"


    // $ANTLR start "rule__Add__Group_1__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3277:1: rule__Add__Group_1__0 : rule__Add__Group_1__0__Impl rule__Add__Group_1__1 ;
    public final void rule__Add__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3281:1: ( rule__Add__Group_1__0__Impl rule__Add__Group_1__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3282:2: rule__Add__Group_1__0__Impl rule__Add__Group_1__1
            {
            pushFollow(FOLLOW_rule__Add__Group_1__0__Impl_in_rule__Add__Group_1__06578);
            rule__Add__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Add__Group_1__1_in_rule__Add__Group_1__06581);
            rule__Add__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_1__0"


    // $ANTLR start "rule__Add__Group_1__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3289:1: rule__Add__Group_1__0__Impl : ( () ) ;
    public final void rule__Add__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3293:1: ( ( () ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3294:1: ( () )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3294:1: ( () )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3295:1: ()
            {
             before(grammarAccess.getAddAccess().getBinaryExprAction_1_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3296:1: ()
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3298:1: 
            {
            }

             after(grammarAccess.getAddAccess().getBinaryExprAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_1__0__Impl"


    // $ANTLR start "rule__Add__Group_1__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3308:1: rule__Add__Group_1__1 : rule__Add__Group_1__1__Impl ;
    public final void rule__Add__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3312:1: ( rule__Add__Group_1__1__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3313:2: rule__Add__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Add__Group_1__1__Impl_in_rule__Add__Group_1__16639);
            rule__Add__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_1__1"


    // $ANTLR start "rule__Add__Group_1__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3319:1: rule__Add__Group_1__1__Impl : ( ( rule__Add__Group_1_1__0 )* ) ;
    public final void rule__Add__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3323:1: ( ( ( rule__Add__Group_1_1__0 )* ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3324:1: ( ( rule__Add__Group_1_1__0 )* )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3324:1: ( ( rule__Add__Group_1_1__0 )* )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3325:1: ( rule__Add__Group_1_1__0 )*
            {
             before(grammarAccess.getAddAccess().getGroup_1_1()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3326:1: ( rule__Add__Group_1_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=11 && LA11_0<=12)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3326:2: rule__Add__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Add__Group_1_1__0_in_rule__Add__Group_1__1__Impl6666);
            	    rule__Add__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAddAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_1__1__Impl"


    // $ANTLR start "rule__Add__Group_1_1__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3340:1: rule__Add__Group_1_1__0 : rule__Add__Group_1_1__0__Impl rule__Add__Group_1_1__1 ;
    public final void rule__Add__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3344:1: ( rule__Add__Group_1_1__0__Impl rule__Add__Group_1_1__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3345:2: rule__Add__Group_1_1__0__Impl rule__Add__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Add__Group_1_1__0__Impl_in_rule__Add__Group_1_1__06701);
            rule__Add__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Add__Group_1_1__1_in_rule__Add__Group_1_1__06704);
            rule__Add__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_1_1__0"


    // $ANTLR start "rule__Add__Group_1_1__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3352:1: rule__Add__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Add__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3356:1: ( ( () ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3357:1: ( () )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3357:1: ( () )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3358:1: ()
            {
             before(grammarAccess.getAddAccess().getBinaryExprLeftAction_1_1_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3359:1: ()
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3361:1: 
            {
            }

             after(grammarAccess.getAddAccess().getBinaryExprLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_1_1__0__Impl"


    // $ANTLR start "rule__Add__Group_1_1__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3371:1: rule__Add__Group_1_1__1 : rule__Add__Group_1_1__1__Impl rule__Add__Group_1_1__2 ;
    public final void rule__Add__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3375:1: ( rule__Add__Group_1_1__1__Impl rule__Add__Group_1_1__2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3376:2: rule__Add__Group_1_1__1__Impl rule__Add__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Add__Group_1_1__1__Impl_in_rule__Add__Group_1_1__16762);
            rule__Add__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Add__Group_1_1__2_in_rule__Add__Group_1_1__16765);
            rule__Add__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_1_1__1"


    // $ANTLR start "rule__Add__Group_1_1__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3383:1: rule__Add__Group_1_1__1__Impl : ( ( rule__Add__OpAssignment_1_1_1 ) ) ;
    public final void rule__Add__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3387:1: ( ( ( rule__Add__OpAssignment_1_1_1 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3388:1: ( ( rule__Add__OpAssignment_1_1_1 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3388:1: ( ( rule__Add__OpAssignment_1_1_1 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3389:1: ( rule__Add__OpAssignment_1_1_1 )
            {
             before(grammarAccess.getAddAccess().getOpAssignment_1_1_1()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3390:1: ( rule__Add__OpAssignment_1_1_1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3390:2: rule__Add__OpAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Add__OpAssignment_1_1_1_in_rule__Add__Group_1_1__1__Impl6792);
            rule__Add__OpAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getOpAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_1_1__1__Impl"


    // $ANTLR start "rule__Add__Group_1_1__2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3400:1: rule__Add__Group_1_1__2 : rule__Add__Group_1_1__2__Impl ;
    public final void rule__Add__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3404:1: ( rule__Add__Group_1_1__2__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3405:2: rule__Add__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Add__Group_1_1__2__Impl_in_rule__Add__Group_1_1__26822);
            rule__Add__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_1_1__2"


    // $ANTLR start "rule__Add__Group_1_1__2__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3411:1: rule__Add__Group_1_1__2__Impl : ( ( rule__Add__RightAssignment_1_1_2 ) ) ;
    public final void rule__Add__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3415:1: ( ( ( rule__Add__RightAssignment_1_1_2 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3416:1: ( ( rule__Add__RightAssignment_1_1_2 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3416:1: ( ( rule__Add__RightAssignment_1_1_2 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3417:1: ( rule__Add__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getAddAccess().getRightAssignment_1_1_2()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3418:1: ( rule__Add__RightAssignment_1_1_2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3418:2: rule__Add__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_rule__Add__RightAssignment_1_1_2_in_rule__Add__Group_1_1__2__Impl6849);
            rule__Add__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_1_1__2__Impl"


    // $ANTLR start "rule__Mul__Group_1__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3434:1: rule__Mul__Group_1__0 : rule__Mul__Group_1__0__Impl rule__Mul__Group_1__1 ;
    public final void rule__Mul__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3438:1: ( rule__Mul__Group_1__0__Impl rule__Mul__Group_1__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3439:2: rule__Mul__Group_1__0__Impl rule__Mul__Group_1__1
            {
            pushFollow(FOLLOW_rule__Mul__Group_1__0__Impl_in_rule__Mul__Group_1__06885);
            rule__Mul__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mul__Group_1__1_in_rule__Mul__Group_1__06888);
            rule__Mul__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mul__Group_1__0"


    // $ANTLR start "rule__Mul__Group_1__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3446:1: rule__Mul__Group_1__0__Impl : ( () ) ;
    public final void rule__Mul__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3450:1: ( ( () ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3451:1: ( () )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3451:1: ( () )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3452:1: ()
            {
             before(grammarAccess.getMulAccess().getBinaryExprAction_1_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3453:1: ()
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3455:1: 
            {
            }

             after(grammarAccess.getMulAccess().getBinaryExprAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mul__Group_1__0__Impl"


    // $ANTLR start "rule__Mul__Group_1__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3465:1: rule__Mul__Group_1__1 : rule__Mul__Group_1__1__Impl ;
    public final void rule__Mul__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3469:1: ( rule__Mul__Group_1__1__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3470:2: rule__Mul__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Mul__Group_1__1__Impl_in_rule__Mul__Group_1__16946);
            rule__Mul__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mul__Group_1__1"


    // $ANTLR start "rule__Mul__Group_1__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3476:1: rule__Mul__Group_1__1__Impl : ( ( rule__Mul__Group_1_1__0 )* ) ;
    public final void rule__Mul__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3480:1: ( ( ( rule__Mul__Group_1_1__0 )* ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3481:1: ( ( rule__Mul__Group_1_1__0 )* )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3481:1: ( ( rule__Mul__Group_1_1__0 )* )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3482:1: ( rule__Mul__Group_1_1__0 )*
            {
             before(grammarAccess.getMulAccess().getGroup_1_1()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3483:1: ( rule__Mul__Group_1_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=13 && LA12_0<=14)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3483:2: rule__Mul__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Mul__Group_1_1__0_in_rule__Mul__Group_1__1__Impl6973);
            	    rule__Mul__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMulAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mul__Group_1__1__Impl"


    // $ANTLR start "rule__Mul__Group_1_1__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3497:1: rule__Mul__Group_1_1__0 : rule__Mul__Group_1_1__0__Impl rule__Mul__Group_1_1__1 ;
    public final void rule__Mul__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3501:1: ( rule__Mul__Group_1_1__0__Impl rule__Mul__Group_1_1__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3502:2: rule__Mul__Group_1_1__0__Impl rule__Mul__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Mul__Group_1_1__0__Impl_in_rule__Mul__Group_1_1__07008);
            rule__Mul__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mul__Group_1_1__1_in_rule__Mul__Group_1_1__07011);
            rule__Mul__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mul__Group_1_1__0"


    // $ANTLR start "rule__Mul__Group_1_1__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3509:1: rule__Mul__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Mul__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3513:1: ( ( () ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3514:1: ( () )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3514:1: ( () )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3515:1: ()
            {
             before(grammarAccess.getMulAccess().getBinaryExprLeftAction_1_1_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3516:1: ()
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3518:1: 
            {
            }

             after(grammarAccess.getMulAccess().getBinaryExprLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mul__Group_1_1__0__Impl"


    // $ANTLR start "rule__Mul__Group_1_1__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3528:1: rule__Mul__Group_1_1__1 : rule__Mul__Group_1_1__1__Impl rule__Mul__Group_1_1__2 ;
    public final void rule__Mul__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3532:1: ( rule__Mul__Group_1_1__1__Impl rule__Mul__Group_1_1__2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3533:2: rule__Mul__Group_1_1__1__Impl rule__Mul__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__Mul__Group_1_1__1__Impl_in_rule__Mul__Group_1_1__17069);
            rule__Mul__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mul__Group_1_1__2_in_rule__Mul__Group_1_1__17072);
            rule__Mul__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mul__Group_1_1__1"


    // $ANTLR start "rule__Mul__Group_1_1__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3540:1: rule__Mul__Group_1_1__1__Impl : ( ( rule__Mul__OpAssignment_1_1_1 ) ) ;
    public final void rule__Mul__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3544:1: ( ( ( rule__Mul__OpAssignment_1_1_1 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3545:1: ( ( rule__Mul__OpAssignment_1_1_1 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3545:1: ( ( rule__Mul__OpAssignment_1_1_1 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3546:1: ( rule__Mul__OpAssignment_1_1_1 )
            {
             before(grammarAccess.getMulAccess().getOpAssignment_1_1_1()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3547:1: ( rule__Mul__OpAssignment_1_1_1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3547:2: rule__Mul__OpAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Mul__OpAssignment_1_1_1_in_rule__Mul__Group_1_1__1__Impl7099);
            rule__Mul__OpAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMulAccess().getOpAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mul__Group_1_1__1__Impl"


    // $ANTLR start "rule__Mul__Group_1_1__2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3557:1: rule__Mul__Group_1_1__2 : rule__Mul__Group_1_1__2__Impl ;
    public final void rule__Mul__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3561:1: ( rule__Mul__Group_1_1__2__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3562:2: rule__Mul__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Mul__Group_1_1__2__Impl_in_rule__Mul__Group_1_1__27129);
            rule__Mul__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mul__Group_1_1__2"


    // $ANTLR start "rule__Mul__Group_1_1__2__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3568:1: rule__Mul__Group_1_1__2__Impl : ( ( rule__Mul__RightAssignment_1_1_2 ) ) ;
    public final void rule__Mul__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3572:1: ( ( ( rule__Mul__RightAssignment_1_1_2 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3573:1: ( ( rule__Mul__RightAssignment_1_1_2 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3573:1: ( ( rule__Mul__RightAssignment_1_1_2 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3574:1: ( rule__Mul__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getMulAccess().getRightAssignment_1_1_2()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3575:1: ( rule__Mul__RightAssignment_1_1_2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3575:2: rule__Mul__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_rule__Mul__RightAssignment_1_1_2_in_rule__Mul__Group_1_1__2__Impl7156);
            rule__Mul__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMulAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mul__Group_1_1__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3591:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3595:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3596:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__07192);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__07195);
            rule__PrimaryExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3603:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3607:1: ( ( '(' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3608:1: ( '(' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3608:1: ( '(' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3609:1: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,26,FOLLOW_26_in_rule__PrimaryExpression__Group_0__0__Impl7223); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3622:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3626:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3627:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__17254);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__17257);
            rule__PrimaryExpression__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3634:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3638:1: ( ( ruleExpression ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3639:1: ( ruleExpression )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3639:1: ( ruleExpression )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3640:1: ruleExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__PrimaryExpression__Group_0__1__Impl7284);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3651:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3655:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3656:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__27313);
            rule__PrimaryExpression__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3662:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3666:1: ( ( ')' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3667:1: ( ')' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3667:1: ( ')' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3668:1: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,27,FOLLOW_27_in_rule__PrimaryExpression__Group_0__2__Impl7341); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__Var__Group__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3687:1: rule__Var__Group__0 : rule__Var__Group__0__Impl rule__Var__Group__1 ;
    public final void rule__Var__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3691:1: ( rule__Var__Group__0__Impl rule__Var__Group__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3692:2: rule__Var__Group__0__Impl rule__Var__Group__1
            {
            pushFollow(FOLLOW_rule__Var__Group__0__Impl_in_rule__Var__Group__07378);
            rule__Var__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Var__Group__1_in_rule__Var__Group__07381);
            rule__Var__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group__0"


    // $ANTLR start "rule__Var__Group__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3699:1: rule__Var__Group__0__Impl : ( () ) ;
    public final void rule__Var__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3703:1: ( ( () ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3704:1: ( () )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3704:1: ( () )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3705:1: ()
            {
             before(grammarAccess.getVarAccess().getVarAction_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3706:1: ()
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3708:1: 
            {
            }

             after(grammarAccess.getVarAccess().getVarAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group__0__Impl"


    // $ANTLR start "rule__Var__Group__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3718:1: rule__Var__Group__1 : rule__Var__Group__1__Impl ;
    public final void rule__Var__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3722:1: ( rule__Var__Group__1__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3723:2: rule__Var__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Var__Group__1__Impl_in_rule__Var__Group__17439);
            rule__Var__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group__1"


    // $ANTLR start "rule__Var__Group__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3729:1: rule__Var__Group__1__Impl : ( ( rule__Var__NameAssignment_1 ) ) ;
    public final void rule__Var__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3733:1: ( ( ( rule__Var__NameAssignment_1 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3734:1: ( ( rule__Var__NameAssignment_1 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3734:1: ( ( rule__Var__NameAssignment_1 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3735:1: ( rule__Var__NameAssignment_1 )
            {
             before(grammarAccess.getVarAccess().getNameAssignment_1()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3736:1: ( rule__Var__NameAssignment_1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3736:2: rule__Var__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Var__NameAssignment_1_in_rule__Var__Group__1__Impl7466);
            rule__Var__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group__1__Impl"


    // $ANTLR start "rule__Val__Group__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3750:1: rule__Val__Group__0 : rule__Val__Group__0__Impl rule__Val__Group__1 ;
    public final void rule__Val__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3754:1: ( rule__Val__Group__0__Impl rule__Val__Group__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3755:2: rule__Val__Group__0__Impl rule__Val__Group__1
            {
            pushFollow(FOLLOW_rule__Val__Group__0__Impl_in_rule__Val__Group__07500);
            rule__Val__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Val__Group__1_in_rule__Val__Group__07503);
            rule__Val__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Val__Group__0"


    // $ANTLR start "rule__Val__Group__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3762:1: rule__Val__Group__0__Impl : ( () ) ;
    public final void rule__Val__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3766:1: ( ( () ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3767:1: ( () )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3767:1: ( () )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3768:1: ()
            {
             before(grammarAccess.getValAccess().getValAction_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3769:1: ()
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3771:1: 
            {
            }

             after(grammarAccess.getValAccess().getValAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Val__Group__0__Impl"


    // $ANTLR start "rule__Val__Group__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3781:1: rule__Val__Group__1 : rule__Val__Group__1__Impl ;
    public final void rule__Val__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3785:1: ( rule__Val__Group__1__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3786:2: rule__Val__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Val__Group__1__Impl_in_rule__Val__Group__17561);
            rule__Val__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Val__Group__1"


    // $ANTLR start "rule__Val__Group__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3792:1: rule__Val__Group__1__Impl : ( ( rule__Val__ValAssignment_1 ) ) ;
    public final void rule__Val__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3796:1: ( ( ( rule__Val__ValAssignment_1 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3797:1: ( ( rule__Val__ValAssignment_1 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3797:1: ( ( rule__Val__ValAssignment_1 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3798:1: ( rule__Val__ValAssignment_1 )
            {
             before(grammarAccess.getValAccess().getValAssignment_1()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3799:1: ( rule__Val__ValAssignment_1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3799:2: rule__Val__ValAssignment_1
            {
            pushFollow(FOLLOW_rule__Val__ValAssignment_1_in_rule__Val__Group__1__Impl7588);
            rule__Val__ValAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValAccess().getValAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Val__Group__1__Impl"


    // $ANTLR start "rule__Gid__Group__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3813:1: rule__Gid__Group__0 : rule__Gid__Group__0__Impl rule__Gid__Group__1 ;
    public final void rule__Gid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3817:1: ( rule__Gid__Group__0__Impl rule__Gid__Group__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3818:2: rule__Gid__Group__0__Impl rule__Gid__Group__1
            {
            pushFollow(FOLLOW_rule__Gid__Group__0__Impl_in_rule__Gid__Group__07622);
            rule__Gid__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gid__Group__1_in_rule__Gid__Group__07625);
            rule__Gid__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gid__Group__0"


    // $ANTLR start "rule__Gid__Group__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3825:1: rule__Gid__Group__0__Impl : ( () ) ;
    public final void rule__Gid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3829:1: ( ( () ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3830:1: ( () )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3830:1: ( () )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3831:1: ()
            {
             before(grammarAccess.getGidAccess().getGidAction_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3832:1: ()
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3834:1: 
            {
            }

             after(grammarAccess.getGidAccess().getGidAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gid__Group__0__Impl"


    // $ANTLR start "rule__Gid__Group__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3844:1: rule__Gid__Group__1 : rule__Gid__Group__1__Impl ;
    public final void rule__Gid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3848:1: ( rule__Gid__Group__1__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3849:2: rule__Gid__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Gid__Group__1__Impl_in_rule__Gid__Group__17683);
            rule__Gid__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gid__Group__1"


    // $ANTLR start "rule__Gid__Group__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3855:1: rule__Gid__Group__1__Impl : ( 'gid' ) ;
    public final void rule__Gid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3859:1: ( ( 'gid' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3860:1: ( 'gid' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3860:1: ( 'gid' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3861:1: 'gid'
            {
             before(grammarAccess.getGidAccess().getGidKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Gid__Group__1__Impl7711); 
             after(grammarAccess.getGidAccess().getGidKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gid__Group__1__Impl"


    // $ANTLR start "rule__Lid__Group__0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3878:1: rule__Lid__Group__0 : rule__Lid__Group__0__Impl rule__Lid__Group__1 ;
    public final void rule__Lid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3882:1: ( rule__Lid__Group__0__Impl rule__Lid__Group__1 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3883:2: rule__Lid__Group__0__Impl rule__Lid__Group__1
            {
            pushFollow(FOLLOW_rule__Lid__Group__0__Impl_in_rule__Lid__Group__07746);
            rule__Lid__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Lid__Group__1_in_rule__Lid__Group__07749);
            rule__Lid__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lid__Group__0"


    // $ANTLR start "rule__Lid__Group__0__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3890:1: rule__Lid__Group__0__Impl : ( () ) ;
    public final void rule__Lid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3894:1: ( ( () ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3895:1: ( () )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3895:1: ( () )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3896:1: ()
            {
             before(grammarAccess.getLidAccess().getLidAction_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3897:1: ()
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3899:1: 
            {
            }

             after(grammarAccess.getLidAccess().getLidAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lid__Group__0__Impl"


    // $ANTLR start "rule__Lid__Group__1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3909:1: rule__Lid__Group__1 : rule__Lid__Group__1__Impl ;
    public final void rule__Lid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3913:1: ( rule__Lid__Group__1__Impl )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3914:2: rule__Lid__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Lid__Group__1__Impl_in_rule__Lid__Group__17807);
            rule__Lid__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lid__Group__1"


    // $ANTLR start "rule__Lid__Group__1__Impl"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3920:1: rule__Lid__Group__1__Impl : ( 'lid' ) ;
    public final void rule__Lid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3924:1: ( ( 'lid' ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3925:1: ( 'lid' )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3925:1: ( 'lid' )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3926:1: 'lid'
            {
             before(grammarAccess.getLidAccess().getLidKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__Lid__Group__1__Impl7835); 
             after(grammarAccess.getLidAccess().getLidKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lid__Group__1__Impl"


    // $ANTLR start "rule__Kernel__NAssignment_1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3944:1: rule__Kernel__NAssignment_1 : ( RULE_INT ) ;
    public final void rule__Kernel__NAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3948:1: ( ( RULE_INT ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3949:1: ( RULE_INT )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3949:1: ( RULE_INT )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3950:1: RULE_INT
            {
             before(grammarAccess.getKernelAccess().getNINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Kernel__NAssignment_17875); 
             after(grammarAccess.getKernelAccess().getNINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kernel__NAssignment_1"


    // $ANTLR start "rule__Kernel__MAssignment_3"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3959:1: rule__Kernel__MAssignment_3 : ( RULE_INT ) ;
    public final void rule__Kernel__MAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3963:1: ( ( RULE_INT ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3964:1: ( RULE_INT )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3964:1: ( RULE_INT )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3965:1: RULE_INT
            {
             before(grammarAccess.getKernelAccess().getMINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Kernel__MAssignment_37906); 
             after(grammarAccess.getKernelAccess().getMINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kernel__MAssignment_3"


    // $ANTLR start "rule__Kernel__ProceduresAssignment_4"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3974:1: rule__Kernel__ProceduresAssignment_4 : ( ruleProcedure ) ;
    public final void rule__Kernel__ProceduresAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3978:1: ( ( ruleProcedure ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3979:1: ( ruleProcedure )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3979:1: ( ruleProcedure )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3980:1: ruleProcedure
            {
             before(grammarAccess.getKernelAccess().getProceduresProcedureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleProcedure_in_rule__Kernel__ProceduresAssignment_47937);
            ruleProcedure();

            state._fsp--;

             after(grammarAccess.getKernelAccess().getProceduresProcedureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kernel__ProceduresAssignment_4"


    // $ANTLR start "rule__Kernel__MainAssignment_6"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3989:1: rule__Kernel__MainAssignment_6 : ( ruleStatement ) ;
    public final void rule__Kernel__MainAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3993:1: ( ( ruleStatement ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3994:1: ( ruleStatement )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3994:1: ( ruleStatement )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:3995:1: ruleStatement
            {
             before(grammarAccess.getKernelAccess().getMainStatementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Kernel__MainAssignment_67968);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getKernelAccess().getMainStatementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kernel__MainAssignment_6"


    // $ANTLR start "rule__Procedure__ZAssignment_1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4004:1: rule__Procedure__ZAssignment_1 : ( RULE_ID ) ;
    public final void rule__Procedure__ZAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4008:1: ( ( RULE_ID ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4009:1: ( RULE_ID )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4009:1: ( RULE_ID )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4010:1: RULE_ID
            {
             before(grammarAccess.getProcedureAccess().getZIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Procedure__ZAssignment_17999); 
             after(grammarAccess.getProcedureAccess().getZIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__ZAssignment_1"


    // $ANTLR start "rule__Procedure__XAssignment_2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4019:1: rule__Procedure__XAssignment_2 : ( RULE_ID ) ;
    public final void rule__Procedure__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4023:1: ( ( RULE_ID ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4024:1: ( RULE_ID )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4024:1: ( RULE_ID )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4025:1: RULE_ID
            {
             before(grammarAccess.getProcedureAccess().getXIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Procedure__XAssignment_28030); 
             after(grammarAccess.getProcedureAccess().getXIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__XAssignment_2"


    // $ANTLR start "rule__Procedure__BodyAssignment_3"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4034:1: rule__Procedure__BodyAssignment_3 : ( ruleStatement ) ;
    public final void rule__Procedure__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4038:1: ( ( ruleStatement ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4039:1: ( ruleStatement )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4039:1: ( ruleStatement )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4040:1: ruleStatement
            {
             before(grammarAccess.getProcedureAccess().getBodyStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Procedure__BodyAssignment_38061);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getProcedureAccess().getBodyStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure__BodyAssignment_3"


    // $ANTLR start "rule__Decl__VarAssignment_2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4049:1: rule__Decl__VarAssignment_2 : ( RULE_ID ) ;
    public final void rule__Decl__VarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4053:1: ( ( RULE_ID ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4054:1: ( RULE_ID )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4054:1: ( RULE_ID )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4055:1: RULE_ID
            {
             before(grammarAccess.getDeclAccess().getVarIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decl__VarAssignment_28092); 
             after(grammarAccess.getDeclAccess().getVarIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__VarAssignment_2"


    // $ANTLR start "rule__Decl__BodyAssignment_4"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4064:1: rule__Decl__BodyAssignment_4 : ( ruleStatement ) ;
    public final void rule__Decl__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4068:1: ( ( ruleStatement ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4069:1: ( ruleStatement )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4069:1: ( ruleStatement )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4070:1: ruleStatement
            {
             before(grammarAccess.getDeclAccess().getBodyStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Decl__BodyAssignment_48123);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getDeclAccess().getBodyStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decl__BodyAssignment_4"


    // $ANTLR start "rule__Branch__GuardAssignment_2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4079:1: rule__Branch__GuardAssignment_2 : ( ruleExpression ) ;
    public final void rule__Branch__GuardAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4083:1: ( ( ruleExpression ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4084:1: ( ruleExpression )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4084:1: ( ruleExpression )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4085:1: ruleExpression
            {
             before(grammarAccess.getBranchAccess().getGuardExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Branch__GuardAssignment_28154);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBranchAccess().getGuardExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__GuardAssignment_2"


    // $ANTLR start "rule__Branch__LeftAssignment_4"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4094:1: rule__Branch__LeftAssignment_4 : ( ruleStatement ) ;
    public final void rule__Branch__LeftAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4098:1: ( ( ruleStatement ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4099:1: ( ruleStatement )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4099:1: ( ruleStatement )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4100:1: ruleStatement
            {
             before(grammarAccess.getBranchAccess().getLeftStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Branch__LeftAssignment_48185);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBranchAccess().getLeftStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__LeftAssignment_4"


    // $ANTLR start "rule__Branch__RightAssignment_6"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4109:1: rule__Branch__RightAssignment_6 : ( ruleStatement ) ;
    public final void rule__Branch__RightAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4113:1: ( ( ruleStatement ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4114:1: ( ruleStatement )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4114:1: ( ruleStatement )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4115:1: ruleStatement
            {
             before(grammarAccess.getBranchAccess().getRightStatementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Branch__RightAssignment_68216);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBranchAccess().getRightStatementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Branch__RightAssignment_6"


    // $ANTLR start "rule__Loop__GuardAssignment_2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4124:1: rule__Loop__GuardAssignment_2 : ( ruleExpression ) ;
    public final void rule__Loop__GuardAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4128:1: ( ( ruleExpression ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4129:1: ( ruleExpression )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4129:1: ( ruleExpression )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4130:1: ruleExpression
            {
             before(grammarAccess.getLoopAccess().getGuardExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Loop__GuardAssignment_28247);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getGuardExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__GuardAssignment_2"


    // $ANTLR start "rule__Loop__BodyAssignment_4"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4139:1: rule__Loop__BodyAssignment_4 : ( ruleStatement ) ;
    public final void rule__Loop__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4143:1: ( ( ruleStatement ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4144:1: ( ruleStatement )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4144:1: ( ruleStatement )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4145:1: ruleStatement
            {
             before(grammarAccess.getLoopAccess().getBodyStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Loop__BodyAssignment_48278);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getBodyStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__BodyAssignment_4"


    // $ANTLR start "rule__Invoke__FunAssignment_1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4154:1: rule__Invoke__FunAssignment_1 : ( RULE_ID ) ;
    public final void rule__Invoke__FunAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4158:1: ( ( RULE_ID ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4159:1: ( RULE_ID )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4159:1: ( RULE_ID )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4160:1: RULE_ID
            {
             before(grammarAccess.getInvokeAccess().getFunIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Invoke__FunAssignment_18309); 
             after(grammarAccess.getInvokeAccess().getFunIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invoke__FunAssignment_1"


    // $ANTLR start "rule__Invoke__ArgAssignment_3"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4169:1: rule__Invoke__ArgAssignment_3 : ( ruleExpression ) ;
    public final void rule__Invoke__ArgAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4173:1: ( ( ruleExpression ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4174:1: ( ruleExpression )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4174:1: ( ruleExpression )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4175:1: ruleExpression
            {
             before(grammarAccess.getInvokeAccess().getArgExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Invoke__ArgAssignment_38340);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getInvokeAccess().getArgExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invoke__ArgAssignment_3"


    // $ANTLR start "rule__Assign__VarAssignment_1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4184:1: rule__Assign__VarAssignment_1 : ( RULE_ID ) ;
    public final void rule__Assign__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4188:1: ( ( RULE_ID ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4189:1: ( RULE_ID )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4189:1: ( RULE_ID )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4190:1: RULE_ID
            {
             before(grammarAccess.getAssignAccess().getVarIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assign__VarAssignment_18371); 
             after(grammarAccess.getAssignAccess().getVarIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__VarAssignment_1"


    // $ANTLR start "rule__Assign__ExpAssignment_3"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4199:1: rule__Assign__ExpAssignment_3 : ( ruleExpression ) ;
    public final void rule__Assign__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4203:1: ( ( ruleExpression ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4204:1: ( ruleExpression )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4204:1: ( ruleExpression )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4205:1: ruleExpression
            {
             before(grammarAccess.getAssignAccess().getExpExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Assign__ExpAssignment_38402);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAssignAccess().getExpExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assign__ExpAssignment_3"


    // $ANTLR start "rule__Read__NameAssignment_1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4214:1: rule__Read__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Read__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4218:1: ( ( RULE_ID ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4219:1: ( RULE_ID )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4219:1: ( RULE_ID )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4220:1: RULE_ID
            {
             before(grammarAccess.getReadAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Read__NameAssignment_18433); 
             after(grammarAccess.getReadAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__NameAssignment_1"


    // $ANTLR start "rule__Read__LocAssignment_5"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4229:1: rule__Read__LocAssignment_5 : ( RULE_INT ) ;
    public final void rule__Read__LocAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4233:1: ( ( RULE_INT ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4234:1: ( RULE_INT )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4234:1: ( RULE_INT )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4235:1: RULE_INT
            {
             before(grammarAccess.getReadAccess().getLocINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Read__LocAssignment_58464); 
             after(grammarAccess.getReadAccess().getLocINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__LocAssignment_5"


    // $ANTLR start "rule__Write__LocAssignment_3"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4244:1: rule__Write__LocAssignment_3 : ( RULE_INT ) ;
    public final void rule__Write__LocAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4248:1: ( ( RULE_INT ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4249:1: ( RULE_INT )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4249:1: ( RULE_INT )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4250:1: RULE_INT
            {
             before(grammarAccess.getWriteAccess().getLocINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Write__LocAssignment_38495); 
             after(grammarAccess.getWriteAccess().getLocINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__LocAssignment_3"


    // $ANTLR start "rule__Write__ExpAssignment_5"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4259:1: rule__Write__ExpAssignment_5 : ( ruleExpression ) ;
    public final void rule__Write__ExpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4263:1: ( ( ruleExpression ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4264:1: ( ruleExpression )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4264:1: ( ruleExpression )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4265:1: ruleExpression
            {
             before(grammarAccess.getWriteAccess().getExpExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Write__ExpAssignment_58526);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWriteAccess().getExpExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Write__ExpAssignment_5"


    // $ANTLR start "rule__Block__StatsAssignment_2_0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4274:1: rule__Block__StatsAssignment_2_0 : ( ruleStatement ) ;
    public final void rule__Block__StatsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4278:1: ( ( ruleStatement ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4279:1: ( ruleStatement )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4279:1: ( ruleStatement )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4280:1: ruleStatement
            {
             before(grammarAccess.getBlockAccess().getStatsStatementParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Block__StatsAssignment_2_08557);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStatsStatementParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__StatsAssignment_2_0"


    // $ANTLR start "rule__LSwitch__CasesAssignment_2_0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4289:1: rule__LSwitch__CasesAssignment_2_0 : ( RULE_INT ) ;
    public final void rule__LSwitch__CasesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4293:1: ( ( RULE_INT ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4294:1: ( RULE_INT )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4294:1: ( RULE_INT )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4295:1: RULE_INT
            {
             before(grammarAccess.getLSwitchAccess().getCasesINTTerminalRuleCall_2_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__LSwitch__CasesAssignment_2_08588); 
             after(grammarAccess.getLSwitchAccess().getCasesINTTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LSwitch__CasesAssignment_2_0"


    // $ANTLR start "rule__LSwitch__StatsAssignment_2_2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4304:1: rule__LSwitch__StatsAssignment_2_2 : ( ruleStatement ) ;
    public final void rule__LSwitch__StatsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4308:1: ( ( ruleStatement ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4309:1: ( ruleStatement )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4309:1: ( ruleStatement )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4310:1: ruleStatement
            {
             before(grammarAccess.getLSwitchAccess().getStatsStatementParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__LSwitch__StatsAssignment_2_28619);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getLSwitchAccess().getStatsStatementParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LSwitch__StatsAssignment_2_2"


    // $ANTLR start "rule__GSwitch__CasesAssignment_2_0"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4319:1: rule__GSwitch__CasesAssignment_2_0 : ( RULE_INT ) ;
    public final void rule__GSwitch__CasesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4323:1: ( ( RULE_INT ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4324:1: ( RULE_INT )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4324:1: ( RULE_INT )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4325:1: RULE_INT
            {
             before(grammarAccess.getGSwitchAccess().getCasesINTTerminalRuleCall_2_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__GSwitch__CasesAssignment_2_08650); 
             after(grammarAccess.getGSwitchAccess().getCasesINTTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSwitch__CasesAssignment_2_0"


    // $ANTLR start "rule__GSwitch__StatsAssignment_2_2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4334:1: rule__GSwitch__StatsAssignment_2_2 : ( ruleStatement ) ;
    public final void rule__GSwitch__StatsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4338:1: ( ( ruleStatement ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4339:1: ( ruleStatement )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4339:1: ( ruleStatement )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4340:1: ruleStatement
            {
             before(grammarAccess.getGSwitchAccess().getStatsStatementParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__GSwitch__StatsAssignment_2_28681);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getGSwitchAccess().getStatsStatementParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GSwitch__StatsAssignment_2_2"


    // $ANTLR start "rule__Add__OpAssignment_1_1_1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4349:1: rule__Add__OpAssignment_1_1_1 : ( ( rule__Add__OpAlternatives_1_1_1_0 ) ) ;
    public final void rule__Add__OpAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4353:1: ( ( ( rule__Add__OpAlternatives_1_1_1_0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4354:1: ( ( rule__Add__OpAlternatives_1_1_1_0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4354:1: ( ( rule__Add__OpAlternatives_1_1_1_0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4355:1: ( rule__Add__OpAlternatives_1_1_1_0 )
            {
             before(grammarAccess.getAddAccess().getOpAlternatives_1_1_1_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4356:1: ( rule__Add__OpAlternatives_1_1_1_0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4356:2: rule__Add__OpAlternatives_1_1_1_0
            {
            pushFollow(FOLLOW_rule__Add__OpAlternatives_1_1_1_0_in_rule__Add__OpAssignment_1_1_18712);
            rule__Add__OpAlternatives_1_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getOpAlternatives_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__OpAssignment_1_1_1"


    // $ANTLR start "rule__Add__RightAssignment_1_1_2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4365:1: rule__Add__RightAssignment_1_1_2 : ( ruleMul ) ;
    public final void rule__Add__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4369:1: ( ( ruleMul ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4370:1: ( ruleMul )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4370:1: ( ruleMul )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4371:1: ruleMul
            {
             before(grammarAccess.getAddAccess().getRightMulParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_ruleMul_in_rule__Add__RightAssignment_1_1_28745);
            ruleMul();

            state._fsp--;

             after(grammarAccess.getAddAccess().getRightMulParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__RightAssignment_1_1_2"


    // $ANTLR start "rule__Mul__OpAssignment_1_1_1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4380:1: rule__Mul__OpAssignment_1_1_1 : ( ( rule__Mul__OpAlternatives_1_1_1_0 ) ) ;
    public final void rule__Mul__OpAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4384:1: ( ( ( rule__Mul__OpAlternatives_1_1_1_0 ) ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4385:1: ( ( rule__Mul__OpAlternatives_1_1_1_0 ) )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4385:1: ( ( rule__Mul__OpAlternatives_1_1_1_0 ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4386:1: ( rule__Mul__OpAlternatives_1_1_1_0 )
            {
             before(grammarAccess.getMulAccess().getOpAlternatives_1_1_1_0()); 
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4387:1: ( rule__Mul__OpAlternatives_1_1_1_0 )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4387:2: rule__Mul__OpAlternatives_1_1_1_0
            {
            pushFollow(FOLLOW_rule__Mul__OpAlternatives_1_1_1_0_in_rule__Mul__OpAssignment_1_1_18776);
            rule__Mul__OpAlternatives_1_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMulAccess().getOpAlternatives_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mul__OpAssignment_1_1_1"


    // $ANTLR start "rule__Mul__RightAssignment_1_1_2"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4396:1: rule__Mul__RightAssignment_1_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__Mul__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4400:1: ( ( rulePrimaryExpression ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4401:1: ( rulePrimaryExpression )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4401:1: ( rulePrimaryExpression )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4402:1: rulePrimaryExpression
            {
             before(grammarAccess.getMulAccess().getRightPrimaryExpressionParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Mul__RightAssignment_1_1_28809);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMulAccess().getRightPrimaryExpressionParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mul__RightAssignment_1_1_2"


    // $ANTLR start "rule__Var__NameAssignment_1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4411:1: rule__Var__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Var__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4415:1: ( ( RULE_ID ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4416:1: ( RULE_ID )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4416:1: ( RULE_ID )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4417:1: RULE_ID
            {
             before(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Var__NameAssignment_18840); 
             after(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__NameAssignment_1"


    // $ANTLR start "rule__Val__ValAssignment_1"
    // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4426:1: rule__Val__ValAssignment_1 : ( RULE_INT ) ;
    public final void rule__Val__ValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4430:1: ( ( RULE_INT ) )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4431:1: ( RULE_INT )
            {
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4431:1: ( RULE_INT )
            // ../unige.dibris.kpl.ui/src-gen/unige/dibris/ui/contentassist/antlr/internal/InternalKPL.g:4432:1: RULE_INT
            {
             before(grammarAccess.getValAccess().getValINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Val__ValAssignment_18871); 
             after(grammarAccess.getValAccess().getValINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Val__ValAssignment_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA1_eotS =
        "\17\uffff";
    static final String DFA1_eofS =
        "\14\uffff\1\16\2\uffff";
    static final String DFA1_minS =
        "\1\5\3\uffff\1\32\7\uffff\1\4\2\uffff";
    static final String DFA1_maxS =
        "\1\47\3\uffff\1\34\7\uffff\1\51\2\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\4\1\uffff\1\6\1\5";
    static final String DFA1_specialS =
        "\17\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\4\15\uffff\1\1\1\uffff\1\2\2\uffff\1\3\5\uffff\1\5\1\uffff\1\6\1\7\2\uffff\1\10\1\uffff\1\11\1\12",
            "",
            "",
            "",
            "\1\13\1\uffff\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\16\5\uffff\4\16\2\uffff\2\16\4\uffff\1\16\2\uffff\1\16\2\uffff\1\15\5\uffff\1\16\4\uffff\2\16",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "704:1: rule__Statement__Alternatives : ( ( ruleDecl ) | ( ruleBranch ) | ( ruleLoop ) | ( ruleInvoke ) | ( ruleAssign ) | ( ruleRead ) | ( ruleWrite ) | ( ruleBarrier ) | ( ruleBlock ) | ( ruleLSwitch ) | ( ruleGSwitch ) | ( ruleSkip ) );";
        }
    }
    static final String DFA2_eotS =
        "\14\uffff";
    static final String DFA2_eofS =
        "\1\3\13\uffff";
    static final String DFA2_minS =
        "\1\4\13\uffff";
    static final String DFA2_maxS =
        "\1\51\13\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\12\1\1\2";
    static final String DFA2_specialS =
        "\14\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\1\5\uffff\2\13\2\2\2\uffff\1\7\1\10\3\uffff\1\5\1\11\1\uffff\1\6\1\1\1\4\7\uffff\1\12\4\uffff\2\2",
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
            return "786:1: rule__Add__Alternatives : ( ( ruleMul ) | ( ( rule__Add__Group_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleKernel_in_entryRuleKernel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKernel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kernel__Group__0_in_ruleKernel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_entryRuleProcedure121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcedure128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__0_in_ruleProcedure154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_entryRuleDecl241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecl248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group__0_in_ruleDecl274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranch_in_entryRuleBranch301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBranch308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Branch__Group__0_in_ruleBranch334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoop_in_entryRuleLoop361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoop368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Loop__Group__0_in_ruleLoop394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvoke_in_entryRuleInvoke421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvoke428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invoke__Group__0_in_ruleInvoke454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssign_in_entryRuleAssign481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssign488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__0_in_ruleAssign514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRead_in_entryRuleRead541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRead548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Read__Group__0_in_ruleRead574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWrite_in_entryRuleWrite601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWrite608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Write__Group__0_in_ruleWrite634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBarrier_in_entryRuleBarrier661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBarrier668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Barrier__Group__0_in_ruleBarrier694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleBlock754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLSwitch_in_entryRuleLSwitch781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLSwitch788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LSwitch__Group__0_in_ruleLSwitch814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGSwitch_in_entryRuleGSwitch841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGSwitch848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GSwitch__Group__0_in_ruleGSwitch874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_entryRuleSkip901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkip908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Skip__Group__0_in_ruleSkip934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdd_in_ruleExpression994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdd_in_entryRuleAdd1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdd1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__Alternatives_in_ruleAdd1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMul_in_entryRuleMul1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMul1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mul__Alternatives_in_ruleMul1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group__0_in_ruleVar1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVal_in_entryRuleVal1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVal1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Val__Group__0_in_ruleVal1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGid_in_entryRuleGid1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGid1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gid__Group__0_in_ruleGid1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLid_in_entryRuleLid1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLid1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lid__Group__0_in_ruleLid1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecl_in_rule__Statement__Alternatives1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranch_in_rule__Statement__Alternatives1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoop_in_rule__Statement__Alternatives1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvoke_in_rule__Statement__Alternatives1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssign_in_rule__Statement__Alternatives1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRead_in_rule__Statement__Alternatives1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWrite_in_rule__Statement__Alternatives1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBarrier_in_rule__Statement__Alternatives1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__Statement__Alternatives1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLSwitch_in_rule__Statement__Alternatives1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGSwitch_in_rule__Statement__Alternatives1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_rule__Statement__Alternatives1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMul_in_rule__Add__Alternatives1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__Group_1__0_in_rule__Add__Alternatives1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Add__OpAlternatives_1_1_1_01719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Add__OpAlternatives_1_1_1_01739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Mul__Alternatives1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mul__Group_1__0_in_rule__Mul__Alternatives1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Mul__OpAlternatives_1_1_1_01824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Mul__OpAlternatives_1_1_1_01844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__PrimaryExpression__Alternatives1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVal_in_rule__PrimaryExpression__Alternatives1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGid_in_rule__PrimaryExpression__Alternatives1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLid_in_rule__PrimaryExpression__Alternatives1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kernel__Group__0__Impl_in_rule__Kernel__Group__01977 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Kernel__Group__1_in_rule__Kernel__Group__01980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Kernel__Group__0__Impl2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kernel__Group__1__Impl_in_rule__Kernel__Group__12039 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Kernel__Group__2_in_rule__Kernel__Group__12042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kernel__NAssignment_1_in_rule__Kernel__Group__1__Impl2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kernel__Group__2__Impl_in_rule__Kernel__Group__22099 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Kernel__Group__3_in_rule__Kernel__Group__22102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Kernel__Group__2__Impl2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kernel__Group__3__Impl_in_rule__Kernel__Group__32161 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__Kernel__Group__4_in_rule__Kernel__Group__32164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kernel__MAssignment_3_in_rule__Kernel__Group__3__Impl2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kernel__Group__4__Impl_in_rule__Kernel__Group__42221 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__Kernel__Group__5_in_rule__Kernel__Group__42224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kernel__ProceduresAssignment_4_in_rule__Kernel__Group__4__Impl2251 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Kernel__Group__5__Impl_in_rule__Kernel__Group__52282 = new BitSet(new long[]{0x000000D341280020L});
    public static final BitSet FOLLOW_rule__Kernel__Group__6_in_rule__Kernel__Group__52285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Kernel__Group__5__Impl2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kernel__Group__6__Impl_in_rule__Kernel__Group__62344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kernel__MainAssignment_6_in_rule__Kernel__Group__6__Impl2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__0__Impl_in_rule__Procedure__Group__02415 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Procedure__Group__1_in_rule__Procedure__Group__02418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Procedure__Group__0__Impl2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__1__Impl_in_rule__Procedure__Group__12477 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Procedure__Group__2_in_rule__Procedure__Group__12480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__ZAssignment_1_in_rule__Procedure__Group__1__Impl2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__2__Impl_in_rule__Procedure__Group__22537 = new BitSet(new long[]{0x000000D341280020L});
    public static final BitSet FOLLOW_rule__Procedure__Group__3_in_rule__Procedure__Group__22540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__XAssignment_2_in_rule__Procedure__Group__2__Impl2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__Group__3__Impl_in_rule__Procedure__Group__32597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Procedure__BodyAssignment_3_in_rule__Procedure__Group__3__Impl2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group__0__Impl_in_rule__Decl__Group__02662 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Decl__Group__1_in_rule__Decl__Group__02665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group__1__Impl_in_rule__Decl__Group__12723 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Decl__Group__2_in_rule__Decl__Group__12726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Decl__Group__1__Impl2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group__2__Impl_in_rule__Decl__Group__22785 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Decl__Group__3_in_rule__Decl__Group__22788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__VarAssignment_2_in_rule__Decl__Group__2__Impl2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group__3__Impl_in_rule__Decl__Group__32845 = new BitSet(new long[]{0x000000D341280020L});
    public static final BitSet FOLLOW_rule__Decl__Group__4_in_rule__Decl__Group__32848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Decl__Group__3__Impl2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__Group__4__Impl_in_rule__Decl__Group__42907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decl__BodyAssignment_4_in_rule__Decl__Group__4__Impl2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Branch__Group__0__Impl_in_rule__Branch__Group__02974 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Branch__Group__1_in_rule__Branch__Group__02977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Branch__Group__1__Impl_in_rule__Branch__Group__13035 = new BitSet(new long[]{0x0000030004007830L});
    public static final BitSet FOLLOW_rule__Branch__Group__2_in_rule__Branch__Group__13038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Branch__Group__1__Impl3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Branch__Group__2__Impl_in_rule__Branch__Group__23097 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Branch__Group__3_in_rule__Branch__Group__23100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Branch__GuardAssignment_2_in_rule__Branch__Group__2__Impl3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Branch__Group__3__Impl_in_rule__Branch__Group__33157 = new BitSet(new long[]{0x000000D341280020L});
    public static final BitSet FOLLOW_rule__Branch__Group__4_in_rule__Branch__Group__33160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Branch__Group__3__Impl3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Branch__Group__4__Impl_in_rule__Branch__Group__43219 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Branch__Group__5_in_rule__Branch__Group__43222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Branch__LeftAssignment_4_in_rule__Branch__Group__4__Impl3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Branch__Group__5__Impl_in_rule__Branch__Group__53279 = new BitSet(new long[]{0x000000D341280020L});
    public static final BitSet FOLLOW_rule__Branch__Group__6_in_rule__Branch__Group__53282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Branch__Group__5__Impl3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Branch__Group__6__Impl_in_rule__Branch__Group__63341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Branch__RightAssignment_6_in_rule__Branch__Group__6__Impl3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Loop__Group__0__Impl_in_rule__Loop__Group__03412 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Loop__Group__1_in_rule__Loop__Group__03415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Loop__Group__1__Impl_in_rule__Loop__Group__13473 = new BitSet(new long[]{0x0000030004007830L});
    public static final BitSet FOLLOW_rule__Loop__Group__2_in_rule__Loop__Group__13476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Loop__Group__1__Impl3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Loop__Group__2__Impl_in_rule__Loop__Group__23535 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Loop__Group__3_in_rule__Loop__Group__23538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Loop__GuardAssignment_2_in_rule__Loop__Group__2__Impl3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Loop__Group__3__Impl_in_rule__Loop__Group__33595 = new BitSet(new long[]{0x000000D341280020L});
    public static final BitSet FOLLOW_rule__Loop__Group__4_in_rule__Loop__Group__33598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Loop__Group__3__Impl3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Loop__Group__4__Impl_in_rule__Loop__Group__43657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Loop__BodyAssignment_4_in_rule__Loop__Group__4__Impl3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invoke__Group__0__Impl_in_rule__Invoke__Group__03724 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Invoke__Group__1_in_rule__Invoke__Group__03727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invoke__Group__1__Impl_in_rule__Invoke__Group__13785 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Invoke__Group__2_in_rule__Invoke__Group__13788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invoke__FunAssignment_1_in_rule__Invoke__Group__1__Impl3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invoke__Group__2__Impl_in_rule__Invoke__Group__23845 = new BitSet(new long[]{0x0000030004007830L});
    public static final BitSet FOLLOW_rule__Invoke__Group__3_in_rule__Invoke__Group__23848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Invoke__Group__2__Impl3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invoke__Group__3__Impl_in_rule__Invoke__Group__33907 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Invoke__Group__4_in_rule__Invoke__Group__33910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invoke__ArgAssignment_3_in_rule__Invoke__Group__3__Impl3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Invoke__Group__4__Impl_in_rule__Invoke__Group__43967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Invoke__Group__4__Impl3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__0__Impl_in_rule__Assign__Group__04036 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Assign__Group__1_in_rule__Assign__Group__04039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__1__Impl_in_rule__Assign__Group__14097 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Assign__Group__2_in_rule__Assign__Group__14100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__VarAssignment_1_in_rule__Assign__Group__1__Impl4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__2__Impl_in_rule__Assign__Group__24157 = new BitSet(new long[]{0x0000030004007830L});
    public static final BitSet FOLLOW_rule__Assign__Group__3_in_rule__Assign__Group__24160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Assign__Group__2__Impl4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__Group__3__Impl_in_rule__Assign__Group__34219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assign__ExpAssignment_3_in_rule__Assign__Group__3__Impl4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Read__Group__0__Impl_in_rule__Read__Group__04284 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Read__Group__1_in_rule__Read__Group__04287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Read__Group__1__Impl_in_rule__Read__Group__14345 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Read__Group__2_in_rule__Read__Group__14348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Read__NameAssignment_1_in_rule__Read__Group__1__Impl4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Read__Group__2__Impl_in_rule__Read__Group__24405 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Read__Group__3_in_rule__Read__Group__24408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Read__Group__2__Impl4436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Read__Group__3__Impl_in_rule__Read__Group__34467 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Read__Group__4_in_rule__Read__Group__34470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Read__Group__3__Impl4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Read__Group__4__Impl_in_rule__Read__Group__44529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Read__Group__5_in_rule__Read__Group__44532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Read__Group__4__Impl4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Read__Group__5__Impl_in_rule__Read__Group__54591 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Read__Group__6_in_rule__Read__Group__54594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Read__LocAssignment_5_in_rule__Read__Group__5__Impl4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Read__Group__6__Impl_in_rule__Read__Group__64651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Read__Group__6__Impl4679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Write__Group__0__Impl_in_rule__Write__Group__04724 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Write__Group__1_in_rule__Write__Group__04727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Write__Group__1__Impl_in_rule__Write__Group__14785 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Write__Group__2_in_rule__Write__Group__14788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Write__Group__1__Impl4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Write__Group__2__Impl_in_rule__Write__Group__24847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Write__Group__3_in_rule__Write__Group__24850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Write__Group__2__Impl4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Write__Group__3__Impl_in_rule__Write__Group__34909 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Write__Group__4_in_rule__Write__Group__34912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Write__LocAssignment_3_in_rule__Write__Group__3__Impl4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Write__Group__4__Impl_in_rule__Write__Group__44969 = new BitSet(new long[]{0x0000030004007830L});
    public static final BitSet FOLLOW_rule__Write__Group__5_in_rule__Write__Group__44972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Write__Group__4__Impl5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Write__Group__5__Impl_in_rule__Write__Group__55031 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Write__Group__6_in_rule__Write__Group__55034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Write__ExpAssignment_5_in_rule__Write__Group__5__Impl5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Write__Group__6__Impl_in_rule__Write__Group__65091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Write__Group__6__Impl5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Barrier__Group__0__Impl_in_rule__Barrier__Group__05164 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Barrier__Group__1_in_rule__Barrier__Group__05167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Barrier__Group__1__Impl_in_rule__Barrier__Group__15225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Barrier__Group__1__Impl5253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__05288 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__05291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__15349 = new BitSet(new long[]{0x000000D341280020L});
    public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__15352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Block__Group__1__Impl5380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__25411 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Block__Group__3_in_rule__Block__Group__25414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group_2__0_in_rule__Block__Group__2__Impl5443 = new BitSet(new long[]{0x000000D341280022L});
    public static final BitSet FOLLOW_rule__Block__Group_2__0_in_rule__Block__Group__2__Impl5455 = new BitSet(new long[]{0x000000D341280022L});
    public static final BitSet FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__35488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Block__Group__3__Impl5516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group_2__0__Impl_in_rule__Block__Group_2__05555 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Block__Group_2__1_in_rule__Block__Group_2__05558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__StatsAssignment_2_0_in_rule__Block__Group_2__0__Impl5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group_2__1__Impl_in_rule__Block__Group_2__15615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Block__Group_2__1__Impl5643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LSwitch__Group__0__Impl_in_rule__LSwitch__Group__05678 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__LSwitch__Group__1_in_rule__LSwitch__Group__05681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LSwitch__Group__1__Impl_in_rule__LSwitch__Group__15739 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LSwitch__Group__2_in_rule__LSwitch__Group__15742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__LSwitch__Group__1__Impl5770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LSwitch__Group__2__Impl_in_rule__LSwitch__Group__25801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LSwitch__Group_2__0_in_rule__LSwitch__Group__2__Impl5830 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__LSwitch__Group_2__0_in_rule__LSwitch__Group__2__Impl5842 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__LSwitch__Group_2__0__Impl_in_rule__LSwitch__Group_2__05881 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__LSwitch__Group_2__1_in_rule__LSwitch__Group_2__05884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LSwitch__CasesAssignment_2_0_in_rule__LSwitch__Group_2__0__Impl5911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LSwitch__Group_2__1__Impl_in_rule__LSwitch__Group_2__15941 = new BitSet(new long[]{0x000000D341280020L});
    public static final BitSet FOLLOW_rule__LSwitch__Group_2__2_in_rule__LSwitch__Group_2__15944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__LSwitch__Group_2__1__Impl5972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LSwitch__Group_2__2__Impl_in_rule__LSwitch__Group_2__26003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LSwitch__StatsAssignment_2_2_in_rule__LSwitch__Group_2__2__Impl6030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GSwitch__Group__0__Impl_in_rule__GSwitch__Group__06066 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__GSwitch__Group__1_in_rule__GSwitch__Group__06069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GSwitch__Group__1__Impl_in_rule__GSwitch__Group__16127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GSwitch__Group__2_in_rule__GSwitch__Group__16130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__GSwitch__Group__1__Impl6158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GSwitch__Group__2__Impl_in_rule__GSwitch__Group__26189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GSwitch__Group_2__0_in_rule__GSwitch__Group__2__Impl6218 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__GSwitch__Group_2__0_in_rule__GSwitch__Group__2__Impl6230 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__GSwitch__Group_2__0__Impl_in_rule__GSwitch__Group_2__06269 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__GSwitch__Group_2__1_in_rule__GSwitch__Group_2__06272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GSwitch__CasesAssignment_2_0_in_rule__GSwitch__Group_2__0__Impl6299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GSwitch__Group_2__1__Impl_in_rule__GSwitch__Group_2__16329 = new BitSet(new long[]{0x000000D341280020L});
    public static final BitSet FOLLOW_rule__GSwitch__Group_2__2_in_rule__GSwitch__Group_2__16332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__GSwitch__Group_2__1__Impl6360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GSwitch__Group_2__2__Impl_in_rule__GSwitch__Group_2__26391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GSwitch__StatsAssignment_2_2_in_rule__GSwitch__Group_2__2__Impl6418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Skip__Group__0__Impl_in_rule__Skip__Group__06454 = new BitSet(new long[]{0x000000D341280020L});
    public static final BitSet FOLLOW_rule__Skip__Group__1_in_rule__Skip__Group__06457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Skip__Group__1__Impl_in_rule__Skip__Group__16515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Skip__Group__1__Impl6543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__Group_1__0__Impl_in_rule__Add__Group_1__06578 = new BitSet(new long[]{0x0000030004007830L});
    public static final BitSet FOLLOW_rule__Add__Group_1__1_in_rule__Add__Group_1__06581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__Group_1__1__Impl_in_rule__Add__Group_1__16639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__Group_1_1__0_in_rule__Add__Group_1__1__Impl6666 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__Add__Group_1_1__0__Impl_in_rule__Add__Group_1_1__06701 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Add__Group_1_1__1_in_rule__Add__Group_1_1__06704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__Group_1_1__1__Impl_in_rule__Add__Group_1_1__16762 = new BitSet(new long[]{0x0000030004006030L});
    public static final BitSet FOLLOW_rule__Add__Group_1_1__2_in_rule__Add__Group_1_1__16765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__OpAssignment_1_1_1_in_rule__Add__Group_1_1__1__Impl6792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__Group_1_1__2__Impl_in_rule__Add__Group_1_1__26822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__RightAssignment_1_1_2_in_rule__Add__Group_1_1__2__Impl6849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mul__Group_1__0__Impl_in_rule__Mul__Group_1__06885 = new BitSet(new long[]{0x0000030004006030L});
    public static final BitSet FOLLOW_rule__Mul__Group_1__1_in_rule__Mul__Group_1__06888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mul__Group_1__1__Impl_in_rule__Mul__Group_1__16946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mul__Group_1_1__0_in_rule__Mul__Group_1__1__Impl6973 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_rule__Mul__Group_1_1__0__Impl_in_rule__Mul__Group_1_1__07008 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Mul__Group_1_1__1_in_rule__Mul__Group_1_1__07011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mul__Group_1_1__1__Impl_in_rule__Mul__Group_1_1__17069 = new BitSet(new long[]{0x0000030004000030L});
    public static final BitSet FOLLOW_rule__Mul__Group_1_1__2_in_rule__Mul__Group_1_1__17072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mul__OpAssignment_1_1_1_in_rule__Mul__Group_1_1__1__Impl7099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mul__Group_1_1__2__Impl_in_rule__Mul__Group_1_1__27129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mul__RightAssignment_1_1_2_in_rule__Mul__Group_1_1__2__Impl7156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__07192 = new BitSet(new long[]{0x0000030004007830L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__07195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PrimaryExpression__Group_0__0__Impl7223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__17254 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__17257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__PrimaryExpression__Group_0__1__Impl7284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__27313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PrimaryExpression__Group_0__2__Impl7341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group__0__Impl_in_rule__Var__Group__07378 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Var__Group__1_in_rule__Var__Group__07381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group__1__Impl_in_rule__Var__Group__17439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__NameAssignment_1_in_rule__Var__Group__1__Impl7466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Val__Group__0__Impl_in_rule__Val__Group__07500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Val__Group__1_in_rule__Val__Group__07503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Val__Group__1__Impl_in_rule__Val__Group__17561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Val__ValAssignment_1_in_rule__Val__Group__1__Impl7588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gid__Group__0__Impl_in_rule__Gid__Group__07622 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Gid__Group__1_in_rule__Gid__Group__07625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gid__Group__1__Impl_in_rule__Gid__Group__17683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Gid__Group__1__Impl7711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lid__Group__0__Impl_in_rule__Lid__Group__07746 = new BitSet(new long[]{0x0000030004000030L});
    public static final BitSet FOLLOW_rule__Lid__Group__1_in_rule__Lid__Group__07749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lid__Group__1__Impl_in_rule__Lid__Group__17807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Lid__Group__1__Impl7835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Kernel__NAssignment_17875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Kernel__MAssignment_37906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcedure_in_rule__Kernel__ProceduresAssignment_47937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Kernel__MainAssignment_67968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Procedure__ZAssignment_17999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Procedure__XAssignment_28030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Procedure__BodyAssignment_38061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decl__VarAssignment_28092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Decl__BodyAssignment_48123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Branch__GuardAssignment_28154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Branch__LeftAssignment_48185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Branch__RightAssignment_68216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Loop__GuardAssignment_28247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Loop__BodyAssignment_48278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Invoke__FunAssignment_18309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Invoke__ArgAssignment_38340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assign__VarAssignment_18371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Assign__ExpAssignment_38402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Read__NameAssignment_18433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Read__LocAssignment_58464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Write__LocAssignment_38495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Write__ExpAssignment_58526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Block__StatsAssignment_2_08557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__LSwitch__CasesAssignment_2_08588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__LSwitch__StatsAssignment_2_28619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__GSwitch__CasesAssignment_2_08650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__GSwitch__StatsAssignment_2_28681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__OpAlternatives_1_1_1_0_in_rule__Add__OpAssignment_1_1_18712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMul_in_rule__Add__RightAssignment_1_1_28745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mul__OpAlternatives_1_1_1_0_in_rule__Mul__OpAssignment_1_1_18776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Mul__RightAssignment_1_1_28809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Var__NameAssignment_18840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Val__ValAssignment_18871 = new BitSet(new long[]{0x0000000000000002L});

}