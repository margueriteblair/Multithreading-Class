package library.checkout.system;

import java.util.concurrent.atomic.AtomicInteger;

public class BookInventory {

    private AtomicInteger availableBooks = new AtomicInteger(10);

    //ways to prevent race conditions:
    //1. synchronized key word
    public synchronized void checkoutBook(String cardName, int numOfBooks) {
        if ((availableBooks.get() >= numOfBooks) && (numOfBooks > 0)) {
            System.out.println("Thanks, " + cardName + ", you've successfully checked out " + numOfBooks + " books.");
            availableBooks.set(availableBooks.get() - numOfBooks);
        } else {
            System.out.println("Unfortunately, those aren't all available");
        }
    }
}
