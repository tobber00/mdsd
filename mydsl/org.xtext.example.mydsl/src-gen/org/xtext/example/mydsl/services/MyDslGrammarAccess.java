/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class EntityRootElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.EntityRoot");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSystemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cEntitiesAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cEntitiesEntityParserRuleCall_2_0_0 = (RuleCall)cEntitiesAssignment_2_0.eContents().get(0);
		private final Assignment cRelationsAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cRelationsRelationParserRuleCall_2_1_0 = (RuleCall)cRelationsAssignment_2_1.eContents().get(0);
		
		//EntityRoot:
		//    'system' name=ID (entities+=Entity | relations+=Relation)*;
		@Override public ParserRule getRule() { return rule; }
		
		//'system' name=ID (entities+=Entity | relations+=Relation)*
		public Group getGroup() { return cGroup; }
		
		//'system'
		public Keyword getSystemKeyword_0() { return cSystemKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//(entities+=Entity | relations+=Relation)*
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//entities+=Entity
		public Assignment getEntitiesAssignment_2_0() { return cEntitiesAssignment_2_0; }
		
		//Entity
		public RuleCall getEntitiesEntityParserRuleCall_2_0_0() { return cEntitiesEntityParserRuleCall_2_0_0; }
		
		//relations+=Relation
		public Assignment getRelationsAssignment_2_1() { return cRelationsAssignment_2_1; }
		
		//Relation
		public RuleCall getRelationsRelationParserRuleCall_2_1_0() { return cRelationsRelationParserRuleCall_2_1_0; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cAttributesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAttributesAttributeParserRuleCall_2_0 = (RuleCall)cAttributesAssignment_2.eContents().get(0);
		
		//Entity:
		//    'entity' name=ID attributes+=Attribute*;
		@Override public ParserRule getRule() { return rule; }
		
		//'entity' name=ID attributes+=Attribute*
		public Group getGroup() { return cGroup; }
		
		//'entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//attributes+=Attribute*
		public Assignment getAttributesAssignment_2() { return cAttributesAssignment_2; }
		
		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_2_0() { return cAttributesAttributeParserRuleCall_2_0; }
	}
	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAttributeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cAsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeTypeParserRuleCall_3_0 = (RuleCall)cTypeAssignment_3.eContents().get(0);
		
		//Attribute:
		//    'attribute' name=ID 'as' type=Type;
		@Override public ParserRule getRule() { return rule; }
		
		//'attribute' name=ID 'as' type=Type
		public Group getGroup() { return cGroup; }
		
		//'attribute'
		public Keyword getAttributeKeyword_0() { return cAttributeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'as'
		public Keyword getAsKeyword_2() { return cAsKeyword_2; }
		
		//type=Type
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }
		
		//Type
		public RuleCall getTypeTypeParserRuleCall_3_0() { return cTypeTypeParserRuleCall_3_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cStringKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cNumberKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//Type:
		//    'string' | 'number';
		@Override public ParserRule getRule() { return rule; }
		
		//'string' | 'number'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'string'
		public Keyword getStringKeyword_0() { return cStringKeyword_0; }
		
		//'number'
		public Keyword getNumberKeyword_1() { return cNumberKeyword_1; }
	}
	public class RelationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Relation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRelationAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cRelationsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cRelationsAlternatives_1_0 = (Alternatives)cRelationsAssignment_1.eContents().get(0);
		private final RuleCall cRelationsInheritanceParserRuleCall_1_0_0 = (RuleCall)cRelationsAlternatives_1_0.eContents().get(0);
		private final RuleCall cRelationsAssociationParserRuleCall_1_0_1 = (RuleCall)cRelationsAlternatives_1_0.eContents().get(1);
		
		//Relation:
		//    {Relation} relations+=(Inheritance | Association)*;
		@Override public ParserRule getRule() { return rule; }
		
		//{Relation} relations+=(Inheritance | Association)*
		public Group getGroup() { return cGroup; }
		
		//{Relation}
		public Action getRelationAction_0() { return cRelationAction_0; }
		
		//relations+=(Inheritance | Association)*
		public Assignment getRelationsAssignment_1() { return cRelationsAssignment_1; }
		
		//(Inheritance | Association)
		public Alternatives getRelationsAlternatives_1_0() { return cRelationsAlternatives_1_0; }
		
		//Inheritance
		public RuleCall getRelationsInheritanceParserRuleCall_1_0_0() { return cRelationsInheritanceParserRuleCall_1_0_0; }
		
		//Association
		public RuleCall getRelationsAssociationParserRuleCall_1_0_1() { return cRelationsAssociationParserRuleCall_1_0_1; }
	}
	public class InheritanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Inheritance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRelationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFromAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFromIDTerminalRuleCall_1_0 = (RuleCall)cFromAssignment_1.eContents().get(0);
		private final Keyword cIsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cToAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cToIDTerminalRuleCall_3_0 = (RuleCall)cToAssignment_3.eContents().get(0);
		
		//Inheritance:
		//    'relation' from=ID 'is' to=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'relation' from=ID 'is' to=ID
		public Group getGroup() { return cGroup; }
		
		//'relation'
		public Keyword getRelationKeyword_0() { return cRelationKeyword_0; }
		
		//from=ID
		public Assignment getFromAssignment_1() { return cFromAssignment_1; }
		
		//ID
		public RuleCall getFromIDTerminalRuleCall_1_0() { return cFromIDTerminalRuleCall_1_0; }
		
		//'is'
		public Keyword getIsKeyword_2() { return cIsKeyword_2; }
		
		//to=ID
		public Assignment getToAssignment_3() { return cToAssignment_3; }
		
		//ID
		public RuleCall getToIDTerminalRuleCall_3_0() { return cToIDTerminalRuleCall_3_0; }
	}
	public class AssociationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Association");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRelationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cAKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Keyword cManyKeyword_1_1 = (Keyword)cAlternatives_1.eContents().get(1);
		private final Assignment cFromAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFromIDTerminalRuleCall_2_0 = (RuleCall)cFromAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Keyword cHasKeyword_3_0 = (Keyword)cAlternatives_3.eContents().get(0);
		private final Keyword cHaveKeyword_3_1 = (Keyword)cAlternatives_3.eContents().get(1);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Keyword cAKeyword_4_0 = (Keyword)cAlternatives_4.eContents().get(0);
		private final Keyword cManyKeyword_4_1 = (Keyword)cAlternatives_4.eContents().get(1);
		private final Assignment cToAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cToIDTerminalRuleCall_5_0 = (RuleCall)cToAssignment_5.eContents().get(0);
		
		//Association:
		//    'relation' ('a' | 'many')* from=ID ('has' | 'have') ('a' | 'many')* to=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'relation' ('a' | 'many')* from=ID ('has' | 'have') ('a' | 'many')* to=ID
		public Group getGroup() { return cGroup; }
		
		//'relation'
		public Keyword getRelationKeyword_0() { return cRelationKeyword_0; }
		
		//('a' | 'many')*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//'a'
		public Keyword getAKeyword_1_0() { return cAKeyword_1_0; }
		
		//'many'
		public Keyword getManyKeyword_1_1() { return cManyKeyword_1_1; }
		
		//from=ID
		public Assignment getFromAssignment_2() { return cFromAssignment_2; }
		
		//ID
		public RuleCall getFromIDTerminalRuleCall_2_0() { return cFromIDTerminalRuleCall_2_0; }
		
		//('has' | 'have')
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//'has'
		public Keyword getHasKeyword_3_0() { return cHasKeyword_3_0; }
		
		//'have'
		public Keyword getHaveKeyword_3_1() { return cHaveKeyword_3_1; }
		
		//('a' | 'many')*
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//'a'
		public Keyword getAKeyword_4_0() { return cAKeyword_4_0; }
		
		//'many'
		public Keyword getManyKeyword_4_1() { return cManyKeyword_4_1; }
		
		//to=ID
		public Assignment getToAssignment_5() { return cToAssignment_5; }
		
		//ID
		public RuleCall getToIDTerminalRuleCall_5_0() { return cToIDTerminalRuleCall_5_0; }
	}
	
	
	private final EntityRootElements pEntityRoot;
	private final EntityElements pEntity;
	private final AttributeElements pAttribute;
	private final TypeElements pType;
	private final RelationElements pRelation;
	private final InheritanceElements pInheritance;
	private final AssociationElements pAssociation;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pEntityRoot = new EntityRootElements();
		this.pEntity = new EntityElements();
		this.pAttribute = new AttributeElements();
		this.pType = new TypeElements();
		this.pRelation = new RelationElements();
		this.pInheritance = new InheritanceElements();
		this.pAssociation = new AssociationElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//EntityRoot:
	//    'system' name=ID (entities+=Entity | relations+=Relation)*;
	public EntityRootElements getEntityRootAccess() {
		return pEntityRoot;
	}
	
	public ParserRule getEntityRootRule() {
		return getEntityRootAccess().getRule();
	}
	
	//Entity:
	//    'entity' name=ID attributes+=Attribute*;
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//Attribute:
	//    'attribute' name=ID 'as' type=Type;
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//Type:
	//    'string' | 'number';
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//Relation:
	//    {Relation} relations+=(Inheritance | Association)*;
	public RelationElements getRelationAccess() {
		return pRelation;
	}
	
	public ParserRule getRelationRule() {
		return getRelationAccess().getRule();
	}
	
	//Inheritance:
	//    'relation' from=ID 'is' to=ID;
	public InheritanceElements getInheritanceAccess() {
		return pInheritance;
	}
	
	public ParserRule getInheritanceRule() {
		return getInheritanceAccess().getRule();
	}
	
	//Association:
	//    'relation' ('a' | 'many')* from=ID ('has' | 'have') ('a' | 'many')* to=ID;
	public AssociationElements getAssociationAccess() {
		return pAssociation;
	}
	
	public ParserRule getAssociationRule() {
		return getAssociationAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
