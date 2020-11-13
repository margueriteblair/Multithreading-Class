package com.margieblair;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> libraryBooks = new ArrayList<>();
        libraryBooks.add(new Book("A Clockwork Orange", "Anthony Burgess", true));
        libraryBooks.add(new Book("The Jungle", "Upton Sinclair", true));
        libraryBooks.add(new Book("I don't read", "Margie Blair", false));


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


    //thread safety in our java code is very important
    //there are multiple strategies for thread-safe code
    //1. don't share data across objects-this makes it easier to avoid data overlap in the first place, no race conditions
    //2.using immutable objects,
    //3.synchronization, not recommended, but basically you time when certain threads can access a data object, its easy for this to get tricky
    //4. atomic objects
    //5. java partitioning

}
