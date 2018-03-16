package cleon.conception.eamod.spec.nsov.v2.productcatalog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICatalog extends ch.actifsource.core.javamodel.IResource, cleon.common.xml.spec.xmi.javamodel.IXmiAggregation {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4d650153-67c6-11e7-afcc-6df3a81a4d17");
  
  // relations
  
  public java.util.List<? extends cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.javamodel.IProductGroup> selectProductGroups();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4d650153-67c6-11e7-afcc-6df3a81a4d17,+oY4I3wFrtRXlah8bAbxeZtWuUU=] */
