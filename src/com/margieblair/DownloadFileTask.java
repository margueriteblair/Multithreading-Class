package com.margieblair;

public class DownloadFileTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Downloading a file!" + Thread.currentThread().getName());

        try {
            Thread.sleep(5000); //this will suspend the current thread for 5 seconds
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }
        //JVM has a virtual scheduler
        System.out.println("Download Complete" + Thread.currentThread().getName());
    }
}
