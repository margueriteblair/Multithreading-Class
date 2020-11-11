package com.margieblair;

import org.w3c.dom.ls.LSOutput;

public class ThreadDemo {
    //runnable interface represents a task to be run on a thread
    //runnable thread only has one method, run

    public static void show() {
        System.out.println(Thread.currentThread().getName());
        //each thread has a name and an id
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }

    }
}
