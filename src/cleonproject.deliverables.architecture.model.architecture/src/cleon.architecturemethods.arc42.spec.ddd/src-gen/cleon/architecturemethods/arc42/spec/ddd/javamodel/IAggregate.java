package cleon.architecturemethods.arc42.spec.ddd.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAggregate extends cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.INamedPackage {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("83c13817-10c0-11e3-b60e-ab478a3e1eca");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.ddd.entities.javamodel.IEntity> selectEntities();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.ddd.exceptions.javamodel.IDomainException> selectExceptions();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.ddd.valueobjects.javamodel.IValueObject> selectValueObjects();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.ddd.repository.javamodel.IRepository> selectRepository();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.ddd.services.javamodel.IDomainService> selectDomainServices();
  
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.enums.javamodel.IEnum> selectEnums();
  
  public java.util.List<? extends cleon.architecturestylesandpatterns.eda.spec.eda.eventaggregator.javamodel.IEventAggregator> selectEventAggregator();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,83c13817-10c0-11e3-b60e-ab478a3e1eca,EOqsSNeygmW2ua3Ji1kbVWZka+8=] */
