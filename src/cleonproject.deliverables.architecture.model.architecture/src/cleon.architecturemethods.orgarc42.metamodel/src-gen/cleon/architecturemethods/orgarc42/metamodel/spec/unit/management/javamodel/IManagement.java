package cleon.architecturemethods.orgarc42.metamodel.spec.unit.management.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IManagement extends cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.javamodel.IOrganisationGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0fb27ece-ba76-11e3-9206-f19b78f4aff0");
  
  // relations
  
  public cleon.architecturemethods.orgarc42.metamodel.spec.unit.management.javamodel.IEnvironmentProtection selectEnvironmentProtection();
  
  public cleon.architecturemethods.orgarc42.metamodel.spec.unit.management.javamodel.IPolticsAndStrategy selectPolticsAndStrategy();
  
  public cleon.architecturemethods.orgarc42.metamodel.spec.unit.management.javamodel.IFinanceAndControlling selectFinanceAndControlling();
  
  public cleon.architecturemethods.orgarc42.metamodel.spec.unit.management.javamodel.IValuesAndCorperateGovernance selectValuesAndCorperateGovernance();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0fb27ece-ba76-11e3-9206-f19b78f4aff0,b7zHkY27/iH01QFLms/jUSwAS/k=] */
