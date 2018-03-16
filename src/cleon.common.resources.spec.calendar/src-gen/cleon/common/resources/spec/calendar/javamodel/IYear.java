package cleon.common.resources.spec.calendar.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IYear extends cleon.common.resources.spec.calendar.javamodel.ICalendarItem {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("56e29973-c37c-11e5-9455-d97b1b986284");
  
  // relations
  
  public java.util.List<? extends cleon.common.resources.spec.calendar.javamodel.IMonth> selectMonths();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,56e29973-c37c-11e5-9455-d97b1b986284,mO8Xf2O6LyidR+GW9w3z7HDYMQA=] */
