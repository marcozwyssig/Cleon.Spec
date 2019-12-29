package cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.buildnode;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[48dec04d-02d8-11e9-9e58-33d596257b14,imports]] */

/* End Protected Region   [[48dec04d-02d8-11e9-9e58-33d596257b14,imports]] */

public class FunctionSpace_BuildNode {

  /* Begin Protected Region [[48dec04d-02d8-11e9-9e58-33d596257b14]] */
  
  /* End Protected Region   [[48dec04d-02d8-11e9-9e58-33d596257b14]] */


  public static interface IServiceBuildNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c2f54725-02d3-11e9-9e58-33d596257b14")
    public java.lang.String GetSimpleName();

    @IDynamicResourceExtension.MethodId("b2bba661-2ed3-11e9-9ca2-d7354798e154")
    public java.lang.String OnlyName();

  }
  
  public static interface IServiceBuildNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceBuildNodeFunctionsImpl implements IServiceBuildNodeFunctionsImpl {

    public static final IServiceBuildNodeFunctionsImpl INSTANCE = new ServiceBuildNodeFunctionsImpl();

    private ServiceBuildNodeFunctionsImpl() {}

  }
  
  public static class ServiceBuildNodeFunctions {

    private ServiceBuildNodeFunctions() {}

  }

  public static interface IExecutionEnvironmentBuildNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("04890c41-02d9-11e9-9e58-33d596257b14")
    public java.lang.String GetSimpleName();

    @IDynamicResourceExtension.MethodId("24d3699c-2ed4-11e9-9ca2-d7354798e154")
    public java.lang.String OnlyName();

  }
  
  public static interface IExecutionEnvironmentBuildNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ExecutionEnvironmentBuildNodeFunctionsImpl implements IExecutionEnvironmentBuildNodeFunctionsImpl {

    public static final IExecutionEnvironmentBuildNodeFunctionsImpl INSTANCE = new ExecutionEnvironmentBuildNodeFunctionsImpl();

    private ExecutionEnvironmentBuildNodeFunctionsImpl() {}

  }
  
  public static class ExecutionEnvironmentBuildNodeFunctions {

    private ExecutionEnvironmentBuildNodeFunctions() {}

  }

  public static interface IBuildNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0adf3643-02d9-11e9-9e58-33d596257b14")
    public java.lang.String GetSimpleName();

    @IDynamicResourceExtension.MethodId("bd89444b-0aa2-11e9-8a91-633e556ac68f")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("c18d533d-0e8e-11e9-9f19-6d15636f4ecc")
    public java.lang.String GetTypeName();

    @IDynamicResourceExtension.MethodId("8ea2102d-2aba-11e9-a3f8-336d9e792e17")
    public java.lang.Boolean IsSupplied();

    @IDynamicResourceExtension.MethodId("8900e24b-2abe-11e9-a3f8-336d9e792e17")
    public java.lang.String GetMaterialTypeName();

    @IDynamicResourceExtension.MethodId("c2eb1394-6cef-11e9-a6d3-775c09e81e2d")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyOs();

    @IDynamicResourceExtension.MethodId("4de742de-7bb1-11e9-94aa-f1ea7ea33f46")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyVMH();

  }
  
  public static interface IBuildNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8ea2102d-2aba-11e9-a3f8-336d9e792e17")
    public java.lang.Boolean IsSupplied(final cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode);

    @IDynamicResourceExtension.MethodId("c2eb1394-6cef-11e9-a6d3-775c09e81e2d")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyOs(final List<cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodeList);

    @IDynamicResourceExtension.MethodId("4de742de-7bb1-11e9-94aa-f1ea7ea33f46")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyVMH(final List<cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodeList);

  }
  
  public static class BuildNodeFunctionsImpl implements IBuildNodeFunctionsImpl {

    public static final IBuildNodeFunctionsImpl INSTANCE = new BuildNodeFunctionsImpl();

    private BuildNodeFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsSupplied(final cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode) {
      return false;
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyOs(final List<cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodeList) {
      return buildNodeList.stream().filter(x -> x.selectSystemConfiguration() instanceof cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.javamodel.IOperatingSystemConfiguration).collect(java.util.stream.Collectors.toList());
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyVMH(final List<cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodeList) {
      return buildNodeList.stream().filter(x -> x.selectSystemConfiguration() instanceof cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.javamodel.IVirtualMachineHostSystemConfiguration).collect(java.util.stream.Collectors.toList());
    }

  }
  
  public static class BuildNodeFunctions {

    private BuildNodeFunctions() {}

    public static java.lang.Boolean IsSupplied(final cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.buildnode.javamodel.IBuildNode buildNode) {
      return DynamicResourceUtil.invoke(IBuildNodeFunctionsImpl.class, BuildNodeFunctionsImpl.INSTANCE, buildNode).IsSupplied(buildNode);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyOs(final List<cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodeList) {
      return DynamicResourceUtil.invoke(IBuildNodeFunctionsImpl.class, BuildNodeFunctionsImpl.INSTANCE, buildNodeList).OnlyOs(buildNodeList);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.buildnode.javamodel.IBuildNode> OnlyVMH(final List<cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodeList) {
      return DynamicResourceUtil.invoke(IBuildNodeFunctionsImpl.class, BuildNodeFunctionsImpl.INSTANCE, buildNodeList).OnlyVMH(buildNodeList);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,48dec04d-02d8-11e9-9e58-33d596257b14,vTbnZlS6yzqDtj2/qCvWu6B+9jQ=] */