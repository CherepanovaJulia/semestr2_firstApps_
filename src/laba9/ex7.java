package laba9;

import java.util.ArrayList;
import java.util.LinkedList;

//В кругу стоят N человек, пронумерованных от 1 до N.
// При ведении счета по кругу вычеркивается каждый второй человек,
// пока не останется один. Составить две программы, моделирующие процесс.
// Одна из программ должна использовать класс ArrayList,
// а вторая — LinkedList.Какая из двух программ работает быстрее? Почему?
public class ex7 {
    public static void main(String[] args) {
        int n = 10000;
        ArrayList<Integer> num = new ArrayList<>();
        for(int i = 1;  i <= n; i++){
            num.add(i);
        }
        //System.out.println(num);

        long arrayStart = System.currentTimeMillis();
        while(num.size() > 1){
            num.remove(1);
        }
        long arrayStop = System.currentTimeMillis();
        long arrTime = arrayStop - arrayStart;
        //System.out.println(num);

        LinkedList<Integer> linkNum = new LinkedList<Integer>();
        for(int i = 1; i <= n; i++){
            linkNum.add(i);
        }
        //System.out.println(linkNum);

        long linkStart = System.currentTimeMillis();
        while(linkNum.size() > 1){
            linkNum.remove(1);
        }
        long linkStop = System.currentTimeMillis();
        long linkTime = linkStop - linkStart;
        //System.out.println(linkNum);

        System.out.println("ArrayList Time = " + arrTime);
        System.out.println("LinkedList Time = " + linkTime);
    }
}
//Программа с использованием LinkedList  работает быстрее
// ( в данном случае, в 5 раз),
// т.к. при удалении записи/значения из LinkedList мы не перезаписываем
// весь массив данных (как в ArrayList), а меняем ссылку в предыдущем
// элементе на следующий.
