package laba10;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;
public class XML_deleteElement {
    public static void main(String[] args) {
        //получаем документ
        try {
            File inputFile = new File("XMLFileMovie.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент " + doc.getDocumentElement().getNodeName());


            NodeList elementsToRemove = doc.getElementsByTagName("year");
            Element elementToRemove = (Element) elementsToRemove.item(0);
            elementToRemove.getParentNode().removeChild(elementToRemove);

            System.out.println("элемментт yeear удален");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


