package org.example;

public class ThreadCreation {
        public static void main(String[] args) {
            // Using Runnable
            Runnable task1 = () -> {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Runnable Task - " + i);
                }
            };

            // by using thread
            Thread thread1 = new Thread(task1);
            thread1.start();

            //by thread class
            Thread thread2 = new CustomThread();
            thread2.start();
        }
    }

    class CustomThread extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread Class Task - " + i);
            }
        }
}
