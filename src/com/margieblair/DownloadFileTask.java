package com.margieblair;

public class DownloadFileTask implements Runnable{
    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }
    @Override
    public void run() {
        System.out.println("Downloading a file!" + Thread.currentThread().getName());


        for (var i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted()) {
                break;
            }
           status.incrementTotalBytes();
        }
        //threads sometimes need to access shared resources
        //if multiple threads access the same object and 1. of those threads modifies the object
        //there are a few issues that you can run into
        //1. multiple threads modifying the same data, the app can crash, this is a RACE CONDITION
        //2. one thread changes the shared data, but the other threads can register the same data
        //we see this issue in databases
        //we need a proper understanding of these conditions
        //thread-safe code is a must have
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
