package practicaSerializacion;
import java.io.File;

import javax.xml.parsers.DocumentBuilder; 
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LecturaXML {

	public static void main(String[] args) {
		leerXML();
		
	}
	
	
	
static void leerXML(){
	DocumentBuilder builder;
	try {
		builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		File f = new File("archivoXML.xml"); 
		Document documento = builder.parse(f);
		recorrer(documento);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	
}

private static void recorrer(Node nodo) {
if(nodo != null){
	System.out.println(nodo.getNodeName() + " - " + nodo.getNodeValue());
	NodeList hijos = nodo.getChildNodes();
	
	for (int i= 0; i < hijos.getLength(); i++){
		recorrer(hijos.item(i));
	}
	
}

}
	
	
	
}
