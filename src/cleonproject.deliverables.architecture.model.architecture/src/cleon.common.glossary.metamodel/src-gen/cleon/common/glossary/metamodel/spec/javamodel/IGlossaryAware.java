package cleon.common.glossary.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IGlossaryAware extends cleon.common.doc.metamodel.spec.document.javamodel.IDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("76a0d31a-4f09-11e6-a115-99fb8013e67b");
  
  // relations
  
  public cleon.common.glossary.metamodel.spec.javamodel.IGlossary selectGlossary();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,76a0d31a-4f09-11e6-a115-99fb8013e67b,FH2SYsW3NYFChYBCs/v4OjX6XEs=] */
