package lesson12;

import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        Thread myRunnable = new Thread(new MyRunnable());
//        Thread myThread = new MyThread();
//
////        myRunnable.run();
//        myRunnable.start();
//        try {
//            myRunnable.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        myThread.start();
//        myThread.interrupt();


//        try {
//            Thread.sleep(5000);
//            System.out.println("Hello!");
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//        myRunnable.setDaemon(true);
//        if (myRunnable.isDaemon()) {
//            System.out.println(myRunnable.getName() + " is Daemon");
//        }
//
//        new ThreadExample();
//        new ThreadExample();
//        new ThreadExample();
//        new ThreadExample();

//        Executors.newFixedThreadPool(100);
//        ForkJoinPool forkJoinPool = new ForkJoinPool();
    }
}
