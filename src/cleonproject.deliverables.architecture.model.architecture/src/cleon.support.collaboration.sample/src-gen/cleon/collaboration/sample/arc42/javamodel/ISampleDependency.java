package cleon.collaboration.sample.arc42.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISampleDependency extends cleon.conception.architecture.spec.buildingblock.javamodel.IDependency {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3b9d179f-c07b-11e6-beed-bb6789615dd5");
  
  // relations
  
  public cleon.collaboration.sample.arc42.javamodel.ISampleBuildingBlock selectTo();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3b9d179f-c07b-11e6-beed-bb6789615dd5,BJPYFmwqsaTOrD4lWhAK+lkGGSU=] */