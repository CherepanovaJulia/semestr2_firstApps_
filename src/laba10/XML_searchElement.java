package laba10;
//поиск элемента
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

public class XML_searchElement {
    public static void main(String[] args) {
        try {
            File inputFile = new File("XMLFileMovie.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("movie");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
               System.out.println("\nТекущий элемент: " + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                  /*  System.out.println("Название фильма: "
                           + element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Режиссер: "
                + element.getElementsByTagName("director").item(0)
                            .getTextContent());
                    System.out.println("Год выпуска: "
                            + element.getElementsByTagName("year").item(0)
                            .getTextContent());*/

                   List<String> result = List.of(element.getTagName());
                   System.out.println(result);


                    //XPath xPath = XPathFactory.newInstance().newXPath();
                   // String expression = "mediateka";
                   // nodeList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
                  //  System.out.println(expression);


                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static List<Element> resultOfSearch(List <Element> list) {
        return list.stream()
                .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                .map(node -> (Element) node)
                .filter(element -> {
                    String director = element.getElementsByTagName("director").item(0).getTextContent();
                    String year = element.getElementsByTagName("year").item(0).getTextContent();
                    return director.equalsIgnoreCase("Джеймс Ганн") && year.equals("2014");
                })
                .collect(Collectors.toList());
    }
}




