package com.margieblair;

public class CheckoutBookTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Currently checking out a book " + Thread.currentThread().getName());
    }
    //would each thread checkout a different book? flesh out?
    //we need to talk about how different threads do work on the same data source in an efficient manner
    //perhaps an arraylist of the library's current books?
}
