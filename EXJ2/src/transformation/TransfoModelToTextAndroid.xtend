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

class TransfoModelToTextAndroid {
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
                       <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:layout_centerVertical="true"
    android:orientation="vertical"
     >

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Sondage(s) généré(s)" />

                        «
                                parcoursMetaLayout(metaLay)
                        »
                        </LinearLayout>
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
                       <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:layout_centerVertical="true"
    android:orientation="vertical"
     >

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Sondage généré" />
                                        «
                                                parcoursLayout(lay)
                                        »
                                </LinearLayoiut>
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
                                tmp = tmp + '''    <CheckBox
        android:id="@+id/«opt.value»"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="CheckBox" />'''

                        }
                }
                else
                {
                        tmp = '''<CheckBox android:id="@+id/«IF chk.id != null»«chk.id»«ELSE»«chk.question»«ENDIF»" android:layout_width="wrap_content" android:layout_height="wrap_content" android:text="«chk.question»" />'''

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
                        tmp = '''<RadioButton android:id="@+id/«IF rd.id != null»«rd.id»«ELSE»«rd.question»«ENDIF»" android:layout_width="wrap_content" android:layout_height="wrap_content" android:text="«rd.question»" />'''
                        id = id + 1
                }
                return tmp + "<br><br>"
        }
        
        def rendererDropDown(DropDown dd)
        {
                var tmp = ''' '''
                      
                return tmp + '''<TextView android:layout_width="wrap_content" android:layout_height="wrap_content" android:text="DropDown Android need Java code , need more tiome, sorry" />'''
        }
        
        def rendererText(Text txt)
        {
                var tmp = '''<TextView
					        «IF txt.id != null»android:id="@+id/«txt.id»«ENDIF»"
					        android:layout_width="wrap_content"
					        android:layout_height="wrap_content"
							android:text="«txt.question»"/>
											    <EditText
					       «IF txt.id != null» android:id="@+id/«txt.id»«ENDIF»"
					        android:layout_width="wrap_content"
					        android:layout_height="wrap_content"
							android:text="«txt.question»"/>
                '''
                return tmp + "<br><br>"
        }
        
        def rendererTextArea(TextArea txt)
        {
        	var tmp = '''<TextView
        «IF txt.id != null»android:id="@+id/«txt.id»«ENDIF»"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
		android:text="«txt.question»"/>
						    <EditText
       «IF txt.id != null» android:id="@+id/«txt.id»«ENDIF»"
        android:layout_width="fill_parent"
        android:layout_height="fill_parent"
		android:text="«txt.question»"/>
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