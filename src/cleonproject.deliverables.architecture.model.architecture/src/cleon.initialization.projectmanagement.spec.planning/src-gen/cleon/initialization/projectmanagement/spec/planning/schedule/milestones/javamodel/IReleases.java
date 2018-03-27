package cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IReleases extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter, cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ITimePlan {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3161251a-a7d9-11e5-82dd-3b995d9c840c");
  
  public java.lang.Integer selectDaysPerSprint();
  
  // relations
  
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IPhase> selectPhases();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3161251a-a7d9-11e5-82dd-3b995d9c840c,FnQu/ZtKDVR46Oot0giKm/1Xrx0=] */