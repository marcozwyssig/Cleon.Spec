package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestGlobalPreconditions extends DynamicResource implements ITestGlobalPreconditions {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestGlobalPreconditions> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestGlobalPreconditions>() {
    
    @Override
    public ITestGlobalPreconditions create() {
      return new TestGlobalPreconditions();
    }
    
    @Override
    public ITestGlobalPreconditions create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestGlobalPreconditions(resourceRepository, resource);
    }
  
  };

  public TestGlobalPreconditions() {
    super(ITestGlobalPreconditions.TYPE_ID);
  }
  
  public TestGlobalPreconditions(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestGlobalPreconditions.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public TestGlobalPreconditions setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public TestGlobalPreconditions setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestGlobalPreconditions setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestGlobalPreconditionGroup> selectTestPreconditionGroups() {
    return _getList(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestGlobalPreconditionGroup.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.Test_preconditionPackage.TestGlobalPreconditions_testPreconditionGroups);
  }

  public TestGlobalPreconditions setTestPreconditionGroups(java.util.List<? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestGlobalPreconditionGroup> testPreconditionGroups) {
    _setList(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.Test_preconditionPackage.TestGlobalPreconditions_testPreconditionGroups, testPreconditionGroups);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestGlobalPreconditions setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptList(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestGlobalPreconditionGroup.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.Test_preconditionPackage.TestGlobalPreconditions_testPreconditionGroups, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestGlobalPreconditions selectToMeTestPreconditionGroups(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestGlobalPreconditionGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestGlobalPreconditions.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.Test_preconditionPackage.TestGlobalPreconditions_testPreconditionGroups, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,894f4f5a-669f-11e9-9ec9-5fbc84faaeb1,1Od0ouDVI381vFr9fpb3DRR1gF8=] */