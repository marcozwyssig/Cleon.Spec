package cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestInfrastructures extends cleon.testingmethods.hermes.metamodel.spec._01_concept.javamodel.IAbstractTestingChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b2de291a-20d7-11e6-9368-9172b77c2cff");
  
  // relations
  
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.javamodel.ITestUsers selectTestUsers();
  
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_environment.javamodel.ITestEnvironments selectTestEnvironments();
  
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_tools.javamodel.ITestTools selectTestTools();
  
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_data.javamodel.ITestDatas selectTestDatas();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b2de291a-20d7-11e6-9368-9172b77c2cff,kjEd7F3uE/HyKZW/jlsQQLGn+V4=] */
