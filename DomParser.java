import java.io.File;
import java.io.IOException;

import javax.lang.model.element.Name;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParser {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = factory.newDocumentBuilder();
		Document doc = documentBuilder.parse(new File("src/computerStore.xml"));
		
		NodeList nodeList = doc.getElementsByTagName("computer");
		
		String title="", type = "";
		int amount = 0;
		System.out.println("title          type         amount");
		for(int i=0; i<nodeList.getLength(); i++){
			Element element = (Element)nodeList.item(i);
			title = element.getElementsByTagName("title").item(0).getChildNodes().item(0).getNodeValue();
			type = element.getElementsByTagName("title").item(0).getChildNodes().item(0).getNodeValue();	
			amount = Integer.parseInt(element.getElementsByTagName("amount").item(0).getChildNodes().item(0).getNodeValue());
			System.out.println(title +"   "+ type +"     " + amount);
			
		}
		
	}

}
