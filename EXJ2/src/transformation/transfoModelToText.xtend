package transformation

import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import mmui.Layout

class transfoModelToText {
	def loadXMI(String fileName)
	{
		var ResourceSet resourceSet = new ResourceSetImpl();
		var loadedModel = resourceSet.getResource(URI.createURI(fileName), true)
		var Layout loadedUI = loadedModel.contents.head as Layout
		return loadedUI
	}
	
	def transform(String fileNameXMI)
	{
		
	}
}