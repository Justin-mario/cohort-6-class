	//import java.util.Scanner;
		public class EmployeeTest{
		public static void main(String[] args){
		
	//Scanner input = new Scanner(System.in);

	Employee empFirst = new Employee("Chijioke", "Lasu", 19500.0, 0.0, 0.0);
	Employee empSecond = new Employee("Grace", "Igbekere", 15000.0, 0.0, 0.0);

	

	 System.out.printf(" Employee Name:  %s %s   #%.2f  #%.2f%n", empFirst.getFirstName(), empFirst.getSecondName(), empFirst.getYearSalary(), empFirst.getYearIncreament());
	
	 System.out.println();
	 System.out.printf(" Employee Name:  %s %s   #%.2f  #%2f%n", empSecond.getFirstName(), empSecond.getSecondName(), empSecond.getYearSalary(), empSecond.getYearIncreament());
	
	
	}
	}