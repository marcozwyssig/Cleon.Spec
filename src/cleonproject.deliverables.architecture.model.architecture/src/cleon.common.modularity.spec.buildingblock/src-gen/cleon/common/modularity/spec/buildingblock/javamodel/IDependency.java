package cleon.common.modularity.spec.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDependency extends ch.actifsource.core.javamodel.IResource, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9416ead6-ffb9-11e4-ac0a-959b440f987f");
  
  // relations
  
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectTo();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9416ead6-ffb9-11e4-ac0a-959b440f987f,gd6g92/KJKClZYRc8CRg+frF4LY=] */
