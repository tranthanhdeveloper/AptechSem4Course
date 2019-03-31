package xpath;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class BooksXPath {
	
	public static void listOut(String author, int year) {
		try {
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse("src\\data\\books.xml");

			XPath xPath = XPathFactory.newInstance().newXPath();
			NodeList nodeList = (NodeList) xPath
					.compile("//book[year ="+year+" and author='"+author+"']")
					.evaluate(document, XPathConstants.NODESET);

			for (int i = 0; i < nodeList.getLength(); i++) {
				String title = xPath.compile("./title").evaluate(nodeList.item(i));
				System.out.println("Id: " + title);
				String authorName = xPath.compile("./author").evaluate(nodeList.item(i));
				System.out.println("author: " + authorName);
				year = Integer.parseInt(xPath.compile("./year").evaluate(nodeList.item(i)));
				System.out.println("year: " + year);
				double price = Double.parseDouble(xPath.compile("./price").evaluate(nodeList.item(i)));
				System.out.println("price: " + price);
				System.out.println("===========================");
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
