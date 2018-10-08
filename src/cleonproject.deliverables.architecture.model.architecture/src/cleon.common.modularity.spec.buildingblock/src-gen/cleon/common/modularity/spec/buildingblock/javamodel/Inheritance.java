package cleon.common.modularity.spec.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Inheritance extends DynamicResource implements IInheritance {

  // abstract implementation, only used for static method calls
  private Inheritance() {
    super(IInheritance.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.common.modularity.spec.buildingblock.javamodel.IInheritance> selectToMeFrom(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock object) {
    return _getToMeList(object.getRepository(), cleon.common.modularity.spec.buildingblock.javamodel.IInheritance.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.Inheritance_from, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d715af8c-ffba-11e4-ac0a-959b440f987f,8Yf29cAut5xGlo6XaFd9y5+U+M0=] */