package cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Organisation extends DynamicResource implements IOrganisation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrganisation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrganisation>() {
    
    @Override
    public IOrganisation create() {
      return new Organisation();
    }
    
    @Override
    public IOrganisation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Organisation(resourceRepository, resource);
    }
  
  };

  public Organisation() {
    super(IOrganisation.TYPE_ID);
  }
  
  public Organisation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOrganisation.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  @Override
  public java.util.List<java.lang.String> selectNotes() {
    return _getListAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.Notes_notes);
  }
    
  public void setNotes(java.util.List<java.lang.String> notes) {
     _setListAttribute(cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.Notes_notes, notes);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.goals.javamodel.IGoal> selectAchieves() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.goals.javamodel.IGoal.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.goals.GoalsPackage.GoalAware_achieves);
  }

  public Organisation setAchieves(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.goals.javamodel.IGoal> achieves) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.goals.GoalsPackage.GoalAware_achieves, achieves);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember selectAuthors() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember.class, cleon.common.doc.metamodel.spec.document.properties.member.MemberPackage.Authors_authors);
  }

  public Organisation setAuthors(cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember authors) {
    _setSingle(cleon.common.doc.metamodel.spec.document.properties.member.MemberPackage.Authors_authors, authors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public Organisation setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Organisation setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.stakeholder.javamodel.IStakeholder> selectOwners() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.stakeholder.javamodel.IStakeholder.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.stakeholder.StakeholderPackage.StakeholderAware_owners);
  }

  public Organisation setOwners(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.stakeholder.javamodel.IStakeholder> owners) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.stakeholder.StakeholderPackage.StakeholderAware_owners, owners);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Organisation setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectRequirements() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.SubjectareasPackage.SubSubjectArea_requirements);
  }

  public Organisation setRequirements(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> requirements) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.SubjectareasPackage.SubSubjectArea_requirements, requirements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Organisation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.Notes_notes, visitor);
    // relations
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.goals.javamodel.IGoal.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.goals.GoalsPackage.GoalAware_achieves, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember.class, cleon.common.doc.metamodel.spec.document.properties.member.MemberPackage.Authors_authors, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.stakeholder.javamodel.IStakeholder.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.stakeholder.StakeholderPackage.StakeholderAware_owners, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.SubjectareasPackage.SubSubjectArea_requirements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8f8a8414-0c77-11e6-86c5-87a8b520dd59,LqAjWmRaPTRjJWxXfQexZ5j7qbo=] */
