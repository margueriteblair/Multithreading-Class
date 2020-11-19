package bus.reservation.system;

public class TicketCounter {

    private int availableSeats = 3;

    public void bookTicket(String pname, int numberOfSeats) {
        if ((availableSeats >= numberOfSeats) && (numberOfSeats > 0)) {
            System.out.println("Hi, " + pname + " : " + numberOfSeats + "successfully booked");
            availableSeats = availableSeats - numberOfSeats;
        } else {
            System.out.println("Apologies, seats not available");
        }
    }
}
