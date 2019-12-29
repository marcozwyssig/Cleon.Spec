package cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Model extends DynamicResource implements IModel {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModel> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModel>() {
    
    @Override
    public IModel create() {
      return new Model();
    }
    
    @Override
    public IModel create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Model(resourceRepository, resource);
    }
  
  };

  public Model() {
    super(IModel.TYPE_ID);
  }
  
  public Model(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IModel.TYPE_ID);
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

  // relations
  
  @Override
  public cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.nature.actifsource.javamodel.IActifsource selectActifsource() {
    return _getSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.nature.actifsource.javamodel.IActifsource.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_actifsource);
  }

  public Model setActifsource(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.nature.actifsource.javamodel.IActifsource actifsource) {
    _setSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_actifsource, actifsource);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> selectDecompose() {
    return _getList(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.common.modularity.metamodel.spec.SpecPackage.DecompositionBuildingBlock_decompose);
  }

  public Model setDecompose(java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> decompose) {
    _setList(cleon.common.modularity.metamodel.spec.SpecPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage> selectDecomposePackages() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages);
  }

  public Model setDecomposePackages(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage> decomposePackages) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentWithPackage_decomposePackages, decomposePackages);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IPluginBuiltinDependency> selectDependsOnBuiltin() {
    return _getList(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IPluginBuiltinDependency.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_dependsOnBuiltin);
  }

  public Model setDependsOnBuiltin(java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IPluginBuiltinDependency> dependsOnBuiltin) {
    _setList(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_dependsOnBuiltin, dependsOnBuiltin);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IPluginProjectDependency> selectDependsOnPlugin() {
    return _getList(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IPluginProjectDependency.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_dependsOnPlugin);
  }

  public Model setDependsOnPlugin(java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IPluginProjectDependency> dependsOnPlugin) {
    _setList(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_dependsOnPlugin, dependsOnPlugin);
    return this;
  }
    
  @Override
  public cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.nature.javamodel.IGradle selectGradle() {
    return _getSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.nature.javamodel.IGradle.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_gradle);
  }

  public Model setGradle(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.nature.javamodel.IGradle gradle) {
    _setSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_gradle, gradle);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentDependency> selectHasDependency() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentDependency.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency);
  }

  public Model setHasDependency(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IComponentDependency> hasDependency) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentWithPackage_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IInteraction> selectInteracts() {
    return _getList(cleon.common.modularity.metamodel.spec.javamodel.IInteraction.class, cleon.common.modularity.metamodel.spec.SpecPackage.InteractiveBuildingBlock_interacts);
  }

  public Model setInteracts(java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IInteraction> interacts) {
    _setList(cleon.common.modularity.metamodel.spec.SpecPackage.InteractiveBuildingBlock_interacts, interacts);
    return this;
  }
    
  @Override
  public cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.nature.javamodel.IJava selectJava() {
    return _getSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.nature.javamodel.IJava.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_java);
  }

  public Model setJava(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.nature.javamodel.IJava java) {
    _setSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_java, java);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage selectNoPackages() {
    return _getSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.Component_noPackages);
  }

  public Model setNoPackages(cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.IPackage noPackages) {
    _setSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.Component_noPackages, noPackages);
    return this;
  }
    
  @Override
  public cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.nature.javamodel.IPlugin selectPlugin() {
    return _getSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.nature.javamodel.IPlugin.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_plugin);
  }

  public Model setPlugin(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.nature.javamodel.IPlugin plugin) {
    _setSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_plugin, plugin);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required> selectPorts_In() {
    return _getMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In);
  }

  public Model setPorts_In(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required> ports_In) {
    _setMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, ports_In);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider> selectPorts_Out() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out);
  }

  public Model setPorts_Out(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider> ports_Out) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, ports_Out);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IResource> selectResources() {
    return _getList(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IResource.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_resources);
  }

  public Model setResources(java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IResource> resources) {
    _setList(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_resources, resources);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Model setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.nature.actifsource.javamodel.IActifsource.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_actifsource, visitor);
    _acceptList(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IPluginBuiltinDependency.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_dependsOnBuiltin, visitor);
    _acceptList(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IPluginProjectDependency.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_dependsOnPlugin, visitor);
    _acceptSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.nature.javamodel.IGradle.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_gradle, visitor);
    _acceptSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.nature.javamodel.IJava.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_java, visitor);
    _acceptSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.nature.javamodel.IPlugin.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_plugin, visitor);
    _acceptMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, visitor);
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, visitor);
    _acceptList(cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IResource.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.PluginPackage.AbstractPlugin_resources, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,eab1ce0a-1005-11e5-865e-55f33dbc76dc,H5KSmv0hDa7sc5BeLtQ1CDVPEyI=] */