package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Mysqlv2 extends DynamicResource implements IMysqlv2 {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMysqlv2> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMysqlv2>() {
    
    @Override
    public IMysqlv2 create() {
      return new Mysqlv2();
    }
    
    @Override
    public IMysqlv2 create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Mysqlv2(resourceRepository, resource);
    }
  
  };

  public Mysqlv2() {
    super(IMysqlv2.TYPE_ID);
  }
  
  public Mysqlv2(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMysqlv2.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Mysqlv2 setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db470020-c1eb-11ea-820f-9931558a898c,BFZd18IsWQns6tWsOXq5+7VBJZU=] */