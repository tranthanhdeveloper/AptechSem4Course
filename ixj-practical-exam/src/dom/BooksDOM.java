package dom;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import xpath.BooksXPath;

public class BooksDOM {
	private static final String DATA_BOOKS_XML = "src\\data\\books.xml";

	public static void create(String category, String title, String author, int year, double price) {
		try {
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse(DATA_BOOKS_XML);
			
			Element bookStore = document.getDocumentElement();
			Element bookEl = document.createElement("book");
			bookEl.setAttribute("category", category);
			
			Element titleEl = document.createElement("title");
			titleEl.setAttribute("lang", "en");
			titleEl.appendChild(document.createTextNode(title));
			bookEl.appendChild(titleEl);
			
			Element authorEl = document.createElement("author");
			authorEl.appendChild(document.createTextNode(author));
			bookEl.appendChild(authorEl);
			
			Element yearEl = document.createElement("year");
			yearEl.appendChild(document.createTextNode(String.valueOf(year)));
			bookEl.appendChild(yearEl);

			Element priceEl = document.createElement("price");
			priceEl.appendChild(document.createTextNode(String.valueOf(price)));
			bookEl.appendChild(priceEl);
			
			bookStore.appendChild(bookEl);
			
			DOMHelper.saveXMLContent(document, DATA_BOOKS_XML);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
