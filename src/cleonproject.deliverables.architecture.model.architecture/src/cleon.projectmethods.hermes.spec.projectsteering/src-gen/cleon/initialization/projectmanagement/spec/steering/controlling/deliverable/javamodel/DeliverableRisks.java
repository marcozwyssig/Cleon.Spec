package cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeliverableRisks extends DynamicResource implements IDeliverableRisks {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeliverableRisks> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeliverableRisks>() {
    
    @Override
    public IDeliverableRisks create() {
      return new DeliverableRisks();
    }
    
    @Override
    public IDeliverableRisks create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeliverableRisks(resourceRepository, resource);
    }
  
  };

  public DeliverableRisks() {
    super(IDeliverableRisks.TYPE_ID);
  }
  
  public DeliverableRisks(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeliverableRisks.TYPE_ID);
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

  public DeliverableRisks setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRisk> selectRisks() {
    return _getList(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRisk.class, cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableRisks_risks);
  }

  public DeliverableRisks setRisks(java.util.List<? extends cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRisk> risks) {
    _setList(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableRisks_risks, risks);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeliverableRisks setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRisk.class, cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableRisks_risks, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableRisks> selectToMeRisks(cleon.initialization.projectmanagement.spec.steering.riskmanagement.risks.javamodel.IRisk object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableRisks.class, cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableRisks_risks, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dd556bb4-2f0a-11e6-8bd9-a77b8d2a3a0e,zPb+7/9dbmTHVno6URhvbVXgD5s=] */