/*
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.math.Div
import dk.sdu.mmmi.mdsd.math.LetBinding
import dk.sdu.mmmi.mdsd.math.MathExp
import dk.sdu.mmmi.mdsd.math.MathNumber
import dk.sdu.mmmi.mdsd.math.Minus
import dk.sdu.mmmi.mdsd.math.Mult
import dk.sdu.mmmi.mdsd.math.Plus
import dk.sdu.mmmi.mdsd.math.VarBinding
import dk.sdu.mmmi.mdsd.math.VariableUse
import java.util.HashMap
import java.util.Map
import javax.swing.JOptionPane
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MathGenerator extends AbstractGenerator {
	
	static Map<String, Integer> variables;

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val math = resource.allContents.filter(MathExp).next
		//val result = math.compute
		//result.displayPanel

		fsa.generateFile('''math_expression/«math.name».java''', math.compile)
	}
	
	def static String compile(MathExp math) {
		
		'''
		package math_expression;
		public class «math.name» {

			public int x;
			public int y;

			private External external;
			
			public MathComputation(External external) {
				this.external = external
			}

			public void compute() {
				x = 2 + 2;
				y = this.external.sqrt(x);
			}

			interface External {
				public int sqrt(int n);
			}
		}
		'''
	}
		
	def void displayPanel(Map<String, Integer> result) {
		var resultString = ""
		for (entry : result.entrySet()) {
         	resultString += "var " + entry.getKey() + " = " + entry.getValue() + "\n"
        }
		
		JOptionPane.showMessageDialog(null, resultString ,"Math Language", JOptionPane.INFORMATION_MESSAGE)
	}
	
	def static compute(MathExp math) {
		variables = new HashMap()
		for(varBinding: math.variables)
			varBinding.computeExpression()
		variables
	}
	
	def static dispatch int computeExpression(VarBinding binding) {
		variables.put(binding.name, binding.expression.computeExpression())
		return variables.get(binding.name)
	}
	
	def static dispatch int computeExpression(MathNumber exp) {
		exp.value
	}

	def static dispatch int computeExpression(Plus exp) {
		exp.left.computeExpression + exp.right.computeExpression
	}
	
	def static dispatch int computeExpression(Minus exp) {
		exp.left.computeExpression - exp.right.computeExpression
	}
	
	def static dispatch int computeExpression(Mult exp) {
		exp.left.computeExpression * exp.right.computeExpression
	}
	
	def static dispatch int computeExpression(Div exp) {
		exp.left.computeExpression / exp.right.computeExpression
	}

	def static dispatch int computeExpression(LetBinding exp) {
		exp.body.computeExpression
	}
	
	def static dispatch int computeExpression(VariableUse exp) {
		exp.ref.computeBinding
	}

	def static dispatch int computeBinding(VarBinding binding){
		if(!variables.containsKey(binding.name))
			binding.computeExpression()			
		variables.get(binding.name)
	}
	
	def static dispatch int computeBinding(LetBinding binding){
		binding.binding.computeExpression
	}
	
}
