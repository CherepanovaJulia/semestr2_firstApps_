package laba10;
// добавить элемент в xml-файл
import java.io.File;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.logging.log4j.core.util.JsonUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {

        System.out.println("введите название фильма, имя режиссера и год выпуска: ");
        Scanner in = new Scanner(System.in);
        String movieTitle = in.nextLine();
        String movieDirector = in.nextLine();
        String movieYear = in.nextLine();

        try {
            File newMovie = new File("movie.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            Document doc = dbf.newDocumentBuilder().parse(newMovie);
            doc.getDocumentElement().normalize();
            //doc.getDocumentElement().getNodeName());
            System.out.println("корневой элемент" +  doc.getDocumentElement().getNodeName());
          //  NodeList nodeList = doc.getElementsByTagName("movie");

               //добавление фильма
            Element movie3 = doc.createElement("movie");
         //   doc.getDocumentElement().getNodeName(movie1);
            Element title3 = doc.createElement("title");
            title3.appendChild(doc.createTextNode("\n" + movieTitle));
            movie3.appendChild(title3);

            Element director3 = doc.createElement("director");
            director3.appendChild(doc.createTextNode("\n" + movieDirector));
            movie3.appendChild(director3);

            Element year3 = doc.createElement("year");
            year3.appendChild(doc.createTextNode("\n" + movieYear));
            movie3.appendChild(year3);
            // запись нового элемента в xml
            javax.xml.transform.Transformer transformer =
                    javax.xml.transform.TransformerFactory.newInstance().newTransformer();
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(new File("movie.xml"));
            transformer.transform(source, result);

            System.out.println("Новый фильм добавлен в xml файл");

        } catch (Exception pce) {
            pce.printStackTrace();
        }
    }
}
  //   File inputFile = new File("XMLfirstFile.xml");
//            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//            Document doc = dBuilder.parse(inputFile);
//            doc.getDocumentElement().normalize();
//            System.out.println("Корневой элемент " + doc.getDocumentElement().getNodeName());
//            NodeList nodeList = doc.getElementsByTagName("book");

        /*System.out.println("введите название фильма, имя режиссера и год выпуска: " );
        Scanner in = new Scanner(System.in);
        String movieTitle = in.nextLine();
        String movieDirector = in.nextLine();
        String movieYear = in.nextLine();*/

        /*Root root = null;

        File newMovie = new File("movie.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Document doc = null;
        try {
            doc = dbf.newDocumentBuilder().parse(newMovie);
        } catch (Exception e){
            System.out.println("Ошибка парсера" + e.toString());
            return;
        }
        // читаем xml
        System.out.println(root.toString());*/




            // запись в  xml

            /*javax.xml.transform.Transformer tmovie =
                    javax.xml.transform.TransformerFactory.newInstance().newTransformer();

            javax.xml.transform.dom.DOMSource source= new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(new File("movie.xml"));*/

// Element (имя) =




