package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Pop3 extends DynamicResource implements IPop3 {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPop3> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPop3>() {
    
    @Override
    public IPop3 create() {
      return new Pop3();
    }
    
    @Override
    public IPop3 create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Pop3(resourceRepository, resource);
    }
  
  };

  public Pop3() {
    super(IPop3.TYPE_ID);
  }
  
  public Pop3(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPop3.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Pop3 setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db488744-c1eb-11ea-820f-9931558a898c,cbOubOX++DZK/FSxfIhjbSXv0QI=] */
