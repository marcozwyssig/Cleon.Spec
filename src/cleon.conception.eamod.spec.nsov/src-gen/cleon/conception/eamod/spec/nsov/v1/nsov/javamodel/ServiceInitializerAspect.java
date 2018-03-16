package cleon.conception.eamod.spec.nsov.v1.nsov.javamodel;

import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdInitializerAspect;

public class ServiceInitializerAspect extends BusinessObjectIdInitializerAspect<IService> 
{
	public ServiceInitializerAspect()
	{
		super(IService.class);
	}
}
