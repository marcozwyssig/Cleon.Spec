package cleon.conception.organisation.spec.epm.organigram.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEnterpriseOrganigram extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4302c8a6-daad-11e3-ae07-89aa80d5ec3d");
  
  // relations
  
  public cleon.conception.organisation.spec.epm.unit.javamodel.IEnterprise selectEnterprise();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.initialization.processlanguage.spec.bpmn.organigram.javamodel.IOrganisation> selectOrganisation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4302c8a6-daad-11e3-ae07-89aa80d5ec3d,8bmvLnVVxvBU6DAdXnio7Bai+To=] */
