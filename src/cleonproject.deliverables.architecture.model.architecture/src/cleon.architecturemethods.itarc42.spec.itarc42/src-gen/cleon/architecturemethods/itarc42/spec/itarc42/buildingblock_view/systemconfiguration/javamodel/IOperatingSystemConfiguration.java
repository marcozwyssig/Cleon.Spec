package cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOperatingSystemConfiguration extends cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("75800d3e-1bfe-11e9-9896-651e5faa32a4");
  
  // relations
  
  public cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.javamodel.IRuntime selectRuntime();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,75800d3e-1bfe-11e9-9896-651e5faa32a4,7G8KXC3blf4tEI0LNBsZH7VGBBM=] */