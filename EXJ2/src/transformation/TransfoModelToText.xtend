package transformation

import java.io.FileWriter
import java.io.PrintWriter
import mmui.CheckBox
import mmui.ElementUI
import mmui.Layout
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import mmui.MetaLayout
import mmui.Radio

class TransfoModelToText {
	def MetaLayout loadXMI(String fileName)
	{
		var ResourceSet resourceSet = new ResourceSetImpl();
		var loadedModel = resourceSet.getResource(URI.createURI(fileName), true)
		var MetaLayout loadedUI = loadedModel.contents.head as MetaLayout
		return loadedUI
	}
	
	def transform(String fileNameXMI, String fileNameOut)
	{
		var metaLay = loadXMI(fileNameXMI)
		var template = '''
			<html>
			«
				parcoursMetaLayout(metaLay)
			»
			</html>
		'''
		storeToFile(fileNameOut, template)
	}
	
	def parcoursMetaLayout(MetaLayout metaLay)
	{
		var lay = metaLay.firstElement
		var tmp = "";
		while(lay != null)
		{
			tmp = tmp + '''
				<form action="" method="GET" name="">
				<fieldset>
					«
						parcoursLayout(lay)
					»
				</fieldset>
				</form>
			'''
			lay = lay.next
		}
		return tmp
	}
	
	def parcoursLayout(Layout lay)
	{
		var el = lay.firstElement as ElementUI
		var tmp = "";
		while(el != null)
		{
			if(el instanceof CheckBox)
				tmp = tmp + rendererCheckbox(el as CheckBox)
			else if(el instanceof Radio)
				tmp = tmp + rendererRadio(el as Radio)
			el = el.next
		}
		return tmp
	}
	
	def rendererCheckbox(CheckBox chk)
	{
		var tmp = '''
			<label «IF chk.id != null» id="«chk.id»«ENDIF»">
				«chk.question»
			</label>
		'''
		val itChk = chk.options.iterator
		while(itChk.hasNext())
		{
			val opt = itChk.next()
			tmp = tmp + '''<input type="checkbox" name="«opt.value»" value="1" />«opt.value»<br>'''
		}
		return tmp + "<br>"
	}
	
	def rendererRadio(Radio rd)
	{
		var tmp = '''
			<label «IF rd.id != null» id="«rd.id»«ENDIF»">
				«rd.question»
			</label>
		'''
		val itRd = rd.options.iterator
		var id = 0
		while(itRd.hasNext())
		{
			val opt = itRd.next()
			tmp = tmp + '''<input type="radio" name="«rd.id»" value="«id»" «IF id == 0»checked «ENDIF»/>«opt.value» '''
			id = id + 1
		}
		return tmp + "<br><br>"
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