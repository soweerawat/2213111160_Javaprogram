import java.util.*;
public class Lab402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = scan.next();
		while(!sentence.endsWith(".")) {
			System.out.print("The sentence must end wiht full stop  point : ");
			sentence = scan.next();
		}
		System.out.println();
		int space =0;
		for(int i =0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ')
			System.out.print(sentence.substring(space,i));
			space = i+1;
		}
		System.out.print(sentence.substring(space));

	}

}
