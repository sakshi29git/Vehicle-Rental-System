package inheritence;
import java.util.Scanner;
public class Vehicle {
	double rental_rate,final_rate,rent,discount;
	int duration;
	
	String vehicle_id,model_name,fuel;
	
	Vehicle()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Vehicle Details:");
		
	}
	
	public void disp()
	{
		System.out.println();
		System.out.println("Rent Details: \n");
		System.out.println("Name of Vehicle: " + model_name);
		System.out.println("Vehicle No: " + vehicle_id);
	}
	

}
