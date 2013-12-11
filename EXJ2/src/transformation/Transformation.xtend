package transformation

import fr.esir.imse.PollSystemStandaloneSetup
import fr.esir.imse.pollSystem.PollSystem
import fr.esir.imse.pollSystem.Question
import java.io.File
import java.io.IOException
import java.util.Collections
import java.util.Iterator
import mmui.EnsembleQuestions
import mmui.MmuiFactory
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.xtext.example.mydsl.MyDslStandaloneSetup
import org.xtext.example.mydsl.myDsl.ListeQuestions
import fr.esir.imse.pollSystem.Poll
import mmui.ElementUI

class Transformation {
	
	def PollSystem parsingPollSystem(String nomFichier) {
		
		// Create a resource set.
  		var ResourceSet resourceSet = new ResourceSetImpl();
  		
  		PollSystemStandaloneSetup.doSetup
  		var resource = resourceSet.getResource(URI.createURI(nomFichier), true)
  		var ps = resource.contents.head as PollSystem
  		return(ps)
	}
	
	def ListeQuestions parsingMapping(String nomFichier) {
		
		// Create a resource set.
  		var ResourceSet resourceSet = new ResourceSetImpl();
  		
  		MyDslStandaloneSetup.doSetup
  		var resource = resourceSet.getResource(URI.createURI(nomFichier), true)
  		var listeQuestions = resource.contents.head as ListeQuestions
  		return(listeQuestions)
	}
	
	def void tranform(String pollSystemFile, String mappingFile){
		
		//parsing
		val ps = parsingPollSystem(pollSystemFile) as PollSystem
		val map = parsingMapping(mappingFile) as ListeQuestions
		
		// Create model mmui
		val ui = MmuiFactory.eINSTANCE.createLayout
		if(ps != null)
		{
			var itPollSystem = ps.polls.iterator as Iterator<Poll>
			if(itPollSystem.hasNext())
			{
				var poll = itPollSystem.next() as Poll
				var itQuestionsPoll = poll.questions.iterator as Iterator<Question>
				if(itQuestionsPoll.hasNext())
				{
					var pollQuestion = itQuestionsPoll.next()
					var courant = null as ElementUI
					if(pollQuestion.id != null)
					{
						//on le cherche
						val idAchercher = pollQuestion.id
						val typeTrouve = map.questions.filter[
							id.equals(idAchercher)
						].head
						if(typeTrouve != null)
						{
							val questionUI = switch typeTrouve.type{
								case 'Radio' : MmuiFactory.eINSTANCE.createRadio
								case 'Text' : MmuiFactory.eINSTANCE.createText
								case 'TextArea' : MmuiFactory.eINSTANCE.createTextArea
								case 'DropDown' : MmuiFactory.eINSTANCE.createDropDown
								case 'CheckBox' : MmuiFactory.eINSTANCE.createCheckBox
								default : MmuiFactory.eINSTANCE.createErreur
							}
							pollQuestion.options.forEach[opt |
								val optAajouter = MmuiFactory.eINSTANCE.createOption
								optAajouter.value = opt.text
								questionUI.options.add(optAajouter)
							]
							questionUI.id = pollQuestion.id
							questionUI.question = pollQuestion.text
							ui.listeElementUI.add(questionUI)
							
							courant = questionUI
							ui.firstElement = questionUI
						}
						else
						{
							//on parcours les options
							val questionUI = MmuiFactory.eINSTANCE.createEnsembleQuestions
							questionUI.id = pollQuestion.id
							questionUI.question = pollQuestion.text
							construireListeSousQuestion(map, questionUI, pollQuestion)
							ui.listeElementUI.add(questionUI)
							
							courant = questionUI
							ui.firstElement = questionUI
						}
					}
					else
					{
						//on parcours les options
						val questionUI = MmuiFactory.eINSTANCE.createEnsembleQuestions
						questionUI.question = pollQuestion.text
						construireListeSousQuestion(map, questionUI, pollQuestion)
						ui.listeElementUI.add(questionUI)
						
						courant = questionUI
						ui.firstElement = questionUI
					}
					while(itQuestionsPoll.hasNext())
					{
						pollQuestion = itQuestionsPoll.next()
						if(pollQuestion.id != null)
						{
							//on le cherche
							val idAchercher = pollQuestion.id
							val typeTrouve = map.questions.filter[
								id.equals(idAchercher)
							].head
							if(typeTrouve != null)
							{
								val questionUI = switch typeTrouve.type{
									case 'Radio' : MmuiFactory.eINSTANCE.createRadio
									case 'Text' : MmuiFactory.eINSTANCE.createText
									case 'TextArea' : MmuiFactory.eINSTANCE.createTextArea
									case 'DropDown' : MmuiFactory.eINSTANCE.createDropDown
									case 'CheckBox' : MmuiFactory.eINSTANCE.createCheckBox
									default : MmuiFactory.eINSTANCE.createErreur
								}
								pollQuestion.options.forEach[opt |
									val optAajouter = MmuiFactory.eINSTANCE.createOption
									optAajouter.value = opt.text
									questionUI.options.add(optAajouter)
								]
								questionUI.id = pollQuestion.id
								questionUI.question = pollQuestion.text
								
								courant.next = questionUI
								courant = courant.next
								ui.listeElementUI.add(courant)
							}
							else
							{
								//on parcours les options
								val questionUI = MmuiFactory.eINSTANCE.createEnsembleQuestions
								questionUI.id = pollQuestion.id
								questionUI.question = pollQuestion.text
								construireListeSousQuestion(map, questionUI, pollQuestion)
								
								courant.next = questionUI
								courant = courant.next
								ui.listeElementUI.add(courant)
							}
						}
						else
						{
							//on parcours les options
							val questionUI = MmuiFactory.eINSTANCE.createEnsembleQuestions
							questionUI.question = pollQuestion.text
							construireListeSousQuestion(map, questionUI, pollQuestion)
							
							courant.next = questionUI
							courant = courant.next
							ui.listeElementUI.add(courant)
						}
					}
				}
			}
		}
		
		/****************************************************/
		/* 				Enregistrement XMI					*/
		/****************************************************/
		
  		var ResourceSet resourceSet = new ResourceSetImpl();
  		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		var URI fileURI = URI.createFileURI(new File("myUI.xmi").getAbsolutePath());
  		var Resource resource = resourceSet.createResource(fileURI);
	  	resource.getContents().add(ui);
  		try
  		{
		    resource.save(Collections.EMPTY_MAP);
  		}
  		catch (IOException e) {}
	}
	
	def construireListeSousQuestion(ListeQuestions mapUI, EnsembleQuestions courant, Question pollQuestion) {
		
		pollQuestion.options.forEach[optionSousQuestion |
			val optionTrouve = mapUI.questions.filter[
				id.equals(optionSousQuestion.id)
			].head
			if(optionTrouve != null)
			{
				val question = switch optionTrouve.type{
					case 'Radio' : MmuiFactory.eINSTANCE.createRadio
					case 'Text' : MmuiFactory.eINSTANCE.createText
					case 'TextArea' : MmuiFactory.eINSTANCE.createTextArea
					case 'DropDown' : MmuiFactory.eINSTANCE.createDropDown
					case 'CheckBox' : MmuiFactory.eINSTANCE.createCheckBox
					default : MmuiFactory.eINSTANCE.createErreur
				}
				question.id = optionSousQuestion.id
				question.question = optionSousQuestion.text
				courant.listeSousQuestion.add(question)
			}
			//else il y a une erreur de sémantique :)
		]
	}
	
}