package cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IModuleUtilization extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("27e45355-c291-11e6-ba8e-05f5391bcda8");
  
  // relations
  
  public cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule selectModule();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IRoleUtilization> selectRoleUtilizations();
  
  public java.util.List<? extends cleon.support.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverable> selectAchiviesDeliverable();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,27e45355-c291-11e6-ba8e-05f5391bcda8,TF0+x9t4j39PRZHri6rq4f2impY=] */
