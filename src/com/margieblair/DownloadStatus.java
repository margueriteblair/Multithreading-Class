package com.margieblair;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private volatile boolean isDone; //we're telling the JVM, hey this object is unstable, don't rely on the data that is already stored in the cache
    private LongAdder totalBytes = new LongAdder();
    private int totalFiles;
//    private Lock lock = new ReentrantLock(); //this is an implementation of the lock interface
//there are the wait() and notify() methods
    //these are available for all objects in java
    //it'll block the rest of the code until its data has been changed
    //should be wrapped in a try/catch block
    //adder classes are even faster than atomic types
    //if we have something that'll be updated frequently, we should use an adder class
    //LongAdder, DoubleAdder

    public int getTotalBytes() {
        return totalBytes.intValue(); //internally will call sum();
    }
    //sometimes we need to share a collection across many threads
    //runnable interface just takes run() method and returns void
    //no parameters
    //collection.addAll(Arrays.asList(1,2,3));

    public void incrementTotalBytes() {
           totalBytes.increment();
           //same as atomic classes, there are lots of built in classes
           //atomic ints have an incrementAndGet() and also a getAndIncrement()
        //the order about returning a value or incrementing first is what matters
        //++a vs a++
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