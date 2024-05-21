package laba13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

//Задание 3
//В программе, вычисляющей сумму элементов типа byte одномерного массива, вводимого с клавиатуры,
// могут возникать ошибки в следующих случаях:
//–	ввод строки вместо числа;
//–	ввод или вычисление значения за границами диапазона типа.
public class Ex4_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
       // int size = in.nextInt();
       try {
           byte size = in.nextByte();

        byte [] array = new byte[size];
       // int [] array = new int[size];

        int sum = 0;
      //  double middleValue = 0;
           for (int i = 0; i < size; i++) {
               Random random = new Random();
               array[i] = (byte) random.nextInt(10);

               if (i >= 0) {
                   sum += array[i];
               }
               System.out.println("Массив: " + Arrays.toString(array));
               System.out.println("Сумма: " + sum);
           }
          //  middleValue = sum / size;
        } catch (Exception e) {
           e.printStackTrace();
           System.out.println("Введите размер массива в диапазоне от -128 до 127:");
       }
       }


      //  System.out.println("Среднее: " + middleValue);
    }


