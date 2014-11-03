package business;
 
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
 
public class JAXBExampleSave {
	public static void main(String[] args) {
 
	  PCM pcm  = new PCM();
	  pcm.setName("test");
	  Cell c1 = new Cell();
	  c1.setX(0);
	  c1.setY(0);
	  c1.setValue("ok");
	  Cell c2 = new Cell();
	  c2.setX(1);
	  c2.setY(1);
	  c2.setValue("nok");
	  pcm.getCells().add(c1);
	  pcm.getCells().add(c2);
	  
	  try {
 
		JAXBContext jaxbContext = JAXBContext.newInstance(PCM.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); 
		jaxbMarshaller.marshal(pcm, new File("test.xml"));
		jaxbMarshaller.marshal(pcm, System.out);
 
	      } catch (JAXBException e) {
		e.printStackTrace();
	      }
 
	}
}