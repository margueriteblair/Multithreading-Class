package InClassDemo.system;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BookInventory {
    private volatile int availableBooks = 10;

    public void checkoutBook(String name, int numOfBooks) {
            if ((availableBooks >= numOfBooks) && numOfBooks > 0) {
                System.out.println("Thanks, " + name + ", you've successfully checked out " + numOfBooks + " books!");
                availableBooks -= numOfBooks;
                System.out.println("Current inventory: " + availableBooks);
            } else {
                System.out.println("Unfortunately, we cannot fulfill this request");
            }


    }
}

//synchronized:
//    public synchronized void checkoutBook(String name, int numOfBooks) {
//        System.out.println("Current inventory: " + availableBooks);
//        if ((availableBooks >= numOfBooks) && numOfBooks > 0) {
//            System.out.println("Thanks, " + name + ", you've successfully checked out " + numOfBooks + " books!");
//            availableBooks -= numOfBooks;
//        } else {
//            System.out.println("Unfortunately, we cannot fulfill this request");
//        }

//locked method:
//public void checkoutBook(String name, int numOfBooks) {
//    lock.lock();
//    try {
//        System.out.println("Current inventory: " + availableBooks);
//        if ((availableBooks >= numOfBooks) && numOfBooks > 0) {
//            System.out.println("Thanks, " + name + ", you've successfully checked out " + numOfBooks + " books!");
//            availableBooks -= numOfBooks;
//        } else {
//            System.out.println("Unfortunately, we cannot fulfill this request");
//        }
//    } finally {
//        lock.unlock();
//    }
