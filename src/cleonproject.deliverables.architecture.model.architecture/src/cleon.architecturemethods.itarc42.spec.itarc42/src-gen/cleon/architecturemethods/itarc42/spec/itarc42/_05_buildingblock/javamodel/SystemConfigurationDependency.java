package cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SystemConfigurationDependency extends DynamicResource implements ISystemConfigurationDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemConfigurationDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemConfigurationDependency>() {
    
    @Override
    public ISystemConfigurationDependency create() {
      return new SystemConfigurationDependency();
    }
    
    @Override
    public ISystemConfigurationDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SystemConfigurationDependency(resourceRepository, resource);
    }
  
  };

  public SystemConfigurationDependency() {
    super(ISystemConfigurationDependency.TYPE_ID);
  }
  
  public SystemConfigurationDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystemConfigurationDependency.TYPE_ID);
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
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfiguration selectTo() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemConfigurationDependency_to);
  }

  public SystemConfigurationDependency setTo(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfiguration to) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemConfigurationDependency_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SystemConfigurationDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemConfigurationDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfigurationDependency> selectToMeTo(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemConfigurationDependency.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemConfigurationDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4134540e-01d9-11e9-9c9d-8d52d6745026,pT/IJAmUvFk6wHS04KiCjLNIO9E=] */
