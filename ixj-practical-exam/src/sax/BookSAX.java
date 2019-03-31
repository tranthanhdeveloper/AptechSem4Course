package sax;

import java.io.FileInputStream;

import javax.xml.namespace.QName;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BookSAX {
	private static final String SRC_DATA_BOOKS_XML = "src\\data\\books.xml";

	public static void read() {
		try {
			XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
			XMLStreamReader xmlStreamReader = xmlInputFactory
					.createXMLStreamReader(new FileInputStream(SRC_DATA_BOOKS_XML));
			String tagName = "";
			int countBook = 0;
			while (xmlStreamReader.hasNext()) {
				int eventType = xmlStreamReader.getEventType();
				switch (eventType) {
				case XMLStreamReader.START_ELEMENT:
					tagName = xmlStreamReader.getLocalName();
					break;
				case XMLStreamReader.CHARACTERS:
					String value = xmlStreamReader.getText();
					if (tagName.equalsIgnoreCase("title")) {
						System.out.println("Title: " + value);
					}
					if (tagName.equalsIgnoreCase("author")) {
						System.out.println("Author: " + value);
					}
					if (tagName.equalsIgnoreCase("year")) {
						System.out.println("Year: " + value);
					}
					if (tagName.equalsIgnoreCase("price")) {
						if (Double.parseDouble(value) > 29) {
							countBook++;
						}
						System.out.println("Price: " + value);
						System.out.println("========================");
					}
					tagName = "";
					break;
				default:
					break;
				}
				xmlStreamReader.next();
			}
			if (xmlStreamReader.getEventType() == XMLStreamReader.END_DOCUMENT) {
				System.out.println("Co " + countBook + " quyen sach co gia lon hon 29USD.");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
}
