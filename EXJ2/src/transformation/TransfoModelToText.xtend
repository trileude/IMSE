package transformation

import java.io.File
import mmui.CheckBox
import mmui.ElementUI
import mmui.Layout
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import java.io.PrintWriter
import java.io.FileWriter

class TransfoModelToText {
	def Layout loadXMI(String fileName)
	{
		var ResourceSet resourceSet = new ResourceSetImpl();
		var loadedModel = resourceSet.getResource(URI.createURI(fileName), true)
		var Layout loadedUI = loadedModel.contents.head as Layout
		return loadedUI
	}
	
	def transform(String fileNameXMI, String fileNameOut)
	{
		var lay = loadXMI(fileNameXMI)
		var template = '''
			<html>
			«
				parcoursLayout(lay)
			»
			</html>
		'''
		storeToFile(fileNameOut, template)
	}
	
	def parcoursLayout(Layout lay)
	{
		var el = lay.firstElement as ElementUI
		var tmp = "";
		while(el != null)
		{
			if(el instanceof CheckBox)
				tmp = tmp + rendererCheckbox(el as CheckBox)
			el = el.next
		}
		return tmp
	}
	
	def rendererCheckbox(CheckBox chk)
	{
		return '''<input type="checkbox" name="«chk.id»" value="1" />«chk.question»<br>
		'''
	}
	
	def storeToFile(String fileNameOut, String contenu)
	{
		try{
			var pr = new PrintWriter(new FileWriter(fileNameOut))
			pr.print(contenu)
			pr.close()
		}
		catch(Exception e)
		{
			println("Error writing to "+fileNameOut)
		}
	}
}