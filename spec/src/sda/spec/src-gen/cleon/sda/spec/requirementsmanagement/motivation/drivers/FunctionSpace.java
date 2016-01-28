package cleon.sda.spec.requirementsmanagement.motivation.drivers;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[39e27138-c58d-11e5-aeea-1db9268c0ee9,imports]] */

/* End Protected Region   [[39e27138-c58d-11e5-aeea-1db9268c0ee9,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[39e27138-c58d-11e5-aeea-1db9268c0ee9]] */
  
  /* End Protected Region   [[39e27138-c58d-11e5-aeea-1db9268c0ee9]] */


  public static interface IDriverFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3ff7c055-c58d-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId();

  }
  
  public static interface IDriverFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("3ff7c055-c58d-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId(final cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDriver driver);

  }
  
  public static class DriverFunctionsImpl implements IDriverFunctionsImpl {

    public static final IDriverFunctionsImpl INSTANCE = new DriverFunctionsImpl();

    private DriverFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDriver driver) {
      /* Begin Protected Region [[3ff7c055-c58d-11e5-aeea-1db9268c0ee9]] */
    	return String.format("DR-%03d", driver.selectIdentifier());  
      /* End Protected Region   [[3ff7c055-c58d-11e5-aeea-1db9268c0ee9]] */
    }

  }
  
  public static class DriverFunctions {

    private DriverFunctions() {}

    public static java.lang.String GetId(final cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDriver driver) {
      return DynamicResourceUtil.invoke(IDriverFunctionsImpl.class, DriverFunctionsImpl.INSTANCE, driver).GetId(driver);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,39e27138-c58d-11e5-aeea-1db9268c0ee9,aFElPNvmm/UBYjc4e4DE55VMYrM=] */
