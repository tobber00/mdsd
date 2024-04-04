/**
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.math;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.MathExp#getVarExp <em>Var Exp</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.math.MathPackage#getMathExp()
 * @model
 * @generated
 */
public interface MathExp extends EObject
{
  /**
   * Returns the value of the '<em><b>Var Exp</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.mdsd.math.VariableExp}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Exp</em>' containment reference list.
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getMathExp_VarExp()
   * @model containment="true"
   * @generated
   */
  EList<VariableExp> getVarExp();

} // MathExp
