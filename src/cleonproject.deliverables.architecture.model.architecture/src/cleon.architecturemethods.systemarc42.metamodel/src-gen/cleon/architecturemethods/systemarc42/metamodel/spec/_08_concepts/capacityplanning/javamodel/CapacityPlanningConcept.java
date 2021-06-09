package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CapacityPlanningConcept extends DynamicResource implements ICapacityPlanningConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICapacityPlanningConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICapacityPlanningConcept>() {
    
    @Override
    public ICapacityPlanningConcept create() {
      return new CapacityPlanningConcept();
    }
    
    @Override
    public ICapacityPlanningConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CapacityPlanningConcept(resourceRepository, resource);
    }
  
  };

  public CapacityPlanningConcept() {
    super(ICapacityPlanningConcept.TYPE_ID);
  }
  
  public CapacityPlanningConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICapacityPlanningConcept.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICPU> selectCPUs() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICPU.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacityPlanningConcept_cPUs);
  }

  public CapacityPlanningConcept setCPUs(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICPU> cPUs) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacityPlanningConcept_cPUs, cPUs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacityPlanningSystemConcept> selectCapacityPlanningConcept() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacityPlanningSystemConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacityPlanningConcept_capacityPlanningConcept);
  }

  public CapacityPlanningConcept setCapacityPlanningConcept(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacityPlanningSystemConcept> capacityPlanningConcept) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacityPlanningConcept_capacityPlanningConcept, capacityPlanningConcept);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public CapacityPlanningConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.IDisk> selectDisks() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.IDisk.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacityPlanningConcept_disks);
  }

  public CapacityPlanningConcept setDisks(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.IDisk> disks) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacityPlanningConcept_disks, disks);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public CapacityPlanningConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.IMemory> selectMemory() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.IMemory.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacityPlanningConcept_memory);
  }

  public CapacityPlanningConcept setMemory(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.IMemory> memory) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacityPlanningConcept_memory, memory);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public CapacityPlanningConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcept> selectSystemConcept() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.ConceptForSystem_systemConcept);
  }

  public CapacityPlanningConcept setSystemConcept(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.javamodel.ISystemConcept> systemConcept) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts._08_conceptsPackage.ConceptForSystem_systemConcept, systemConcept);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CapacityPlanningConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICPU.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacityPlanningConcept_cPUs, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacityPlanningSystemConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacityPlanningConcept_capacityPlanningConcept, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.IDisk.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacityPlanningConcept_disks, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.IMemory.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacityPlanningConcept_memory, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacityPlanningConcept selectToMeCapacityPlanningConcept(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacityPlanningSystemConcept object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacityPlanningConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacityPlanningConcept_capacityPlanningConcept, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacityPlanningConcept selectToMeCPUs(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICPU object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacityPlanningConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacityPlanningConcept_cPUs, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacityPlanningConcept selectToMeDisks(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.IDisk object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacityPlanningConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacityPlanningConcept_disks, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacityPlanningConcept selectToMeMemory(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.IMemory object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICapacityPlanningConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.CapacityplanningPackage.CapacityPlanningConcept_memory, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0a49b292-c93a-11eb-adc4-d18d1353eb6e,8QcYE/KoWuxDonCT/tUHa2CQGp4=] */