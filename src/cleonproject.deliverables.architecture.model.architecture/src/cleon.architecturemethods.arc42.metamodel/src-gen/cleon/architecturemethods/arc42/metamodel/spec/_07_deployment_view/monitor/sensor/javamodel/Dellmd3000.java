package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Dellmd3000 extends DynamicResource implements IDellmd3000 {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDellmd3000> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDellmd3000>() {
    
    @Override
    public IDellmd3000 create() {
      return new Dellmd3000();
    }
    
    @Override
    public IDellmd3000 create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Dellmd3000(resourceRepository, resource);
    }
  
  };

  public Dellmd3000() {
    super(IDellmd3000.TYPE_ID);
  }
  
  public Dellmd3000(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDellmd3000.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Dellmd3000 setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db426be4-c1eb-11ea-820f-9931558a898c,N00hHszQ3yItMF0fUgK0Z87XZ0A=] */
