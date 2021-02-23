	public class EvenAndOddNumbers{

		public static void main(String[] args){

			int evenNumber = 1;
			int oddNumber = 1;	  
			while (evenNumber <= 100)
			{
		if((evenNumber % 2) == 0)
			{
		
			System.out.println(" Even Numbers " + evenNumber);
			}
			
			System.out.println();
				evenNumber++;
			}
			while (oddNumber <= 100)
			{
			System.out.println();
		if((oddNumber % 2) == 1)
			{
			System.out.println(" Odd Numbers " + oddNumber);
			}
			oddNumber++;
			}
		}
		}