package transformation;

import com.google.common.base.Objects;
import java.io.FileWriter;
import java.io.PrintWriter;
import mmui.CheckBox;
import mmui.ElementUI;
import mmui.Layout;
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
  public Layout loadXMI(final String fileName) {
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    ResourceSet resourceSet = _resourceSetImpl;
    URI _createURI = URI.createURI(fileName);
    Resource loadedModel = resourceSet.getResource(_createURI, true);
    EList<EObject> _contents = loadedModel.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    Layout loadedUI = ((Layout) _head);
    return loadedUI;
  }
  
  public String transform(final String fileNameXMI, final String fileNameOut) {
    String _xblockexpression = null;
    {
      Layout lay = this.loadXMI(fileNameXMI);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<html>");
      _builder.newLine();
      String _parcoursLayout = this.parcoursLayout(lay);
      _builder.append(_parcoursLayout, "");
      _builder.newLineIfNotEmpty();
      _builder.append("</html>");
      _builder.newLine();
      String template = _builder.toString();
      String _storeToFile = this.storeToFile(fileNameOut, template);
      _xblockexpression = (_storeToFile);
    }
    return _xblockexpression;
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
    _builder.append("<input type=\"checkbox\" name=\"");
    String _id = chk.getId();
    _builder.append(_id, "");
    _builder.append("\" value=\"1\" />");
    String _question = chk.getQuestion();
    _builder.append(_question, "");
    _builder.append("<br>");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
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
