	import java.util.Scanner;	
		public class ConvertCelsiusToFahrenheit{

		public static void main(String[] args){

		Scanner collect = new Scanner(System.in);

		double celsius;
		

		System.out.print(" Enter a degree in Celsius: ");
		celsius = collect.nextDouble();
		double fahrenheit = 32 + celsius * 9/5;
		System.out.print(celsius);
		System.out.printf(" Celsius is %.2f", fahrenheit);
		System.out.print("  Fahrenheit");

	}
	}