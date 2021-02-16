package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IServiceAccountTemplate extends cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.metamodel.spec.descriptions.javamodel.IMandatoryDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9eec10e6-395b-11eb-978d-47c0228773ba");
  
  public java.lang.Integer selectOverrideId();
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration selectServiceConfigurationForServiceAccount();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IBuiltinRole> selectBuiltinRoles();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForPermission> selectActivityTemplates();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9eec10e6-395b-11eb-978d-47c0228773ba,KVC1sE31HUCZ/mCMIJp7JM3cxnM=] */
