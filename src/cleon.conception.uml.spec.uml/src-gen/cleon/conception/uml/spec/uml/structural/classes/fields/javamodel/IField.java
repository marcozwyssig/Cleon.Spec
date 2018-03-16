package cleon.conception.uml.spec.uml.structural.classes.fields.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IField extends ch.actifsource.core.javamodel.INamedResource, cleon.conception.uml.spec.uml.structural.classes.javamodel.IReturnType {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("809747d2-2758-11e3-a600-d180349bca70");
  
  public java.lang.Boolean selectSetter();
  
  public java.lang.Boolean selectGetter();
  
  // relations
  
  public cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier selectType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,809747d2-2758-11e3-a600-d180349bca70,W26NFD1gpHDteO6nxyiNs7/Qo10=] */
