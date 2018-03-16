package cleon.conception.uml.spec.uml.structural.classes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AssociationClass extends DynamicResource implements IAssociationClass {

  // abstract implementation, only used for static method calls
  private AssociationClass() {
    super(IAssociationClass.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.conception.uml.spec.uml.structural.classes.javamodel.IAssociationClass selectToMeRelations(cleon.conception.uml.spec.uml.structural.classes.association.javamodel.IAssociation object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.uml.spec.uml.structural.classes.javamodel.IAssociationClass.class, cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.AssociationClass_relations, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,deb55644-13d3-11e3-9736-a3484832b481,CtaCH+QW1Yirp3+oKNREgDnYZ78=] */
