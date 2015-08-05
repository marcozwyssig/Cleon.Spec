package cleon.actifsource.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Specifications extends DynamicResource implements ISpecifications {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISpecifications> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISpecifications>() {
    
    @Override
    public ISpecifications create() {
      return new Specifications();
    }
    
    @Override
    public ISpecifications create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Specifications(resourceRepository, resource);
    }
  
  };

  public Specifications() {
    super(ISpecifications.TYPE_ID);
  }
  
  public Specifications(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISpecifications.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.actifsource.spec.javamodel.ISpecification> selectSpecifications() {
    return _getList(cleon.actifsource.spec.javamodel.ISpecification.class, cleon.actifsource.spec.SpecPackage.Specifications_specifications);
  }

  public Specifications setSpecifications(java.util.List<? extends cleon.actifsource.spec.javamodel.ISpecification> specifications) {
    _setList(cleon.actifsource.spec.SpecPackage.Specifications_specifications, specifications);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Specifications setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.actifsource.spec.javamodel.ISpecification.class, cleon.actifsource.spec.SpecPackage.Specifications_specifications, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.actifsource.spec.javamodel.ISpecifications selectToMeSpecifications(cleon.actifsource.spec.javamodel.ISpecification object) {
    return _getToMeSingle(object.getRepository(), cleon.actifsource.spec.javamodel.ISpecifications.class, cleon.actifsource.spec.SpecPackage.Specifications_specifications, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,28f43850-e9ba-11e4-848b-0509e3792151,xLkQb44hGEzDeHlNabGhGqeulI8=] */
