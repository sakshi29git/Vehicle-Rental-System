package inheritence;

import java.util.Scanner;

public class Motorcycle extends Vehicle {
    Scanner sc = new Scanner(System.in);
    float displacement;
    int top_speed, no_seats;
    String engine;

    // Constructor to initialize motorcycle details
    public Motorcycle() {
        super(); // Call superclass constructor
        System.out.println("Available Motorcycles: ");
        System.out.println("1. Hero Pleasure");
        System.out.println("2. Honda XRM 125");
        System.out.println("3. Royal Enfield Hunter 350");
        System.out.println("Available fuel type: Petrol");
        fuel = "Petrol";

        System.out.println("Enter Model Name: ");
        model_name = sc.nextLine();
        model_name = model_name.toUpperCase();

        // Setting specifications based on the model name
        if (model_name.equals("HERO PLEASURE")) {
            displacement = 110.9f;
            engine = "8 bhp and a torque of 8.7 Nm";
            top_speed = 75;
            rental_rate = 250;
        } else if (model_name.equals("ROYAL ENFIELD HUNTER 350")) {
            displacement = 349.34f;
            engine = "Single cylinder, 4 stroke, SOHC Engine";
            top_speed = 114;
            rental_rate = 350;
        } else if (model_name.equals("HONDA XRM 125")) {
            displacement = 124.8f;
            engine = "4 - Stroke OHC Air Cooled";
            top_speed = 115;
            rental_rate = 350;
        } else {
            System.out.println("Please enter correct model name...Run again");
            System.exit(1);
        }

        System.out.println("Vehicle No (Including State & District no):");
        vehicle_id = sc.next();
        model_name = model_name.toUpperCase();
        System.out.println("Maximum seats: 2");
        no_seats = 2;
        System.out.println("For how many days you want to rent motorcycle (Max - 60 days): ");
        duration = sc.nextInt();
        if (duration > 60) {
            System.out.println("Sorry..You can rent motorcycle only for 60 days");
            System.exit(1);
        }
    }

    // Method to display motorcycle specifications
    public void specification() {
        System.out.println();
        System.out.println("Motorcycle Specifications: ");
        System.out.println();
        model_name = model_name.toLowerCase();
        System.out.println("Fuel: " + fuel);
        System.out.println("Seats: " + no_seats);
        System.out.println("Engine: " + engine);
        System.out.println("Top speed: " + top_speed + " kmph");
        System.out.println("Displacement: " + displacement + " cc");
    }

    // Method to display rental details and calculate charges
    public void disp() {
        super.disp(); // Call superclass method to display basic vehicle details
        discount = 0;
        rent = duration * rental_rate;
        if (duration >= 10 && duration <= 29) {
            discount = rent * 0.10;
        } else if (duration >= 30 && duration <= 50) {
            discount = rent * 0.20;
        } else if (duration >= 51 && duration <= 60) {
            discount = rent * 0.35;
        } else {
            System.out.println("Discount is not applicable.....");
            discount = 0;
        }
        final_rate = rent - discount;
        System.out.println("Duration of rent: " + duration);
        System.out.println("Actual rate per day: " + rental_rate);
        System.out.println("Calculated rate for " + duration + " days is: " + rent);
        System.out.println("Discount applicable: " + discount);
        System.out.println("Final amount to be paid: " + final_rate);
    }

   
}
