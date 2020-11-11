package com.margieblair;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Process is an instance of a program/application
        //loading a music player is an instance of an application
        //your computer can handle multiple processes at one time
        //threads are within the process
        //each process has at least one thread called the main thread
        //threads are like a set of instructions
        //we can create many threads to run different tasks concurrrently
        //multi-threading is running many threads at the same time
        //most processors have many cores and each core can be used to run different threads
        //if your application doesn't use threads, youre essentially only using one of the processor cores
        System.out.println(Thread.activeCount()); //we're running two threads, the main thread upfront and the garbage collector in the background
        System.out.println(Runtime.getRuntime().availableProcessors()); //this is the total number of threads available
        //2 threads running
        //4 total threads available
        //how to safely share data between threads
        ThreadDemo.show();
    }
}
