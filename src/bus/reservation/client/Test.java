package bus.reservation.client;


import bus.reservation.system.TicketBookingThread;
import bus.reservation.system.TicketCounter;

public class Test {
    public static void main(String[] args) {
        TicketCounter ticketCounter = new TicketCounter(); //doesn't take any args
        TicketBookingThread t1 = new TicketBookingThread(ticketCounter, "Margie", 2);
        TicketBookingThread t2 = new TicketBookingThread(ticketCounter, "Hello World", 2);
        //both margie and hello world want 2 tickets, but there's only 3!
        t1.start();
        t2.start();
        //they share they same reference

    }
}
