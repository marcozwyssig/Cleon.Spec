package cleon.actifsource.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Template extends DynamicResource implements ITemplate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITemplate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITemplate>() {
    
    @Override
    public ITemplate create() {
      return new Template();
    }
    
    @Override
    public ITemplate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Template(resourceRepository, resource);
    }
  
  };

  public Template() {
    super(ITemplate.TYPE_ID);
  }
  
  public Template(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITemplate.TYPE_ID);
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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectResponsibility() {
    return _getSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility);
  }
    
  public void setResponsibility(java.lang.String responsibility) {
     _setSingleAttribute(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, responsibility);
  }

  @Override
  public java.lang.String selectVersion() {
    return _getSingleAttribute(java.lang.String.class, cleon.actifsource.spec.SpecPackage.Project_version);
  }
    
  public void setVersion(java.lang.String version) {
     _setSingleAttribute(cleon.actifsource.spec.SpecPackage.Project_version, version);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.actifsource.spec.javamodel.IProjectDependency> selectDependsOn() {
    return _getList(cleon.actifsource.spec.javamodel.IProjectDependency.class, cleon.actifsource.spec.SpecPackage.Project_dependsOn);
  }

  public Template setDependsOn(java.util.List<? extends cleon.actifsource.spec.javamodel.IProjectDependency> dependsOn) {
    _setList(cleon.actifsource.spec.SpecPackage.Project_dependsOn, dependsOn);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDependency> selectHasDependency() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IDependency.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DependentBuildingBlock_hasDependency);
  }

  public Template setHasDependency(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDependency> hasDependency) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DependentBuildingBlock_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Template setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.actifsource.spec.SpecPackage.Project_version, visitor);
    // relations
    _acceptList(cleon.actifsource.spec.javamodel.IProjectDependency.class, cleon.actifsource.spec.SpecPackage.Project_dependsOn, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IDependency.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DependentBuildingBlock_hasDependency, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3e687740-e9ba-11e4-848b-0509e3792151,7WC7Q03x6zT1K3sqgH8rF6O5Mh4=] */