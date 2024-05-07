package Laba12;

import java.util.concurrent.ExecutionException;

//Напишите программу, которая создает 10 потоков
// и каждый поток выводит на экран свой номер.
public class Ex4 {
    private static final Object lock = new Object();
    private static int number = 1;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            Thread OneThread = new Thread(() -> {
                synchronized (lock) {

                    if (number == 1) {
                        System.out.println(Thread.currentThread().getName() + ":"
                                + number);
                        number++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }

            });

            Thread TwoThread = new Thread(() -> {

                synchronized (lock) {

                    if (number == 2) {
                        System.out.println(Thread.currentThread().getName() + ":"
                                + number);
                        number++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            });

            Thread ThreeThread = new Thread(() -> {

                synchronized (lock) {

                    if (number == 3) {
                        System.out.println(Thread.currentThread().getName() + ":"
                                + number);
                        number++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            });

            Thread FourThread = new Thread(() -> {
                synchronized (lock) {

                    if (number == 4) {
                        System.out.println(Thread.currentThread().getName() + ":"
                                + number);
                        number++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }

            });

            Thread FiveThread = new Thread(() -> {
                synchronized (lock) {

                    if (number == 5) {
                        System.out.println(Thread.currentThread().getName() + ":"
                                + number);
                        number++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            });

            Thread SixThread = new Thread(() -> {
                synchronized (lock) {

                    if (number == 6) {
                        System.out.println(Thread.currentThread().getName() + ":"
                                + number);
                        number++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            });

            Thread SevenThread = new Thread(() -> {
                synchronized (lock) {

                    if (number == 7) {
                        System.out.println(Thread.currentThread().getName() + ":"
                                + number);
                        number++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            });

            Thread EightThread = new Thread(() -> {
                synchronized (lock) {

                    if (number == 8) {
                        System.out.println(Thread.currentThread().getName() + ":"
                                + number);
                        number++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            });

            Thread NineThread = new Thread(() -> {
                synchronized (lock) {

                    if (number == 9) {
                        System.out.println(Thread.currentThread().getName() + ":"
                                + number);
                        number++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            });


            Thread TenThread = new Thread(() -> {
                synchronized (lock) {

                    if (number == 10) {
                        System.out.println(Thread.currentThread().getName() + ":"
                                + number);
                        number++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            });


            OneThread.setName("One Thread");
            TwoThread.setName("Two Thread");
            ThreeThread.setName("Three Thread");
            FourThread.setName("Four  Thread");
            FiveThread.setName("Five Thread");
            SixThread.setName("Six Thread");
            SevenThread.setName("Seven Thread");
            EightThread.setName("Eight Thread");
            NineThread.setName("Eight Thread");
            TenThread.setName("Ten Thread");


            OneThread.start();
            TwoThread.start();
            ThreeThread.start();
            FourThread.start();
            FiveThread.start();
            SixThread.start();
            SevenThread.start();
            EightThread.start();
            NineThread.start();
            TenThread.start();


        }

    }
}

