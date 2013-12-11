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
import mmui.DropDown;
import mmui.ElementUI;
import mmui.EnsembleQuestions;
import mmui.Erreur;
import mmui.Layout;
import mmui.MmuiFactory;
import mmui.Radio;
import mmui.Text;
import mmui.TextArea;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
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
      Iterator<Poll> _iterator = _polls.iterator();
      Iterator<Poll> itPollSystem = ((Iterator<Poll>) _iterator);
      boolean _hasNext = itPollSystem.hasNext();
      if (_hasNext) {
        Poll _next = itPollSystem.next();
        Poll poll = ((Poll) _next);
        EList<Question> _questions = poll.getQuestions();
        Iterator<Question> _iterator_1 = _questions.iterator();
        Iterator<Question> itQuestionsPoll = ((Iterator<Question>) _iterator_1);
        boolean _hasNext_1 = itQuestionsPoll.hasNext();
        if (_hasNext_1) {
          Question pollQuestion = itQuestionsPoll.next();
          ElementUI courant = ((ElementUI) null);
          String _id = pollQuestion.getId();
          boolean _notEquals_1 = (!Objects.equal(_id, null));
          if (_notEquals_1) {
            final String idAchercher = pollQuestion.getId();
            EList<org.xtext.example.mydsl.myDsl.Question> _questions_1 = map.getQuestions();
            final Function1<org.xtext.example.mydsl.myDsl.Question,Boolean> _function = new Function1<org.xtext.example.mydsl.myDsl.Question,Boolean>() {
              public Boolean apply(final org.xtext.example.mydsl.myDsl.Question it) {
                String _id = it.getId();
                boolean _equals = _id.equals(idAchercher);
                return Boolean.valueOf(_equals);
              }
            };
            Iterable<org.xtext.example.mydsl.myDsl.Question> _filter = IterableExtensions.<org.xtext.example.mydsl.myDsl.Question>filter(_questions_1, _function);
            final org.xtext.example.mydsl.myDsl.Question typeTrouve = IterableExtensions.<org.xtext.example.mydsl.myDsl.Question>head(_filter);
            boolean _notEquals_2 = (!Objects.equal(typeTrouve, null));
            if (_notEquals_2) {
              ElementUI _switchResult = null;
              String _type = typeTrouve.getType();
              final String _switchValue = _type;
              boolean _matched = false;
              if (!_matched) {
                if (Objects.equal(_switchValue,"Radio")) {
                  _matched=true;
                  Radio _createRadio = MmuiFactory.eINSTANCE.createRadio();
                  _switchResult = _createRadio;
                }
              }
              if (!_matched) {
                if (Objects.equal(_switchValue,"Text")) {
                  _matched=true;
                  Text _createText = MmuiFactory.eINSTANCE.createText();
                  _switchResult = _createText;
                }
              }
              if (!_matched) {
                if (Objects.equal(_switchValue,"TextArea")) {
                  _matched=true;
                  TextArea _createTextArea = MmuiFactory.eINSTANCE.createTextArea();
                  _switchResult = _createTextArea;
                }
              }
              if (!_matched) {
                if (Objects.equal(_switchValue,"DropDown")) {
                  _matched=true;
                  DropDown _createDropDown = MmuiFactory.eINSTANCE.createDropDown();
                  _switchResult = _createDropDown;
                }
              }
              if (!_matched) {
                if (Objects.equal(_switchValue,"CheckBox")) {
                  _matched=true;
                  CheckBox _createCheckBox = MmuiFactory.eINSTANCE.createCheckBox();
                  _switchResult = _createCheckBox;
                }
              }
              if (!_matched) {
                Erreur _createErreur = MmuiFactory.eINSTANCE.createErreur();
                _switchResult = _createErreur;
              }
              final ElementUI questionUI = _switchResult;
              EList<Option> _options = pollQuestion.getOptions();
              final Procedure1<Option> _function_1 = new Procedure1<Option>() {
                public void apply(final Option opt) {
                  final mmui.Option optAajouter = MmuiFactory.eINSTANCE.createOption();
                  String _text = opt.getText();
                  optAajouter.setValue(_text);
                  EList<mmui.Option> _options = questionUI.getOptions();
                  _options.add(optAajouter);
                }
              };
              IterableExtensions.<Option>forEach(_options, _function_1);
              String _id_1 = pollQuestion.getId();
              questionUI.setId(_id_1);
              String _text = pollQuestion.getText();
              questionUI.setQuestion(_text);
              EList<ElementUI> _listeElementUI = ui.getListeElementUI();
              _listeElementUI.add(questionUI);
              courant = questionUI;
              ui.setFirstElement(questionUI);
            } else {
              final EnsembleQuestions questionUI_1 = MmuiFactory.eINSTANCE.createEnsembleQuestions();
              String _id_2 = pollQuestion.getId();
              questionUI_1.setId(_id_2);
              String _text_1 = pollQuestion.getText();
              questionUI_1.setQuestion(_text_1);
              this.construireListeSousQuestion(map, questionUI_1, pollQuestion);
              EList<ElementUI> _listeElementUI_1 = ui.getListeElementUI();
              _listeElementUI_1.add(questionUI_1);
              courant = questionUI_1;
              ui.setFirstElement(questionUI_1);
            }
          } else {
            final EnsembleQuestions questionUI_2 = MmuiFactory.eINSTANCE.createEnsembleQuestions();
            String _text_2 = pollQuestion.getText();
            questionUI_2.setQuestion(_text_2);
            this.construireListeSousQuestion(map, questionUI_2, pollQuestion);
            EList<ElementUI> _listeElementUI_2 = ui.getListeElementUI();
            _listeElementUI_2.add(questionUI_2);
            courant = questionUI_2;
            ui.setFirstElement(questionUI_2);
          }
          boolean _hasNext_2 = itQuestionsPoll.hasNext();
          boolean _while = _hasNext_2;
          while (_while) {
            {
              Question _next_1 = itQuestionsPoll.next();
              pollQuestion = _next_1;
              String _id_3 = pollQuestion.getId();
              boolean _notEquals_3 = (!Objects.equal(_id_3, null));
              if (_notEquals_3) {
                final String idAchercher_1 = pollQuestion.getId();
                EList<org.xtext.example.mydsl.myDsl.Question> _questions_2 = map.getQuestions();
                final Function1<org.xtext.example.mydsl.myDsl.Question,Boolean> _function_2 = new Function1<org.xtext.example.mydsl.myDsl.Question,Boolean>() {
                  public Boolean apply(final org.xtext.example.mydsl.myDsl.Question it) {
                    String _id = it.getId();
                    boolean _equals = _id.equals(idAchercher_1);
                    return Boolean.valueOf(_equals);
                  }
                };
                Iterable<org.xtext.example.mydsl.myDsl.Question> _filter_1 = IterableExtensions.<org.xtext.example.mydsl.myDsl.Question>filter(_questions_2, _function_2);
                final org.xtext.example.mydsl.myDsl.Question typeTrouve_1 = IterableExtensions.<org.xtext.example.mydsl.myDsl.Question>head(_filter_1);
                boolean _notEquals_4 = (!Objects.equal(typeTrouve_1, null));
                if (_notEquals_4) {
                  ElementUI _switchResult_1 = null;
                  String _type_1 = typeTrouve_1.getType();
                  final String _switchValue_1 = _type_1;
                  boolean _matched_1 = false;
                  if (!_matched_1) {
                    if (Objects.equal(_switchValue_1,"Radio")) {
                      _matched_1=true;
                      Radio _createRadio_1 = MmuiFactory.eINSTANCE.createRadio();
                      _switchResult_1 = _createRadio_1;
                    }
                  }
                  if (!_matched_1) {
                    if (Objects.equal(_switchValue_1,"Text")) {
                      _matched_1=true;
                      Text _createText_1 = MmuiFactory.eINSTANCE.createText();
                      _switchResult_1 = _createText_1;
                    }
                  }
                  if (!_matched_1) {
                    if (Objects.equal(_switchValue_1,"TextArea")) {
                      _matched_1=true;
                      TextArea _createTextArea_1 = MmuiFactory.eINSTANCE.createTextArea();
                      _switchResult_1 = _createTextArea_1;
                    }
                  }
                  if (!_matched_1) {
                    if (Objects.equal(_switchValue_1,"DropDown")) {
                      _matched_1=true;
                      DropDown _createDropDown_1 = MmuiFactory.eINSTANCE.createDropDown();
                      _switchResult_1 = _createDropDown_1;
                    }
                  }
                  if (!_matched_1) {
                    if (Objects.equal(_switchValue_1,"CheckBox")) {
                      _matched_1=true;
                      CheckBox _createCheckBox_1 = MmuiFactory.eINSTANCE.createCheckBox();
                      _switchResult_1 = _createCheckBox_1;
                    }
                  }
                  if (!_matched_1) {
                    Erreur _createErreur_1 = MmuiFactory.eINSTANCE.createErreur();
                    _switchResult_1 = _createErreur_1;
                  }
                  final ElementUI questionUI_3 = _switchResult_1;
                  EList<Option> _options_1 = pollQuestion.getOptions();
                  final Procedure1<Option> _function_3 = new Procedure1<Option>() {
                    public void apply(final Option opt) {
                      final mmui.Option optAajouter = MmuiFactory.eINSTANCE.createOption();
                      String _text = opt.getText();
                      optAajouter.setValue(_text);
                      EList<mmui.Option> _options = questionUI_3.getOptions();
                      _options.add(optAajouter);
                    }
                  };
                  IterableExtensions.<Option>forEach(_options_1, _function_3);
                  String _id_4 = pollQuestion.getId();
                  questionUI_3.setId(_id_4);
                  String _text_3 = pollQuestion.getText();
                  questionUI_3.setQuestion(_text_3);
                  courant.setNext(questionUI_3);
                  ElementUI _next_2 = courant.getNext();
                  courant = _next_2;
                  EList<ElementUI> _listeElementUI_3 = ui.getListeElementUI();
                  _listeElementUI_3.add(courant);
                } else {
                  final EnsembleQuestions questionUI_4 = MmuiFactory.eINSTANCE.createEnsembleQuestions();
                  String _id_5 = pollQuestion.getId();
                  questionUI_4.setId(_id_5);
                  String _text_4 = pollQuestion.getText();
                  questionUI_4.setQuestion(_text_4);
                  this.construireListeSousQuestion(map, questionUI_4, pollQuestion);
                  courant.setNext(questionUI_4);
                  ElementUI _next_3 = courant.getNext();
                  courant = _next_3;
                  EList<ElementUI> _listeElementUI_4 = ui.getListeElementUI();
                  _listeElementUI_4.add(courant);
                }
              } else {
                final EnsembleQuestions questionUI_5 = MmuiFactory.eINSTANCE.createEnsembleQuestions();
                String _text_5 = pollQuestion.getText();
                questionUI_5.setQuestion(_text_5);
                this.construireListeSousQuestion(map, questionUI_5, pollQuestion);
                courant.setNext(questionUI_5);
                ElementUI _next_4 = courant.getNext();
                courant = _next_4;
                EList<ElementUI> _listeElementUI_5 = ui.getListeElementUI();
                _listeElementUI_5.add(courant);
              }
            }
            boolean _hasNext_3 = itQuestionsPoll.hasNext();
            _while = _hasNext_3;
          }
        }
      }
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
        EList<org.xtext.example.mydsl.myDsl.Question> _questions = mapUI.getQuestions();
        final Function1<org.xtext.example.mydsl.myDsl.Question,Boolean> _function = new Function1<org.xtext.example.mydsl.myDsl.Question,Boolean>() {
          public Boolean apply(final org.xtext.example.mydsl.myDsl.Question it) {
            String _id = it.getId();
            String _id_1 = optionSousQuestion.getId();
            boolean _equals = _id.equals(_id_1);
            return Boolean.valueOf(_equals);
          }
        };
        Iterable<org.xtext.example.mydsl.myDsl.Question> _filter = IterableExtensions.<org.xtext.example.mydsl.myDsl.Question>filter(_questions, _function);
        final org.xtext.example.mydsl.myDsl.Question optionTrouve = IterableExtensions.<org.xtext.example.mydsl.myDsl.Question>head(_filter);
        boolean _notEquals = (!Objects.equal(optionTrouve, null));
        if (_notEquals) {
          ElementUI _switchResult = null;
          String _type = optionTrouve.getType();
          final String _switchValue = _type;
          boolean _matched = false;
          if (!_matched) {
            if (Objects.equal(_switchValue,"Radio")) {
              _matched=true;
              Radio _createRadio = MmuiFactory.eINSTANCE.createRadio();
              _switchResult = _createRadio;
            }
          }
          if (!_matched) {
            if (Objects.equal(_switchValue,"Text")) {
              _matched=true;
              Text _createText = MmuiFactory.eINSTANCE.createText();
              _switchResult = _createText;
            }
          }
          if (!_matched) {
            if (Objects.equal(_switchValue,"TextArea")) {
              _matched=true;
              TextArea _createTextArea = MmuiFactory.eINSTANCE.createTextArea();
              _switchResult = _createTextArea;
            }
          }
          if (!_matched) {
            if (Objects.equal(_switchValue,"DropDown")) {
              _matched=true;
              DropDown _createDropDown = MmuiFactory.eINSTANCE.createDropDown();
              _switchResult = _createDropDown;
            }
          }
          if (!_matched) {
            if (Objects.equal(_switchValue,"CheckBox")) {
              _matched=true;
              CheckBox _createCheckBox = MmuiFactory.eINSTANCE.createCheckBox();
              _switchResult = _createCheckBox;
            }
          }
          if (!_matched) {
            Erreur _createErreur = MmuiFactory.eINSTANCE.createErreur();
            _switchResult = _createErreur;
          }
          final ElementUI question = _switchResult;
          String _id = optionSousQuestion.getId();
          question.setId(_id);
          String _text = optionSousQuestion.getText();
          question.setQuestion(_text);
          EList<ElementUI> _listeSousQuestion = courant.getListeSousQuestion();
          _listeSousQuestion.add(question);
        }
      }
    };
    IterableExtensions.<Option>forEach(_options, _function);
  }
}
