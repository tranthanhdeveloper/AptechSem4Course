package xstl;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;

public class BookXsltTransformation {
	private static final String sourcePath = "src\\data\\books.xml";
	private static final String stylePath = "src\\data\\books.xsl";
	private static final String destinationPath = "src\\data\\books.html";
	
	public static void transforToHTMl() throws Exception {
		Document document;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		 
	    File sourceFile = new File(sourcePath);
	    File styleFile = new File(stylePath);
	 
	    DocumentBuilder builder = factory.newDocumentBuilder();
	    document = builder.parse(sourcePath);
	 
	    // Use a Transformer for output
	    TransformerFactory transformerFactory = TransformerFactory.newInstance();
	    StreamSource style = new StreamSource(styleFile);
	    Transformer transformer = transformerFactory.newTransformer(style);
	 
	    DOMSource source = new DOMSource(document);
	    StreamResult result = new StreamResult(new FileOutputStream(new File(destinationPath)));
	    transformer.transform(source, result);
	}

}
