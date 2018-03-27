package cleon.common.resources.spec.resources.id.javamodel;

import java.util.List;
import java.util.stream.Collectors;

import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.model.aspects.IResourceValidationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.validation.ValidationContext;
import ch.actifsource.core.validation.inconsistency.IResourceInconsistency;
import ch.actifsource.core.validation.inconsistency.PredicateInconsistency;
import cleon.common.resources.spec.resources.id.IdPackage;

public class BusinessObjectIdUniqueValidationAspect<T extends IBusinessObjectId> implements IResourceValidationAspect {

	private Class<T> _classInstance;

	protected BusinessObjectIdUniqueValidationAspect(Class<T> classInstance) {
		_classInstance = classInstance;
	}

	@Override
	public void validate(ValidationContext context, List<IResourceInconsistency> inconsistencyList) {
		ITypeSystem typeSystem = context.getTypeSystem();
		IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();

		List<T> resources = resourceRepository.getAllResources(_classInstance);
		IBusinessObjectId businessObjectId = resourceRepository.getResource(IBusinessObjectId.class,
				context.getResource());

		List<T> duplicateItems = resources.stream()
				.filter(x -> x.selectIdentifier().equals(businessObjectId.selectIdentifier()))
				.collect(Collectors.toList());
		if (!duplicateItems.isEmpty() && duplicateItems.size() != 1) {
			String name = Select.simpleName(context.getReadJobExecutor(), businessObjectId.getResource());
			String errormessage = String.format("Resource %1$s with id %2$d is not unique", name,
					businessObjectId.selectIdentifier());
			inconsistencyList.add(new PredicateInconsistency(context.getPackage(), context.getResource(),
					IdPackage.BusinessObjectId_identifier, errormessage));
		}

	}
}