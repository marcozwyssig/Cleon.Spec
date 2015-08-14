package cleon.doc.spec.chapter.paragraph.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Note extends DynamicResource implements INote {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INote> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INote>() {
    
    @Override
    public INote create() {
      return new Note();
    }
    
    @Override
    public INote create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Note(resourceRepository, resource);
    }
  
  };

  public Note() {
    super(INote.TYPE_ID);
  }
  
  public Note(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INote.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectText() {
    return _getSingleAttribute(java.lang.String.class, cleon.doc.spec.chapter.paragraph.ParagraphPackage.TextParagraph_text);
  }
    
  public void setText(java.lang.String text) {
     _setSingleAttribute(cleon.doc.spec.chapter.paragraph.ParagraphPackage.TextParagraph_text, text);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Note setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.doc.spec.chapter.paragraph.ParagraphPackage.TextParagraph_text, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3ec11f20-3087-11e5-8cdc-d5b441c8c3df,ZJyvKIVAvUSdN9IWNlkx018BzPo=] */