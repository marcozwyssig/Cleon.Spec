package cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AggregateDecomposite extends DynamicResource implements IAggregateDecomposite {

  // abstract implementation, only used for static method calls
  private AggregateDecomposite() {
    super(IAggregateDecomposite.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IAggregateDecomposite selectToMeInto(cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IBuildingBlock object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IAggregateDecomposite.class, cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.BuildingblockPackage.AggregateDecomposite_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,53d51c49-7ad7-11e4-a6e2-23d949480f96,Ys36lExZyErsLFaIhnnOtoyDOOc=] */
