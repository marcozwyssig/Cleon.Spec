package cleon.modelinglanguages.segmentation.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISegmentation extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ccaeef49-0d1d-11e9-be4f-03130cc057ef");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone> selectZones();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ccaeef49-0d1d-11e9-be4f-03130cc057ef,N5YSFp8t2F1tcbPJ0x22qM+yCjg=] */