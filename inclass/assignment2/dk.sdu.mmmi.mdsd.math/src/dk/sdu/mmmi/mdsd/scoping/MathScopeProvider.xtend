/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import dk.sdu.mmmi.mdsd.math.VariableUse
import org.eclipse.xtext.scoping.IScope
import dk.sdu.mmmi.mdsd.math.LetBinding
import org.eclipse.xtext.scoping.Scopes
import dk.sdu.mmmi.mdsd.math.MathExp

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MathScopeProvider extends AbstractMathScopeProvider {
	override getScope(EObject context, EReference reference) {
		switch context {
			VariableUse: return context.scopeForVarUse
		}
		return super.getScope(context, reference)
	}
	
	def IScope scopeForVarUse(EObject context) {
		val container = context.eContainer
		switch container {
			LetBinding: {
				if(container.binding == context) {
					container.scopeForVarUse
				} else {
					Scopes.scopeFor(#[container], container.scopeForVarUse)
				}
			}
			MathExp: Scopes.scopeFor(container.varExp.filter[it != context])
			default: container.scopeForVarUse
		}
	}
}
