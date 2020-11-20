package library.checkout.system;

public class BookInventory {

    private int availableBooks = 10;

    public synchronized void checkoutBook(String cardName, int numOfBooks) {
        if ((availableBooks >= numOfBooks) && (numOfBooks > 0)) {
            System.out.println("Thanks, " + cardName + ", you've successfully checked out " + numOfBooks + " books.");
            availableBooks = availableBooks - numOfBooks;
        } else {
            System.out.println("Unfortunately, those aren't all available");
        }
    }
}
