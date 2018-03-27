package cleon.initialization.projectmanagement.spec.planning.initialposition.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Initialposition extends DynamicResource implements IInitialposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInitialposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInitialposition>() {
    
    @Override
    public IInitialposition create() {
      return new Initialposition();
    }
    
    @Override
    public IInitialposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Initialposition(resourceRepository, resource);
    }
  
  };

  public Initialposition() {
    super(IInitialposition.TYPE_ID);
  }
  
  public Initialposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInitialposition.TYPE_ID);
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

  public Initialposition setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Initialposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.initialposition.javamodel.IPositionView> selectViews() {
    return _getList(cleon.initialization.projectmanagement.spec.planning.initialposition.javamodel.IPositionView.class, cleon.initialization.projectmanagement.spec.planning.initialposition.InitialpositionPackage.Initialposition_views);
  }

  public Initialposition setViews(java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.initialposition.javamodel.IPositionView> views) {
    _setList(cleon.initialization.projectmanagement.spec.planning.initialposition.InitialpositionPackage.Initialposition_views, views);
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
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.initialization.projectmanagement.spec.planning.initialposition.javamodel.IPositionView.class, cleon.initialization.projectmanagement.spec.planning.initialposition.InitialpositionPackage.Initialposition_views, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.planning.initialposition.javamodel.IInitialposition selectToMeViews(cleon.initialization.projectmanagement.spec.planning.initialposition.javamodel.IPositionView object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.initialposition.javamodel.IInitialposition.class, cleon.initialization.projectmanagement.spec.planning.initialposition.InitialpositionPackage.Initialposition_views, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,df42256a-c1c9-11e6-bd27-4740c1c9b441,h58djqvtxW8ZhYhJls8Cwgu2D0Y=] */