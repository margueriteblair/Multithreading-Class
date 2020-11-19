package bus.reservation.system;

public class TicketBookingThread extends Thread {

    private TicketCounter ticketCounter; //bc this references ticket counter, the number will automatically be 3 tickets to start
    private String passengerName;
    private int numOfSeatsToBook;

    public TicketBookingThread(TicketCounter ticketCounter, String passengerName, int numOfSeatsToBook) {
        this.ticketCounter = ticketCounter;
        this.passengerName = passengerName;
        this.numOfSeatsToBook = numOfSeatsToBook;
    }

    public void run() {
        ticketCounter.bookTicket(passengerName, numOfSeatsToBook);
    }
}
