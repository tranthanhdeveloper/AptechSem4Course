package entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "product")
public class Product {
	
	@XmlElement(name="id")
	private Id id;
	
	@XmlElement(name="name")
	private String name;
	
	@XmlElement(name="price")
	private Price price;
	
	@XmlElement(name="weight")
	private Weight weight;
	
	@XmlElement(name="cateforys")
	private Category catefory;
	
	@XmlElement(name="date")
	private Date date;
	
	public Product() {
	}
	
	public Product(Id id, String name, Price price, Weight weight, Category catefory, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.catefory = catefory;
		this.date = date;
	}

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public Weight getWeight() {
		return weight;
	}

	public void setWeight(Weight weight) {
		this.weight = weight;
	}

	public Category getCatefory() {
		return catefory;
	}

	public void setCatefory(Category catefory) {
		this.catefory = catefory;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	@XmlRootElement(name = "category")
	public static class Id {
		@XmlElement(name = "min")
		private int min;
		
		@XmlElement(name = "max")
		private int max;
		
		@XmlValue
		private String value;

		public int getMin() {
			return min;
		}

		public void setMin(int min) {
			this.min = min;
		}

		public int getMax() {
			return max;
		}

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
		@XmlElement(name = "id")
		private int id;

		@XmlElement(name = "name")
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

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

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
		@XmlAttribute(name = "currency")
		private String currency;

		@XmlValue
		private float value;

		public String getCurrency() {
			return currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public float getValue() {
			return value;
		}

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

	public static class Weight {
		@XmlAttribute(name = "unit")
		private String unit;

		@XmlValue
		private int value;

		public String getUnit() {
			return unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

		public int getValue() {
			return value;
		}

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

	public static class Date {
		@XmlAttribute(name="format")
		private String format;
		
		@XmlValue
		private String value;

		public String getFormat() {
			return format;
		}

		public void setFormat(String format) {
			this.format = format;
		}

		public String getValue() {
			return value;
		}

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
