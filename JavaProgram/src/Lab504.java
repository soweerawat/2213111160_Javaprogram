import java.util.*;

public class Lab504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name, separted by a space.");
		System.out.print(":");
		String fullname = scan.nextLine();
		int space = fullname.indexOf(' ');
		String firstName = fullname.substring(0, space);
		System.out.println(addreviatName(fullname)+firstName);

	}
	public static String addreviatName(String fullname) {
		String wordName = "";
		for(int i =0;i<fullname.length();i++) {
			if(fullname.charAt(i)==' ') {
				wordName = ((wordName + fullname.charAt(i+1)).toUpperCase() );
				wordName = wordName +'.';
				
			}
		}
		return  wordName ;
	}

}
