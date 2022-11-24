import java.util.*;
import java.text.*;
public class SalespersonSalary {
	static final double COMMISSION_RATE = 0.15;
	static final int SENTINEL = -1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sales; 
		double salary;
		DecimalFormat fmr = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		do
		{
			System.out.print("Enter sales in dollars (or -1 to end): ");
			sales = scan.nextInt();
			if (sales != SENTINEL )
			{
				System.out.println("Bye");
			}
			else {
				salary =(sales*COMMISSION_RATE)+1000;
				System.out.println("salary is : $"+fmr.format(salary));
				System.out.println();}
				
			}while (sales == SENTINEL);
		
	}
	
}
