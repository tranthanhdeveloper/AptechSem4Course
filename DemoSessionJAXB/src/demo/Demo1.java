package demo;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import entities.Student;

public class Demo1 {
	public static void main(String[] args) {
		Student student1 = new Student("st01", "Student Name 1", 10);
		student1.setAddress(new Student.Address("Street", "Ward", "District 3"));
		student1.setDoB(new Student.DoB("1980-10-20", "yyyy-MM-dd", "Test"));
		serialize(student1);
		
		deserialize();
		
	}
	
	private static void serialize(Student student) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(student, System.out);
			marshaller.marshal(student, new File("src\\data\\student1.xml"));
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	private static void deserialize() {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Student student = (Student)unmarshaller.unmarshal(new File("src\\data\\student1.xml"));
			System.out.println(student.toString());
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
