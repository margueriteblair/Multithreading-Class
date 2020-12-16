package InClassDemo.client;

import InClassDemo.system.BookCheckoutThread;
import InClassDemo.system.BookInventory;

import java.util.ArrayList;
import java.util.List;


public class LibraryTest {
    public static void main(String[] args) throws InterruptedException {
        BookInventory bookInventory = new BookInventory(); //doesn't take arguments, but does provide 10 book val
        BookCheckoutThread thread1 = new BookCheckoutThread(bookInventory, "Margie", 3);
        BookCheckoutThread thread2 = new BookCheckoutThread(bookInventory, "Arniel", 2);
        BookCheckoutThread thread3 = new BookCheckoutThread(bookInventory, "Scott", 3);
        BookCheckoutThread thread4 = new BookCheckoutThread(bookInventory, "Gabe", 1);
        BookCheckoutThread thread5 = new BookCheckoutThread(bookInventory, "Cliff", 3);

        List<Thread> threadList = new ArrayList<>();
        threadList.addAll(List.of(thread1, thread2, thread3, thread4, thread5));

        for (Thread thread: threadList) {
            thread.start();
        }


    }
}
