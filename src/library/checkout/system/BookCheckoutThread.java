package library.checkout.system;

import bus.reservation.system.TicketCounter;

public class BookCheckoutThread extends Thread{
    private BookInventory bookInventory;
    private String checkoutName;
    private int numOfBooks;

    public BookCheckoutThread(BookInventory bookInventory, String checkoutName, int numOfBooks) {
        this.bookInventory = bookInventory;
        this.checkoutName = checkoutName;
        this.numOfBooks = numOfBooks;
    }

    public void run() {
        bookInventory.checkoutBook(checkoutName, numOfBooks);
    }
}
