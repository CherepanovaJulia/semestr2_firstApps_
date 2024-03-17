package laba9;
//Создать приложение с использованием рекурсии для перевода целого числа,
// введенного с клавиатуры, в двоичную систему счисления

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        recursion(x);
      }
      public static void recursion (int x){
        if (x != 0) {
            int n = x % 2;
            System.out.print(n);
            recursion(x = x / 2);
        }
      }
}
