package cleon.sda.spec.projectmanagement.resourcemanagement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IResourceManagement extends cleon.doc.spec.document.javamodel.ISubDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a143e996-a7e5-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.javamodel.IResources> selectResources();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a143e996-a7e5-11e5-82dd-3b995d9c840c,nJkNRZ/0gu1sJmSscHit6un84xI=] */