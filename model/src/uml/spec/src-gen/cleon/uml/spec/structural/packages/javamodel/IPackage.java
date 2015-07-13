package cleon.uml.spec.structural.packages.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPackage extends cleon.arc42.spec._05_buildingblockview.javamodel.IDecompositionBuildingBlock {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2f4eebfb-92f9-11e3-a63e-fb8038f76aec");
  
  // relations
  
  public java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IPackageDecomposition> selectSubPackages();
  
  public java.util.List<? extends cleon.uml.spec.structural.packages.javamodel.IClassifierDecomposition> selectDecomposeClasses();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2f4eebfb-92f9-11e3-a63e-fb8038f76aec,e8Fn41yK7UItYo6tRg4+JaG8jxg=] */