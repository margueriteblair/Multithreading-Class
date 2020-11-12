package com.margieblair;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private boolean isDone;
    private int totalBytes;
    private int totalFiles;
//    private Lock lock = new ReentrantLock(); //this is an implementation of the lock interface


    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        synchronized (this) {
            totalBytes++;
        }
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }



//        lock.lock();
//        try {
//            totalBytes++;
//        } finally {
//            lock.unlock();
//            //make sure to unlock this lock inside a finally block
//            //still gets to 10000 bytes
//        }

    public synchronized void incrementTotalFiles() {
        //using the this keyword is bad practice bc it can cause unnecessary waits
        totalFiles++;

    }

}