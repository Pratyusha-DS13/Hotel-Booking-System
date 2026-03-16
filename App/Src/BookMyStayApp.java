/**
 * The BookMyStayApp class serves as the entry point for the Hotel Booking System.
     * It demonstrates object modeling through inheritance, abstraction, and polymorphism.
     *
     * @author Pratyusha
     * @version 2.0
     */
public class BookMyStayApp {

    // --- Abstract Room Class ---
    /**
     * Abstract base class representing a general Room.
        * Defines common attributes and behaviors shared by all room types.
        */
    static abstract class Room {
               private String title;
               private int numberOfBeds;
               private double price;
               private double size;

           public Room(String title, int numberOfBeds, double price, double size) {
                          this.title = title;
                          this.numberOfBeds = numberOfBeds;
                          this.price = price;
                          this.size = size;
           }

           public String getTitle() { return title; }
               public int getNumberOfBeds() { return numberOfBeds; }
               public double getPrice() { return price; }
               public double getSize() { return size; }

           public abstract void displayDetails();
    }

    // --- Concrete Room Classes ---
    static class SingleRoom extends Room {
               public SingleRoom() {
                              super("Single Room", 1, 100.0, 200.0);
               }

           @Override
               public void displayDetails() {
                              System.out.println("--- " + getTitle() + " ---");
                              System.out.println("Beds: " + getNumberOfBeds());
                              System.out.println("Price: $" + getPrice() + " per night");
                              System.out.println("Size: " + getSize() + " sq.ft.");
               }
    }

    static class DoubleRoom extends Room {
               public DoubleRoom() {
                              super("Double Room", 2, 150.0, 300.0);
               }

           @Override
               public void displayDetails() {
                              System.out.println("--- " + getTitle() + " ---");
                              System.out.println("Beds: " + getNumberOfBeds());
                              System.out.println("Price: $" + getPrice() + " per night");
                              System.out.println("Size: " + getSize() + " sq.ft.");
               }
    }

    static class SuiteRoom extends Room {
               public SuiteRoom() {
                              super("Suite Room", 2, 350.0, 600.0);
               }

           @Override
               public void displayDetails() {
                              System.out.println("--- " + getTitle() + " ---");
                              System.out.println("Beds: " + getNumberOfBeds() + " (King Size) + Living Area");
                              System.out.println("Price: $" + getPrice() + " per night");
                              System.out.println("Size: " + getSize() + " sq.ft.");
               }
    }

    // --- Static Availability Variables ---
    private static int singleRoomAvailability = 5;
       private static int doubleRoomAvailability = 3;
       private static int suiteRoomAvailability = 2;

    /**
     * The main method is the entry point of the application.
        *
        * @param args command-line arguments (not used)
        */
    public static void main(String[] args) {
               System.out.println("===============================================");
               System.out.println(" Welcome to BookMyStay - Hotel Booking System!");
               System.out.println("===============================================");
               System.out.println("Application Name: BookMyStay");
               System.out.println("Version: v2.0\n");

           // Polymorphism: Using the abstract Room type to reference concrete objects
           Room singleRoom = new SingleRoom();
               Room doubleRoom = new DoubleRoom();
               Room suiteRoom = new SuiteRoom();

           singleRoom.displayDetails();
               System.out.println("Available Rooms: " + singleRoomAvailability + "\n");

           doubleRoom.displayDetails();
               System.out.println("Available Rooms: " + doubleRoomAvailability + "\n");

           suiteRoom.displayDetails();
               System.out.println("Available Rooms: " + suiteRoomAvailability + "\n");

           System.out.println("===============================================");
    }
}
