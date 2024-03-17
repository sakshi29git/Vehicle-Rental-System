package inheritence;

import java.util.Scanner;

// Car class inherits from Vehicle class
public class Car extends Vehicle {
    int no_seats;
    Scanner sc = new Scanner(System.in);

    // Constructor
    public Car() {
        super(); // Call superclass constructor to initialize common properties

        // Display available car options
        System.out.println("Available Cars: ");
        System.out.println("1. Alto");
        System.out.println("2. Mahendra");
        System.out.println("3. Maruti");

        // Input model name
        System.out.println("Enter Model Name: ");
        model_name = sc.next();
        System.out.println("Vehicle No(Including State & District no):");
        vehicle_id = sc.next();
        model_name = model_name.toUpperCase(); // Convert model name to uppercase for comparison

        // Initialize rental rate based on model name
        if (model_name.equals("ALTO")) {
            System.out.println("Maximum seats: 7");
            System.out.println("Enter number of seats required:");
            no_seats = sc.nextInt();
            if (no_seats > 7) {
                System.out.println("Maximum seats are 7 only for Alto. Please enter correct seat numbers");
                System.exit(1);
            }
            rental_rate = 200;
        } else if (model_name.equals("MARUTI")) {
            System.out.println("Maximum seats: 5");
            System.out.println("Enter number of seats required:");
            no_seats = sc.nextInt();
            if (no_seats > 5) {
                System.out.println("Maximum seats are 5 only for Maruti. Please enter correct seat numbers");
                System.exit(1);
            }
            if (no_seats <= 0) {
                System.out.println("Please enter correct number");
                System.exit(1);
            }
            rental_rate = 400;
        } else if (model_name.equals("MAHENDRA")) {
            System.out.println("Maximum seats: 12");
            System.out.println("Enter number of seats required:");
            no_seats = sc.nextInt();
            if (no_seats > 12) {
                System.out.println("Maximum seats are 12 only for Mahendra. Please enter correct seat numbers");
                System.exit(1);
            }
            if (no_seats <= 0) {
                System.out.println("Please enter correct number. Please start again");
                System.exit(1);
            }
            rental_rate = 600;
        } else {
            System.out.println("Please enter correct model name");
            System.exit(1);
        }

        // Input fuel type
        System.out.println("Enter Type of Fuel(Petrol/Disel/CNG): ");
        fuel = sc.next().toUpperCase();
        // Validate fuel type
        if (!fuel.equals("PETROL") && !fuel.equals("DIESEL") && !fuel.equals("CNG")) {
            System.out.println("Please enter correct fuel");
            System.exit(1);
        }

        // Input rental duration
        System.out.println("For how many days you want to rent car(Max -100 days): ");
        duration = sc.nextInt();
        if (duration > 100) {
            System.out.println("Sorry. You can rent the car only for up to 100 days");
            System.exit(1);
        }
    }

    // Method to display car specifications
    public void specification() {
        System.out.println("Car Specifications: ");
        model_name = model_name.toLowerCase(); // Convert model name to lowercase for consistent formatting
        System.out.println("Model Name: " + model_name);
        System.out.println("Car model number: " + vehicle_id);
        System.out.println("Fuel: " + fuel);
        System.out.println("Number of seats: " + no_seats);
    }

    // Method to display rental details
    public void disp() {
        super.disp(); // Call superclass method to display common rental details
        discount = 0;
        rent = duration * rental_rate;
        // Calculate discount based on rental duration
        if (duration >= 10 && duration <= 30) {
            discount = rent * 0.10;
        } else if (duration >= 31 && duration <= 50) {
            discount = rent * 0.20;
        } else if (duration >= 51 && duration <= 100) {
            discount = rent * 0.35;
        } else {
            System.out.println("Discount is not applicable");
        }
        final_rate = rent - discount;

        // Display rental details
        System.out.println("Duration of rent: " + duration);
        System.out.println("Actual rate per day: " + rental_rate);
        System.out.println("Calculated rate for " + duration + " days: " + rent);
        System.out.println("Discount applicable: " + discount);
        System.out.println("Final amount to be paid: " + final_rate);
    }

   
}
