package ikt.product.documentation.spec.concepts.qos.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class QoS_Concept extends DynamicResource implements IQoS_Concept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQoS_Concept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQoS_Concept>() {
    
    @Override
    public IQoS_Concept create() {
      return new QoS_Concept();
    }
    
    @Override
    public IQoS_Concept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new QoS_Concept(resourceRepository, resource);
    }
  
  };

  public QoS_Concept() {
    super(IQoS_Concept.TYPE_ID);
  }
  
  public QoS_Concept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IQoS_Concept.TYPE_ID);
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

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public QoS_Concept setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public QoS_Concept setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public QoS_Concept setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends ikt.product.documentation.spec.concepts.qos.javamodel.IQoSConfigurationComponentConcept> selectQosConfigurationConcept() {
    return _getMap(ikt.product.documentation.spec.concepts.qos.javamodel.IQoSConfigurationComponentConcept.class, ikt.product.documentation.spec.concepts.qos.QosPackage.QoS_aE_Concept_qosConfigurationConcept);
  }

  public QoS_Concept setQosConfigurationConcept(java.util.Map<ch.actifsource.core.Resource, ? extends ikt.product.documentation.spec.concepts.qos.javamodel.IQoSConfigurationComponentConcept> qosConfigurationConcept) {
    _setMap(ikt.product.documentation.spec.concepts.qos.QosPackage.QoS_aE_Concept_qosConfigurationConcept, qosConfigurationConcept);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends ikt.product.documentation.spec.concepts.javamodel.ISystemConfigurationComponentConcept> selectSystemConfigurationConcept() {
    return _getMap(ikt.product.documentation.spec.concepts.javamodel.ISystemConfigurationComponentConcept.class, ikt.product.documentation.spec.concepts.ConceptsPackage.ConceptForSystemConfigurationComponent_systemConfigurationConcept);
  }

  public QoS_Concept setSystemConfigurationConcept(java.util.Map<ch.actifsource.core.Resource, ? extends ikt.product.documentation.spec.concepts.javamodel.ISystemConfigurationComponentConcept> systemConfigurationConcept) {
    _setMap(ikt.product.documentation.spec.concepts.ConceptsPackage.ConceptForSystemConfigurationComponent_systemConfigurationConcept, systemConfigurationConcept);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public QoS_Concept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMap(ikt.product.documentation.spec.concepts.qos.javamodel.IQoSConfigurationComponentConcept.class, ikt.product.documentation.spec.concepts.qos.QosPackage.QoS_aE_Concept_qosConfigurationConcept, visitor);
    _acceptMap(ikt.product.documentation.spec.concepts.javamodel.ISystemConfigurationComponentConcept.class, ikt.product.documentation.spec.concepts.ConceptsPackage.ConceptForSystemConfigurationComponent_systemConfigurationConcept, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ikt.product.documentation.spec.concepts.qos.javamodel.IQoS_Concept selectToMeQosConfigurationConcept(ikt.product.documentation.spec.concepts.qos.javamodel.IQoSConfigurationComponentConcept object) {
    return _getToMeSingle(object.getRepository(), ikt.product.documentation.spec.concepts.qos.javamodel.IQoS_Concept.class, ikt.product.documentation.spec.concepts.qos.QosPackage.QoS_aE_Concept_qosConfigurationConcept, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a4426fd0-f2e5-11e8-b860-9fc163e21388,MOq+PWn5JU8/1sV7SkLFim74Iaw=] */
