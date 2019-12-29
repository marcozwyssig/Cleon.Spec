package cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystemComponent extends cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentComposition, cleon.architecturemethods.arc42.metamodel.spec._12_requirements_coverage.javamodel.IBuildingBlockRequirementCoverage {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c0436bff-d0b2-11e8-b005-f7630e4c29c0");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfiguration> selectSystemConfigurations();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemComponentDependency> selectHasDependency();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c0436bff-d0b2-11e8-b005-f7630e4c29c0,aBtAbeHy+ZZvGMGPjpeQjKRAFPY=] */