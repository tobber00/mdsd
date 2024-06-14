/**
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.math_expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.math_expression.LetBinding#getBinding <em>Binding</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.math_expression.LetBinding#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.math_expression.Math_expressionPackage#getLetBinding()
 * @model
 * @generated
 */
public interface LetBinding extends Expression, Binding
{
  /**
   * Returns the value of the '<em><b>Binding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binding</em>' containment reference.
   * @see #setBinding(Expression)
   * @see dk.sdu.mmmi.mdsd.math_expression.Math_expressionPackage#getLetBinding_Binding()
   * @model containment="true"
   * @generated
   */
  Expression getBinding();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math_expression.LetBinding#getBinding <em>Binding</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binding</em>' containment reference.
   * @see #getBinding()
   * @generated
   */
  void setBinding(Expression value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Expression)
   * @see dk.sdu.mmmi.mdsd.math_expression.Math_expressionPackage#getLetBinding_Body()
   * @model containment="true"
   * @generated
   */
  Expression getBody();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math_expression.LetBinding#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Expression value);

} // LetBinding