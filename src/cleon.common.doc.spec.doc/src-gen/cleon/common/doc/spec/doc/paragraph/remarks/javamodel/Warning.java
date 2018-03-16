package cleon.common.doc.spec.doc.paragraph.remarks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Warning extends DynamicResource implements IWarning {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWarning> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWarning>() {
    
    @Override
    public IWarning create() {
      return new Warning();
    }
    
    @Override
    public IWarning create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Warning(resourceRepository, resource);
    }
  
  };

  public Warning() {
    super(IWarning.TYPE_ID);
  }
  
  public Warning(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWarning.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectRemark() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.spec.doc.paragraph.remarks.RemarksPackage.Remark_remark);
  }
    
  public void setRemark(java.lang.String remark) {
     _setSingleAttribute(cleon.common.doc.spec.doc.paragraph.remarks.RemarksPackage.Remark_remark, remark);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Warning setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Warning setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.spec.doc.paragraph.remarks.RemarksPackage.Remark_remark, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,aad9acec-466d-11e5-ba74-cb2e95044e1c,8HSqKkLrEiFxLZ9nEtSsAa4HA4E=] */
