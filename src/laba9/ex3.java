package laba9;

//Создать приложение, позволяющее ввести и вывести одномерный массив целых чисел.
// Для ввода и вывода массива разработать рекурсивные методы вместо циклов for.

public class ex3 {
    public static void main(String[] args) {
        massiv(0);


    }

    public static int massiv(int i) {

        if (i < 10) {
            //return i;
            System.out.println(i);
            massiv(i + 1);

        }
        return i;
    }
}



