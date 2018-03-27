package cleon.initialization.projectmanagement.spec.planning.scope.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Scope extends DynamicResource implements IScope {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IScope> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IScope>() {
    
    @Override
    public IScope create() {
      return new Scope();
    }
    
    @Override
    public IScope create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Scope(resourceRepository, resource);
    }
  
  };

  public Scope() {
    super(IScope.TYPE_ID);
  }
  
  public Scope(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IScope.TYPE_ID);
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
  public cleon.initialization.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverables selectDeliverables() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverables.class, cleon.initialization.projectmanagement.spec.planning.scope.ScopePackage.Scope_deliverables);
  }

  public Scope setDeliverables(cleon.initialization.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverables deliverables) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.scope.ScopePackage.Scope_deliverables, deliverables);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Scope setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModules selectModules() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModules.class, cleon.initialization.projectmanagement.spec.planning.scope.ScopePackage.Scope_modules);
  }

  public Scope setModules(cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModules modules) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.scope.ScopePackage.Scope_modules, modules);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Scope setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackages selectWorkpackages() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackages.class, cleon.initialization.projectmanagement.spec.planning.scope.ScopePackage.Scope_workpackages);
  }

  public Scope setWorkpackages(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackages workpackages) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.scope.ScopePackage.Scope_workpackages, workpackages);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverables.class, cleon.initialization.projectmanagement.spec.planning.scope.ScopePackage.Scope_deliverables, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModules.class, cleon.initialization.projectmanagement.spec.planning.scope.ScopePackage.Scope_modules, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackages.class, cleon.initialization.projectmanagement.spec.planning.scope.ScopePackage.Scope_workpackages, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.planning.scope.javamodel.IScope selectToMeDeliverables(cleon.initialization.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverables object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.scope.javamodel.IScope.class, cleon.initialization.projectmanagement.spec.planning.scope.ScopePackage.Scope_deliverables, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.planning.scope.javamodel.IScope selectToMeModules(cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModules object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.scope.javamodel.IScope.class, cleon.initialization.projectmanagement.spec.planning.scope.ScopePackage.Scope_modules, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.planning.scope.javamodel.IScope selectToMeWorkpackages(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackages object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.scope.javamodel.IScope.class, cleon.initialization.projectmanagement.spec.planning.scope.ScopePackage.Scope_workpackages, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8c485ce0-3eb3-11e7-a89c-83d57940f0e3,ycLTXvvCRVBYLFaDHUqWWZiao60=] */
