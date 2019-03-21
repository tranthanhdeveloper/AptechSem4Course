package demo;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import entities.Product;

public class DemoProduct {
	public static void main(String[] args) {
		Product product = new Product();
		product.setId(new Product.Id(3, 10, "p01"));
		product.setName("Name 1");
		product.setPrice(new Product.Price("USD", (float)4.5));
		product.setWeight(new Product.Weight("kg", 2));
		product.setCatefory(new Product.Category(1, "Category 1"));
		product.setDate(new Product.Date("dd/MM/yyy", "20/10/2019"));
		product.setStatus(true);

		serialize(product);
	}
	
	private static void serialize(Product product) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Product.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(product, new File("src\\data\\product.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	private static void deserialize() {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Product.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Product product = (Product)unmarshaller.unmarshal(new File("src\\data\\product.xml"));
			System.out.println(product.toString());
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
