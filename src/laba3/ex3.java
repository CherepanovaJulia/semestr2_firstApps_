package laba3;
//Напишите программу, которая выводит последовательность чисел Фибоначчи.
// Первые два числа в этой последовательности равны 1,
// а каждое следующее число равно сумме двух предыдущих
// (получается по-следовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее).
// Количество чисел в последовательности вводится пользователем.
// Предложите версии программы, использующие разные операторы цикла
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел Фибоначчи");

        Scanner in = new Scanner(System.in);

        int x = in.nextInt(); // кол-во чисел
        int a = 0;
        int b = 1;
        int fib = b;

        for (int i = 0; i < x; i++) {
            System.out.println(fib);
            fib = a + b;
            a = b;
            b = fib;
            //System.out.println(fib);
        }

    }
}
















