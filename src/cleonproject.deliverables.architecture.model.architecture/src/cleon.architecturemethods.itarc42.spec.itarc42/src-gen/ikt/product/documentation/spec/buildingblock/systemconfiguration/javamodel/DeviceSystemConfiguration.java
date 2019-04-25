package ikt.product.documentation.spec.buildingblock.systemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class DeviceSystemConfiguration extends DynamicResource implements IDeviceSystemConfiguration {

  // abstract implementation, only used for static method calls
  private DeviceSystemConfiguration() {
    super(IDeviceSystemConfiguration.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7f1b960b-02d3-11e9-9e58-33d596257b14,u/45TPKkK5pKCI5jU1W6ab46C/M=] */
