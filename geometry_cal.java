import java.util.Scanner;

public class geometry_cal {

	public static void main(String[] args) {

		Scanner bread = new Scanner (System.in);
		System.out.print("Please enter you're name: ");
		String Name;
		Name = bread.nextLine();
		
		System.out.println("\n\nHello, " + Name + ", welcome to geometry_cal!");
		System.out.println("Press enter to continue..");
		bread.nextLine();
		System.out.println("AREA OF A TRIANGLE");
		System.out.print("Please enter the measureof the base:	");
	
		String baseStr  = bread.nextLine();
		System.out.print("\nPlease enter the messure of the height:	");
		String heightStr = bread.nextLine();
		
		double base; 
		base = Double.parseDouble(baseStr);
		
		double height = Double.parseDouble(heightStr);
		
		System.out.print("Please enter the unit of messure:	");
		String unit = bread.nextLine();
		
		double area = .5*(base*height);
		
		System.out.println("The area of the triangle is " + area + " " + unit + "^2");
		
		
		
		
		
		
		
	}

}