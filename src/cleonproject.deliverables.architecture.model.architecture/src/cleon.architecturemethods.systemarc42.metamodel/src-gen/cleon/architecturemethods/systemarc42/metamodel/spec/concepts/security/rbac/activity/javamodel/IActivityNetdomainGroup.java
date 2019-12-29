package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IActivityNetdomainGroup extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel.IAbstractNetdomainGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e3611bf2-1e06-11e9-834d-77c41fccc6bf");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivitySystemConfiguration> selectActivitiesForSystemConfiguration();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e3611bf2-1e06-11e9-834d-77c41fccc6bf,QC6R5mdrJT099Bxkk5tDfTtxysI=] */