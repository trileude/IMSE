package transformation;

import mmui.Layout;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class transfoModelToText {
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
  
  public Object transform(final String fileNameXMI) {
    return null;
  }
}
