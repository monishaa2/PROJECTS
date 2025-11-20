import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EventManager manager = new EventManager();

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        User user = new User(1, userName); 

        int choice;

        do {
            System.out.println("\n==== Event Booking System ====");
            System.out.println("1. View Events");
            System.out.println("2. Book Ticket");
            System.out.println("3. Check Booking Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manager.viewEvents();
                    break;
                case 2:
                    System.out.print("Enter Event ID to book: ");
                    int eventId = scanner.nextInt();
                    System.out.print("Enter number of tickets: ");
                    int tickets = scanner.nextInt();
                    manager.bookTicket(user, eventId, tickets);
                    break;
                case 3:
                    System.out.print("Enter your Booking ID: ");
                    int bookingId = scanner.nextInt();
                    manager.checkBookingStatus(bookingId);
                    break;
                case 4:
                    System.out.println("Thank you for using the Event Booking System.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
