package laba9;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Заполнить HashMap 10 объектами <Integer, String>.
// Найти строки у которых ключ> 5.
// Если ключ = 0, вывести строки через запятую.
// Перемножить все ключи, где длина строки>5.
public class ex6 {
    public static void main(String[] args) {
        HashMap <Integer,String> firstMap = new HashMap<>();

        firstMap.put(0,"Ноль");
        firstMap.put(1,"Один");
        firstMap.put(2,"Два");
        firstMap.put(3,"Три");
        firstMap.put(4,"Четыре");
        firstMap.put(5,"Пять");
        firstMap.put(6,"Шесть");
        firstMap.put(7,"Семь");
        firstMap.put(8,"Восемь");
        firstMap.put(9,"Девять");
        firstMap.put(10,"Десять");

        Set<Integer> keys = firstMap.keySet();
        ArrayList<String> values = new ArrayList<>(firstMap.values());

        for (Integer key: keys){
            if (key > 5) {
                System.out.println(firstMap.get(key));
            } else if (key == 0) {
                String result = String.join(",",values);
                System.out.println(result);

            }
        }
        int dig = 1;
        for(Map.Entry<Integer,String> entry: firstMap.entrySet()){
            if(entry.getValue().length() > 5){
                dig = dig * entry.getKey();
            }
        }
        System.out.println(dig);
        }
    }


