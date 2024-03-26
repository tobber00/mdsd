/*
 * generated by Xtext 2.25.0
 */
grammar InternalMath;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;

}
@parser::members {
	private MathGrammarAccess grammarAccess;

	public void setGrammarAccess(MathGrammarAccess grammarAccess) {
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
}

// Entry rule entryRuleMathExp
entryRuleMathExp
:
{ before(grammarAccess.getMathExpRule()); }
	 ruleMathExp
{ after(grammarAccess.getMathExpRule()); } 
	 EOF 
;

// Rule MathExp
ruleMathExp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMathExpAccess().getGroup()); }
		(rule__MathExp__Group__0)
		{ after(grammarAccess.getMathExpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExp
entryRuleExp
:
{ before(grammarAccess.getExpRule()); }
	 ruleExp
{ after(grammarAccess.getExpRule()); } 
	 EOF 
;

// Rule Exp
ruleExp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpAccess().getGroup()); }
		(rule__Exp__Group__0)
		{ after(grammarAccess.getExpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpOp
entryRuleExpOp
:
{ before(grammarAccess.getExpOpRule()); }
	 ruleExpOp
{ after(grammarAccess.getExpOpRule()); } 
	 EOF 
;

// Rule ExpOp
ruleExpOp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpOpAccess().getAlternatives()); }
		(rule__ExpOp__Alternatives)
		{ after(grammarAccess.getExpOpAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParenthesis
entryRuleParenthesis
:
{ before(grammarAccess.getParenthesisRule()); }
	 ruleParenthesis
{ after(grammarAccess.getParenthesisRule()); } 
	 EOF 
;

// Rule Parenthesis
ruleParenthesis 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParenthesisAccess().getGroup()); }
		(rule__Parenthesis__Group__0)
		{ after(grammarAccess.getParenthesisAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNumber
entryRuleNumber
:
{ before(grammarAccess.getNumberRule()); }
	 ruleNumber
{ after(grammarAccess.getNumberRule()); } 
	 EOF 
;

// Rule Number
ruleNumber 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNumberAccess().getValueAssignment()); }
		(rule__Number__ValueAssignment)
		{ after(grammarAccess.getNumberAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVariableUse
entryRuleVariableUse
:
{ before(grammarAccess.getVariableUseRule()); }
	 ruleVariableUse
{ after(grammarAccess.getVariableUseRule()); } 
	 EOF 
;

// Rule VariableUse
ruleVariableUse 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVariableUseAccess().getRefAssignment()); }
		(rule__VariableUse__RefAssignment)
		{ after(grammarAccess.getVariableUseAccess().getRefAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpOpAccess().getGroup_0()); }
		(rule__ExpOp__Group_0__0)
		{ after(grammarAccess.getExpOpAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpOpAccess().getGroup_1()); }
		(rule__ExpOp__Group_1__0)
		{ after(grammarAccess.getExpOpAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getExpOpAccess().getGroup_2()); }
		(rule__ExpOp__Group_2__0)
		{ after(grammarAccess.getExpOpAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getExpOpAccess().getGroup_3()); }
		(rule__ExpOp__Group_3__0)
		{ after(grammarAccess.getExpOpAccess().getGroup_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__0__Impl
	rule__MathExp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getVarKeyword_0()); }
	'var'
	{ after(grammarAccess.getMathExpAccess().getVarKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__1__Impl
	rule__MathExp__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getNameAssignment_1()); }
	(rule__MathExp__NameAssignment_1)
	{ after(grammarAccess.getMathExpAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__2__Impl
	rule__MathExp__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getEqualsSignKeyword_2()); }
	'='
	{ after(grammarAccess.getMathExpAccess().getEqualsSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getExpAssignment_3()); }
	(rule__MathExp__ExpAssignment_3)
	{ after(grammarAccess.getMathExpAccess().getExpAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Exp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group__0__Impl
	rule__Exp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getLeftAssignment_0()); }
	(rule__Exp__LeftAssignment_0)
	{ after(grammarAccess.getExpAccess().getLeftAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getGroup_1()); }
	(rule__Exp__Group_1__0)?
	{ after(grammarAccess.getExpAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Exp__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group_1__0__Impl
	rule__Exp__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getOperatorAssignment_1_0()); }
	(rule__Exp__OperatorAssignment_1_0)
	{ after(grammarAccess.getExpAccess().getOperatorAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Exp__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpAccess().getRightAssignment_1_1()); }
	(rule__Exp__RightAssignment_1_1)
	{ after(grammarAccess.getExpAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExpOp__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpOp__Group_0__0__Impl
	rule__ExpOp__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpOpAccess().getPlusAction_0_0()); }
	()
	{ after(grammarAccess.getExpOpAccess().getPlusAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpOp__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpOpAccess().getPlusSignKeyword_0_1()); }
	'+'
	{ after(grammarAccess.getExpOpAccess().getPlusSignKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExpOp__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpOp__Group_1__0__Impl
	rule__ExpOp__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpOpAccess().getMinusAction_1_0()); }
	()
	{ after(grammarAccess.getExpOpAccess().getMinusAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpOp__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpOpAccess().getHyphenMinusKeyword_1_1()); }
	'-'
	{ after(grammarAccess.getExpOpAccess().getHyphenMinusKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExpOp__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpOp__Group_2__0__Impl
	rule__ExpOp__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpOpAccess().getMultAction_2_0()); }
	()
	{ after(grammarAccess.getExpOpAccess().getMultAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpOp__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpOpAccess().getAsteriskKeyword_2_1()); }
	'*'
	{ after(grammarAccess.getExpOpAccess().getAsteriskKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExpOp__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpOp__Group_3__0__Impl
	rule__ExpOp__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpOpAccess().getDivAction_3_0()); }
	()
	{ after(grammarAccess.getExpOpAccess().getDivAction_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExpOp__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExpOp__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpOpAccess().getSolidusKeyword_3_1()); }
	'/'
	{ after(grammarAccess.getExpOpAccess().getSolidusKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Parenthesis__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parenthesis__Group__0__Impl
	rule__Parenthesis__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parenthesis__Group__1__Impl
	rule__Parenthesis__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesisAccess().getExpAssignment_1()); }
	(rule__Parenthesis__ExpAssignment_1)
	{ after(grammarAccess.getParenthesisAccess().getExpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parenthesis__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); }
	')'
	{ after(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MathExp__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__ExpAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0()); }
		ruleExp
		{ after(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__LeftAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpAccess().getLeftNumberParserRuleCall_0_0()); }
		ruleNumber
		{ after(grammarAccess.getExpAccess().getLeftNumberParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__OperatorAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpAccess().getOperatorExpOpParserRuleCall_1_0_0()); }
		ruleExpOp
		{ after(grammarAccess.getExpAccess().getOperatorExpOpParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Exp__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpAccess().getRightNumberParserRuleCall_1_1_0()); }
		ruleNumber
		{ after(grammarAccess.getExpAccess().getRightNumberParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__ExpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0()); }
		ruleExp
		{ after(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Number__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); }
		RULE_INT
		{ after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableUse__RefAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableUseAccess().getRefMathExpCrossReference_0()); }
		(
			{ before(grammarAccess.getVariableUseAccess().getRefMathExpIDTerminalRuleCall_0_1()); }
			RULE_ID
			{ after(grammarAccess.getVariableUseAccess().getRefMathExpIDTerminalRuleCall_0_1()); }
		)
		{ after(grammarAccess.getVariableUseAccess().getRefMathExpCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
