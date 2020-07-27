package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Snmpciscoucschassis extends DynamicResource implements ISnmpciscoucschassis {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmpciscoucschassis> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmpciscoucschassis>() {
    
    @Override
    public ISnmpciscoucschassis create() {
      return new Snmpciscoucschassis();
    }
    
    @Override
    public ISnmpciscoucschassis create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Snmpciscoucschassis(resourceRepository, resource);
    }
  
  };

  public Snmpciscoucschassis() {
    super(ISnmpciscoucschassis.TYPE_ID);
  }
  
  public Snmpciscoucschassis(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISnmpciscoucschassis.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Snmpciscoucschassis setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db4a0db0-c1eb-11ea-820f-9931558a898c,lVI7rtw3xPdEnhJ172DrUzQoZws=] */