package laba13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//В программе, вычисляющей среднее значение среди положительных элементов
// одномерного массива (тип элементов int), вводимого с клавиатуры,
// могут возникать ошибки в следующих случаях:
//–	ввод строки вместо числа;
//–	несоответствие числового типа данных;
//–	положительные элементы отсутствуют.
public class Ex2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
      try{  int size = in.nextInt();
        int[] array = new int[size];

        int sum = 0;
        double middleValue = 0;

        for (int i = 0; i < size; i++) {
            Random random = new Random();
            array[i] = random.nextInt(10);
            if (i >= 0) {
                sum += array[i];
            }
            middleValue = sum / size;
        }

                System.out.println("Массив: " + Arrays.toString(array));
                System.out.println("Сумма: " + sum);
                System.out.println("Среднее: " + middleValue);
            } catch (Exception e) {
               e.printStackTrace();
          System.out.println("Введите целое число ");
      }
    }
}

