package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RN extends DynamicResource implements IRN {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRN> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRN>() {
    
    @Override
    public IRN create() {
      return new RN();
    }
    
    @Override
    public IRN create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RN(resourceRepository, resource);
    }
  
  };

  public RN() {
    super(IRN.TYPE_ID);
  }
  
  public RN(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRN.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectOwner() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractSiteWithZone_owner);
  }
    
  public void setOwner(java.lang.String owner) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractSiteWithZone_owner, owner);
  }

  // relations
  
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> selectHosts() {
    return _getMultiMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractSiteWithHosts_hosts);
  }

  public RN setHosts(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> hosts) {
    _setMultiMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractSiteWithHosts_hosts, hosts);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RN setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetDomainZone selectZone() {
    return _getSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetDomainZone.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractSiteWithZone_zone);
  }

  public RN setZone(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetDomainZone zone) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractSiteWithZone_zone, zone);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractSiteWithZone_owner, visitor);
    // relations
    _acceptMultiMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractSiteWithHosts_hosts, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetDomainZone.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractSiteWithZone_zone, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3615fdfa-936d-11e9-8139-e76b19cfb4bf,7DuyQforIt/C2nJP2mTC3Dju+2I=] */