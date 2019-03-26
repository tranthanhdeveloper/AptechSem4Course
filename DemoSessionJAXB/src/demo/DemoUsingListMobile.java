package demo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import entities.Mobile;
import entities.Mobiles;

public class DemoUsingListMobile {
	public static void main(String[] args) {
		List<Mobile> mobileList = new ArrayList<>();
		mobileList.add(new Mobile("m01", "Mobile 1", 11));
		mobileList.add(new Mobile("m02", "Mobile 2", 12));
		mobileList.add(new Mobile("m03", "Mobile 3", 13));
		
		Mobiles mobiles = new Mobiles(mobileList);
		deserializa();
	}

	private static void serializa(Mobiles mobiles) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Mobiles.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(mobiles, System.out);
			marshaller.marshal(mobiles, new File("src\\data\\mobiles.xml"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deserializa() {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Mobiles.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Mobiles mobiles = (Mobiles)unmarshaller.unmarshal(new File("src\\data\\mobiles.xml"));
			
			System.out.println(mobiles.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
