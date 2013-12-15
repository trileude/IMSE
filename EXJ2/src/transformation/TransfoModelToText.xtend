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
import mmui.DropDown
import mmui.Text
import mmui.EnsembleQuestions
import org.eclipse.emf.common.util.EList
import mmui.TextArea

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
			<head>
				<meta charset="UTF-8">
				<title>Sondage généré</title>
				<link rel='stylesheet' href='style.css' type='text/css' media='all' />
			</head>
			<body>
			«
				parcoursMetaLayout(metaLay)
			»
			</body>
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
			tmp = tmp + switchElementUI(el)
			el = el.next
		}
		return tmp
	}
	
	def String switchElementUI(ElementUI el)
	{
		if(el instanceof CheckBox)
			return(rendererCheckbox(el as CheckBox))
		else if(el instanceof Radio)
			return(rendererRadio(el as Radio))
		else if(el instanceof DropDown)
			return(rendererDropDown(el as DropDown))
		else if(el instanceof Text)
			return(rendererText(el as Text))
		else if(el instanceof TextArea)
			return(rendererTextArea(el as TextArea))
		else if(el instanceof EnsembleQuestions)
			return(rendererEnsembleQuestions(el as EnsembleQuestions))
		else return('''<p>Erreur de type sur «el.question»''')
	}
	
	def rendererCheckbox(CheckBox chk)
	{
		var tmp = ''
		if(chk.options.length > 0)
		{
			tmp = '''
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
		}
		else
		{
			tmp = '''<input type="checkbox" name="«IF chk.id != null»«chk.id»«ELSE»«chk.question»«ENDIF»" value="1" />«chk.question»'''
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
	
	def rendererDropDown(DropDown dd)
	{
		var tmp = '''
			<label «IF dd.id != null» id="«dd.id»«ENDIF»">
				«dd.question»
			</label>
			<select name="«IF dd.id != null»«dd.id»«ELSE»«dd.question»«ENDIF»">
		'''
		val itRd = dd.options.iterator
		var id = 0
		while(itRd.hasNext())
		{
			val opt = itRd.next()
			tmp = tmp + '''<option value="«id»"/>«opt.value»</option>
			'''
			id = id + 1
		}
		tmp = tmp + '''</select>'''
		return tmp + "<br><br>"
	}
	
	def rendererText(Text txt)
	{
		var tmp = '''
			<label «IF txt.id != null» id="«txt.id»«ENDIF»">
				«txt.question»
			</label>
			<input type="text" name="«IF txt.id != null»«txt.id»«ELSE»«txt.question»«ENDIF»" />
		'''
		return tmp + "<br><br>"
	}
	
	def rendererTextArea(TextArea txt)
	{
		var tmp = '''
			<label «IF txt.id != null» id="«txt.id»«ENDIF»">
				«txt.question»
			</label>
			<textarea rows="4" cols="50" name="«IF txt.id != null»«txt.id»«ELSE»«txt.question»«ENDIF»"></textarea>
		'''
		return tmp + "<br><br>"
	}
	
	def parcoursSousQuestions(EList<ElementUI> listeSousQuestion)
	{
		var tmp = "";
		var itL = listeSousQuestion.iterator
		while(itL.hasNext())
		{
			tmp = tmp + switchElementUI(itL.next())
		}
		return tmp
	}
	
	def rendererEnsembleQuestions(EnsembleQuestions eq)
	{
		var tmp = '''
			<fieldset>
				<legend>«eq.question»</legend>
					«parcoursSousQuestions(eq.listeSousQuestion)»
			</fieldset>
		'''
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