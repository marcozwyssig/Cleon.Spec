package cleon.support.projectmanagement.spec.planning.schedule.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Schedule extends DynamicResource implements ISchedule {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISchedule> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISchedule>() {
    
    @Override
    public ISchedule create() {
      return new Schedule();
    }
    
    @Override
    public ISchedule create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Schedule(resourceRepository, resource);
    }
  
  };

  public Schedule() {
    super(ISchedule.TYPE_ID);
  }
  
  public Schedule(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISchedule.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.common.resources.spec.calendar.javamodel.ICalendar selectCalendar() {
    return _getSingle(cleon.common.resources.spec.calendar.javamodel.ICalendar.class, cleon.support.projectmanagement.spec.planning.schedule.SchedulePackage.Schedule_calendar);
  }

  public Schedule setCalendar(cleon.common.resources.spec.calendar.javamodel.ICalendar calendar) {
    _setSingle(cleon.support.projectmanagement.spec.planning.schedule.SchedulePackage.Schedule_calendar, calendar);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Schedule setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.IReleases selectReleases() {
    return _getSingle(cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.IReleases.class, cleon.support.projectmanagement.spec.planning.schedule.SchedulePackage.Schedule_releases);
  }

  public Schedule setReleases(cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.IReleases releases) {
    _setSingle(cleon.support.projectmanagement.spec.planning.schedule.SchedulePackage.Schedule_releases, releases);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlannings selectSprintPlanning() {
    return _getSingle(cleon.support.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlannings.class, cleon.support.projectmanagement.spec.planning.schedule.SchedulePackage.Schedule_sprintPlanning);
  }

  public Schedule setSprintPlanning(cleon.support.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlannings sprintPlanning) {
    _setSingle(cleon.support.projectmanagement.spec.planning.schedule.SchedulePackage.Schedule_sprintPlanning, sprintPlanning);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.planning.schedule.targetdates.javamodel.IDeadlines selectTargetDates() {
    return _getSingle(cleon.support.projectmanagement.spec.planning.schedule.targetdates.javamodel.IDeadlines.class, cleon.support.projectmanagement.spec.planning.schedule.SchedulePackage.Schedule_targetDates);
  }

  public Schedule setTargetDates(cleon.support.projectmanagement.spec.planning.schedule.targetdates.javamodel.IDeadlines targetDates) {
    _setSingle(cleon.support.projectmanagement.spec.planning.schedule.SchedulePackage.Schedule_targetDates, targetDates);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Schedule setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.common.resources.spec.calendar.javamodel.ICalendar.class, cleon.support.projectmanagement.spec.planning.schedule.SchedulePackage.Schedule_calendar, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.IReleases.class, cleon.support.projectmanagement.spec.planning.schedule.SchedulePackage.Schedule_releases, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlannings.class, cleon.support.projectmanagement.spec.planning.schedule.SchedulePackage.Schedule_sprintPlanning, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.planning.schedule.targetdates.javamodel.IDeadlines.class, cleon.support.projectmanagement.spec.planning.schedule.SchedulePackage.Schedule_targetDates, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.support.projectmanagement.spec.planning.schedule.javamodel.ISchedule selectToMeReleases(cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.IReleases object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.planning.schedule.javamodel.ISchedule.class, cleon.support.projectmanagement.spec.planning.schedule.SchedulePackage.Schedule_releases, object.getResource());
  }
  
  public static cleon.support.projectmanagement.spec.planning.schedule.javamodel.ISchedule selectToMeSprintPlanning(cleon.support.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlannings object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.planning.schedule.javamodel.ISchedule.class, cleon.support.projectmanagement.spec.planning.schedule.SchedulePackage.Schedule_sprintPlanning, object.getResource());
  }
  
  public static cleon.support.projectmanagement.spec.planning.schedule.javamodel.ISchedule selectToMeTargetDates(cleon.support.projectmanagement.spec.planning.schedule.targetdates.javamodel.IDeadlines object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.planning.schedule.javamodel.ISchedule.class, cleon.support.projectmanagement.spec.planning.schedule.SchedulePackage.Schedule_targetDates, object.getResource());
  }
  
  public static java.util.List<cleon.support.projectmanagement.spec.planning.schedule.javamodel.ISchedule> selectToMeCalendar(cleon.common.resources.spec.calendar.javamodel.ICalendar object) {
    return _getToMeList(object.getRepository(), cleon.support.projectmanagement.spec.planning.schedule.javamodel.ISchedule.class, cleon.support.projectmanagement.spec.planning.schedule.SchedulePackage.Schedule_calendar, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5f541a84-a7d8-11e5-82dd-3b995d9c840c,lDjYJrxkWUh5yeSJhw3Aguz552s=] */
