package transformation

import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import mmui.Layout
import mmui.impl.CheckBoxImpl
import mmui.ElementUI
import mmui.CheckBox

class TransfoModelToText {
	def Layout loadXMI(String fileName)
	{
		var ResourceSet resourceSet = new ResourceSetImpl();
		var loadedModel = resourceSet.getResource(URI.createURI(fileName), true)
		var Layout loadedUI = loadedModel.contents.head as Layout
		return loadedUI
	}
	
	def transform(String fileNameXMI)
	{
		var lay = loadXMI(fileNameXMI)
		var template = '''
			<html>
			«
				parcoursLayout(lay)
			»
			</html>
		'''
		print(template)
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
		return '''<input type="checkbox" name="«chk.id»" value="1" />«chk.question»
		'''
	}
}