package pom.accenture.utilities;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name="registrationData")
public class RegData {
	private List<Data> regdata;
	@XmlElement(name="data")
	public void setUserdata(List<Data> regdata)
	{
		this.regdata=regdata;
	}
	public List<Data> getUserdata()
	{
		return regdata;
	}

}
