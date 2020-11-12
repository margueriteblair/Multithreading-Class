package com.margieblair;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    //runnable interface represents a task to be run on a thread
    //runnable thread only has one method, run

    public static void show() {
        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();

        for (var i = 0; i < 10; i++) {
            var task = new DownloadFileTask();
            tasks.add(task);
            var thread = new Thread(task);
            thread.start();
            threads.add(thread);
            //we can't call thread.join() because it's a blocking method
        }

        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        var totalBytes = tasks.stream().map(t -> t.getStatus().getTotalBytes()).reduce(0, (a, b) -> (a+b));
        System.out.println(totalBytes);
        //this will not actually return the 10,000 bytes we wanted it to because this is a race condition in action
//        System.out.println(Thread.currentThread().getName());
        //each thread has a name and an id
//        for (int i = 0; i < 10; i++) {
//            Thread thread = new Thread(new DownloadFileTask());
//            thread.start();
//            try {
//                thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                ex.printStackTrace();
//            }
//
//            thread.interrupt();

//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException ex) {
//                ex.printStackTrace();
//            }
//        }

    }
}
