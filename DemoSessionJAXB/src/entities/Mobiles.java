package entities;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="mobiles")
public class Mobiles {
	private List<Mobile> mobiles;
	
	public List<Mobile> getMobiles() {
		return mobiles;
	}
	
	@XmlElement(name="mobile")
	public void setMobiles(List<Mobile> mobiles) {
		this.mobiles = mobiles;
	}
	
	public Mobiles() {
		super();
	}

	public Mobiles(List<Mobile> mobiles) {
		super();
		this.mobiles = mobiles;
	}

	@Override
	public String toString() {
		return "Mobiles " + mobiles;
	}
	
}
