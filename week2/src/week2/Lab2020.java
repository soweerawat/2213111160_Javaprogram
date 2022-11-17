package week2;
import java.util.*;
public class Lab2020 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the number of minutes : ");
		int numberof = scan.nextInt();
		System.out.println(numberof+"minutes is approximately  "+numberof/525600+"year and"+ (numberof%525600)/1440 + "day" );

	}

}
