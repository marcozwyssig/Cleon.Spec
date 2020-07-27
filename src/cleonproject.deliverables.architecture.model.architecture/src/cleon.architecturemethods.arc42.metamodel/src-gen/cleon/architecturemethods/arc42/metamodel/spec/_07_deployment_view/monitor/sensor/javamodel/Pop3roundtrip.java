package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Pop3roundtrip extends DynamicResource implements IPop3roundtrip {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPop3roundtrip> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPop3roundtrip>() {
    
    @Override
    public IPop3roundtrip create() {
      return new Pop3roundtrip();
    }
    
    @Override
    public IPop3roundtrip create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Pop3roundtrip(resourceRepository, resource);
    }
  
  };

  public Pop3roundtrip() {
    super(IPop3roundtrip.TYPE_ID);
  }
  
  public Pop3roundtrip(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPop3roundtrip.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Pop3roundtrip setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db4a0d74-c1eb-11ea-820f-9931558a898c,i8k8sxPh/b8aTcurQCIpX3FmTrY=] */
