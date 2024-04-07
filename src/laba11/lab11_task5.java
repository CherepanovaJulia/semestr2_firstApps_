package laba11;

import java.util.List;
import java.util.stream.Collectors;

//Напишите функцию, которая принимает на вход список
// строк и возвращает новый список, содержащий только те строки,
// которые содержат заданную подстроку
public class lab11_task5 {
    public static void main(String[] args) {
        String str = "Жили-были три китайца: Як, Як-цедрак, Як-цедрак-цедрак-цедрони " +
                "Жили-были три китайки: Цыпа, Цыпа-дрыпа, Цыпа-дрыпа-дрымпампони "
                + "Все они переженились: " + "Як на Цыпе, Як-цедрак на Цыпе-дрыпе," +
                "Як-цедрак-цедрак-цедрони на Цыпе-дрыпе-дрымпампони";
        List<String> strings = List.of(str.split(":"));
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
                .filter(s -> s.contains("три"))
                .collect(Collectors.toList());
    }
}


/*Жили-были три китайца: Як, Як-цедрак, Як-цедрак-цедрак-цедрони.
Жили-были три китайки: Цыпа, Цыпа-дрыпа, Цыпа-дрыпа-дрымпампони.
Все они переженились: Як на Цыпе, Як-цедрак на Цыпе-дрыпе,
Як-цедрак-цедрак-цедрони на Цыпе-дрыпе-дрымпампони.*/