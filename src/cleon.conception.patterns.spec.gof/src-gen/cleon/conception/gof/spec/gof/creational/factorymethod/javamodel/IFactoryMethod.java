package cleon.conception.gof.spec.gof.creational.factorymethod.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IFactoryMethod extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8838d098-ddd3-11e4-b0b5-6911fa4e24e5");
  
  // relations
  
  public cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier selectClassifier();
  
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.classes.method.parameter.javamodel.IParameter> selectCtorArgs();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8838d098-ddd3-11e4-b0b5-6911fa4e24e5,0Sbp/SZuz52bOpKidVIwjqPizws=] */
