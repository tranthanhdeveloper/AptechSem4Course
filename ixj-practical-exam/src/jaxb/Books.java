package jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "bookstore")
public class Books {
	private List<Book> books = new ArrayList<Book>();

	public List<Book> getBooks() {
		return books;
	}

	@XmlElement(name = "book")
	public void setBooks(List<Book> mobiles) {
		this.books = mobiles;
	}

	public Books() {
		super();
	}

	public Books(List<Book> mobiles) {
		super();
		this.books = mobiles;
	}
}
