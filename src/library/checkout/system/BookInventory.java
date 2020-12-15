package library.checkout.system;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

public class BookInventory {

    private int availableBooks = 10;
    private LongAdder txCounter = new LongAdder();

    public void checkoutBook(String cardName, int numOfBooks) {

        if ((availableBooks >= numOfBooks) && (numOfBooks > 0)) {
            txCounter.increment();
            System.out.println("Thanks, " + cardName + ", you've successfully checked out " + numOfBooks + " books.");
            System.out.println("The library has had a total of " + txCounter + " checkouts today!");
            availableBooks = (availableBooks - numOfBooks);
        } else {
            System.out.println("Unfortunately, those aren't all available");
        }
    }
}
