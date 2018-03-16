package cleon.common.resources.spec.resources.versions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISemanticVersionAware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0e6fee9d-d410-11e5-8556-8f55ceb91287");
  
  // relations
  
  public cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion selectVersion();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0e6fee9d-d410-11e5-8556-8f55ceb91287,t8XHvtlkMueJIgp5IHkCxWlsPcU=] */
