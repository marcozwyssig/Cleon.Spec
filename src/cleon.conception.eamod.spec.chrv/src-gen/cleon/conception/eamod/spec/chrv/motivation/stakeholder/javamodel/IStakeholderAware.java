package cleon.conception.eamod.spec.chrv.motivation.stakeholder.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IStakeholderAware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("33ff7368-0d07-11e6-be97-7d1235599779");
  
  // relations
  
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.stakeholder.javamodel.IStakeholder> selectOwners();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,33ff7368-0d07-11e6-be97-7d1235599779,2dnZSzFlUS1j6R4B5JrC07+lw3Q=] */
