		import java.lang.Math;
		import java.util.*;
		public class QuadraticEquation{
			public static void main(String[] args){

			Scanner collect = new Scanner(System.in);
			
			double a, b, c, d, e, x1, x2;
			
			System.out.println("Input Operands a b c  ");
			a = collect.nextDouble();

			b = collect.nextDouble();

			c = collect.nextDouble();
			
			d = Math.sqrt((b * b) - (4 * a *c)); 
			
			x1 = (-b + d) / (2 * a);
			x2 = (-b - d) / (2 * a);
		
		System.out.println();
		System.out.println(" X1  " + x1 + " X2  " + x2);

			}
		}