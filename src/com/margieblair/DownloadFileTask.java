package com.margieblair;

public class DownloadFileTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Downloading a file!" + Thread.currentThread().getName());


        for (var i = 0; i < Integer.MAX_VALUE; i++) {
            if (Thread.currentThread().isInterrupted()) {
                break;
            }
            System.out.println("Downloading byte" + i);
        }
//        try {
//            Thread.sleep(5000); //this will suspend the current thread for 5 seconds
//        } catch(InterruptedException ex) {
//            ex.printStackTrace();
//        }
        //JVM has a virtual scheduler
        //if you have more tasks than available threads, the built in thread scheduler
        //will decide which threads to give to what amount of CPU time
        System.out.println("Download Complete" + Thread.currentThread().getName());
    }
}
