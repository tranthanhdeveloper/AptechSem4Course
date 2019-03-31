package run;

import dom.BooksDOM;
import jaxb.Book;
import jaxb.Book.Title;
import jaxb.Books;
import jaxb.BooksJAXB;
import sax.BookSAX;
import xpath.BooksXPath;
import xstl.BookXsltTransformation;

public class RunExam {
	public static void main(String[] args) throws Exception {
		System.out.println("Bat dau yeu cau 1");
		BookSAX.read();
		System.out.println("Ket thuc yeu cau 1");
		System.out.println("********************************************");
		
		System.out.println("Bat dau yeu cau 2");
		BooksDOM.create("Children", "Test DOM create", "Tran Thanh", 12, 1);
		System.out.println("Ket thuc yeu cau 2");
		System.out.println("********************************************");
		
		
		System.out.println("Bat dau yeu cau 3");
		BooksXPath.listOut("J K. Rowling", 2005);
		System.out.println("Ket thuc yeu cau 3");
		System.out.println("********************************************");
		
		
		System.out.println("Bat dau yeu cau 4");
		Books books = new Books();
		books.getBooks().add(new Book("children", new Title("en", "Tran Thanh Book"), "Tran Thanh", 2019, 12));
		BooksJAXB.serialize(books);
		BooksJAXB.deserialize(); 
		System.out.println("Ket thuc yeu cau 4");
		System.out.println("********************************************");
		
		System.out.println("Bat dau yeu cau 5");
		BookXsltTransformation.transforToHTMl();
		System.out.println("Ket thuc yeu cau 5");
		System.out.println("********************************************");
	}
}
