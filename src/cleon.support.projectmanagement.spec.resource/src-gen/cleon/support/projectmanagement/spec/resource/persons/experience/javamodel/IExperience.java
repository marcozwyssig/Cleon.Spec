package cleon.support.projectmanagement.spec.resource.persons.experience.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IExperience extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2ba27c0a-b509-11e5-aa95-235930e9af3d");
  
  // relations
  
  public cleon.support.projectmanagement.spec.resource.skills.javamodel.ISkill selectSkill();
  
  public cleon.support.projectmanagement.spec.resource.persons.experience.javamodel.IMaturity selectMaturity();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2ba27c0a-b509-11e5-aa95-235930e9af3d,HHz53+ypFdUR3kgD1QRa/btrNq8=] */
