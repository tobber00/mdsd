/*
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal.InternalUiParser;
import dk.sdu.mmmi.mdsd.services.UiGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class UiParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(UiGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, UiGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getLayoutAccess().getAlternatives(), "rule__Layout__Alternatives");
			builder.put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
			builder.put(grammarAccess.getButtonAccess().getAlternatives(), "rule__Button__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getBooleanExpAccess().getAlternatives_1(), "rule__BooleanExp__Alternatives_1");
			builder.put(grammarAccess.getEqualityExpAccess().getAlternatives_1(), "rule__EqualityExp__Alternatives_1");
			builder.put(grammarAccess.getLessGreaterExpAccess().getAlternatives_1(), "rule__LessGreaterExp__Alternatives_1");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getUI23Access().getGroup(), "rule__UI23__Group__0");
			builder.put(grammarAccess.getFormAccess().getGroup(), "rule__Form__Group__0");
			builder.put(grammarAccess.getColumnAccess().getGroup(), "rule__Column__Group__0");
			builder.put(grammarAccess.getRowAccess().getGroup(), "rule__Row__Group__0");
			builder.put(grammarAccess.getLabelAccess().getGroup(), "rule__Label__Group__0");
			builder.put(grammarAccess.getInputAccess().getGroup(), "rule__Input__Group__0");
			builder.put(grammarAccess.getButtonAccess().getGroup_0(), "rule__Button__Group_0__0");
			builder.put(grammarAccess.getButtonAccess().getGroup_1(), "rule__Button__Group_1__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_0(), "rule__Type__Group_0__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_1(), "rule__Type__Group_1__0");
			builder.put(grammarAccess.getTypeAccess().getGroup_2(), "rule__Type__Group_2__0");
			builder.put(grammarAccess.getBooleanExpAccess().getGroup(), "rule__BooleanExp__Group__0");
			builder.put(grammarAccess.getBooleanExpAccess().getGroup_1_0(), "rule__BooleanExp__Group_1_0__0");
			builder.put(grammarAccess.getBooleanExpAccess().getGroup_1_1(), "rule__BooleanExp__Group_1_1__0");
			builder.put(grammarAccess.getEqualityExpAccess().getGroup(), "rule__EqualityExp__Group__0");
			builder.put(grammarAccess.getEqualityExpAccess().getGroup_1_0(), "rule__EqualityExp__Group_1_0__0");
			builder.put(grammarAccess.getEqualityExpAccess().getGroup_1_1(), "rule__EqualityExp__Group_1_1__0");
			builder.put(grammarAccess.getLessGreaterExpAccess().getGroup(), "rule__LessGreaterExp__Group__0");
			builder.put(grammarAccess.getLessGreaterExpAccess().getGroup_1_0(), "rule__LessGreaterExp__Group_1_0__0");
			builder.put(grammarAccess.getLessGreaterExpAccess().getGroup_1_1(), "rule__LessGreaterExp__Group_1_1__0");
			builder.put(grammarAccess.getLessGreaterExpAccess().getGroup_1_2(), "rule__LessGreaterExp__Group_1_2__0");
			builder.put(grammarAccess.getLessGreaterExpAccess().getGroup_1_3(), "rule__LessGreaterExp__Group_1_3__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
			builder.put(grammarAccess.getUI23Access().getNameAssignment_1(), "rule__UI23__NameAssignment_1");
			builder.put(grammarAccess.getUI23Access().getFormAssignment_2(), "rule__UI23__FormAssignment_2");
			builder.put(grammarAccess.getFormAccess().getNameAssignment_1(), "rule__Form__NameAssignment_1");
			builder.put(grammarAccess.getFormAccess().getLayoutAssignment_3(), "rule__Form__LayoutAssignment_3");
			builder.put(grammarAccess.getColumnAccess().getElementsAssignment_2(), "rule__Column__ElementsAssignment_2");
			builder.put(grammarAccess.getRowAccess().getElementsAssignment_2(), "rule__Row__ElementsAssignment_2");
			builder.put(grammarAccess.getLabelAccess().getValueAssignment_2(), "rule__Label__ValueAssignment_2");
			builder.put(grammarAccess.getInputAccess().getNameAssignment_1(), "rule__Input__NameAssignment_1");
			builder.put(grammarAccess.getInputAccess().getExpAssignment_3(), "rule__Input__ExpAssignment_3");
			builder.put(grammarAccess.getButtonAccess().getNameAssignment_0_1(), "rule__Button__NameAssignment_0_1");
			builder.put(grammarAccess.getButtonAccess().getValueAssignment_0_3(), "rule__Button__ValueAssignment_0_3");
			builder.put(grammarAccess.getButtonAccess().getNameAssignment_1_2(), "rule__Button__NameAssignment_1_2");
			builder.put(grammarAccess.getButtonAccess().getValueAssignment_1_4(), "rule__Button__ValueAssignment_1_4");
			builder.put(grammarAccess.getTypeAccess().getValueAssignment_0_1(), "rule__Type__ValueAssignment_0_1");
			builder.put(grammarAccess.getTypeAccess().getValueAssignment_1_1(), "rule__Type__ValueAssignment_1_1");
			builder.put(grammarAccess.getTypeAccess().getValueAssignment_2_1(), "rule__Type__ValueAssignment_2_1");
			builder.put(grammarAccess.getBooleanExpAccess().getRightAssignment_1_0_2(), "rule__BooleanExp__RightAssignment_1_0_2");
			builder.put(grammarAccess.getBooleanExpAccess().getRightAssignment_1_1_2(), "rule__BooleanExp__RightAssignment_1_1_2");
			builder.put(grammarAccess.getEqualityExpAccess().getRightAssignment_1_0_2(), "rule__EqualityExp__RightAssignment_1_0_2");
			builder.put(grammarAccess.getEqualityExpAccess().getRightAssignment_1_1_2(), "rule__EqualityExp__RightAssignment_1_1_2");
			builder.put(grammarAccess.getLessGreaterExpAccess().getRightAssignment_1_0_2(), "rule__LessGreaterExp__RightAssignment_1_0_2");
			builder.put(grammarAccess.getLessGreaterExpAccess().getRightAssignment_1_1_2(), "rule__LessGreaterExp__RightAssignment_1_1_2");
			builder.put(grammarAccess.getLessGreaterExpAccess().getRightAssignment_1_2_2(), "rule__LessGreaterExp__RightAssignment_1_2_2");
			builder.put(grammarAccess.getLessGreaterExpAccess().getRightAssignment_1_3_2(), "rule__LessGreaterExp__RightAssignment_1_3_2");
			builder.put(grammarAccess.getPrimaryAccess().getValueAssignment_0_1(), "rule__Primary__ValueAssignment_0_1");
			builder.put(grammarAccess.getPrimaryAccess().getTypeAssignment_1(), "rule__Primary__TypeAssignment_1");
			builder.put(grammarAccess.getInputUseAccess().getRefAssignment(), "rule__InputUse__RefAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private UiGrammarAccess grammarAccess;

	@Override
	protected InternalUiParser createParser() {
		InternalUiParser result = new InternalUiParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public UiGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UiGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
