package laba9;
//Для примера 5 дополнительно
// вывести в консоль последовательность обхода дерева рекурсивных вызовов.
public class ex1_5_1 {
    public static void main(String[] args) {
        System.out.println(fib(8));
    }
    public static int fib(int n) {
        System.out.println(n);
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }
}


