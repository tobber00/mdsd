/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.myDsl.EntityRoot
import org.xtext.example.mydsl.myDsl.Entity

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
		val sys = resource.allContents.filter(EntityRoot).next
		for (entity: resource.allContents.toIterable.filter(Entity)) {
			fsa.generateFile(entity.name + ".java", entity.compile(sys))
		}
	}
	
	def compile(Entity entity, EntityRoot root)'''
	package <<root.name>>;
	public class <<entity.name>> {
		
	};
	'''
}