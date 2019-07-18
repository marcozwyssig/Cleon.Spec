package cleon.modelinglanguages.network.spec.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SecurityExternalZone extends DynamicResource implements ISecurityExternalZone {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISecurityExternalZone> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISecurityExternalZone>() {
    
    @Override
    public ISecurityExternalZone create() {
      return new SecurityExternalZone();
    }
    
    @Override
    public ISecurityExternalZone create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SecurityExternalZone(resourceRepository, resource);
    }
  
  };

  public SecurityExternalZone() {
    super(ISecurityExternalZone.TYPE_ID);
  }
  
  public SecurityExternalZone(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISecurityExternalZone.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecurityZone> selectAllowed() {
    return _getList(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecurityZone.class, cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.SecurityZone_allowed);
  }

  public SecurityExternalZone setAllowed(java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecurityZone> allowed) {
    _setList(cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.SecurityZone_allowed, allowed);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecuritySubZone> selectSecuritySubZones() {
    return _getList(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecuritySubZone.class, cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.SecurityZone_securitySubZones);
  }

  public SecurityExternalZone setSecuritySubZones(java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecuritySubZone> securitySubZones) {
    _setList(cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.SecurityZone_securitySubZones, securitySubZones);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SecurityExternalZone setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.IZone> selectZones() {
    return _getList(cleon.modelinglanguages.network.spec.segmentation.javamodel.IZone.class, cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.Zone_zones);
  }

  public SecurityExternalZone setZones(java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.IZone> zones) {
    _setList(cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.Zone_zones, zones);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecurityZone.class, cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.SecurityZone_allowed, visitor);
    _acceptList(cleon.modelinglanguages.network.spec.segmentation.javamodel.ISecuritySubZone.class, cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.SecurityZone_securitySubZones, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.modelinglanguages.network.spec.segmentation.javamodel.IZone.class, cleon.modelinglanguages.network.spec.segmentation.SegmentationPackage.Zone_zones, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ae271ab1-0b78-11e9-a136-69d076e48ed1,Kl2Pe8UYU/msetUbawxNB5QwCwE=] */
