package jaxb;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "mobile")
public class Book {
	private String category;
	private Title title;
	private String author;
	private int year;
	private double price;

	public String getCategory() {
		return category;
	}
	
	@XmlAttribute(name = "category")
	public void setCategory(String category) {
		this.category = category;
	}
	
	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book(String category, Title title, String author, int year, double price) {
		super();
		this.category = category;
		this.title = title;
		this.author = author;
		this.year = year;
		this.price = price;
	}

	public Book() {
		super();
	}

	@XmlRootElement(name = "title")
	public static class Title implements Serializable {
		private static final long serialVersionUID = 1L;

		private String lang;
		private String value;

		public String getValue() {
			return value;
		}

		@XmlValue
		public void setValue(String value) {
			this.value = value;
		}

		public String getLang() {
			return lang;
		}

		@XmlAttribute(name = "lang")
		public void setLang(String format) {
			this.lang = format;
		}

		public Title() {
			super();
		}

		public Title(String lang, String value) {
			super();
			this.lang = lang;
			this.value = value;
		}

		@Override
		public String toString() {
			return "Title [lang=" + lang + ", value=" + value + "]";
		}

	}
}