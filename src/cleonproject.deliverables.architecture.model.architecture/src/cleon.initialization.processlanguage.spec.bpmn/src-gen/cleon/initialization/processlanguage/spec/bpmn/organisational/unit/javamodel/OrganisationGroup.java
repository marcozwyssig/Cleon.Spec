package cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OrganisationGroup extends DynamicResource implements IOrganisationGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrganisationGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrganisationGroup>() {
    
    @Override
    public IOrganisationGroup create() {
      return new OrganisationGroup();
    }
    
    @Override
    public IOrganisationGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OrganisationGroup(resourceRepository, resource);
    }
  
  };

  public OrganisationGroup() {
    super(IOrganisationGroup.TYPE_ID);
  }
  
  public OrganisationGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOrganisationGroup.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole selectResponsible() {
    return _getSingle(cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_responsible);
  }

  public OrganisationGroup setResponsible(cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole responsible) {
    _setSingle(cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_responsible, responsible);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole> selectStaff() {
    return _getList(cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_staff);
  }

  public OrganisationGroup setStaff(java.util.List<? extends cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole> staff) {
    _setList(cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_staff, staff);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationUnit> selectSubOrganisations() {
    return _getList(cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationUnit.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationGroup_subOrganisations);
  }

  public OrganisationGroup setSubOrganisations(java.util.List<? extends cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationUnit> subOrganisations) {
    _setList(cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationGroup_subOrganisations, subOrganisations);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OrganisationGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_responsible, visitor);
    _acceptList(cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_staff, visitor);
    _acceptList(cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationUnit.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationGroup_subOrganisations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationGroup selectToMeSubOrganisations(cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationUnit object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationGroup.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationGroup_subOrganisations, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a7b9016a-ba7b-11e3-9206-f19b78f4aff0,FH34zNqTS9VssZGYNbGQ5f60stU=] */