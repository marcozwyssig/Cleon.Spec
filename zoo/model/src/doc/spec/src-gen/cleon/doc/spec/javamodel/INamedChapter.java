package cleon.doc.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INamedChapter extends cleon.doc.spec.javamodel.IChapter, ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("cdb18e6a-1003-11e5-865e-55f33dbc76dc");
  
  // relations
  
  public java.util.List<? extends cleon.doc.spec.javamodel.IParagraph> selectParagraphes();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,cdb18e6a-1003-11e5-865e-55f33dbc76dc,pFPReljGCv4W4uEwWka2Nv6tHIw=] */
