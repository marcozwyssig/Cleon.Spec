package cleon.support.projectmanagement.spec.steering.controlling.module.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IModuleLamp extends ch.actifsource.core.javamodel.IResource, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("779caf13-3386-11e6-b251-57783f5929b3");
  
  // relations
  
  public cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLampState selectState();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,779caf13-3386-11e6-b251-57783f5929b3,kFWHNt3lNOjVf9aMKC3AteEEMjg=] */
