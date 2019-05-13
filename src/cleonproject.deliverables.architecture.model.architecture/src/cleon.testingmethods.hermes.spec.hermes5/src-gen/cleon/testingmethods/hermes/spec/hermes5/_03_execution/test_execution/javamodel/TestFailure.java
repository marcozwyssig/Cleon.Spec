package cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestFailure extends DynamicResource implements ITestFailure {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestFailure> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestFailure>() {
    
    @Override
    public ITestFailure create() {
      return new TestFailure();
    }
    
    @Override
    public ITestFailure create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestFailure(resourceRepository, resource);
    }
  
  };

  public TestFailure() {
    super(ITestFailure.TYPE_ID);
  }
  
  public TestFailure(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestFailure.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectFailureReason() {
    return _getSingleAttribute(java.lang.String.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.Test_executionPackage.TestFailure_failureReason);
  }
    
  public void setFailureReason(java.lang.String failureReason) {
     _setSingleAttribute(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.Test_executionPackage.TestFailure_failureReason, failureReason);
  }

  // relations
  
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._01_concept.test_constraints.failureclass.javamodel.IFailureClass selectFailureClass() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_constraints.failureclass.javamodel.IFailureClass.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.Test_executionPackage.TestFailure_failureClass);
  }

  public TestFailure setFailureClass(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_constraints.failureclass.javamodel.IFailureClass failureClass) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.Test_executionPackage.TestFailure_failureClass, failureClass);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestFailure setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static.javamodel.ITestQualityCriteria selectTestQualityCriteria() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static.javamodel.ITestQualityCriteria.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.Test_executionPackage.TestResult_testQualityCriteria);
  }

  public TestFailure setTestQualityCriteria(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static.javamodel.ITestQualityCriteria testQualityCriteria) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.Test_executionPackage.TestResult_testQualityCriteria, testQualityCriteria);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember selectTester() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.Test_executionPackage.TestResult_tester);
  }

  public TestFailure setTester(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember tester) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.Test_executionPackage.TestResult_tester, tester);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestFailure setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.Test_executionPackage.TestFailure_failureReason, visitor);
    // relations
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_constraints.failureclass.javamodel.IFailureClass.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.Test_executionPackage.TestFailure_failureClass, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._static.javamodel.ITestQualityCriteria.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.Test_executionPackage.TestResult_testQualityCriteria, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.Test_executionPackage.TestResult_tester, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.javamodel.ITestFailure> selectToMeFailureClass(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_constraints.failureclass.javamodel.IFailureClass object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.javamodel.ITestFailure.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.Test_executionPackage.TestFailure_failureClass, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c78ee45d-1cf3-11e6-aaba-9db7fdc64d7e,laFKBBCHnQDmpgDrA6vFa664p9Y=] */