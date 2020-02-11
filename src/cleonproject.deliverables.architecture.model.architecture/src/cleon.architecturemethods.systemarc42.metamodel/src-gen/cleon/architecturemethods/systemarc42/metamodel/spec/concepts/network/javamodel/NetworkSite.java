package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NetworkSite extends DynamicResource implements INetworkSite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetworkSite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetworkSite>() {
    
    @Override
    public INetworkSite create() {
      return new NetworkSite();
    }
    
    @Override
    public INetworkSite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NetworkSite(resourceRepository, resource);
    }
  
  };

  public NetworkSite() {
    super(INetworkSite.TYPE_ID);
  }
  
  public NetworkSite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INetworkSite.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public NetworkSite setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask selectCidr() {
    return _getSingle(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_Mask_aE_Aware_cidr);
  }

  public NetworkSite setCidr(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask cidr) {
    _setSingle(cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_Mask_aE_Aware_cidr, cidr);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public NetworkSite setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone> selectNetworkSubZone() {
    return _getMultiMap(cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkSite_networkSubZone);
  }

  public NetworkSite setNetworkSubZone(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone> networkSubZone) {
    _setMultiMap(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkSite_networkSubZone, networkSubZone);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetwork> selectNetworks() {
    return _getList(cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetwork.class, cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworkAware_networks);
  }

  public NetworkSite setNetworks(java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetwork> networks) {
    _setList(cleon.modelinglanguages.network.metamodel.spec.SpecPackage.AbstractNetworkAware_networks, networks);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public NetworkSite setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public NetworkSite setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ISite selectSite() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ISite.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkSite_site);
  }

  public NetworkSite setSite(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ISite site) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkSite_site, site);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public NetworkSite setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NetworkSite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_Mask.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_Mask_aE_Aware_cidr, visitor);
    _acceptMultiMap(cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkSite_networkSubZone, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ISite.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkSite_site, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkSite> selectToMeSite(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ISite object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkSite.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkSite_site, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkSite selectToMeNetworkSubZone(cleon.modelinglanguages.network.metamodel.spec.javamodel.INetworkSubZone object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.INetworkSite.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.NetworkPackage.NetworkSite_networkSubZone, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,398f37f2-928a-11e9-959e-8115c2f9e41e,vtn833BMD0/dAySSF2Jvy8+y2Hg=] */
