	import java.util.Scanner;
		public class TelevisionTest{
			public static void main(String[] args){

				Scanner set = new Scanner(System.in);

				Television myTelevision = new Television("Samsung");
				

				System.out.println(" " + myTelevision.getTelevisionName());
				System.out.println();
				myTelevision.setOn(true);
			        //myTelevision.isOn();
				System.out.println(" ON? " + myTelevision.isOn());
				System.out.println();
				
			
				int myChannel = 01;
				myTelevision.setTelevisionChannel(myChannel);
				System.out.println(" Channel: " + myTelevision.getTelevisionChannel());
				System.out.println();

				int myVolume = 25;
				myTelevision.setTelevisionVolume(myVolume);
				System.out.println(" Volume " + myTelevision.getTelevisionVolume());
				System.out.println();
		
				System.out.print(" Increase Volume++++");
				int newVolume = set.nextInt();
				if(newVolume < 100 && newVolume >=0)
				myTelevision.setTelevisionVolume(newVolume);
				System.out.println();
				System.out.println( " Current Volume" + myTelevision.getTelevisionVolume());
				System.out.println();

				System.out.print(" Decrease Volume---- ");
				int decreaseVolume = set.nextInt();
				if(decreaseVolume < newVolume && decreaseVolume >= 0 && decreaseVolume < newVolume){
				myTelevision.setTelevisionVolume(decreaseVolume);
				System.out.println();
				System.out.println(" Current Volume " + myTelevision.getTelevisionVolume());}
				
				else
				System.out.println();
				myTelevision.setTelevisionVolume(decreaseVolume);
				System.out.println("Current Volume " + myTelevision.getTelevisionVolume());
				System.out.println();				

				System.out.print(" Increase Channel ");
				int newChannel = set.nextInt();
				if(newChannel < 400 && newChannel >=0)
				myTelevision.setTelevisionChannel(newChannel);
				System.out.println();
				System.out.println( " Current Channel " + myTelevision.getTelevisionChannel());
				System.out.println();

				System.out.print(" Reduce Channel ");
				int reduceChannel = set.nextInt();
				if(reduceChannel >= 0)
				myTelevision.setTelevisionChannel(reduceChannel);
				System.out.println();
				System.out.println(" Current Channel " + myTelevision.getTelevisionChannel());
				

				


	}
	}