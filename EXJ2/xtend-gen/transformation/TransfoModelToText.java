package transformation;

import com.google.common.base.Objects;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Iterator;
import mmui.CheckBox;
import mmui.ElementUI;
import mmui.Layout;
import mmui.MetaLayout;
import mmui.Option;
import mmui.Radio;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
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
      String _parcoursMetaLayout = this.parcoursMetaLayout(metaLay);
      _builder.append(_parcoursMetaLayout, "");
      _builder.newLineIfNotEmpty();
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
        if ((el instanceof CheckBox)) {
          String _rendererCheckbox = this.rendererCheckbox(((CheckBox) el));
          String _plus = (tmp + _rendererCheckbox);
          tmp = _plus;
        } else {
          if ((el instanceof Radio)) {
            String _rendererRadio = this.rendererRadio(((Radio) el));
            String _plus_1 = (tmp + _rendererRadio);
            tmp = _plus_1;
          }
        }
        ElementUI _next = el.getNext();
        el = _next;
      }
      boolean _notEquals_1 = (!Objects.equal(el, null));
      _while = _notEquals_1;
    }
    return tmp;
  }
  
  public String rendererCheckbox(final CheckBox chk) {
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
    String tmp = _builder.toString();
    EList<Option> _options = chk.getOptions();
    final Iterator<Option> itChk = _options.iterator();
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
