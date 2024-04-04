/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.math.Div
import dk.sdu.mmmi.mdsd.math.Exp
import dk.sdu.mmmi.mdsd.math.MathExp
import dk.sdu.mmmi.mdsd.math.Minus
import dk.sdu.mmmi.mdsd.math.Mult
import dk.sdu.mmmi.mdsd.math.Number
import dk.sdu.mmmi.mdsd.math.Plus
import java.util.HashMap
import java.util.Map
import javax.swing.JOptionPane
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import dk.sdu.mmmi.mdsd.math.VariableUse
import dk.sdu.mmmi.mdsd.math.LetBinding
import dk.sdu.mmmi.mdsd.math.VariableExp

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MathGenerator extends AbstractGenerator {

	static Map<String, Integer> variables = new HashMap();
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val math = resource.allContents.filter(MathExp).next
		val result = math.compute
		
		// You can replace with hovering, see Bettini Chapter 8
		//result.displayPanel
		
		//fsa.generateFile('''"math_expression/«math.name».java"''', math.compile)
	}
	
	/*def compile(MathExp math) {
		'''
		Package math_expression;
		
		public class «math.name» {
			«FOR variable: math.varExp»
				public int «variable.name»;
			«ENDFOR»
			
			public void compute() {
				«FOR variable: math.varExp»
				«variable.name» = «variable.exp.computeExp»;
				«ENDFOR»
			}
		}
		'''
	}*/
	
	//
	// Compute function: computes value of expression
	// Note: written according to illegal left-recursive grammar, requires fix
	//
	
	def static compute(MathExp math) {
		variables = newHashMap()
		for (variableExp: math.varExp) {
			variables.put(variableExp.name, variableExp.exp.computeExp)
		}
		return variables
	}
	
	//def CharSequence compute(Exp exp) {
	def static int computeExp(Exp exp) {
		switch exp {
			Number: exp.value
			//Plus: exp.left.computeExp + '+' + exp.right.computeExp
			Plus: exp.left.computeExp+exp.right.computeExp
			Minus: exp.left.computeExp-exp.right.computeExp
			Mult: exp.left.computeExp*exp.right.computeExp
			Div: exp.left.computeExp/exp.right.computeExp
			VariableUse: exp.ref.computeVariableBinding
			LetBinding: exp.body.computeExp
		}
	}
	
	def static dispatch int computeVariableBinding(VariableExp exp) {
		variables.get(exp.name)
	}
	
	def static dispatch int computeVariableBinding(LetBinding exp) {
		exp.binding.computeExp
	}
}
