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
 *******************************************************************************/
/*
 * generated by Xtext 2.18.0.M3
 */
package org.polarsys.capella.scenario.editor.dsl.helpers

import org.eclipse.emf.ecore.EObject
import org.polarsys.capella.scenario.editor.helper.EmbeddedEditorInstanceHelper
import org.polarsys.capella.scenario.editor.dsl.textualScenario.SequenceMessage
import org.polarsys.capella.core.model.helpers.CapellaElementExt
import org.eclipse.emf.common.util.EList
import org.polarsys.capella.core.data.fa.ComponentExchange
import org.polarsys.capella.core.data.fa.FunctionalExchange
import org.polarsys.capella.scenario.editor.dsl.textualScenario.CombinedFragment
import org.polarsys.capella.scenario.editor.dsl.textualScenario.Model
import org.polarsys.capella.scenario.editor.dsl.textualScenario.Block
import org.polarsys.capella.scenario.editor.dsl.textualScenario.Element
import org.polarsys.capella.scenario.editor.dsl.textualScenario.SequenceMessageType
import java.util.Set

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class TextualScenarioHelper {
	static val TYPE_FE = "FE";
	static val TYPE_CE = "CE";
	/*
	 * calculate the type of exchanges allowed to be declared in the text
	 */
	def static getScenarioAllowedExchangesType(EList<Element> elements) {
		if (EmbeddedEditorInstanceHelper.isESScenario()) {
			if(EmbeddedEditorInstanceHelper.isCEScenario())
				return TYPE_CE
			if(EmbeddedEditorInstanceHelper.isFEScenario())
				return TYPE_FE
			for (element : elements) {
				if (element instanceof SequenceMessage) {
					var message = element as SequenceMessage
					return getMessageExchangeType(message)
				}
				if (element instanceof CombinedFragment) {
					var combinedFragment = element as CombinedFragment
					return getScenarioAllowedExchangesType(combinedFragment.block.blockElements)
				}
			}
		}
		return null
	}
	/*
	 * we return CE or FE or null in case we allow both or other type
	 */
	def static getMessageExchangeType(SequenceMessage message) {
		var exchangesAvailable = EmbeddedEditorInstanceHelper.getExchangeMessages(message.getSource, message.getTarget)
		var allowedTypes = newHashSet as Set<Object>
		for(exchange : exchangesAvailable) {
			if(message.name !== null && message.name.equals(CapellaElementExt.getName(exchange))) {
				var type = getExchangeType(exchange)
				if(type !== null)
					allowedTypes.add(type)
			}
		}
		if(allowedTypes.size() == 1) {
			return allowedTypes.get(0)
		}
		
		return null
	}
	
	/*
	 * we return a list of available exchanges CE or FE
	 */
	def static Set getAllMessageExchangeType(SequenceMessage message) {
		var exchangesAvailable = EmbeddedEditorInstanceHelper.getExchangeMessages(message.getSource, message.getTarget)
		var allowedTypes = newHashSet as Set<Object>
		for(exchange : exchangesAvailable) {
			if(message.name !== null && message.name.equals(CapellaElementExt.getName(exchange))) {
				var type = getExchangeType(exchange)
				if(type !== null)
					allowedTypes.add(type)
			}
		}
		
		return allowedTypes
	}
	
	def static getExchangeType(EObject exchangeElement) {
		if (exchangeElement instanceof ComponentExchange)
			return TYPE_CE
		else if (exchangeElement instanceof FunctionalExchange)
			return TYPE_FE
		return null
	}
	
	def static participantsDefinedBefore(EObject element, Model rootModel) {
		if(element instanceof Model)
			return (element as Model).participants
		else {
			return rootModel.participants
		}	
	}
	
	def static participantsDefinedBeforeNames(EObject element) {
		var participantsNames = newArrayList
		var container = getModelContainer(element)
		if (container instanceof Model) {
			var model = container as Model
			var participants = participantsDefinedBefore(element, model)
			for (participant : participants) {
				participantsNames.add(participant.name)
			}
		}	
		return participantsNames
	}
	
	def static isParticipantKeyword(String keywordValue) {
		var participantsKeywords = EmbeddedEditorInstanceHelper.PARTICIPANT_KEYWORDS;
		return participantsKeywords.contains(keywordValue)
	}
	
	/*
	 * get all elements on the same level as modelContainer  
	 */
	def static getElements(EObject modelContainer) {
		
		if (modelContainer instanceof Model) {
			return (modelContainer as Model).elements
		}
		if (modelContainer instanceof CombinedFragment) {
			var elements = newArrayList
			elements.addAll((modelContainer as CombinedFragment).block.blockElements)
			var operands = (modelContainer as CombinedFragment).operands
			for(operand : operands) {
				elements.addAll(operand.block.blockElements)
			}
			return elements
		}
		
		if (modelContainer instanceof Block) {
			return (modelContainer as Block).blockElements
		}
	}
	
	/*
	 * get the root model that contains the object given as para
	 */
	def static EObject getModelContainer(EObject object) {
		if(object instanceof Model)
			return object as Model
		if(object !== null)		
			return getModelContainer(object.eContainer)
		return null
	}
	
	/*
	 * get the logic container of an element 
	 * (the container can be the model or a combined fragment)
	 */
	def static EObject getDirectContainer(EObject element) {
		if (element !== null) {
			var container = element.eContainer
			if (container instanceof Model || container instanceof CombinedFragment) {
				return container
			}
			return getDirectContainer(container)

		}
		return null
	}
	
}
