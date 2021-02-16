	import java.util.Scanner;
		public class GuessGame{
			public static void main(String[] args){
			Scanner input = new Scanner(System.in);

			int ans = 100;
			int guess;

			System.out.print("Guess!");
			guess = input.nextInt();

			if(ans == guess)
			System.out.print("You are right!");

			if(ans > guess)
			System.out.print("Less! Retry");

			if(ans < guess)
			System.out.print("High! Retry");

	}
	}