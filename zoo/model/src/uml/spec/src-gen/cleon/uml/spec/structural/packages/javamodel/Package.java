package cleon.uml.spec.structural.packages.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Package extends DynamicResource implements IPackage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackage>() {
    
    @Override
    public IPackage create() {
      return new Package();
    }
    
    @Override
    public IPackage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Package(resourceRepository, resource);
    }
  
  };

  public Package() {
    super(IPackage.TYPE_ID);
  }
  
  public Package(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPackage.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectResponsibility() {
    return _getSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility);
  }
    
  public void setResponsibility(java.lang.String responsibility) {
     _setSingleAttribute(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, responsibility);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters);
  }

  public Package setChapters(java.util.List<? extends cleon.doc.spec.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.SpecPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.javamodel.IClassifier> selectClasses() {
    return _getList(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_classes);
  }

  public Package setClasses(java.util.List<? extends cleon.uml.spec.structural.classes.javamodel.IClassifier> classes) {
    _setList(cleon.uml.spec.structural.packages.PackagesPackage.Package_classes, classes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Package setDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackage> selectSubPackages() {
    return _getList(cleon.uml.spec.structural.packages.javamodel.IPackage.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages);
  }

  public Package setSubPackages(java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackage> subPackages) {
    _setList(cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages, subPackages);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Package setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock> selectUseDecompositions() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions);
  }

  public Package setUseDecompositions(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock> useDecompositions) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions, useDecompositions);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    // relations
    _acceptList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters, visitor);
    _acceptList(cleon.uml.spec.structural.classes.javamodel.IClassifier.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_classes, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.uml.spec.structural.packages.javamodel.IPackage.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions, visitor);
  }

  // toMeRelations
  
  public static cleon.uml.spec.structural.packages.javamodel.IPackage selectToMeSubPackages(cleon.uml.spec.structural.packages.javamodel.IPackage object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.structural.packages.javamodel.IPackage.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_subPackages, object.getResource());
  }
  
  public static cleon.uml.spec.structural.packages.javamodel.IPackage selectToMeClasses(cleon.uml.spec.structural.classes.javamodel.IClassifier object) {
    return _getToMeSingle(object.getRepository(), cleon.uml.spec.structural.packages.javamodel.IPackage.class, cleon.uml.spec.structural.packages.PackagesPackage.Package_classes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2f4eebfb-92f9-11e3-a63e-fb8038f76aec,og6OPiWNpstuEFmSaQdHbRngpbo=] */
