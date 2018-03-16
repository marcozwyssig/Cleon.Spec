package cleon.support.projectmanagement.spec.steering.controlling.module.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ModuleImpediments extends DynamicResource implements IModuleImpediments {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModuleImpediments> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModuleImpediments>() {
    
    @Override
    public IModuleImpediments create() {
      return new ModuleImpediments();
    }
    
    @Override
    public IModuleImpediments create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ModuleImpediments(resourceRepository, resource);
    }
  
  };

  public ModuleImpediments() {
    super(IModuleImpediments.TYPE_ID);
  }
  
  public ModuleImpediments(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IModuleImpediments.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public ModuleImpediments setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.support.projectmanagement.spec.steering.impediments.javamodel.IImpediment> selectImpediments() {
    return _getList(cleon.support.projectmanagement.spec.steering.impediments.javamodel.IImpediment.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleImpediments_impediments);
  }

  public ModuleImpediments setImpediments(java.util.List<? extends cleon.support.projectmanagement.spec.steering.impediments.javamodel.IImpediment> impediments) {
    _setList(cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleImpediments_impediments, impediments);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ModuleImpediments setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.support.projectmanagement.spec.steering.impediments.javamodel.IImpediment.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleImpediments_impediments, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleImpediments> selectToMeImpediments(cleon.support.projectmanagement.spec.steering.impediments.javamodel.IImpediment object) {
    return _getToMeList(object.getRepository(), cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleImpediments.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleImpediments_impediments, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d942ec5f-3384-11e6-b251-57783f5929b3,ZtuCYpo8Z3LiFw/XITZB3fB0eG0=] */
