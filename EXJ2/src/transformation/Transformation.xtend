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

class Transformation {
	
	def PollSystem parsingPollSystem(String nomFichier) {
		
		// Create a resource set.
  		var ResourceSet resourceSet = new ResourceSetImpl();
  		
  		PollSystemStandaloneSetup.doSetup
  		var resource = resourceSet.getResource(URI.createURI(nomFichier), true)
  		var ps = resource.contents.head as PollSystem
  		//println(ps.polls.size)
  		return(ps)
	}
	
	def ListeQuestions parsingMapping(String nomFichier) {
		
		// Create a resource set.
  		var ResourceSet resourceSet = new ResourceSetImpl();
  		
  		MyDslStandaloneSetup.doSetup
  		var resource = resourceSet.getResource(URI.createURI(nomFichier), true)
  		var listeQuestions = resource.contents.head as ListeQuestions
  		//println(listeQuestions.toString());
  		return(listeQuestions)
	}
	
	def void tranform(String pollSystemFile, String mappingFile){
		
		//parsing
		var ps = parsingPollSystem(pollSystemFile) as PollSystem
		var map = parsingMapping(mappingFile) as ListeQuestions
		
		var itPs = ps.polls.iterator as Iterator<Poll>
		//var itMap = map.questions.iterator as Iterator<Question>
		
		// Create model mmui
		var ui = MmuiFactory.eINSTANCE.createLayout
		
		//firstPoll
		if(itPs.hasNext())
		{
			var itQuestionsPaul = itPs.next().questions.iterator as Iterator<fr.esir.imse.pollSystem.Question>
			if(itQuestionsPaul.hasNext())
			{
				var pollQuestion = itQuestionsPaul.next()
				var courant = MmuiFactory.eINSTANCE.createCheckBox as ElementUI
				courant.id = pollQuestion.id
				courant.question = pollQuestion.text
				ui.listeElementUI.add(courant)
				ui.firstElement = courant
				while(itQuestionsPaul.hasNext())
				{
					pollQuestion = itQuestionsPaul.next()
					courant.next = MmuiFactory.eINSTANCE.createCheckBox
					courant.next.id = pollQuestion.id
					courant.next.question = pollQuestion.text
					courant = courant.next
					ui.listeElementUI.add(courant)
				}
			}
		}
		
		//**************************************************
		//					Enregistrement
		//**************************************************
		// Create a resource set.
  		var ResourceSet resourceSet = new ResourceSetImpl();

	  	// Register the default resource factory -- only needed for stand-alone!
  		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Get the URI of the model file.
		var URI fileURI = URI.createFileURI(new File("myUI.xmi").getAbsolutePath());

		// Create a resource for this file.
  		var Resource resource = resourceSet.createResource(fileURI);
 
		// Add the book and writer objects to the contents.
	  	resource.getContents().add(ui);

		// Save the contents of the resource to the file system.
  		try
  		{
		    resource.save(Collections.EMPTY_MAP);
  		}
  		catch (IOException e) {}
	}
}