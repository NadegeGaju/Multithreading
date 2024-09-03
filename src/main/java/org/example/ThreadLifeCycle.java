package org.example;

public class ThreadLifeCycle {
        public static void main(String[] args) throws InterruptedException {
            Thread thread = new Thread(() -> {
                System.out.println("Thread is running");
            });

            System.out.println("Thread state before start: " + thread.getState());
            thread.start();
            System.out.println("Thread state after start: " + thread.getState());

            thread.join(); // Wait for the thread to finish
            System.out.println("Thread state after completion: " + thread.getState());
        }

}
