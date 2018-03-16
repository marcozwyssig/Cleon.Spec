package cleon.conception.software.spec.software._05_building_block.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SoftwareSystem extends DynamicResource implements ISoftwareSystem {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISoftwareSystem> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISoftwareSystem>() {
    
    @Override
    public ISoftwareSystem create() {
      return new SoftwareSystem();
    }
    
    @Override
    public ISoftwareSystem create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SoftwareSystem(resourceRepository, resource);
    }
  
  };

  public SoftwareSystem() {
    super(ISoftwareSystem.TYPE_ID);
  }
  
  public SoftwareSystem(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISoftwareSystem.TYPE_ID);
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

  @Override
  public java.lang.String selectShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName);
  }
    
  public void setShortName(java.lang.String shortName) {
     _setSingleAttribute(cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, shortName);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDecomposite.class, cleon.conception.arc.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_decompose);
  }

  public SoftwareSystem setDecompose(java.util.List<? extends cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDecomposite> decompose) {
    _setList(cleon.conception.arc.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public SoftwareSystem setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDependency> selectHasDependency() {
    return _getList(cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDependency.class, cleon.conception.software.spec.software._05_building_block._05_building_blockPackage.SoftwareSystem_hasDependency);
  }

  public SoftwareSystem setHasDependency(java.util.List<? extends cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDependency> hasDependency) {
    _setList(cleon.conception.software.spec.software._05_building_block._05_building_blockPackage.SoftwareSystem_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SoftwareSystem setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, visitor);
    // relations
    _acceptList(cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDecomposite.class, cleon.conception.arc.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_decompose, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDependency.class, cleon.conception.software.spec.software._05_building_block._05_building_blockPackage.SoftwareSystem_hasDependency, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.software.spec.software._05_building_block.javamodel.ISoftwareSystem selectToMeHasDependency(cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.software.spec.software._05_building_block.javamodel.ISoftwareSystem.class, cleon.conception.software.spec.software._05_building_block._05_building_blockPackage.SoftwareSystem_hasDependency, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9237e4d5-4aa3-11e6-9c0f-393d355c5fe3,oNksfxxtHBAx7iOOeLtLRkCju+0=] */
