package entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "student")
public class Student implements Serializable {
	@XmlRootElement(name = "address")
	public static class Address implements Serializable {
		private static final long serialVersionUID = 1L;
		private String district;
		private String street;
		private String ward;

		public Address() {
		}

		public Address(String street, String ward, String district) {
			super();
			this.street = street;
			this.ward = ward;
			this.district = district;
		}

		protected String getDistrict() {
			return district;
		}

		protected String getStreet() {
			return street;
		}

		protected String getWard() {
			return ward;
		}

		@XmlElement
		protected void setDistrict(String district) {
			this.district = district;
		}

		@XmlElement
		protected void setStreet(String street) {
			this.street = street;
		}

		@XmlElement
		protected void setWard(String ward) {
			this.ward = ward;
		}

		@Override
		public String toString() {
			return "Address [street=" + street + ", ward=" + ward + ", district=" + district + "]";
		}

	}
	@XmlRootElement(name = "dob")
	public static class DoB implements Serializable {
		private static final long serialVersionUID = 1L;
		
		private String format;
		private String place;
		private String value;

		public DoB() {
		}

		public DoB(String value, String format, String place) {
			super();
			this.value = value;
			this.format = format;
			this.place = place;
		}

		public String getFormat() {
			return format;
		}

		public String getPlace() {
			return place;
		}

		public String getValue() {
			return value;
		}

		@XmlAttribute(name = "format")
		public void setFormat(String format) {
			this.format = format;
		}

		@XmlAttribute(name = "place")
		public void setPlace(String place) {
			this.place = place;
		}

		@XmlValue
		public void setValue(String value) {
			this.value = value;
		}

	}
	private static final long serialVersionUID = 1L;
	private Address address;
	private int age;
	private DoB doB;
	
	

	private String id;

	private String name;

	public Student() {
	}

	public Student(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Student(String id, String name, int age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	protected int getAge() {
		return age;
	}
	
	public DoB getDoB() {
		return doB;
	}

	protected String getId() {
		return id;
	}

	protected String getName() {
		return name;
	}
	
	@XmlElement(name = "address")
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@XmlElement(name = "age")
	protected void setAge(int age) {
		this.age = age;
	}

	@XmlElement(name="dob")
	public void setDoB(DoB doB) {
		this.doB = doB;
	}

	@XmlElement(name = "id")
	protected void setId(String id) {
		this.id = id;
	}

	@XmlElement(name = "name")
	protected void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
