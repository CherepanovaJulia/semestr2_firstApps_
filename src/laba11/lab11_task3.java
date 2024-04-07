package laba11;
//Напишите функцию, которая принимает на вход список строк и возвращает новый список,
// содержащий только те строки, которые начинаются с большой буквы.

import org.etsi.uri.x01903.v13.SignerRoleType;
import org.jsoup.parser.CharacterReader;

import java.util.List;
import java.util.stream.Collectors;

public class lab11_task3 {
    public static void main(String[] args) {
        String str = "Скажи-ка, дядя, ведь недаром " +
                "Москва,спаленная пожаром, " + "Французу отдана?";
        List<String> strings = List.of(str.split(" "));
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
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}


