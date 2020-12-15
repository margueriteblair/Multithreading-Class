package library.checkout.system;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BookInventory {

    private int availableBooks = 10;
    private Lock lock = new ReentrantLock();

    public void checkoutBook(String cardName, int numOfBooks) {
        lock.lock();
        try {
            if ((availableBooks >= numOfBooks) && (numOfBooks > 0)) {
                System.out.println("Thanks, " + cardName + ", you've successfully checked out " + numOfBooks + " books.");
                availableBooks = (availableBooks - numOfBooks);
            } else {
                System.out.println("Unfortunately, those aren't all available");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
