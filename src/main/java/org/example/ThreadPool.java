package org.example;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {


        public static void main(String[] args) {
            ExecutorService executorService = Executors.newFixedThreadPool(3);

            for (int i = 1; i <= 5; i++) {
                int taskId = i;
                executorService.execute(() -> {
                    System.out.println("Executing task " + taskId + " by " + Thread.currentThread().getName());
                });
            }

            executorService.shutdown();
        }
}
