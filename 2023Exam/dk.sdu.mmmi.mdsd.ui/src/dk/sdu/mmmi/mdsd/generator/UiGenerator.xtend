/*
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import dk.sdu.mmmi.mdsd.ui.UI23
import dk.sdu.mmmi.mdsd.ui.Form
import dk.sdu.mmmi.mdsd.ui.Label
import dk.sdu.mmmi.mdsd.ui.Column
import dk.sdu.mmmi.mdsd.ui.Row
import dk.sdu.mmmi.mdsd.ui.Layout
import java.util.ArrayList
import dk.sdu.mmmi.mdsd.ui.Input
import dk.sdu.mmmi.mdsd.ui.Button
import dk.sdu.mmmi.mdsd.ui.StringType
import dk.sdu.mmmi.mdsd.ui.StarButton
import dk.sdu.mmmi.mdsd.ui.HashStringType
import dk.sdu.mmmi.mdsd.ui.Greater
import dk.sdu.mmmi.mdsd.ui.Number

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class UiGenerator extends AbstractGenerator {
	
	var static panelNum = 1
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val ui23 = resource.allContents.filter(UI23).next
		val path = camelToSnake(ui23.name)
		panelNum = 1
		
		fsa.generateFile('''user_interface/«path»/UserInterface.java''', generateUserinterface(path, ui23))
		fsa.generateFile('''user_interface/«path»/«ui23.form.name»Form.java''', generateForm(path, ui23, ui23.form))
		fsa.generateFile('''user_interface/common/Form.java''', generateCommon())
	}
	
	def static String generateUserinterface(String path, UI23 ui23) {
		'''
		package user_interface.«path»;
		    
		import javax.swing.*;
		
		public class UserInterface{
		    public JFrame frame;
		
		    public void open() {
		        frame = new JFrame("«ui23.name»");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        «ui23.form.name»Form form = new «ui23.form.name»Form(this);
		        frame.add(form.createPanel());
		        frame.pack();
		        frame.setVisible(true);
		    }
		}
		'''
	}
	
	def static String generateForm(String path, UI23 ui23, Form form) {
		var inputs = new ArrayList<Input>()
		var buttons = new ArrayList<Button>()
		checkElements(inputs, buttons, form.layout)
		'''
		package user_interface.«path»;
		        
		import javax.swing.*;
		import java.awt.event.*;
		import user_interface.common.*;
		
		public class «form.name»Form extends Form{
			
			«FOR input : inputs»
			public JTextField «input.name»Component;
			«ENDFOR»
			«FOR button : buttons»
			public JButton «button.name»Component;
			«ENDFOR»
		    UserInterface parent;
		    
		    «form.name»Form(UserInterface parent) {
		        this.parent = parent;
		        «FOR input : inputs»
		        «input.name»Component = new JTextField();
		        «ENDFOR»
		        «FOR button : buttons»
		        «button.name»Component = new JButton("«button.value»");
    			«ENDFOR»
		    }
		
		    public JPanel createPanel(){
		        return createPanel«panelNum»();
		    }

			«generateLayout(form.layout, panelNum)»
		
		    public boolean checkValidity(){
		        «FOR input : inputs»
		        «IF input.exp.type instanceof StringType»
		        String «input.name» = this.«input.name»Component.getText();
		        «ELSEIF input.exp instanceof Greater»
		        «IF (input.exp as Greater).left instanceof HashStringType»
		        String «input.name» = this.«input.name»Component.getText();
		        	if(!(«(input.exp as Greater).left».length() > «((input.exp as Greater).right as Number).value»)){
		            	return false;
		        }
		        «ENDIF»
		        «ENDIF»
		        «ENDFOR»
		        return true;
		    }
		}
		'''
	}
	
	def static void checkElements(ArrayList inputs, ArrayList buttons, Layout layout) {
		for (element : layout.elements) {
			if (element instanceof Input) {
				inputs.add(element)
			} else if (element instanceof Button) {
				buttons.add(element)
			} else if (element instanceof Layout) {
				checkElements(inputs, buttons, element)
			}
		}
	}
	
	def static String generateLayout(Layout layout, int num) {
		var layouts = new ArrayList()
		var panelNums = new ArrayList()
		var i = 0
		'''
public JPanel createPanel«num»() {
	JPanel panel = new JPanel();
	«IF layout instanceof Column»
	panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	«ELSEIF layout instanceof Row»
	panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
	«ENDIF»
	«FOR element : layout.elements»
	«IF element instanceof Label»
	panel.add(new JLabel("«element.value»"));
	«ELSEIF element instanceof Layout»
	«addLayout(element, layouts, panelNums)»
	panel.add(createPanel«panelNum»());
	«ELSEIF element instanceof Input»
	panel.add(«element.name»Component);
	«ELSEIF element instanceof Button»
	panel.add(«element.name»Component);
	«IF element instanceof StarButton»
    «element.name»Component.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e){
    		if(checkValidity()){
    	    	JOptionPane.showMessageDialog(
    	    		parent.frame, 
    	            "Data has been saved");
    	    }
    	    else {
    	    	JOptionPane.showMessageDialog(
    	    		parent.frame, 
    	    		"Validation Error", 
    	    		"Error",
    	    		JOptionPane.ERROR_MESSAGE);
    	    }
    	}
    });
    «ENDIF»
	«ENDIF»
	«ENDFOR»	
	return panel;
}

«FOR layout1 : layouts»
«generateLayout(layout1, panelNums.get(i))»
«{i = i + 1; ""}»
«ENDFOR»
		'''
	}
	
	def static void addLayout(Layout layout, ArrayList layouts, ArrayList panelNums) {
		panelNum = panelNum + 1
		layouts.add(layout)
		panelNums.add(panelNum)
	}
	
	def static String generateCommon() {
		'''
		package user_interface.common;
		
		import javax.swing.*;
		
		public abstract class Form{
			public abstract boolean checkValidity();
			public abstract JPanel createPanel();
		}
		'''
	}
	
	def static String camelToSnake(String str) {
        var result = ""
 
        var c = str.charAt(0)
        result = result + Character.toLowerCase(c)
 
        for (var i = 1; i < str.length(); i++) {
 
            var ch = str.charAt(i)
 
            if (Character.isUpperCase(ch)) {
                result = result + '_'
                result
                    = result
                      + Character.toLowerCase(ch)
            } else {
                result = result + ch
            }
        }
 
        return result
    }
	
}