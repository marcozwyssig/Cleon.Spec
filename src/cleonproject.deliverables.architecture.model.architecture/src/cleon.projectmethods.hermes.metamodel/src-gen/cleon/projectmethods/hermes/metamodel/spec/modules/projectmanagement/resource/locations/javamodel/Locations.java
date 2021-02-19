package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.locations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Locations extends DynamicResource implements ILocations {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILocations> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILocations>() {
    
    @Override
    public ILocations create() {
      return new Locations();
    }
    
    @Override
    public ILocations create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Locations(resourceRepository, resource);
    }
  
  };

  public Locations() {
    super(ILocations.TYPE_ID);
  }
  
  public Locations(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILocations.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public Locations setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Locations setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.locations.javamodel.ILocation> selectLocations() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.locations.javamodel.ILocation.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.locations.LocationsPackage.Locations_locations);
  }

  public Locations setLocations(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.locations.javamodel.ILocation> locations) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.locations.LocationsPackage.Locations_locations, locations);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Locations setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Locations setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.locations.javamodel.ILocation.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.locations.LocationsPackage.Locations_locations, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.locations.javamodel.ILocations selectToMeLocations(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.locations.javamodel.ILocation object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.locations.javamodel.ILocations.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.locations.LocationsPackage.Locations_locations, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0de22a0b-c768-11e5-b3f9-43c5a0896ea1,AYRBYXVx1s2iazjSl8tQGGCoVTc=] */
