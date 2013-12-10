package transformation

import fr.esir.imse.PollSystemStandaloneSetup
import fr.esir.imse.pollSystem.Poll
import fr.esir.imse.pollSystem.PollSystem
import java.io.File
import java.io.IOException
import java.util.Collections
import java.util.Iterator
import mmui.ElementUI
import mmui.MmuiFactory
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.xtext.example.mydsl.MyDslStandaloneSetup
import org.xtext.example.mydsl.myDsl.ListeQuestions
import org.xtext.example.mydsl.myDsl.Question
import fr.esir.imse.pollSystem.Option
import mmui.EnsembleQuestions

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
		
		//var itMap = map.questions.iterator as Iterator<Question>
		
		// Create model mmui
		val ui = MmuiFactory.eINSTANCE.createLayout
		if(ps != null)
		{
			ps.polls.forEach[poll |
				var itQuestionsPoll = poll.questions.iterator as Iterator<fr.esir.imse.pollSystem.Question>
				if(itQuestionsPoll.hasNext())
				{
					var pollQuestion = itQuestionsPoll.next()
					val courant = MmuiFactory.eINSTANCE.createEnsembleQuestions()
					courant.id = pollQuestion.id
					courant.question = pollQuestion.text
					construireListeSousQuestion(map, courant, pollQuestion)
					ui.listeElementUI.add(courant)
					ui.firstElement = courant
					/*while(itQuestionsPoll.hasNext())
					{
						pollQuestion = itQuestionsPoll.next()
						courant.next = MmuiFactory.eINSTANCE.createCheckBox
						courant.next.id = pollQuestion.id
						courant.next.question = pollQuestion.text
						courant = courant.next
						ui.listeElementUI.add(courant)
					}*/
				}
			]
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
	
	def construireListeSousQuestion(ListeQuestions mapUI, EnsembleQuestions courant, fr.esir.imse.pollSystem.Question pollQuestion) {
		
		pollQuestion.options.forEach[optionSousQuestion |
			//trouver dans map les options pour savoir quoi mettre comme type
			val question = MmuiFactory.eINSTANCE.createCheckBox
			question.id = optionSousQuestion.id
			question.question = optionSousQuestion.text
			courant.listeSousQuestion.add(question)
		]
	}
	
}