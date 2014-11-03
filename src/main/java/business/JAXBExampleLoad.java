package business;
 
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
 
public class JAXBExampleLoad {
	public static void main(String[] args) throws JAXBException {
 		JAXBContext jaxbContext = JAXBContext.newInstance(PCM.class);
		Unmarshaller jaxbunMarshaller = jaxbContext.createUnmarshaller();
		PCM p = (PCM) jaxbunMarshaller.unmarshal(new File("test.xml"));
		System.err.println(p.getName());
 
	}
}