package business;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.txw2.annotation.XmlAttribute;
import com.sun.xml.txw2.annotation.XmlElement;


@XmlRootElement
public class PCM {
	
	String name;
	List<Cell> cells = new ArrayList<Cell>();

	
	public String getName() {
		return name;
	}
	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}
	public List<Cell> getCells() {
		return cells;
	}
	@XmlElement
	public void setCells(List<Cell> cells) {
		this.cells = cells;
	}

}
