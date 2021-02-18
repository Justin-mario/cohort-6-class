	import java.util.Scanner;
	public class Compute{
		public static void main(String[] args){
		
		Scanner collect = new Scanner(System.in);

		double radius;
		double length;
		

		System.out.print(" Enter the radius and lenght of a cylinder:");
		
			radius = collect.nextDouble();
			length = collect.nextDouble();
		
		double area = radius * radius * 3.142; 
		double volume = area * length;
		System.out.printf(" The area is %.2f", area);
		System.out.printf(" The volume is %.2f", volume);
	}
	}

		