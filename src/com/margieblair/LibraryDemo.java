package com.margieblair;

public class LibraryDemo {

    public static void show() {
        //this is where we'll put more specifics to actually run it
        //then within the main class, LibraryDemo.show()
        //should make a book object?

        //runnable interface

        //talk about thread-safecode
        //joining threads
        //starting threads
        //idk help

        var status = new CheckoutStatus();
        var thread = new Thread(new CheckoutBookTask());


    }
}
