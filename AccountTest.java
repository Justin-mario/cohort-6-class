	import java.util.Scanner;
	
		public class AccountTest{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		Account newAccount = new Account("john", 50.00);
		
		
	System.out.printf("%s balance: %.2f%n", newAccount.getName(), newAccount.getBalance());	

	
	System.out.printf("Deposit:");
	double depositAmount = input.nextDouble();
	newAccount.deposit(depositAmount);
	System.out.printf("%s Account Balance: %.2f%n", newAccount.getName(), newAccount.getBalance());

	



	}
	}

		