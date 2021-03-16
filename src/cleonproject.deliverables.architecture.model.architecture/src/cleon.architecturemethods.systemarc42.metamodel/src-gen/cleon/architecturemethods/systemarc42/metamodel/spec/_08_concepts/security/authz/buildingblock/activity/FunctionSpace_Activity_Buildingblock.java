package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[9fbae63a-0a1c-11eb-a857-d17d567fc174,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.FunctionSpace_Accounts.IServiceAccountFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.FunctionSpace_Activity_Deployment.IActivityPermissionFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.ActivityPermission;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission;

import java.util.ArrayList;
/* End Protected Region   [[9fbae63a-0a1c-11eb-a857-d17d567fc174,imports]] */

public class FunctionSpace_Activity_Buildingblock {

  /* Begin Protected Region [[9fbae63a-0a1c-11eb-a857-d17d567fc174]] */

  /* End Protected Region   [[9fbae63a-0a1c-11eb-a857-d17d567fc174]] */


  public static interface IAbstractAuthZBuildingBlockPermissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("11904919-0a1d-11eb-a857-d17d567fc174")
    public java.lang.String CommonName();

    @IDynamicResourceExtension.MethodId("4a3a0826-6fab-11eb-a1e4-f1bdb2897690")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccount serviceAccount);

    @IDynamicResourceExtension.MethodId("dc5d1980-864b-11eb-9869-4317e18e6c88")
    public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration SystemConfiguration();

    @IDynamicResourceExtension.MethodId("2cce0dbb-864c-11eb-9869-4317e18e6c88")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IPermission Permission();

    @IDynamicResourceExtension.MethodId("02efc120-864e-11eb-9869-4317e18e6c88")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("76754559-864e-11eb-9869-4317e18e6c88")
    public java.lang.String CommonNameSpecific();

  }
  
  public static interface IAbstractAuthZBuildingBlockPermissionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4a3a0826-6fab-11eb-a1e4-f1bdb2897690")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccount serviceAccount, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission> abstractAuthZBuildingBlockPermissionList);

  }
  
  public static class AbstractAuthZBuildingBlockPermissionFunctionsImpl implements IAbstractAuthZBuildingBlockPermissionFunctionsImpl {

    public static final IAbstractAuthZBuildingBlockPermissionFunctionsImpl INSTANCE = new AbstractAuthZBuildingBlockPermissionFunctionsImpl();

    private AbstractAuthZBuildingBlockPermissionFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccount serviceAccount, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission> abstractAuthZBuildingBlockPermissionList) {
      /* Begin Protected Region [[4a3a0826-6fab-11eb-a1e4-f1bdb2897690]] */
      final var serviceAccountFunctions = serviceAccount.extension(IServiceAccountFunctions.class);
      final var abstractSites = serviceAccountFunctions.GetAllowedSiteForServiceAccount();

      final var activityPermissions = new ArrayList<IActivityPermission>();
      abstractAuthZBuildingBlockPermissionList.stream().forEach( x -> {
      	for( final var activityPermission : ActivityPermission.selectToMeActivityTemplate(x) ) {
      		if (!activityPermissions.contains(activityPermission)) {
      			final var activityPermissionFunctions = activityPermission.extension(IActivityPermissionFunctions.class);
      			if( abstractSites.contains(activityPermissionFunctions.GetAbstractSite())) {
      				activityPermissions.add(activityPermission);
      			}
      		}
      	}
      });
      return activityPermissions;
      /* End Protected Region   [[4a3a0826-6fab-11eb-a1e4-f1bdb2897690]] */
    }

  }
  
  public static class AbstractAuthZBuildingBlockPermissionFunctions {

    private AbstractAuthZBuildingBlockPermissionFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> ToActivePermissions(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.accounts.javamodel.IServiceAccount serviceAccount, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.buildingblock.activity.javamodel.IAbstractAuthZBuildingBlockPermission> abstractAuthZBuildingBlockPermissionList) {
      return DynamicResourceUtil.invoke(IAbstractAuthZBuildingBlockPermissionFunctionsImpl.class, AbstractAuthZBuildingBlockPermissionFunctionsImpl.INSTANCE, abstractAuthZBuildingBlockPermissionList).ToActivePermissions(serviceAccount, abstractAuthZBuildingBlockPermissionList);
    }

  }

  public static interface IAuthZBuildingBlockForSharePermissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("40ca2922-8648-11eb-9869-4317e18e6c88")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("ebdfbda8-864b-11eb-9869-4317e18e6c88")
    public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration SystemConfiguration();

    @IDynamicResourceExtension.MethodId("46d5b8e8-864c-11eb-9869-4317e18e6c88")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IPermission Permission();

    @IDynamicResourceExtension.MethodId("49530245-864e-11eb-9869-4317e18e6c88")
    public java.lang.String CommonNameSpecific();

  }
  
  public static interface IAuthZBuildingBlockForSharePermissionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AuthZBuildingBlockForSharePermissionFunctionsImpl implements IAuthZBuildingBlockForSharePermissionFunctionsImpl {

    public static final IAuthZBuildingBlockForSharePermissionFunctionsImpl INSTANCE = new AuthZBuildingBlockForSharePermissionFunctionsImpl();

    private AuthZBuildingBlockForSharePermissionFunctionsImpl() {}

  }
  
  public static class AuthZBuildingBlockForSharePermissionFunctions {

    private AuthZBuildingBlockForSharePermissionFunctions() {}

  }

  public static interface IStringLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6d742e75-8648-11eb-9869-4317e18e6c88")
    public java.lang.String ReplaceDashToUnderscore();

  }
  
  public static interface IStringLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("6d742e75-8648-11eb-9869-4317e18e6c88")
    public java.lang.String ReplaceDashToUnderscore(final java.lang.String stringLiteral);

  }
  
  public static class StringLiteralFunctionsImpl implements IStringLiteralFunctionsImpl {

    public static final IStringLiteralFunctionsImpl INSTANCE = new StringLiteralFunctionsImpl();

    private StringLiteralFunctionsImpl() {}

    @Override
    public java.lang.String ReplaceDashToUnderscore(final java.lang.String stringLiteral) {
      /* Begin Protected Region [[6d742e75-8648-11eb-9869-4317e18e6c88]] */
      return stringLiteral.replaceAll("-", "_");
      /* End Protected Region   [[6d742e75-8648-11eb-9869-4317e18e6c88]] */
    }

  }
  
  public static class StringLiteralFunctions {

    private StringLiteralFunctions() {}

    public static java.lang.String ReplaceDashToUnderscore(final java.lang.String stringLiteral) {
      return DynamicResourceUtil.invoke(IStringLiteralFunctionsImpl.class, StringLiteralFunctionsImpl.INSTANCE, stringLiteral).ReplaceDashToUnderscore(stringLiteral);
    }

  }

  public static interface IAuthZBuildingBlockForPermissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f5ec10ef-864b-11eb-9869-4317e18e6c88")
    public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration SystemConfiguration();

    @IDynamicResourceExtension.MethodId("35ba7315-864c-11eb-9869-4317e18e6c88")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IPermission Permission();

    @IDynamicResourceExtension.MethodId("11848368-864e-11eb-9869-4317e18e6c88")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("db1f3ad7-864e-11eb-9869-4317e18e6c88")
    public java.lang.String CommonNameSpecific();

  }
  
  public static interface IAuthZBuildingBlockForPermissionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AuthZBuildingBlockForPermissionFunctionsImpl implements IAuthZBuildingBlockForPermissionFunctionsImpl {

    public static final IAuthZBuildingBlockForPermissionFunctionsImpl INSTANCE = new AuthZBuildingBlockForPermissionFunctionsImpl();

    private AuthZBuildingBlockForPermissionFunctionsImpl() {}

  }
  
  public static class AuthZBuildingBlockForPermissionFunctions {

    private AuthZBuildingBlockForPermissionFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,9fbae63a-0a1c-11eb-a857-d17d567fc174,N8nWulV98QX+LS9GHYQCH/KeTjI=] */
