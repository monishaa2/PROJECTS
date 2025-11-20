public class Booking {
    private static int bookingCounter = 1000;
    private int bookingId;
    private User user;
    private Event event;
    private int numberOfTickets;

    public Booking(User user, Event event, int numberOfTickets) {
        this.bookingId = bookingCounter++;
        this.user = user;
        this.event = event;
        this.numberOfTickets = numberOfTickets;
    }

    public int getBookingId() {
        return bookingId;
    }

    public User getUser() {
        return user;
    }

    public Event getEvent() {
        return event;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void displayBooking() {
        System.out.println("Booking ID: " + bookingId);
        System.out.println("User: " + user.getName());
        System.out.println("Event: " + event.getName());
        System.out.println("Tickets Booked: " + numberOfTickets);
        System.out.println("---------------------------");
    }
}
