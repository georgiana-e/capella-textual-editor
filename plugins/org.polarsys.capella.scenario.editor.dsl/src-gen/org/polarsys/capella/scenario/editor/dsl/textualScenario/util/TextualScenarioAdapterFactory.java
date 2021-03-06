/*******************************************************************************
 * Copyright (c) 2020 THALES GLOBAL SERVICES.
 *  
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *     Thales - initial API and implementation
 ******************************************************************************/
/**
 * generated by Xtext 2.18.0.M3
 */
package org.polarsys.capella.scenario.editor.dsl.textualScenario.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.scenario.editor.dsl.textualScenario.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.TextualScenarioPackage
 * @generated
 */
public class TextualScenarioAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TextualScenarioPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextualScenarioAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TextualScenarioPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextualScenarioSwitch<Adapter> modelSwitch =
    new TextualScenarioSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseParticipant(Participant object)
      {
        return createParticipantAdapter();
      }
      @Override
      public Adapter caseGenericComponent(GenericComponent object)
      {
        return createGenericComponentAdapter();
      }
      @Override
      public Adapter caseGenericFunction(GenericFunction object)
      {
        return createGenericFunctionAdapter();
      }
      @Override
      public Adapter caseActor(Actor object)
      {
        return createActorAdapter();
      }
      @Override
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      @Override
      public Adapter caseConfigurationItem(ConfigurationItem object)
      {
        return createConfigurationItemAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseActivity(Activity object)
      {
        return createActivityAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseRole(Role object)
      {
        return createRoleAdapter();
      }
      @Override
      public Adapter caseMessage(Message object)
      {
        return createMessageAdapter();
      }
      @Override
      public Adapter caseSequenceMessageType(SequenceMessageType object)
      {
        return createSequenceMessageTypeAdapter();
      }
      @Override
      public Adapter caseSequenceMessage(SequenceMessage object)
      {
        return createSequenceMessageAdapter();
      }
      @Override
      public Adapter caseCreateMessage(CreateMessage object)
      {
        return createCreateMessageAdapter();
      }
      @Override
      public Adapter caseDeleteMessage(DeleteMessage object)
      {
        return createDeleteMessageAdapter();
      }
      @Override
      public Adapter caseArmTimerMessage(ArmTimerMessage object)
      {
        return createArmTimerMessageAdapter();
      }
      @Override
      public Adapter caseParticipantDeactivation(ParticipantDeactivation object)
      {
        return createParticipantDeactivationAdapter();
      }
      @Override
      public Adapter caseReference(Reference object)
      {
        return createReferenceAdapter();
      }
      @Override
      public Adapter caseCombinedFragment(CombinedFragment object)
      {
        return createCombinedFragmentAdapter();
      }
      @Override
      public Adapter caseOperand(Operand object)
      {
        return createOperandAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseStateFragment(StateFragment object)
      {
        return createStateFragmentAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.Participant <em>Participant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.Participant
   * @generated
   */
  public Adapter createParticipantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.GenericComponent <em>Generic Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.GenericComponent
   * @generated
   */
  public Adapter createGenericComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.GenericFunction <em>Generic Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.GenericFunction
   * @generated
   */
  public Adapter createGenericFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.Actor
   * @generated
   */
  public Adapter createActorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.ConfigurationItem <em>Configuration Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.ConfigurationItem
   * @generated
   */
  public Adapter createConfigurationItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.Activity
   * @generated
   */
  public Adapter createActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.Role
   * @generated
   */
  public Adapter createRoleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.Message
   * @generated
   */
  public Adapter createMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.SequenceMessageType <em>Sequence Message Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.SequenceMessageType
   * @generated
   */
  public Adapter createSequenceMessageTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.SequenceMessage <em>Sequence Message</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.SequenceMessage
   * @generated
   */
  public Adapter createSequenceMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.CreateMessage <em>Create Message</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.CreateMessage
   * @generated
   */
  public Adapter createCreateMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.DeleteMessage <em>Delete Message</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.DeleteMessage
   * @generated
   */
  public Adapter createDeleteMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.ArmTimerMessage <em>Arm Timer Message</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.ArmTimerMessage
   * @generated
   */
  public Adapter createArmTimerMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.ParticipantDeactivation <em>Participant Deactivation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.ParticipantDeactivation
   * @generated
   */
  public Adapter createParticipantDeactivationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.CombinedFragment <em>Combined Fragment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.CombinedFragment
   * @generated
   */
  public Adapter createCombinedFragmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.Operand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.Operand
   * @generated
   */
  public Adapter createOperandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.polarsys.capella.scenario.editor.dsl.textualScenario.StateFragment <em>State Fragment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.polarsys.capella.scenario.editor.dsl.textualScenario.StateFragment
   * @generated
   */
  public Adapter createStateFragmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TextualScenarioAdapterFactory
