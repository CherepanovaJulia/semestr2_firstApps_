package Laba12;
//Напишите функцию, которая суммирует элементы в массиве целых чисел
// при помощи многопоточности.
// Количество потоков должно быть равно количеству ядер процессора.
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex6 {
    public static int array[];

    public static int sums[];

    public static void main(String[] args) {
        Random random = new Random();
       /// Scanner scanner = new Scanner(System.in);


        int numbersCount = 20;//scanner.nextInt();
        int threadsCount = 5;//scanner.nextInt();

        array = new int[numbersCount];
        sums = new int[threadsCount];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("массив случайных чисел:  " + Arrays.toString(array));

       /* long startTime = System.currentTimeMillis();

        int realSum = 0;

        for (int i = 0; i < array.length; i++) {
            realSum += array[i];
        }*/


       // System.out.println("Сумма через цикл - " + realSum);
       /// System.out.println("Время выполнения через цикл - " + time);


       // long startTime1 = System.currentTimeMillis();

        int numberOfElementsInOneThread = numbersCount / threadsCount;
        int startThread = 0;
        int endThread = numberOfElementsInOneThread - 1;
        int[] sums = new int[threadsCount];
        for (int i = 0; i < threadsCount; i++) {
            SumThread sumThread = new SumThread(startThread, endThread, array);
            sums[i] = sumThread.Sum();
            startThread += numberOfElementsInOneThread;
            endThread += numberOfElementsInOneThread;
        }

        int byThreadSum = 0;

        for (int i = 0; i < sums.length; i++) {
            byThreadSum += sums[i];

        }
       // long time1 = System.currentTimeMillis() - startTime1;

        System.out.println("Сумма через потоки - " + byThreadSum);
      //  System.out.println("Время выполнения через потоки - " + time1);
    }


    public static class SumThread extends Thread {
        private int from;
        private int to;
        private int[] sum;


        public SumThread(int from, int to, int[] sum) {

            this.from = from;
            this.to = to;
            this.sum = sum;
        }

        public int Sum() {
            int sum = 0;
            for (int j = this.from; j <= this.to; j++) {
                sum += this.sum[j];
            }
            return sum;
        }
    }
}


