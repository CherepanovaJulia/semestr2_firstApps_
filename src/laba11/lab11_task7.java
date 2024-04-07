package laba11;

import org.etsi.uri.x01903.v13.SignerRoleType;

import java.util.List;
import java.util.stream.Collectors;

//Напишите функцию, которая принимает на вход список строк
// и возвращает новый список, содержащий только те строки, которые имеют длину больше заданного значения.
public class lab11_task7 {
    public static void main(String[] args) {
        String str = "Скажи-ка, дядя, ведь недаром Москва," +
                "спаленная пожаром," + "Французу отдана?";
        List<String> strings = List.of(str.split(","));
        System.out.println("\n" + "Строка после сплитования: " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }
        List<String> stringsAfter = filterCapitalizedStrings(strings);
        System.out.println("\n" + "Строка после преобразования: " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }


    public static List<String> filterCapitalizedStrings(List<String> list) {
        return list.stream()
                .filter(s -> s.toString().length() > 10)
                .collect(Collectors.toList());
    }
}
