package transformation;

import com.google.common.base.Objects;
import fr.esir.imse.PollSystemStandaloneSetup;
import fr.esir.imse.pollSystem.Option;
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
import mmui.EnsembleQuestions;
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
    final PollSystem ps = ((PollSystem) _parsingPollSystem);
    ListeQuestions _parsingMapping = this.parsingMapping(mappingFile);
    final ListeQuestions map = ((ListeQuestions) _parsingMapping);
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
            final EnsembleQuestions courant = MmuiFactory.eINSTANCE.createEnsembleQuestions();
            String _id = pollQuestion.getId();
            courant.setId(_id);
            String _text = pollQuestion.getText();
            courant.setQuestion(_text);
            Transformation.this.construireListeSousQuestion(map, courant, pollQuestion);
            EList<ElementUI> _listeElementUI = ui.getListeElementUI();
            _listeElementUI.add(courant);
            ui.setFirstElement(courant);
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
  
  public void construireListeSousQuestion(final ListeQuestions mapUI, final EnsembleQuestions courant, final Question pollQuestion) {
    EList<Option> _options = pollQuestion.getOptions();
    final Procedure1<Option> _function = new Procedure1<Option>() {
      public void apply(final Option optionSousQuestion) {
        final CheckBox question = MmuiFactory.eINSTANCE.createCheckBox();
        String _id = optionSousQuestion.getId();
        question.setId(_id);
        String _text = optionSousQuestion.getText();
        question.setQuestion(_text);
        EList<ElementUI> _listeSousQuestion = courant.getListeSousQuestion();
        _listeSousQuestion.add(question);
      }
    };
    IterableExtensions.<Option>forEach(_options, _function);
  }
}
