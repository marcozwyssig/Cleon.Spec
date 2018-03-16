package cleon.support.projectmanagement.spec.resource.locations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ILocation extends ch.actifsource.core.javamodel.INamedResource, cleon.support.projectmanagement.spec.resource.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("16fa59aa-c768-11e5-b3f9-43c5a0896ea1");
  
  // relations
  
  public java.util.List<? extends cleon.support.projectmanagement.spec.resource.locations.javamodel.ILocation> selectSublocation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,16fa59aa-c768-11e5-b3f9-43c5a0896ea1,5pF7OK0zIh7LKTmFmuLcELlgqKs=] */
