package stax;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

public class StudentSTAX {
	public void write() {
		try {
			XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newFactory();
			XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(new FileOutputStream("src\\data\\student.xml"), "UTF-8");
			xmlStreamWriter.writeStartDocument("UTF-8", "1.0");
			
			// add root node
			xmlStreamWriter.writeStartElement("student");// open student node
				xmlStreamWriter.writeStartElement("id");
				xmlStreamWriter.writeCharacters("st01");
				xmlStreamWriter.writeEndElement();
				
				xmlStreamWriter.writeStartElement("name");
				xmlStreamWriter.writeCharacters("First Student");
				xmlStreamWriter.writeEndElement();
				
				xmlStreamWriter.writeStartElement("dob");
				xmlStreamWriter.writeAttribute("format", "MM/dd/yyyy");
				xmlStreamWriter.writeAttribute("place", "Ha Tinh");
				xmlStreamWriter.writeCharacters("03/05/1998");
				xmlStreamWriter.writeEndElement();
				
				xmlStreamWriter.writeStartElement("address");
					xmlStreamWriter.writeStartElement("street");
					xmlStreamWriter.writeCharacters("Nguyen Hien");
					xmlStreamWriter.writeEndElement();
					
					xmlStreamWriter.writeStartElement("ward");
					xmlStreamWriter.writeCharacters("ward 4");
					xmlStreamWriter.writeEndElement();
					
					xmlStreamWriter.writeStartElement("district");
					xmlStreamWriter.writeCharacters("District 3");
					xmlStreamWriter.writeEndElement();
					
				xmlStreamWriter.writeEndElement();
			xmlStreamWriter.writeEndElement(); // close student node
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void read() {
		try {
			XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
			XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(new FileInputStream("src\\data\\student.xml"));
			String tagName ="";
			while(xmlStreamReader.hasNext()) {
				int eventType = xmlStreamReader.getEventType();
				switch (eventType) {
				case XMLStreamReader.START_DOCUMENT:
					System.out.println("Start document");					
					break;
				case XMLStreamReader.START_ELEMENT:
					System.out.println("\t"+xmlStreamReader.getName());
					// read element attributes
					if(xmlStreamReader.getAttributeCount() >0) {
						for(int i = 0; i<xmlStreamReader.getAttributeCount(); i++) {
							System.out.println("\t\t"+xmlStreamReader.getAttributeName(i)+": "+xmlStreamReader.getAttributeValue(i));
						}
					}
					break;
				case XMLStreamReader.END_ELEMENT:
					System.out.println("\tEnd element: "+xmlStreamReader.getName());
					break;
				case XMLStreamReader.CHARACTERS:
					String value = xmlStreamReader.getText();
					break;
				}
				xmlStreamReader.next();
			};
			if(xmlStreamReader.getEventType() == XMLStreamReader.END_DOCUMENT) {
				System.out.println("End document");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
