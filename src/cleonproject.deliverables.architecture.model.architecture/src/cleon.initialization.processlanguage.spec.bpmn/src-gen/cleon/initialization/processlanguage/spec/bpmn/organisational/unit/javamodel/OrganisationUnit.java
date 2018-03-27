package cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class OrganisationUnit extends DynamicResource implements IOrganisationUnit {

  // abstract implementation, only used for static method calls
  private OrganisationUnit() {
    super(IOrganisationUnit.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationUnit> selectToMeResponsible(cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole object) {
    return _getToMeList(object.getRepository(), cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationUnit.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_responsible, object.getResource());
  }
  
  public static cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationUnit selectToMeStaff(cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationUnit.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_staff, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,43bbb85b-ba76-11e3-9206-f19b78f4aff0,AUOuwRPba3NrDuPlil1s3l1GGek=] */
