package cleon.common.doc.spec.doc.paragraph.sourcecode.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SourceCode extends DynamicResource implements ISourceCode {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISourceCode> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISourceCode>() {
    
    @Override
    public ISourceCode create() {
      return new SourceCode();
    }
    
    @Override
    public ISourceCode create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SourceCode(resourceRepository, resource);
    }
  
  };

  public SourceCode() {
    super(ISourceCode.TYPE_ID);
  }
  
  public SourceCode(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISourceCode.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectCode() {
    return _getListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.paragraph.sourcecode.SourcecodePackage.SourceCode_code);
  }
    
  public void setCode(java.util.List<java.lang.String> code) {
     _setListAttribute(cleon.common.doc.spec.doc.paragraph.sourcecode.SourcecodePackage.SourceCode_code, code);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public SourceCode setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SourceCode setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.paragraph.sourcecode.SourcecodePackage.SourceCode_code, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3d1cea5a-466e-11e5-ba74-cb2e95044e1c,GrDTl1fpdXj8WFlJibSs83IPRUQ=] */
