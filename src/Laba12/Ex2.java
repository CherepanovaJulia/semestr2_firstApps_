package Laba12;
//Напишите программу, которая запускает поток и выводит
// на экран числа от 1 до 10 с задержкой в 1 секунду между выводами.
public class Ex2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        t.join();

    }

}

