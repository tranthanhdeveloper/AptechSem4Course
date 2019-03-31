package jaxb;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import jaxb.Book.Title;

public class BooksJAXB {
	private static final String SOURCE_PATH ="src\\data\\books.xml";
	public static void serialize(Books books) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Books.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(books, System.out);
			marshaller.marshal(books, new File(SOURCE_PATH));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	public static void deserialize() {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Books.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Books books = (Books) unmarshaller.unmarshal(new File(SOURCE_PATH));
			List<Book> list = books.getBooks();
			System.out.println("Books: " + list.size());
			for (Book mobile : list) {
				System.out.println("Title: " + mobile.getTitle());
				System.out.println("Author: " + mobile.getAuthor());
				System.out.println("Year: " + mobile.getYear());
				System.out.println("Price: " + mobile.getPrice());
				System.out.println("=================");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
