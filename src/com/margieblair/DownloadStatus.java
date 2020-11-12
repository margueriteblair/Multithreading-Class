package com.margieblair;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalBytes;
    private Lock lock = new ReentrantLock(); //this is an implementation of the lock interface


    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {

        lock.lock();
        try {
            totalBytes++;
        } finally {
            lock.unlock();
            //make sure to unlock this lock inside a finally block
            //still gets to 10000 bytes
        }

    }
}
