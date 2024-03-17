package inheritence; // Package declaration

import java.util.Scanner;

public class Bicycles extends Vehicle { // Class declaration, extending Vehicle class

    // Instance variables
    int frame_size, gear, no_seats;
    Scanner sc = new Scanner(System.in);

    // Constructor
    public Bicycles() {
        super(); // Call to superclass constructor
        System.out.println("Available Bicycles:");
        System.out.println("1. Folding");
        System.out.println("2. Hybrid");
        System.out.println("3. Cyclo-cross");
        
        System.out.println("Enter Model Name:");
        model_name = sc.nextLine(); // Read model name from user input
        model_name = model_name.toUpperCase(); // Convert model name to uppercase
        if (model_name.equals("FOLDING")) {
            frame_size = 24;
            gear = 9;
            rental_rate = 150;
        } else if (model_name.equals("HYBRID")) {
            frame_size = 21;
            gear = 8;
            rental_rate = 250;
        } else if (model_name.equals("CYCLO-CROSS")) {
            frame_size = 25;
            gear = 8;
            rental_rate = 300;
        } else {
            System.out.println("Please enter correct model name...Run again");
            System.exit(1); // Exit program if incorrect model name entered
        }
        
        // Set maximum seats and read duration of rent
        System.out.println("Maximum seats: 2");
        no_seats = 2;
        System.out.println("For how many days you want to rent bicycle (Max - 60 days): ");
        duration = sc.nextInt();
        if (duration > 60) {
            System.out.println("Sorry..You can rent bicycles only for 60 days maximum");
            System.exit(1); // Exit program if duration exceeds maximum limit
        }
    }

    // Method to display bicycle specifications
    public void specification() {
        System.out.println();
        System.out.println("Bicycle Specifications:");
        System.out.println("Seats: " + no_seats);
        System.out.println("Gears: " + gear);
        System.out.println("Frame Size: " + frame_size);
    }

    // Method to display rental details
    public void disp() {
        super.disp(); // Call superclass method to display rental details
        discount = 0;
        rent = duration * rental_rate;
        // Calculate discount based on duration of rent
        if (duration >= 10 && duration <= 29) {
            discount = rent * 0.10;
        } else if (duration >= 30 && duration <= 50) {
            discount = rent * 0.20;
        } else if (duration >= 51 && duration <= 60) {
            discount = rent * 0.35;
        } else {
            System.out.println("Discount is not applicable.");
            discount = 0;
        }
        final_rate = rent - discount; // Calculate final amount to be paid
        // Display rental details
        System.out.println("Duration of rent: " + duration);
        System.out.println("Actual rate per day: " + rental_rate);
        System.out.println("Calculated rate for " + duration + " days: " + rent);
        System.out.println("Discount applicable: " + discount);
        System.out.println("Final amount to be paid: " + final_rate);
    }

   
}
