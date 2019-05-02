package cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestConnection extends DynamicResource implements ITestConnection {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestConnection> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestConnection>() {
    
    @Override
    public ITestConnection create() {
      return new TestConnection();
    }
    
    @Override
    public ITestConnection create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestConnection(resourceRepository, resource);
    }
  
  };

  public TestConnection() {
    super(ITestConnection.TYPE_ID);
  }
  
  public TestConnection(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestConnection.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode selectNode() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.Test_environmentPackage.TestConnection_node);
  }

  public TestConnection setNode(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode node) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.Test_environmentPackage.TestConnection_node, node);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestConnection setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestConnection setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.Test_environmentPackage.TestConnection_node, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.javamodel.ITestConnection> selectToMeNode(cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.javamodel.INode object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.javamodel.ITestConnection.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_environment.Test_environmentPackage.TestConnection_node, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a36e4d8e-6ceb-11e9-a6d3-775c09e81e2d,Ea6h0rj9YNxWI52dBpKYIINxyxk=] */
