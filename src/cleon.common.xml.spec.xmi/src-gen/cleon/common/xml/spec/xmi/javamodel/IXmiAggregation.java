package cleon.common.xml.spec.xmi.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IXmiAggregation extends cleon.common.xml.spec.xmi.javamodel.IXmiClass {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a54a5c70-6c8a-11e7-acfe-cd993eb63ee2");
  
  // relations
  
  public java.util.List<? extends cleon.common.xml.spec.xmi.javamodel.IXmiClass> selectAggregates();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a54a5c70-6c8a-11e7-acfe-cd993eb63ee2,P86M2cTzKLNXOsi2DtKuaLWUhRU=] */
