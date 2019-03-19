package dom;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class StudentsDOM {

	public void display2() {
		try {
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse("src\\data\\student.xml");
			NodeList nodeList = document.getElementsByTagName("student");
			System.out.println("Students: " + nodeList.getLength());
			System.out.println("Student list");
			for (int i = 0; i < nodeList.getLength(); i++) {
				Element studentEL = (Element)nodeList.item(i);
				System.out.println("ID: "+studentEL.getElementsByTagName("id").item(0).getTextContent());
			}

		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		new StudentsDOM().display2();
	}

}
