package System.out;
import java.util.*;
public class Lab602 {
	static Scanner scan = new Scanner(System.in);
	static int sum =0;
	static double averageNumber = 0;
	public static void main(String[] args) {
		double[] inputScore = new double[5];
		for(int i=0;i< inputScore.length;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			inputScore[i] = scan.nextDouble();
			sum += inputScore[i];
		}
		
		System.out.println();
		averageNumber = sum/(inputScore.length);
		System.out.println("Average of "+ inputScore.length+" student is "+averageNumber);
		for(int i=0;i< inputScore.length;i++) {
			System.out.println("Student "+(i+1)+("inputScore[i]+"));
		}

	}

}
