package ikt.product.documentation.spec.deployment.environment.node.supplynode.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SupplyLocationNode extends DynamicResource implements ISupplyLocationNode {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISupplyLocationNode> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISupplyLocationNode>() {
    
    @Override
    public ISupplyLocationNode create() {
      return new SupplyLocationNode();
    }
    
    @Override
    public ISupplyLocationNode create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SupplyLocationNode(resourceRepository, resource);
    }
  
  };

  public SupplyLocationNode() {
    super(ISupplyLocationNode.TYPE_ID);
  }
  
  public SupplyLocationNode(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISupplyLocationNode.TYPE_ID);
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

  @Override
  public java.lang.String selectShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName);
  }
    
  public void setShortName(java.lang.String shortName) {
     _setSingleAttribute(cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, shortName);
  }

  // relations
  
  @Override
  public java.util.List<? extends ikt.product.documentation.spec.deployment.environment.node.buildnode.javamodel.IBuildNode> selectBuildNodes() {
    return _getList(ikt.product.documentation.spec.deployment.environment.node.buildnode.javamodel.IBuildNode.class, ikt.product.documentation.spec.deployment.environment.node.NodePackage.RootNode_buildNodes);
  }

  public SupplyLocationNode setBuildNodes(java.util.List<? extends ikt.product.documentation.spec.deployment.environment.node.buildnode.javamodel.IBuildNode> buildNodes) {
    _setList(ikt.product.documentation.spec.deployment.environment.node.NodePackage.RootNode_buildNodes, buildNodes);
    return this;
  }
    
  @Override
  public ikt.product.documentation.spec.deployment.environment.javamodel.ICustomer selectCustomer() {
    return _getSingle(ikt.product.documentation.spec.deployment.environment.javamodel.ICustomer.class, ikt.product.documentation.spec.deployment.environment.node.NodePackage.CustomerAware_customer);
  }

  public SupplyLocationNode setCustomer(ikt.product.documentation.spec.deployment.environment.javamodel.ICustomer customer) {
    _setSingle(ikt.product.documentation.spec.deployment.environment.node.NodePackage.CustomerAware_customer, customer);
    return this;
  }
    
  @Override
  public java.util.List<? extends ikt.product.documentation.spec.deployment.environment.node.javamodel.INode> selectNodes() {
    return _getList(ikt.product.documentation.spec.deployment.environment.node.javamodel.INode.class, ikt.product.documentation.spec.deployment.environment.node.NodePackage.Node_nodes);
  }

  public SupplyLocationNode setNodes(java.util.List<? extends ikt.product.documentation.spec.deployment.environment.node.javamodel.INode> nodes) {
    _setList(ikt.product.documentation.spec.deployment.environment.node.NodePackage.Node_nodes, nodes);
    return this;
  }
    
  @Override
  public java.util.List<? extends ikt.product.documentation.spec.deployment.environment.node.supplynode.javamodel.ISupplyNode> selectSuppliedNodes() {
    return _getList(ikt.product.documentation.spec.deployment.environment.node.supplynode.javamodel.ISupplyNode.class, ikt.product.documentation.spec.deployment.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes);
  }

  public SupplyLocationNode setSuppliedNodes(java.util.List<? extends ikt.product.documentation.spec.deployment.environment.node.supplynode.javamodel.ISupplyNode> suppliedNodes) {
    _setList(ikt.product.documentation.spec.deployment.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes, suppliedNodes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SupplyLocationNode setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.spec.resources.naming.NamingPackage.ShortName_shortName, visitor);
    // relations
    _acceptList(ikt.product.documentation.spec.deployment.environment.node.buildnode.javamodel.IBuildNode.class, ikt.product.documentation.spec.deployment.environment.node.NodePackage.RootNode_buildNodes, visitor);
    _acceptSingle(ikt.product.documentation.spec.deployment.environment.javamodel.ICustomer.class, ikt.product.documentation.spec.deployment.environment.node.NodePackage.CustomerAware_customer, visitor);
    _acceptList(ikt.product.documentation.spec.deployment.environment.node.javamodel.INode.class, ikt.product.documentation.spec.deployment.environment.node.NodePackage.Node_nodes, visitor);
    _acceptList(ikt.product.documentation.spec.deployment.environment.node.supplynode.javamodel.ISupplyNode.class, ikt.product.documentation.spec.deployment.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e265052b-0aaa-11e9-8a91-633e556ac68f,cOwx9MYF1Ij8jHTlYJPuafuv6Lg=] */
