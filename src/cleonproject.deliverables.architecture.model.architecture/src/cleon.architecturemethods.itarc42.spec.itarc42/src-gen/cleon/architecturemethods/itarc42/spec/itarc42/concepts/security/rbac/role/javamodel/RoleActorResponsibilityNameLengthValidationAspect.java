package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel;

import java.util.List;
import java.util.stream.Collectors;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.ActivityPackage;
import cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.RolePackage;
import cleon.common.resources.spec.resources.id.IdPackage;
import cleon.common.resources.spec.resources.id.javamodel.BusinessObjectIdUniqueValidationAspect;

public class RoleActorResponsibilityNameLengthValidationAspect implements IResourceValidationAspect 
{
	private final int MAX_LENGTH_AD_GROUP = 64;
	
	@Override
	public void validate(ValidationContext context, List<IResourceInconsistency> inconsistencyList) {
		String name = Select.simpleName(context.getReadJobExecutor(), context.getResource());
		if (name.length() > MAX_LENGTH_AD_GROUP) {
			String errormessage = String.format("Name of role system component should not exceed a length of %1$d", MAX_LENGTH_AD_GROUP);
			inconsistencyList.add(new PredicateInconsistency(context.getPackage(), context.getResource(), RolePackage.RoleActorResponsibility, errormessage));
		}
	}	
}