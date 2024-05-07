package Laba12;
//Напишите функцию, которая находит максимальный элемент
// в массиве целых чисел при помощи многопоточности.
// Количество потоков должно быть равно количеству ядер процессора.


import java.util.Arrays;
import java.util.Random;

public class Ex5 {
    private static int workedThreads = 0;

    public static void main(String[] args) {
        final int ARRAY_LENGTH = 20;
        final int BOUND = 20;
        final int QUANTITY_THREADS = 10;
        MyThread[] myThreads = new MyThread[QUANTITY_THREADS];


        int[] myArray = new int[ARRAY_LENGTH];
        for (int i = 0; i < myArray.length; i++) {
            Random random = new Random();
            myArray[i] = random.nextInt(BOUND);
        }


        System.out.println(Arrays.toString(myArray));
        for (int i = 0; i < QUANTITY_THREADS; i++) {
            int startArray = i * (ARRAY_LENGTH / QUANTITY_THREADS);
            int endArray = (i + 1) * ARRAY_LENGTH / QUANTITY_THREADS - 1;
            MyThread myThread = new MyThread(myArray, startArray, endArray);
            myThreads[i] = myThread;
            myThread.start();
        }

        while (Ex5.getWorkedThreads() != QUANTITY_THREADS) {
        }

        System.out.println("наибольшее значение в массиве: " + biggestValue(myThreads));
    }


    public static int biggestValue(MyThread[] myThreads) {
        int biggestValue = 0;
        for (int i = 0; i < myThreads.length; i++) {
            if (biggestValue < myThreads[i].biggestValue) {
                biggestValue = myThreads[i].biggestValue;
            }
        }
        return biggestValue;
    }


    public static int getWorkedThreads() {
        return workedThreads;
    }

    synchronized public static int incWorkedThreads() {
        return Ex5.workedThreads = Ex5.workedThreads + 1;
    }
    public static class MyThread extends Thread {

        public int biggestValue;
        public int[] myArray;
        public int startArray;
        public int endArray;

        public MyThread(int[] myArray, int startArray, int endArray) {
            this.myArray = myArray;
            this.startArray = startArray;
            this.endArray = endArray;
        }

        private void biggestValue(int[] myArray, int startArray, int endArray) {
            biggestValue = myArray[startArray];
            for (int i = startArray; i <= endArray; i++) {
                if (biggestValue < myArray[i]) {
                    biggestValue = myArray[i];
                }
            }
        }

        @Override
        public void run() {
            biggestValue(myArray, startArray, endArray);
            Ex5.incWorkedThreads();
        }
    }

}

