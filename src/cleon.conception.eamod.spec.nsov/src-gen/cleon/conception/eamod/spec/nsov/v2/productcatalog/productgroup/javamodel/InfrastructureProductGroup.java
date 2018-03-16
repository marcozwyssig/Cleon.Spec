package cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InfrastructureProductGroup extends DynamicResource implements IInfrastructureProductGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInfrastructureProductGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInfrastructureProductGroup>() {
    
    @Override
    public IInfrastructureProductGroup create() {
      return new InfrastructureProductGroup();
    }
    
    @Override
    public IInfrastructureProductGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InfrastructureProductGroup(resourceRepository, resource);
    }
  
  };

  public InfrastructureProductGroup() {
    super(IInfrastructureProductGroup.TYPE_ID);
  }
  
  public InfrastructureProductGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInfrastructureProductGroup.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.xml.spec.xmi.javamodel.IXmiClass> selectAggregates() {
    return _getList(cleon.common.xml.spec.xmi.javamodel.IXmiClass.class, cleon.common.xml.spec.xmi.XmiPackage.XmiAggregation_aggregates);
  }

  public InfrastructureProductGroup setAggregates(java.util.List<? extends cleon.common.xml.spec.xmi.javamodel.IXmiClass> aggregates) {
    _setList(cleon.common.xml.spec.xmi.XmiPackage.XmiAggregation_aggregates, aggregates);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup> selectDependsOn() {
    return _getList(cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup.class, cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.InfrastructureProductGroup_dependsOn);
  }

  public InfrastructureProductGroup setDependsOn(java.util.List<? extends cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup> dependsOn) {
    _setList(cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.InfrastructureProductGroup_dependsOn, dependsOn);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.eamod.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct> selectInfrastructureProducts() {
    return _getList(cleon.conception.eamod.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct.class, cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.InfrastructureProductGroup_infrastructureProducts);
  }

  public InfrastructureProductGroup setInfrastructureProducts(java.util.List<? extends cleon.conception.eamod.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct> infrastructureProducts) {
    _setList(cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.InfrastructureProductGroup_infrastructureProducts, infrastructureProducts);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.eamod.spec.nsov.v2.productcatalog.product.javamodel.IProduct> selectProducts() {
    return _getList(cleon.conception.eamod.spec.nsov.v2.productcatalog.product.javamodel.IProduct.class, cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.ProductGroup_products);
  }

  public InfrastructureProductGroup setProducts(java.util.List<? extends cleon.conception.eamod.spec.nsov.v2.productcatalog.product.javamodel.IProduct> products) {
    _setList(cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.ProductGroup_products, products);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public InfrastructureProductGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.xml.spec.xmi.javamodel.IXmiClass.class, cleon.common.xml.spec.xmi.XmiPackage.XmiAggregation_aggregates, visitor);
    _acceptList(cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup.class, cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.InfrastructureProductGroup_dependsOn, visitor);
    _acceptList(cleon.conception.eamod.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct.class, cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.InfrastructureProductGroup_infrastructureProducts, visitor);
    _acceptList(cleon.conception.eamod.spec.nsov.v2.productcatalog.product.javamodel.IProduct.class, cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.ProductGroup_products, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup selectToMeInfrastructureProducts(cleon.conception.eamod.spec.nsov.v2.productcatalog.product.javamodel.IInfrastructureProduct object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup.class, cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.InfrastructureProductGroup_infrastructureProducts, object.getResource());
  }
  
  public static java.util.List<cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup> selectToMeDependsOn(cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup object) {
    return _getToMeList(object.getRepository(), cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.javamodel.IInfrastructureProductGroup.class, cleon.conception.eamod.spec.nsov.v2.productcatalog.productgroup.ProductgroupPackage.InfrastructureProductGroup_dependsOn, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,761e31cd-6897-11e7-9be5-6dfce969ae4e,uu4lg2NuJFg+dXvZ+NTFS3bO6+o=] */
