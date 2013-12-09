package transformation;

import com.google.common.base.Objects;
import fr.esir.imse.PollSystemStandaloneSetup;
import fr.esir.imse.pollSystem.Poll;
import fr.esir.imse.pollSystem.PollSystem;
import fr.esir.imse.pollSystem.Question;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import mmui.CheckBox;
import mmui.ElementUI;
import mmui.Layout;
import mmui.MmuiFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.xtext.example.mydsl.myDsl.ListeQuestions;

@SuppressWarnings("all")
public class Transformation {
  public PollSystem parsingPollSystem(final String nomFichier) {
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    ResourceSet resourceSet = _resourceSetImpl;
    PollSystemStandaloneSetup.doSetup();
    URI _createURI = URI.createURI(nomFichier);
    Resource resource = resourceSet.getResource(_createURI, true);
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    PollSystem ps = ((PollSystem) _head);
    return ps;
  }
  
  public ListeQuestions parsingMapping(final String nomFichier) {
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    ResourceSet resourceSet = _resourceSetImpl;
    MyDslStandaloneSetup.doSetup();
    URI _createURI = URI.createURI(nomFichier);
    Resource resource = resourceSet.getResource(_createURI, true);
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    ListeQuestions listeQuestions = ((ListeQuestions) _head);
    return listeQuestions;
  }
  
  public void tranform(final String pollSystemFile, final String mappingFile) {
    PollSystem _parsingPollSystem = this.parsingPollSystem(pollSystemFile);
    PollSystem ps = ((PollSystem) _parsingPollSystem);
    ListeQuestions _parsingMapping = this.parsingMapping(mappingFile);
    ListeQuestions map = ((ListeQuestions) _parsingMapping);
    final Layout ui = MmuiFactory.eINSTANCE.createLayout();
    boolean _notEquals = (!Objects.equal(ps, null));
    if (_notEquals) {
      EList<Poll> _polls = ps.getPolls();
      final Procedure1<Poll> _function = new Procedure1<Poll>() {
        public void apply(final Poll poll) {
          EList<Question> _questions = poll.getQuestions();
          Iterator<Question> _iterator = _questions.iterator();
          Iterator<Question> itQuestionsPoll = ((Iterator<Question>) _iterator);
          boolean _hasNext = itQuestionsPoll.hasNext();
          if (_hasNext) {
            Question pollQuestion = itQuestionsPoll.next();
            CheckBox _createCheckBox = MmuiFactory.eINSTANCE.createCheckBox();
            ElementUI courant = ((ElementUI) _createCheckBox);
            String _id = pollQuestion.getId();
            courant.setId(_id);
            String _text = pollQuestion.getText();
            courant.setQuestion(_text);
            EList<ElementUI> _listeElementUI = ui.getListeElementUI();
            _listeElementUI.add(courant);
            ui.setFirstElement(courant);
            boolean _hasNext_1 = itQuestionsPoll.hasNext();
            boolean _while = _hasNext_1;
            while (_while) {
              {
                Question _next = itQuestionsPoll.next();
                pollQuestion = _next;
                CheckBox _createCheckBox_1 = MmuiFactory.eINSTANCE.createCheckBox();
                courant.setNext(_createCheckBox_1);
                ElementUI _next_1 = courant.getNext();
                String _id_1 = pollQuestion.getId();
                _next_1.setId(_id_1);
                ElementUI _next_2 = courant.getNext();
                String _text_1 = pollQuestion.getText();
                _next_2.setQuestion(_text_1);
                ElementUI _next_3 = courant.getNext();
                courant = _next_3;
                EList<ElementUI> _listeElementUI_1 = ui.getListeElementUI();
                _listeElementUI_1.add(courant);
              }
              boolean _hasNext_2 = itQuestionsPoll.hasNext();
              _while = _hasNext_2;
            }
          }
        }
      };
      IterableExtensions.<Poll>forEach(_polls, _function);
    }
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    ResourceSet resourceSet = _resourceSetImpl;
    Registry _resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
    Map<String,Object> _extensionToFactoryMap = _resourceFactoryRegistry.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put(Registry.DEFAULT_EXTENSION, _xMIResourceFactoryImpl);
    File _file = new File("myUI.xmi");
    String _absolutePath = _file.getAbsolutePath();
    URI fileURI = URI.createFileURI(_absolutePath);
    Resource resource = resourceSet.createResource(fileURI);
    EList<EObject> _contents = resource.getContents();
    _contents.add(ui);
    try {
      resource.save(Collections.EMPTY_MAP);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
