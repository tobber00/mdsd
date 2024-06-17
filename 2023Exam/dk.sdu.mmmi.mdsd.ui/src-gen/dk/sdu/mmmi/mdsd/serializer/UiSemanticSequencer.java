/*
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.serializer;

import com.google.inject.Inject;
import dk.sdu.mmmi.mdsd.services.UiGrammarAccess;
import dk.sdu.mmmi.mdsd.ui.And;
import dk.sdu.mmmi.mdsd.ui.Button;
import dk.sdu.mmmi.mdsd.ui.Column;
import dk.sdu.mmmi.mdsd.ui.Equals;
import dk.sdu.mmmi.mdsd.ui.Exp;
import dk.sdu.mmmi.mdsd.ui.Form;
import dk.sdu.mmmi.mdsd.ui.Greater;
import dk.sdu.mmmi.mdsd.ui.GreaterOrEqual;
import dk.sdu.mmmi.mdsd.ui.HashStringType;
import dk.sdu.mmmi.mdsd.ui.Input;
import dk.sdu.mmmi.mdsd.ui.InputUse;
import dk.sdu.mmmi.mdsd.ui.Label;
import dk.sdu.mmmi.mdsd.ui.Less;
import dk.sdu.mmmi.mdsd.ui.LessOrEqual;
import dk.sdu.mmmi.mdsd.ui.NotEqual;
import dk.sdu.mmmi.mdsd.ui.NumberType;
import dk.sdu.mmmi.mdsd.ui.Or;
import dk.sdu.mmmi.mdsd.ui.Row;
import dk.sdu.mmmi.mdsd.ui.StarButton;
import dk.sdu.mmmi.mdsd.ui.StringType;
import dk.sdu.mmmi.mdsd.ui.UI23;
import dk.sdu.mmmi.mdsd.ui.UiPackage;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class UiSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UiGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == UiPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case UiPackage.AND:
				sequence_BooleanExp(context, (And) semanticObject); 
				return; 
			case UiPackage.BUTTON:
				sequence_Button(context, (Button) semanticObject); 
				return; 
			case UiPackage.COLUMN:
				sequence_Column(context, (Column) semanticObject); 
				return; 
			case UiPackage.EQUALS:
				sequence_EqualityExp(context, (Equals) semanticObject); 
				return; 
			case UiPackage.EXP:
				sequence_Primary(context, (Exp) semanticObject); 
				return; 
			case UiPackage.FORM:
				sequence_Form(context, (Form) semanticObject); 
				return; 
			case UiPackage.GREATER:
				sequence_LessGreaterExp(context, (Greater) semanticObject); 
				return; 
			case UiPackage.GREATER_OR_EQUAL:
				sequence_LessGreaterExp(context, (GreaterOrEqual) semanticObject); 
				return; 
			case UiPackage.HASH_STRING_TYPE:
				sequence_Type(context, (HashStringType) semanticObject); 
				return; 
			case UiPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case UiPackage.INPUT_USE:
				sequence_InputUse(context, (InputUse) semanticObject); 
				return; 
			case UiPackage.LABEL:
				sequence_Label(context, (Label) semanticObject); 
				return; 
			case UiPackage.LESS:
				sequence_LessGreaterExp(context, (Less) semanticObject); 
				return; 
			case UiPackage.LESS_OR_EQUAL:
				sequence_LessGreaterExp(context, (LessOrEqual) semanticObject); 
				return; 
			case UiPackage.NOT_EQUAL:
				sequence_EqualityExp(context, (NotEqual) semanticObject); 
				return; 
			case UiPackage.NUMBER:
				sequence_Primary(context, (dk.sdu.mmmi.mdsd.ui.Number) semanticObject); 
				return; 
			case UiPackage.NUMBER_TYPE:
				sequence_Type(context, (NumberType) semanticObject); 
				return; 
			case UiPackage.OR:
				sequence_BooleanExp(context, (Or) semanticObject); 
				return; 
			case UiPackage.ROW:
				sequence_Row(context, (Row) semanticObject); 
				return; 
			case UiPackage.STAR_BUTTON:
				sequence_Button(context, (StarButton) semanticObject); 
				return; 
			case UiPackage.STRING_TYPE:
				sequence_Type(context, (StringType) semanticObject); 
				return; 
			case UiPackage.UI23:
				sequence_UI23(context, (UI23) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns And
	 *     BooleanExp returns And
	 *     BooleanExp.And_1_0_0 returns And
	 *     BooleanExp.Or_1_1_0 returns And
	 *
	 * Constraint:
	 *     (left=BooleanExp_And_1_0_0 right=EqualityExp)
	 * </pre>
	 */
	protected void sequence_BooleanExp(ISerializationContext context, And semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.AND__LEFT));
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.AND__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBooleanExpAccess().getAndLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBooleanExpAccess().getRightEqualityExpParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Or
	 *     BooleanExp returns Or
	 *     BooleanExp.And_1_0_0 returns Or
	 *     BooleanExp.Or_1_1_0 returns Or
	 *
	 * Constraint:
	 *     (left=BooleanExp_Or_1_1_0 right=EqualityExp)
	 * </pre>
	 */
	protected void sequence_BooleanExp(ISerializationContext context, Or semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.OR__LEFT));
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.OR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBooleanExpAccess().getOrLeftAction_1_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBooleanExpAccess().getRightEqualityExpParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Element returns Button
	 *     Button returns Button
	 *
	 * Constraint:
	 *     (name=ID value=STRING)
	 * </pre>
	 */
	protected void sequence_Button(ISerializationContext context, Button semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.BUTTON__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.BUTTON__NAME));
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.BUTTON__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.BUTTON__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_0_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getButtonAccess().getValueSTRINGTerminalRuleCall_0_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Element returns StarButton
	 *     Button returns StarButton
	 *
	 * Constraint:
	 *     (name=ID value=STRING)
	 * </pre>
	 */
	protected void sequence_Button(ISerializationContext context, StarButton semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.BUTTON__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.BUTTON__NAME));
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.BUTTON__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.BUTTON__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getButtonAccess().getValueSTRINGTerminalRuleCall_1_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Layout returns Column
	 *     Column returns Column
	 *     Element returns Column
	 *
	 * Constraint:
	 *     elements+=Element+
	 * </pre>
	 */
	protected void sequence_Column(ISerializationContext context, Column semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Equals
	 *     BooleanExp returns Equals
	 *     BooleanExp.And_1_0_0 returns Equals
	 *     BooleanExp.Or_1_1_0 returns Equals
	 *     EqualityExp returns Equals
	 *     EqualityExp.Equals_1_0_0 returns Equals
	 *     EqualityExp.NotEqual_1_1_0 returns Equals
	 *
	 * Constraint:
	 *     (left=EqualityExp_Equals_1_0_0 right=LessGreaterExp)
	 * </pre>
	 */
	protected void sequence_EqualityExp(ISerializationContext context, Equals semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.EQUALS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.EQUALS__LEFT));
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.EQUALS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.EQUALS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEqualityExpAccess().getEqualsLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getEqualityExpAccess().getRightLessGreaterExpParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns NotEqual
	 *     BooleanExp returns NotEqual
	 *     BooleanExp.And_1_0_0 returns NotEqual
	 *     BooleanExp.Or_1_1_0 returns NotEqual
	 *     EqualityExp returns NotEqual
	 *     EqualityExp.Equals_1_0_0 returns NotEqual
	 *     EqualityExp.NotEqual_1_1_0 returns NotEqual
	 *
	 * Constraint:
	 *     (left=EqualityExp_NotEqual_1_1_0 right=LessGreaterExp)
	 * </pre>
	 */
	protected void sequence_EqualityExp(ISerializationContext context, NotEqual semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.NOT_EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.NOT_EQUAL__LEFT));
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.NOT_EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.NOT_EQUAL__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEqualityExpAccess().getNotEqualLeftAction_1_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getEqualityExpAccess().getRightLessGreaterExpParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Form returns Form
	 *
	 * Constraint:
	 *     (name=ID layout=Layout)
	 * </pre>
	 */
	protected void sequence_Form(ISerializationContext context, Form semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.FORM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.FORM__NAME));
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.FORM__LAYOUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.FORM__LAYOUT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFormAccess().getLayoutLayoutParserRuleCall_3_0(), semanticObject.getLayout());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns InputUse
	 *     BooleanExp returns InputUse
	 *     BooleanExp.And_1_0_0 returns InputUse
	 *     BooleanExp.Or_1_1_0 returns InputUse
	 *     EqualityExp returns InputUse
	 *     EqualityExp.Equals_1_0_0 returns InputUse
	 *     EqualityExp.NotEqual_1_1_0 returns InputUse
	 *     LessGreaterExp returns InputUse
	 *     LessGreaterExp.Less_1_0_0 returns InputUse
	 *     LessGreaterExp.LessOrEqual_1_1_0 returns InputUse
	 *     LessGreaterExp.Greater_1_2_0 returns InputUse
	 *     LessGreaterExp.GreaterOrEqual_1_3_0 returns InputUse
	 *     Primary returns InputUse
	 *     InputUse returns InputUse
	 *
	 * Constraint:
	 *     ref=[Input|ID]
	 * </pre>
	 */
	protected void sequence_InputUse(ISerializationContext context, InputUse semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.INPUT_USE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.INPUT_USE__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInputUseAccess().getRefInputIDTerminalRuleCall_0_1(), semanticObject.eGet(UiPackage.Literals.INPUT_USE__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Element returns Input
	 *     Input returns Input
	 *
	 * Constraint:
	 *     (name=ID exp=Exp)
	 * </pre>
	 */
	protected void sequence_Input(ISerializationContext context, Input semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.INPUT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.INPUT__NAME));
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.INPUT__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.INPUT__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInputAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInputAccess().getExpExpParserRuleCall_3_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Element returns Label
	 *     Label returns Label
	 *
	 * Constraint:
	 *     value=STRING
	 * </pre>
	 */
	protected void sequence_Label(ISerializationContext context, Label semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.LABEL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.LABEL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLabelAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Greater
	 *     BooleanExp returns Greater
	 *     BooleanExp.And_1_0_0 returns Greater
	 *     BooleanExp.Or_1_1_0 returns Greater
	 *     EqualityExp returns Greater
	 *     EqualityExp.Equals_1_0_0 returns Greater
	 *     EqualityExp.NotEqual_1_1_0 returns Greater
	 *     LessGreaterExp returns Greater
	 *     LessGreaterExp.Less_1_0_0 returns Greater
	 *     LessGreaterExp.LessOrEqual_1_1_0 returns Greater
	 *     LessGreaterExp.Greater_1_2_0 returns Greater
	 *     LessGreaterExp.GreaterOrEqual_1_3_0 returns Greater
	 *
	 * Constraint:
	 *     (left=LessGreaterExp_Greater_1_2_0 right=Primary)
	 * </pre>
	 */
	protected void sequence_LessGreaterExp(ISerializationContext context, Greater semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.GREATER__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.GREATER__LEFT));
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.GREATER__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.GREATER__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLessGreaterExpAccess().getGreaterLeftAction_1_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getLessGreaterExpAccess().getRightPrimaryParserRuleCall_1_2_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns GreaterOrEqual
	 *     BooleanExp returns GreaterOrEqual
	 *     BooleanExp.And_1_0_0 returns GreaterOrEqual
	 *     BooleanExp.Or_1_1_0 returns GreaterOrEqual
	 *     EqualityExp returns GreaterOrEqual
	 *     EqualityExp.Equals_1_0_0 returns GreaterOrEqual
	 *     EqualityExp.NotEqual_1_1_0 returns GreaterOrEqual
	 *     LessGreaterExp returns GreaterOrEqual
	 *     LessGreaterExp.Less_1_0_0 returns GreaterOrEqual
	 *     LessGreaterExp.LessOrEqual_1_1_0 returns GreaterOrEqual
	 *     LessGreaterExp.Greater_1_2_0 returns GreaterOrEqual
	 *     LessGreaterExp.GreaterOrEqual_1_3_0 returns GreaterOrEqual
	 *
	 * Constraint:
	 *     (left=LessGreaterExp_GreaterOrEqual_1_3_0 right=Primary)
	 * </pre>
	 */
	protected void sequence_LessGreaterExp(ISerializationContext context, GreaterOrEqual semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.GREATER_OR_EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.GREATER_OR_EQUAL__LEFT));
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.GREATER_OR_EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.GREATER_OR_EQUAL__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLessGreaterExpAccess().getGreaterOrEqualLeftAction_1_3_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getLessGreaterExpAccess().getRightPrimaryParserRuleCall_1_3_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Less
	 *     BooleanExp returns Less
	 *     BooleanExp.And_1_0_0 returns Less
	 *     BooleanExp.Or_1_1_0 returns Less
	 *     EqualityExp returns Less
	 *     EqualityExp.Equals_1_0_0 returns Less
	 *     EqualityExp.NotEqual_1_1_0 returns Less
	 *     LessGreaterExp returns Less
	 *     LessGreaterExp.Less_1_0_0 returns Less
	 *     LessGreaterExp.LessOrEqual_1_1_0 returns Less
	 *     LessGreaterExp.Greater_1_2_0 returns Less
	 *     LessGreaterExp.GreaterOrEqual_1_3_0 returns Less
	 *
	 * Constraint:
	 *     (left=LessGreaterExp_Less_1_0_0 right=Primary)
	 * </pre>
	 */
	protected void sequence_LessGreaterExp(ISerializationContext context, Less semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.LESS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.LESS__LEFT));
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.LESS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.LESS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLessGreaterExpAccess().getLessLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getLessGreaterExpAccess().getRightPrimaryParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns LessOrEqual
	 *     BooleanExp returns LessOrEqual
	 *     BooleanExp.And_1_0_0 returns LessOrEqual
	 *     BooleanExp.Or_1_1_0 returns LessOrEqual
	 *     EqualityExp returns LessOrEqual
	 *     EqualityExp.Equals_1_0_0 returns LessOrEqual
	 *     EqualityExp.NotEqual_1_1_0 returns LessOrEqual
	 *     LessGreaterExp returns LessOrEqual
	 *     LessGreaterExp.Less_1_0_0 returns LessOrEqual
	 *     LessGreaterExp.LessOrEqual_1_1_0 returns LessOrEqual
	 *     LessGreaterExp.Greater_1_2_0 returns LessOrEqual
	 *     LessGreaterExp.GreaterOrEqual_1_3_0 returns LessOrEqual
	 *
	 * Constraint:
	 *     (left=LessGreaterExp_LessOrEqual_1_1_0 right=Primary)
	 * </pre>
	 */
	protected void sequence_LessGreaterExp(ISerializationContext context, LessOrEqual semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.LESS_OR_EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.LESS_OR_EQUAL__LEFT));
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.LESS_OR_EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.LESS_OR_EQUAL__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLessGreaterExpAccess().getLessOrEqualLeftAction_1_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getLessGreaterExpAccess().getRightPrimaryParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Exp
	 *     BooleanExp returns Exp
	 *     BooleanExp.And_1_0_0 returns Exp
	 *     BooleanExp.Or_1_1_0 returns Exp
	 *     EqualityExp returns Exp
	 *     EqualityExp.Equals_1_0_0 returns Exp
	 *     EqualityExp.NotEqual_1_1_0 returns Exp
	 *     LessGreaterExp returns Exp
	 *     LessGreaterExp.Less_1_0_0 returns Exp
	 *     LessGreaterExp.LessOrEqual_1_1_0 returns Exp
	 *     LessGreaterExp.Greater_1_2_0 returns Exp
	 *     LessGreaterExp.GreaterOrEqual_1_3_0 returns Exp
	 *     Primary returns Exp
	 *
	 * Constraint:
	 *     type=Type
	 * </pre>
	 */
	protected void sequence_Primary(ISerializationContext context, Exp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.EXP__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.EXP__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Exp returns Number
	 *     BooleanExp returns Number
	 *     BooleanExp.And_1_0_0 returns Number
	 *     BooleanExp.Or_1_1_0 returns Number
	 *     EqualityExp returns Number
	 *     EqualityExp.Equals_1_0_0 returns Number
	 *     EqualityExp.NotEqual_1_1_0 returns Number
	 *     LessGreaterExp returns Number
	 *     LessGreaterExp.Less_1_0_0 returns Number
	 *     LessGreaterExp.LessOrEqual_1_1_0 returns Number
	 *     LessGreaterExp.Greater_1_2_0 returns Number
	 *     LessGreaterExp.GreaterOrEqual_1_3_0 returns Number
	 *     Primary returns Number
	 *
	 * Constraint:
	 *     value=INT
	 * </pre>
	 */
	protected void sequence_Primary(ISerializationContext context, dk.sdu.mmmi.mdsd.ui.Number semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.NUMBER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Layout returns Row
	 *     Row returns Row
	 *     Element returns Row
	 *
	 * Constraint:
	 *     elements+=Element+
	 * </pre>
	 */
	protected void sequence_Row(ISerializationContext context, Row semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Type returns HashStringType
	 *
	 * Constraint:
	 *     value='#string'
	 * </pre>
	 */
	protected void sequence_Type(ISerializationContext context, HashStringType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.TYPE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeAccess().getValueStringKeyword_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Type returns NumberType
	 *
	 * Constraint:
	 *     value='number'
	 * </pre>
	 */
	protected void sequence_Type(ISerializationContext context, NumberType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.TYPE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeAccess().getValueNumberKeyword_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Type returns StringType
	 *
	 * Constraint:
	 *     value='string'
	 * </pre>
	 */
	protected void sequence_Type(ISerializationContext context, StringType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.TYPE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.TYPE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeAccess().getValueStringKeyword_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     UI23 returns UI23
	 *
	 * Constraint:
	 *     (name=ID form=Form)
	 * </pre>
	 */
	protected void sequence_UI23(ISerializationContext context, UI23 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.UI23__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.UI23__NAME));
			if (transientValues.isValueTransient(semanticObject, UiPackage.Literals.UI23__FORM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UiPackage.Literals.UI23__FORM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUI23Access().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getUI23Access().getFormFormParserRuleCall_2_0(), semanticObject.getForm());
		feeder.finish();
	}
	
	
}
