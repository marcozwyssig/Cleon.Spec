package cleon.conception.architecture.spec.eamod.nsv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DataEntity extends DynamicResource implements IDataEntity {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDataEntity> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDataEntity>() {
    
    @Override
    public IDataEntity create() {
      return new DataEntity();
    }
    
    @Override
    public IDataEntity create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DataEntity(resourceRepository, resource);
    }
  
  };

  public DataEntity() {
    super(IDataEntity.TYPE_ID);
  }
  
  public DataEntity(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDataEntity.TYPE_ID);
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
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.nsv.javamodel.IDataEntity> selectEntityRelationship() {
    return _getList(cleon.conception.architecture.spec.eamod.nsv.javamodel.IDataEntity.class, cleon.conception.architecture.spec.eamod.nsv.NsvPackage.DataEntity_entityRelationship);
  }

  public DataEntity setEntityRelationship(java.util.List<? extends cleon.conception.architecture.spec.eamod.nsv.javamodel.IDataEntity> entityRelationship) {
    _setList(cleon.conception.architecture.spec.eamod.nsv.NsvPackage.DataEntity_entityRelationship, entityRelationship);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DataEntity setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.conception.architecture.spec.eamod.nsv.javamodel.IDataEntity.class, cleon.conception.architecture.spec.eamod.nsv.NsvPackage.DataEntity_entityRelationship, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.architecture.spec.eamod.nsv.javamodel.IDataEntity> selectToMeEntityRelationship(cleon.conception.architecture.spec.eamod.nsv.javamodel.IDataEntity object) {
    return _getToMeList(object.getRepository(), cleon.conception.architecture.spec.eamod.nsv.javamodel.IDataEntity.class, cleon.conception.architecture.spec.eamod.nsv.NsvPackage.DataEntity_entityRelationship, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9327c0d9-818c-11e7-9507-01b75489c44b,QNqx1gOHD9LlPhZUrsh/qma1Kh4=] */