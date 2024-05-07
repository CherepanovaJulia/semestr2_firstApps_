package Laba12;
//Напишите программу, которая запускает два потока и выводит на экран их имена
// и текущее время в течение 10 секунд.

import java.time.LocalTime;
public class Ex1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": "
                        + LocalTime.now());
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": "
                        + LocalTime.now());
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        ;
        t2.start();

        t1.join();
        t2.join();
    }
}
