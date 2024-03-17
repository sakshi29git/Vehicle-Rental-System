package inheritence; // importing package of project
import java.util.Scanner;

public class Management_vehicle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		Vehicle ob=null; // creating object of class Vehicle and initialized as null
		do {
			//User menu to perform different operations
			System.out.println("Welcome to Vehicle renting system: \n Please enter following choice(Any One)");
			System.out.println("1. Car Renting");
			System.out.println("2. Motorcycle Renting");
			System.out.println("3. Bicycle Renting");
			System.out.println("4.Exit");
			System.out.print("Enter your choice:");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1://car renting system
				System.out.println("Welcome to Car renting system:");
				System.out.println("please enter following options: ");
				System.out.println("1.Add Car  \n2. Car Specification  \n3.Rent Details");
				choice=sc.nextInt();
				switch(choice) {
				
					case 1://Adding car details
						System.out.println("Please add required information:");
						ob=new Car();
						break;
					case 2://display specification
						if(ob instanceof Car)
						{
							((Car) ob).specification();
						}
						else {
							System.out.println("Please enter details first");
						}
						break;
					case 3://Display renting details
						if(ob instanceof Car)
						{
							((Car) ob).disp();						
						}
						else {
							System.out.println("Please enter details first");
						}
						break;
					default:
						System.out.println("Wrong option");
						break;			
					}
				
			break;
			
			
			case 2://Morcycle renting system
				System.out.println("Welcome to Motorcycle renting system:");
				System.out.println("please enter following options: ");
				System.out.println("1.Add Bike  \n2. Bike Specification  \n3.Rent Details");
				choice=sc.nextInt();
				switch(choice) {
				
					case 1://for motorcycle details
						System.out.println("Please add required information:");
						ob=new Motorcycle();
						break;
					case 2://to display motorcycle specification
						if(ob instanceof Motorcycle)
						{
							((Motorcycle) ob).specification();
						}
						else {
							System.out.println("Please enter details first");
						}
						break;
					case 3: //to display motorcycle renting information
						if(ob instanceof Motorcycle)
						{
							((Motorcycle) ob).disp();
						}
						else {
							System.out.println("Please enter details first");
						}
						break;
					default:
						System.out.println("Wrong option");
						break;			
					}
				
			break;
			
			
			case 3: //Adding bicycles information
				System.out.println("Welcome to Bicycle renting system:");
				System.out.println("please enter following options: ");
				System.out.println("1.Add Bicycle  \n2. Bicycle Specification  \n3.Rent Details");
				choice=sc.nextInt();
				switch(choice) {
				
					case 1://for bicycles details
						System.out.println("Please add required information:");
						ob=new Bicycles();
						break;
					case 2: // display bicycle specification
						if(ob instanceof Bicycles)
						{
							((Bicycles) ob).specification();
						}
						else {
							System.out.println("Please enter details first");
						}
						break;
					case 3://display bicycle renting information
						if(ob instanceof Bicycles)
						{
							((Bicycles) ob).disp();
						}
						else {
							System.out.println("Please enter details first");
						}
						break;
					default:
						System.out.println("Wrong option");
						break;			
					}
				
			break;
			
			case 4: // to exit from system
				System.out.println("Exiting...");
				break;
				
			default:
				System.out.println("Wrong choice");
				break;
			
			
			
			
			}
			
		}while(choice!=4);
	}

}
