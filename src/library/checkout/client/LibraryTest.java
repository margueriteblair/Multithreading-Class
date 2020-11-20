package library.checkout.client;

import bus.reservation.system.TicketCounter;
import com.margieblair.Book;
import library.checkout.system.BookCheckoutThread;
import library.checkout.system.BookInventory;

public class LibraryTest {
    public static void main(String[] args) {
        BookInventory bookInventory = new BookInventory();
        BookCheckoutThread threadBook1 = new BookCheckoutThread(bookInventory, "Margie", 7);
        BookCheckoutThread threadBook2 = new BookCheckoutThread(bookInventory, "Hello world", 15);

        threadBook1.start();
        threadBook2.start();
    }
}
