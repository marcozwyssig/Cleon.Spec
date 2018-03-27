package cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdInitializerAspect;
import cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IDefect;


public class DefectInitializerAspect extends BusinessObjectIdInitializerAspect<IDefect> 
{
	public DefectInitializerAspect()
	{
		super(IDefect.class);
	}
}