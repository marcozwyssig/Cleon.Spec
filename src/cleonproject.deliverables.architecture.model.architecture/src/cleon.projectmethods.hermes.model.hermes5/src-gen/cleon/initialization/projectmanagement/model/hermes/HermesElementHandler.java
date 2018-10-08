/* See the file "LICENSE" for the full license governing this code. */

package cleon.initialization.projectmanagement.model.hermes;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import ch.actifsource.core.INode;
import ch.actifsource.core.Resource;
import ch.actifsource.xml.importer.util.AbstractXMLElementHandler;
import ch.actifsource.xml.importer.util.IXMLElementContext;
import ch.actifsource.xml.importer.util.IXMLElementHandler;

public class HermesElementHandler extends AbstractXMLElementHandler {

	private String _discriminator;
	private Resource _cls;
	private Resource _rel;

	public HermesElementHandler(Resource cls)
	{
		_discriminator = null;
		_cls = cls;
		_rel = null;
	}
	
	public HermesElementHandler(Resource cls, Resource rel)
	{
		_discriminator = null;
		_cls = cls;
		_rel = rel;
	}	
	
	public HermesElementHandler(String discriminator, Resource cls, Resource rel)
	{
		_discriminator = discriminator;
		_cls = cls;
		_rel = rel;
	}

	@Override
	public INode createElement(IXMLElementContext context, String name, Attributes attributes) throws SAXException
	{
		context.getImportContext().putInfo("createElement with name '" + name + "'");
		if( name.equalsIgnoreCase("hermes"))
		{		
			context.getImportContext().putInfo("creating hermes resource with name '" + name + "' and discriminator '" + _discriminator + "'");
			String discriminatorAttribute = null;
			if( _discriminator != null )
				discriminatorAttribute = context.getMandatoryAttributeStringValue(_discriminator, attributes);
			return context.getOrCreateResourceByName(discriminatorAttribute, context.getParentResourceNotNull(), _rel, _cls);
		}
		
		context.getImportContext().putError("name doenst not equals hermes");
		return super.createElement(context, name, attributes);	
	}
	
	@Override
	public void setAttribute(IXMLElementContext context, String name, Attributes attributes) throws SAXException 
	{
	
	}		

	@Override
	public IXMLElementHandler createSubElementHandler(IXMLElementContext context, String name) throws SAXException 
	{	
		context.getImportContext().putInfo("createSubElementHandler with name '" + name + "'");
		if(name.equalsIgnoreCase("roles"))
		{
			return new RolesElementHandler
			  ( 
			    new Resource("9097eb07-31ca-11e8-8a84-6f139e67278b"), 
			    new Resource("97f39d2b-31ca-11e8-8a84-6f139e67278b"));
		}
		
				
		throw context.createException("Create nested element '" + name + "' is not supported.");
	}
}
/* Actifsource ID=[38dbaecb-237f-11e8-85f4-376150ff5cc0,492b1225-31d3-11e8-8891-11071a1f2fb6,OOca/Ln9hA6pKaNAyikj7f/AOR8=] */