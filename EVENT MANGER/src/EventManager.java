import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<Event> events = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();

    public EventManager() {
        
        events.add(new Event(1, "Music Concert", "2025-06-01", 100));
        events.add(new Event(2, "Tech Conference", "2025-07-15", 50));
        events.add(new Event(3, "Art Exhibition", "2025-08-10", 30));
    }

    public void viewEvents() {
        for (Event event : events) {
            event.displayEvent();
        }
    }

    public Event findEventById(int id) {
        for (Event event : events) {
            if (event.getId() == id) {
                return event;
            }
        }
        return null;
    }

    public Booking bookTicket(User user, int eventId, int ticketCount) {
        Event event = findEventById(eventId);
        if (event == null) {
            System.out.println("Event not found.");
            return null;
        }

        if (event.bookSeats(ticketCount)) {
            Booking booking = new Booking(user, event, ticketCount);
            bookings.add(booking);
            System.out.println("Booking successful! Your Booking ID is: " + booking.getBookingId());
            return booking;
        } else {
            System.out.println("Not enough seats available.");
            return null;
        }
    }

    public void checkBookingStatus(int bookingId) {
        for (Booking booking : bookings) {
            if (booking.getBookingId() == bookingId) {
                booking.displayBooking();
                return;
            }
        }
        System.out.println("Booking not found.");
    }
}
