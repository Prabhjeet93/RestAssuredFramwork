package operations;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class readXMLAndJsonFile {
	


	public static String readFileAsString(String filePath) throws IOException {
	    DataInputStream dis = new DataInputStream(new FileInputStream(filePath));
	    try {
	        long len = new File(filePath).length();
	        if (len > Integer.MAX_VALUE) throw new IOException("File "+filePath+" too large, was "+len+" bytes.");
	        byte[] bytes = new byte[(int) len];
	        dis.readFully(bytes);
	        return new String(bytes, "UTF-8");
	    } finally {
	        dis.close();
	    }
	}
}
