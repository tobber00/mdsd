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
 *   <li>{@link dk.sdu.mmmi.mdsd.math.MathExp#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.MathExp#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.math.MathPackage#getMathExp()
 * @model
 * @generated
 */
public interface MathExp extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getMathExp_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.MathExp#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.mdsd.math.VarBinding}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getMathExp_Variables()
   * @model containment="true"
   * @generated
   */
  EList<VarBinding> getVariables();

} // MathExp
