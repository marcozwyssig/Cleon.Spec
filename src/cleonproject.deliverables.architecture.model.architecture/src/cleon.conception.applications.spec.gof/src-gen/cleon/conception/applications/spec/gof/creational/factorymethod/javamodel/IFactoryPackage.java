package cleon.conception.applications.spec.gof.creational.factorymethod.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IFactoryPackage extends cleon.conception.architecture.spec.uml.structural.packages.javamodel.IPackage {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("46daf4f0-ddd3-11e4-b0b5-6911fa4e24e5");
  
  // relations
  
  public cleon.conception.applications.spec.gof.creational.factorymethod.javamodel.IFactoryCreator selectFactory();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,46daf4f0-ddd3-11e4-b0b5-6911fa4e24e5,Z2dnWy0v5pGAqaRBAlzMmqqK0Fw=] */