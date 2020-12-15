package library.checkout.system;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

public class BookInventory {

//    private int availableBooks = 10;
    private LongAdder checkedOutBooks = new LongAdder();

    public void checkoutBook(String cardName, int numOfBooks) {

        if ((10 >= numOfBooks) && (numOfBooks > 0)) {
            System.out.println("Thanks, " + cardName + ", you've successfully checked out " + numOfBooks + " books.");
            checkedOutBooks.increment();
            System.out.println("Total checked out books is: " + checkedOutBooks);
        } else {
            System.out.println("Unfortunately, those aren't all available");
        }
    }
}
