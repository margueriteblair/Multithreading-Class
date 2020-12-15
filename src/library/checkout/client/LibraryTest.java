package library.checkout.client;

import library.checkout.system.BookCheckoutThread;
import library.checkout.system.BookInventory;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {
    public static void main(String[] args) {
        BookInventory bookInventory = new BookInventory(); //doesn't take any args, but it'll provide us with a number of 10 books
        List<Thread> threadList = new ArrayList<>();
        BookCheckoutThread threadBook1 = new BookCheckoutThread(bookInventory, "Margie", 3);
        BookCheckoutThread threadBook2 = new BookCheckoutThread(bookInventory, "User 1", 2);
        BookCheckoutThread threadBook3 = new BookCheckoutThread(bookInventory, "User 2", 3);
        BookCheckoutThread threadBook4 = new BookCheckoutThread(bookInventory, "User 3", 1);
        BookCheckoutThread threadBook5 = new BookCheckoutThread(bookInventory, "User 4", 3);


        threadList.add(threadBook1);
        threadList.add(threadBook2);
        threadList.add(threadBook3);
        threadList.add(threadBook4);
        threadList.add(threadBook5);

        for (Thread thread: threadList) {
            thread.start();
        }

    }
}
