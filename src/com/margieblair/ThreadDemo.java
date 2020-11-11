package com.margieblair;

import org.w3c.dom.ls.LSOutput;

public class ThreadDemo {
    //runnable interface represents a task to be run on a thread
    //runnable thread only has one method, run

    public static void show() {
        System.out.println(Thread.currentThread().getName());
        //each thread has a name and an id
//        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        System.out.println("File is ready to be scanned.");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
//        }

    }
}
