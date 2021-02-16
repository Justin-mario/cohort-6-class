	import java.util.Scanner;
		public class AirConditionerTest
	{
		
		public static void main(String[] args)
	{
			Scanner input = new Scanner(System.in);
		
			//AirConditioner gozieAc;
			AirConditioner gozieAc = new AirConditioner();
		
			AirConditioner myAc;
			myAc = new AirConditioner();

			AirConditioner acStatus = new AirConditioner();
			

			//System.out.println("Product name:");
			String theName = "Samsung";
			gozieAc.setProductName(theName);
			System.out.printf("Product name is: %n%s%n", gozieAc.getProductName());
		
			//acStatus.setOn(true);
			//acStatus.isOn();
			System.out.printf("Status: " +acStatus.isOn());
			System.out.println();
				
			System.out.println("Set Temperature");
			int theTemp = input.nextInt();
			myAc.setTemperature(theTemp);
			System.out.println();
			System.out.printf("Temperature is: %n%d%n", myAc.getTemperature());
		
			System.out.println("Increase");
			int newTemp = input.nextInt();
			myAc.increaseTemperature(newTemp);
			System.out.println();
			System.out.printf("New temparature is: %n%d%n", myAc.getTemperature());

			System.out.println("decrease");
			int temp = input.nextInt();
			myAc.decreaseTemperature(temp);
			System.out.println();
		 	System.out.printf("New temperature is: %n%d%n", myAc.getTemperature());

		


		}
		}	