package transformation;

import com.google.common.base.Objects;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Iterator;
import mmui.CheckBox;
import mmui.DropDown;
import mmui.ElementUI;
import mmui.EnsembleQuestions;
import mmui.Layout;
import mmui.MetaLayout;
import mmui.Option;
import mmui.Radio;
import mmui.Text;
import mmui.TextArea;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class TransfoModelToText {
  public MetaLayout loadXMI(final String fileName) {
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    ResourceSet resourceSet = _resourceSetImpl;
    URI _createURI = URI.createURI(fileName);
    Resource loadedModel = resourceSet.getResource(_createURI, true);
    EList<EObject> _contents = loadedModel.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    MetaLayout loadedUI = ((MetaLayout) _head);
    return loadedUI;
  }
  
  public String transform(final String fileNameXMI, final String fileNameOut) {
    String _xblockexpression = null;
    {
      MetaLayout metaLay = this.loadXMI(fileNameXMI);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<html>");
      _builder.newLine();
      _builder.append("<head>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<meta charset=\"UTF-8\">");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<title>Sondage généré</title>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<link rel=\'stylesheet\' href=\'style.css\' type=\'text/css\' media=\'all\' />");
      _builder.newLine();
      _builder.append("</head>");
      _builder.newLine();
      _builder.append("<body>");
      _builder.newLine();
      String _parcoursMetaLayout = this.parcoursMetaLayout(metaLay);
      _builder.append(_parcoursMetaLayout, "");
      _builder.newLineIfNotEmpty();
      _builder.append("</body>");
      _builder.newLine();
      _builder.append("</html>");
      _builder.newLine();
      String template = _builder.toString();
      String _storeToFile = this.storeToFile(fileNameOut, template);
      _xblockexpression = (_storeToFile);
    }
    return _xblockexpression;
  }
  
  public String parcoursMetaLayout(final MetaLayout metaLay) {
    Layout lay = metaLay.getFirstElement();
    String tmp = "";
    boolean _notEquals = (!Objects.equal(lay, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<form action=\"\" method=\"GET\" name=\"\">");
        _builder.newLine();
        _builder.append("<fieldset>");
        _builder.newLine();
        _builder.append("\t");
        String _parcoursLayout = this.parcoursLayout(lay);
        _builder.append(_parcoursLayout, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("</fieldset>");
        _builder.newLine();
        _builder.append("</form>");
        _builder.newLine();
        String _plus = (tmp + _builder);
        tmp = _plus;
        Layout _next = lay.getNext();
        lay = _next;
      }
      boolean _notEquals_1 = (!Objects.equal(lay, null));
      _while = _notEquals_1;
    }
    return tmp;
  }
  
  public String parcoursLayout(final Layout lay) {
    ElementUI _firstElement = lay.getFirstElement();
    ElementUI el = ((ElementUI) _firstElement);
    String tmp = "";
    boolean _notEquals = (!Objects.equal(el, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        String _switchElementUI = this.switchElementUI(el);
        String _plus = (tmp + _switchElementUI);
        tmp = _plus;
        ElementUI _next = el.getNext();
        el = _next;
      }
      boolean _notEquals_1 = (!Objects.equal(el, null));
      _while = _notEquals_1;
    }
    return tmp;
  }
  
  public String switchElementUI(final ElementUI el) {
    if ((el instanceof CheckBox)) {
      return this.rendererCheckbox(((CheckBox) el));
    } else {
      if ((el instanceof Radio)) {
        return this.rendererRadio(((Radio) el));
      } else {
        if ((el instanceof DropDown)) {
          return this.rendererDropDown(((DropDown) el));
        } else {
          if ((el instanceof Text)) {
            return this.rendererText(((Text) el));
          } else {
            if ((el instanceof TextArea)) {
              return this.rendererTextArea(((TextArea) el));
            } else {
              if ((el instanceof EnsembleQuestions)) {
                return this.rendererEnsembleQuestions(((EnsembleQuestions) el));
              } else {
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("<p>Erreur de type sur ");
                String _question = el.getQuestion();
                _builder.append(_question, "");
                return _builder.toString();
              }
            }
          }
        }
      }
    }
  }
  
  public String rendererCheckbox(final CheckBox chk) {
    String tmp = "";
    EList<Option> _options = chk.getOptions();
    int _length = ((Object[])Conversions.unwrapArray(_options, Object.class)).length;
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<label ");
      {
        String _id = chk.getId();
        boolean _notEquals = (!Objects.equal(_id, null));
        if (_notEquals) {
          _builder.append(" id=\"");
          String _id_1 = chk.getId();
          _builder.append(_id_1, "");
        }
      }
      _builder.append("\">");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      String _question = chk.getQuestion();
      _builder.append(_question, "	");
      _builder.newLineIfNotEmpty();
      _builder.append("</label>");
      _builder.newLine();
      tmp = _builder.toString();
      EList<Option> _options_1 = chk.getOptions();
      final Iterator<Option> itChk = _options_1.iterator();
      boolean _hasNext = itChk.hasNext();
      boolean _while = _hasNext;
      while (_while) {
        {
          final Option opt = itChk.next();
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("<input type=\"checkbox\" name=\"");
          String _value = opt.getValue();
          _builder_1.append(_value, "");
          _builder_1.append("\" value=\"1\" />");
          String _value_1 = opt.getValue();
          _builder_1.append(_value_1, "");
          _builder_1.append("<br>");
          String _plus = (tmp + _builder_1);
          tmp = _plus;
        }
        boolean _hasNext_1 = itChk.hasNext();
        _while = _hasNext_1;
      }
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<input type=\"checkbox\" name=\"");
      {
        String _id_2 = chk.getId();
        boolean _notEquals_1 = (!Objects.equal(_id_2, null));
        if (_notEquals_1) {
          String _id_3 = chk.getId();
          _builder_1.append(_id_3, "");
        } else {
          String _question_1 = chk.getQuestion();
          _builder_1.append(_question_1, "");
        }
      }
      _builder_1.append("\" value=\"1\" />");
      String _question_2 = chk.getQuestion();
      _builder_1.append(_question_2, "");
      tmp = _builder_1.toString();
    }
    return (tmp + "<br>");
  }
  
  public String rendererRadio(final Radio rd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<label ");
    {
      String _id = rd.getId();
      boolean _notEquals = (!Objects.equal(_id, null));
      if (_notEquals) {
        _builder.append(" id=\"");
        String _id_1 = rd.getId();
        _builder.append(_id_1, "");
      }
    }
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _question = rd.getQuestion();
    _builder.append(_question, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("</label>");
    _builder.newLine();
    String tmp = _builder.toString();
    EList<Option> _options = rd.getOptions();
    final Iterator<Option> itRd = _options.iterator();
    int id = 0;
    boolean _hasNext = itRd.hasNext();
    boolean _while = _hasNext;
    while (_while) {
      {
        final Option opt = itRd.next();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<input type=\"radio\" name=\"");
        String _id_2 = rd.getId();
        _builder_1.append(_id_2, "");
        _builder_1.append("\" value=\"");
        _builder_1.append(id, "");
        _builder_1.append("\" ");
        {
          boolean _equals = (id == 0);
          if (_equals) {
            _builder_1.append("checked ");
          }
        }
        _builder_1.append("/>");
        String _value = opt.getValue();
        _builder_1.append(_value, "");
        _builder_1.append(" ");
        String _plus = (tmp + _builder_1);
        tmp = _plus;
        int _plus_1 = (id + 1);
        id = _plus_1;
      }
      boolean _hasNext_1 = itRd.hasNext();
      _while = _hasNext_1;
    }
    return (tmp + "<br><br>");
  }
  
  public String rendererDropDown(final DropDown dd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<label ");
    {
      String _id = dd.getId();
      boolean _notEquals = (!Objects.equal(_id, null));
      if (_notEquals) {
        _builder.append(" id=\"");
        String _id_1 = dd.getId();
        _builder.append(_id_1, "");
      }
    }
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _question = dd.getQuestion();
    _builder.append(_question, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("</label>");
    _builder.newLine();
    _builder.append("<select name=\"");
    {
      String _id_2 = dd.getId();
      boolean _notEquals_1 = (!Objects.equal(_id_2, null));
      if (_notEquals_1) {
        String _id_3 = dd.getId();
        _builder.append(_id_3, "");
      } else {
        String _question_1 = dd.getQuestion();
        _builder.append(_question_1, "");
      }
    }
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    String tmp = _builder.toString();
    EList<Option> _options = dd.getOptions();
    final Iterator<Option> itRd = _options.iterator();
    int id = 0;
    boolean _hasNext = itRd.hasNext();
    boolean _while = _hasNext;
    while (_while) {
      {
        final Option opt = itRd.next();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<option value=\"");
        _builder_1.append(id, "");
        _builder_1.append("\"/>");
        String _value = opt.getValue();
        _builder_1.append(_value, "");
        _builder_1.append("</option>");
        _builder_1.newLineIfNotEmpty();
        String _plus = (tmp + _builder_1);
        tmp = _plus;
        int _plus_1 = (id + 1);
        id = _plus_1;
      }
      boolean _hasNext_1 = itRd.hasNext();
      _while = _hasNext_1;
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("</select>");
    String _plus = (tmp + _builder_1);
    tmp = _plus;
    return (tmp + "<br><br>");
  }
  
  public String rendererText(final Text txt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<label ");
    {
      String _id = txt.getId();
      boolean _notEquals = (!Objects.equal(_id, null));
      if (_notEquals) {
        _builder.append(" id=\"");
        String _id_1 = txt.getId();
        _builder.append(_id_1, "");
      }
    }
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _question = txt.getQuestion();
    _builder.append(_question, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("</label>");
    _builder.newLine();
    _builder.append("<input type=\"text\" name=\"");
    {
      String _id_2 = txt.getId();
      boolean _notEquals_1 = (!Objects.equal(_id_2, null));
      if (_notEquals_1) {
        String _id_3 = txt.getId();
        _builder.append(_id_3, "");
      } else {
        String _question_1 = txt.getQuestion();
        _builder.append(_question_1, "");
      }
    }
    _builder.append("\" />");
    _builder.newLineIfNotEmpty();
    String tmp = _builder.toString();
    return (tmp + "<br><br>");
  }
  
  public String rendererTextArea(final TextArea txt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<label ");
    {
      String _id = txt.getId();
      boolean _notEquals = (!Objects.equal(_id, null));
      if (_notEquals) {
        _builder.append(" id=\"");
        String _id_1 = txt.getId();
        _builder.append(_id_1, "");
      }
    }
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _question = txt.getQuestion();
    _builder.append(_question, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("</label>");
    _builder.newLine();
    _builder.append("<textarea rows=\"4\" cols=\"50\" name=\"");
    {
      String _id_2 = txt.getId();
      boolean _notEquals_1 = (!Objects.equal(_id_2, null));
      if (_notEquals_1) {
        String _id_3 = txt.getId();
        _builder.append(_id_3, "");
      } else {
        String _question_1 = txt.getQuestion();
        _builder.append(_question_1, "");
      }
    }
    _builder.append("\"></textarea>");
    _builder.newLineIfNotEmpty();
    String tmp = _builder.toString();
    return (tmp + "<br><br>");
  }
  
  public String parcoursSousQuestions(final EList<ElementUI> listeSousQuestion) {
    String tmp = "";
    Iterator<ElementUI> itL = listeSousQuestion.iterator();
    boolean _hasNext = itL.hasNext();
    boolean _while = _hasNext;
    while (_while) {
      ElementUI _next = itL.next();
      String _switchElementUI = this.switchElementUI(_next);
      String _plus = (tmp + _switchElementUI);
      tmp = _plus;
      boolean _hasNext_1 = itL.hasNext();
      _while = _hasNext_1;
    }
    return tmp;
  }
  
  public String rendererEnsembleQuestions(final EnsembleQuestions eq) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<fieldset>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<legend>");
    String _question = eq.getQuestion();
    _builder.append(_question, "	");
    _builder.append("</legend>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    EList<ElementUI> _listeSousQuestion = eq.getListeSousQuestion();
    String _parcoursSousQuestions = this.parcoursSousQuestions(_listeSousQuestion);
    _builder.append(_parcoursSousQuestions, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("</fieldset>");
    _builder.newLine();
    String tmp = _builder.toString();
    return (tmp + "<br><br>");
  }
  
  public String storeToFile(final String fileNameOut, final String contenu) {
    String _xtrycatchfinallyexpression = null;
    try {
      FileWriter _fileWriter = new FileWriter(fileNameOut);
      PrintWriter _printWriter = new PrintWriter(_fileWriter);
      PrintWriter pr = _printWriter;
      pr.print(contenu);
      pr.close();
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        String _plus = ("Error writing to " + fileNameOut);
        String _println = InputOutput.<String>println(_plus);
        _xtrycatchfinallyexpression = _println;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
}
