/*
 * generated by Xtext
 */
package unige.dibris.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import unige.dibris.services.KPLGrammarAccess;

public class KPLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private KPLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected unige.dibris.parser.antlr.internal.InternalKPLParser createParser(XtextTokenStream stream) {
		return new unige.dibris.parser.antlr.internal.InternalKPLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Kernel";
	}
	
	public KPLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(KPLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
