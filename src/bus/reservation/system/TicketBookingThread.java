package bus.reservation.system;

public class TicketBookingThread extends Thread {

    private TicketCounter ticketCounter;
    private String passengerName;
    private int numOfSeatsToBook;

    public TicketBookingThread(TicketCounter ticketCounter, String passengerName, int numOfSeatsToBook) {
        this.ticketCounter = ticketCounter;
        this.passengerName = passengerName;
        this.numOfSeatsToBook = numOfSeatsToBook;
    }
}
