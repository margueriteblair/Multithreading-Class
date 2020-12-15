package library.checkout.client;

import library.checkout.system.BookCheckoutThread;
import library.checkout.system.BookInventory;

public class LibraryTest {
    public static void main(String[] args) throws InterruptedException {
        BookInventory bookInventory = new BookInventory(); //doesn't take any args, but it'll provide us with a number of 10 books
        BookCheckoutThread threadBook1 = new BookCheckoutThread(bookInventory, "Margie", 7);
        BookCheckoutThread threadBook2 = new BookCheckoutThread(bookInventory, "Hello world", 5);

        threadBook1.start();
        threadBook1.join();
        threadBook2.start();
    }
}
