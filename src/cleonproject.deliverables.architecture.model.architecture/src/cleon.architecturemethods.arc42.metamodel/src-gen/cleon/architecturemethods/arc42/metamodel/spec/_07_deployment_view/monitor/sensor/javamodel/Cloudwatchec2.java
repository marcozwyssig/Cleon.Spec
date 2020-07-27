package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Cloudwatchec2 extends DynamicResource implements ICloudwatchec2 {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICloudwatchec2> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICloudwatchec2>() {
    
    @Override
    public ICloudwatchec2 create() {
      return new Cloudwatchec2();
    }
    
    @Override
    public ICloudwatchec2 create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Cloudwatchec2(resourceRepository, resource);
    }
  
  };

  public Cloudwatchec2() {
    super(ICloudwatchec2.TYPE_ID);
  }
  
  public Cloudwatchec2(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICloudwatchec2.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Cloudwatchec2 setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db40e5f0-c1eb-11ea-820f-9931558a898c,fTtgX8URqJEXASc7iO9LZzJy33M=] */
