/**
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.math;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.ExternalUse#getRef <em>Ref</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.ExternalUse#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.math.MathPackage#getExternalUse()
 * @model
 * @generated
 */
public interface ExternalUse extends Expression
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(External)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getExternalUse_Ref()
   * @model
   * @generated
   */
  External getRef();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.ExternalUse#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(External value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' attribute list.
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getExternalUse_Arguments()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getArguments();

} // ExternalUse
