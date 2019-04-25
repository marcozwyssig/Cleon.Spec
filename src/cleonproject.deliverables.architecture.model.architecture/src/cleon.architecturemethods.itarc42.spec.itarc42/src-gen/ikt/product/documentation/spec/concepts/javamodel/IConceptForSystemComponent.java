package ikt.product.documentation.spec.concepts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IConceptForSystemComponent extends ikt.product.documentation.spec.concepts.javamodel.IConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2d6d075b-0b80-11e9-a136-69d076e48ed1");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends ikt.product.documentation.spec.concepts.javamodel.ISystemComponentConcept> selectSystemComponentConcept();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2d6d075b-0b80-11e9-a136-69d076e48ed1,YZK2IvxDlGiJ8NCviGLlqyjZBfI=] */
