package cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystemConfiguration extends cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponent, cleon.architecturemethods.arc42.metamodel.spec._12_requirements_coverage.javamodel.IBuildingBlockRequirementCoverage, cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4e0a6f85-e0fb-11e8-8499-a3b0fb3cad90");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfigurationDependency> selectHasDependency();
  
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> selectInSubZone();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4e0a6f85-e0fb-11e8-8499-a3b0fb3cad90,Mt6oR8iKYPICG6ELAw4+YJBZ94o=] */
