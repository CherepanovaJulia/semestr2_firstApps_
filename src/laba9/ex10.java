package laba9;
import java.util.*;

public class ex10 {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        SortedSet<Integer> sortedSet = new TreeSet<>();
        System.out.println("Время выполнения операции получения элемента arrayList = " + getRunningTime(arrayList));
        System.out.println("Время выполнения операции получения элемента arrayDeque = " + getRunningTime(arrayDeque));
        System.out.println("Время выполнения операции получения элемента sortedSet = " + getRunningTime(sortedSet));

    }

    private static long getRunningTime(List<Integer> list) {
        // точка начала отсчета времени выполнения программы

        // блок кода в котором выполняется операция добавления

        for (int i = 1; i < 5000000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 2000000; i < 2100000; i++) {
            list.get(i);
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTime(Deque<Integer> deque) {
        // точка начала отсчета времени выполнения программы

        // блок кода в котором выполняется операция добавления

        for (int i = 1; i < 5000000; i++) {
            deque.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            deque.getFirst();
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTime(SortedSet<Integer> set) {
        // точка начала отсчета времени выполнения программы

        // блок кода в котором выполняется операция добавления

       for (int i = 1; i < 5000000; i++) {
            set.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 5000000; i > 4990000; i--) {
            set.remove(i);
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }
}