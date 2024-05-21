package laba13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//В программе, где требуется из матрицы вывести столбец с номером,
// заданным с клавиатуры, могут возникать ошибки в следующих случаях:
//–	ввод строки вместо числа;
//–	нет столбца с таким номером.
public class Ex3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите номер столбца от 0 до 4: ");
        int number = in.nextInt();
        int[][] array = new int[5][5];

            for (int i = 0; i < array.length; i++) {
               System.out.print(i);
                for (int j = 1; j < array.length; j++) {

                    System.out.print(j);
                   // break;
                    }
                System.out.println();
                }

             System.out.println();

        }

        }












