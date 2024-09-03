package org.example;

public class ThreadSynchronization {
        private int counter = 0;

        public static void main(String[] args) {
            ThreadSynchronization example = new ThreadSynchronization();
            example.doWork();
        }

        public synchronized void increment() {
            counter++;
        }

        public void doWork() {
            Thread t1 = new Thread(this::work);
            Thread t2 = new Thread(this::work);

            t1.start();
            t2.start();

            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Final Counter: " + counter);
        }

        public void work() {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        }
}
