public class Event {
    private int id;
    private String name;
    private String date;
    private int totalSeats;
    private int bookedSeats;

    public Event(int id, String name, String date, int totalSeats) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getAvailableSeats() {
        return totalSeats - bookedSeats;
    }

    public boolean bookSeats(int count) {
        if (count <= getAvailableSeats()) {
            bookedSeats += count;
            return true;
        }
        return false;
    }

    public void displayEvent() {
        System.out.println("Event ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("Available Seats: " + getAvailableSeats());
        System.out.println("---------------------------");
    }
}
