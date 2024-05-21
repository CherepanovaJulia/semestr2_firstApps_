package KursProject;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.jsoup.Jsoup.*;

public class myParser {
    public static void main (String[]args) throws IOException, IndexOutOfBoundsException {
        List<MovieMenu> menuList = new ArrayList<>();

        System.out.println("Подключение к главной странице он-лайн кинотеатра Иви - www.ivi.ru...");
        Document doc = Jsoup.connect("https://www.ivi.ru/").get();

        Elements titleOfMenuIvi = doc.getElementsByAttributeValue("class", "nbl-button nbl-button_style_sairo nbl-button_size_stryker nbl-button_hasBadge_0");
        System.out.println("Главное меню сайта: " + titleOfMenuIvi.text());
        /*for (Element element : titleOfMenuIvi) {
            System.out.println(element.attr("href") + "|" + element.attr("title"));
        }*/
        try {
            System.out.println("Подключение ко всем подразделам сайта...");
            Elements titles = doc.getElementsByAttributeValue("class", "nbl-link nbl-link_style_reska");
            //  System.out.println("Подразделы сайта: \n" + menu.get(1));

            // пройтись по элементам
            for (Element element : titles) {
                for (int i = 0; i < doc.attributesSize(); i++) {
                    i = titles.indexOf(element);

                    System.out.println("\nПодраздел: " + element.attr("title")
                            + "\nссылка для подключения: " + element.attr("href"));
                    String link = element.attr("href");
                    MovieMenu menuMovie = new MovieMenu();
                    menuMovie.setLink(link);
                    // System.out.println(link);
                    menuMovie.setDetails(element.attr("title"));
                    Document menuMovieDoc = Jsoup.connect(link).get();
                    // System.out.println(menuMovieDoc.getAllElements());
                    Element subMenuElement = menuMovieDoc.getElementsByAttributeValue("class", "nbl-slimPosterBlock__title").first().child(0);
                    menuMovie.setSubMenu(subMenuElement.text());
                    //System.out.println(subMenuElement.text());
                    menuList.add(menuMovie);

                    FileWriter writer = new FileWriter("MoviesFromIvi.txt");
                    for (MovieMenu movies : menuList) {
                        String title = movies.getDetails();
                        String titleLink = movies.getLink();
                        String firstMovie = movies.getSubMenu();
                        writer.write("\nПодраздел: " + title + "\nСсылка для подключения: " + titleLink
                                + "\nПервый фильм в подборке: " + firstMovie);
                    }
                    writer.close();
                }
            }
            System.out.println("Данные записаны в файл - MoviesFromIvi.txt");

        } catch (Exception e) {
            Jsoup.connect("https://www.ivi.ru/animation/su");
        }
        menuList.forEach(System.out::println);
    }


    private static Document connectWithRetry (String url) throws IOException {
        int maxRetries = 3;
        int retries = 0;
        while (true) {
            try {
                return Jsoup.connect(url).get();
            } catch (IOException e) {
                retries++;
                if (retries == maxRetries) {
                    throw e;
                }
                System.out.println("Ошибка при подключении к сайту. Попытка переподключения...");
            }
        }
    }
}
