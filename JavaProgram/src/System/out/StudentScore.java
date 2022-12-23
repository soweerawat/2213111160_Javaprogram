package System.out;
import java.util.*;
public class StudentScore {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("How many student in classt : ");
		int num = sc.nextInt();
		Student[]std = new Student[num];
		System.out.println();
		for(int i = 0 ; i<std.length ; i++) {
			System.out.println("INPUT INFOPMATION OF STUDENT"+(i+1));
			System.out.println("----------------------------------");
			std[i] = new Student();
			System.out.println("Input Student Name : ");
			std[i].setScore(sc.nextInt());
			while(!std[i].checkScore()) {
				System.out.print("Input Student Score, agin : ");
				std[i].setScore(sc.nextInt());
			}
			System.out.println();
			
			
		}
		System.out.println();
		System.out.println("LIST OF PASS STUDENT (>=50) ");
		System.out.println("----------------------------------");
		for(Student _std : std) {
			if(_std.isPass()) {
				System.out.println(">> "+_std.getName()+"get grade"+_std.fingGrade(_std.getScore())+"");
			}
		}
		
}
}