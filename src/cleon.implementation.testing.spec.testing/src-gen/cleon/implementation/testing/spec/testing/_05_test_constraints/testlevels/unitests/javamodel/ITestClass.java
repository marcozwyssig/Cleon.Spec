package cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestClass extends cleon.conception.uml.spec.uml.structural.classes.method.javamodel.IMethodClass {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c17728d0-df47-11e2-b229-cd1bd4a07953");
  
  // relations
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestMethod> selectTestMethods();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.implementation.testing.spec.testing._05_test_constraints.testlevels.unitests.javamodel.ITestProperty> selectTestProperties();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c17728d0-df47-11e2-b229-cd1bd4a07953,z2+ipH/X63uTfrzb/6xhT2Ffzpk=] */
