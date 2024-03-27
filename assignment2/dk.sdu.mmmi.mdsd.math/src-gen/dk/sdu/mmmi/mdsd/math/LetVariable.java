/**
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.math;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.LetVariable#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.math.MathPackage#getLetVariable()
 * @model
 * @generated
 */
public interface LetVariable extends Primary, VariableType
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Exp)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getLetVariable_Value()
   * @model containment="true"
   * @generated
   */
  Exp getValue();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.LetVariable#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Exp value);

} // LetVariable
