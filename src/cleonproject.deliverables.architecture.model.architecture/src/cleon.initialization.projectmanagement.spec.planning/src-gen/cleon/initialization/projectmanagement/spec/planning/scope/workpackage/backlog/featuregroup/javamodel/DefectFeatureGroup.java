package cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DefectFeatureGroup extends DynamicResource implements IDefectFeatureGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDefectFeatureGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDefectFeatureGroup>() {
    
    @Override
    public IDefectFeatureGroup create() {
      return new DefectFeatureGroup();
    }
    
    @Override
    public IDefectFeatureGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DefectFeatureGroup(resourceRepository, resource);
    }
  
  };

  public DefectFeatureGroup() {
    super(IDefectFeatureGroup.TYPE_ID);
  }
  
  public DefectFeatureGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDefectFeatureGroup.TYPE_ID);
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
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Integer selectPlannedEstimate() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.WorkItemGroup_plannedEstimate);
  }
    
  public void setPlannedEstimate(java.lang.Integer plannedEstimate) {
     _setSingleAttribute(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.WorkItemGroup_plannedEstimate, plannedEstimate);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IDefect> selectDefects() {
    return _getList(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IDefect.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.DefectFeatureGroup_defects);
  }

  public DefectFeatureGroup setDefects(java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IDefect> defects) {
    _setList(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.DefectFeatureGroup_defects, defects);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItem> selectItems() {
    return _getList(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItem.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.WorkItemGroup_items);
  }

  public DefectFeatureGroup setItems(java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItem> items) {
    _setList(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.WorkItemGroup_items, items);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson> selectOwners() {
    return _getList(cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_owners);
  }

  public DefectFeatureGroup setOwners(java.util.List<? extends cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson> owners) {
    _setList(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_owners, owners);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup> selectPreconditions() {
    return _getList(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.WorkItemGroup_preconditions);
  }

  public DefectFeatureGroup setPreconditions(java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup> preconditions) {
    _setList(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.WorkItemGroup_preconditions, preconditions);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.priority.javamodel.IPriority selectPriority() {
    return _getSingle(cleon.common.resources.spec.resources.priority.javamodel.IPriority.class, cleon.common.resources.spec.resources.priority.PriorityPackage.PriorityAware_priority);
  }

  public DefectFeatureGroup setPriority(cleon.common.resources.spec.resources.priority.javamodel.IPriority priority) {
    _setSingle(cleon.common.resources.spec.resources.priority.PriorityPackage.PriorityAware_priority, priority);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItemState selectState() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItemState.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_state);
  }

  public DefectFeatureGroup setState(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItemState state) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DefectFeatureGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.WorkItemGroup_plannedEstimate, visitor);
    // relations
    _acceptList(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IDefect.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.DefectFeatureGroup_defects, visitor);
    _acceptList(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItem.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.WorkItemGroup_items, visitor);
    _acceptList(cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_owners, visitor);
    _acceptList(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.WorkItemGroup_preconditions, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.priority.javamodel.IPriority.class, cleon.common.resources.spec.resources.priority.PriorityPackage.PriorityAware_priority, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItemState.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.WorkItem_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.javamodel.IDefectFeatureGroup selectToMeDefects(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IDefect object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.javamodel.IDefectFeatureGroup.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.featuregroup.FeaturegroupPackage.DefectFeatureGroup_defects, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d243a7a6-369e-11e5-95d9-2b04d7ab02d9,s7i24C1x++MpLpi2kvMp5CWPyqA=] */
