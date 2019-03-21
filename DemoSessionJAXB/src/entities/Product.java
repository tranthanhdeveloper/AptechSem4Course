package entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "product")
public class Product {
	
	private Id id;
	private String name;
	private Price price;
	private Weight weight;
	private Category category;
	private Date date;
	private boolean status;
	
	public Product() {
	}

	public Product(Id id, String name, Price price, Weight weight, Category catefory, Date date, boolean status) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.category = catefory;
		this.date = date;
		this.status = status;
	}

	public Id getId() {
		return id;
	}

	@XmlElement(name="id")
	public void setId(Id id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@XmlElement(name="name")
	public void setName(String name) {
		this.name = name;
	}

	public Price getPrice() {
		return price;
	}
	
	@XmlElement(name="price")
	public void setPrice(Price price) {
		this.price = price;
	}

	public Weight getWeight() {
		return weight;
	}
	
	@XmlElement(name="weight")
	public void setWeight(Weight weight) {
		this.weight = weight;
	}

	public Category getCatefory() {
		return category;
	}

	@XmlElement(name="category")
	public void setCatefory(Category catefory) {
		this.category = catefory;
	}

	public Date getDate() {
		return date;
	}

	@XmlElement(name="date")
	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isStatus() {
		return status;
	}

	@XmlElement(name="status")
	public void setStatus(boolean status) {
		this.status = status;
	}

	@XmlRootElement(name = "id")
	public static class Id {
		private int min;
		private int max;
		private String value;

		public int getMin() {
			return min;
		}

		@XmlElement(name = "min")
		public void setMin(int min) {
			this.min = min;
		}

		public int getMax() {
			return max;
		}

		@XmlElement(name = "max")
		public void setMax(int max) {
			this.max = max;
		}

		public String getValue() {
			return value;
		}
		
		public void setValue(String value) {
			this.value = value;
		}

		public Id(int min, int max, String value) {
			super();
			this.min = min;
			this.max = max;
			this.value = value;
		}
		
		public Id() {
		}
		
	}
	
	@XmlRootElement(name = "category")
	public static class Category {
		private int id;
		private String name;

		public Category() {
		}

		public Category(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		@XmlElement(name = "id")
		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		@XmlElement(name = "name")
		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Category [id=" + id + ", name=" + name + "]";
		}

	}

	@XmlRootElement(name = "price")
	public static class Price {
		private String currency;
		private float value;

		public String getCurrency() {
			return currency;
		}

		@XmlAttribute(name = "currency")
		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public float getValue() {
			return value;
		}

		@XmlValue
		public void setValue(float value) {
			this.value = value;
		}

		public Price(String currency, float value) {
			super();
			this.currency = currency;
			this.value = value;
		}

		public Price() {

		}
	}

	@XmlRootElement(name="weight")
	public static class Weight {
		private String unit;
		private int value;

		public String getUnit() {
			return unit;
		}

		@XmlAttribute(name = "unit")
		public void setUnit(String unit) {
			this.unit = unit;
		}

		public int getValue() {
			return value;
		}

		@XmlValue
		public void setValue(int value) {
			this.value = value;
		}

		public Weight(String unit, int value) {
			super();
			this.unit = unit;
			this.value = value;
		}

		public Weight() {
		}
	}

	@XmlRootElement(name="date")
	public static class Date {
		private String format;
		private String value;

		public String getFormat() {
			return format;
		}

		@XmlAttribute(name="format")
		public void setFormat(String format) {
			this.format = format;
		}

		public String getValue() {
			return value;
		}

		@XmlValue
		public void setValue(String value) {
			this.value = value;
		}

		public Date(String format, String value) {
			super();
			this.format = format;
			this.value = value;
		}

		public Date() {
		}

	}
}
