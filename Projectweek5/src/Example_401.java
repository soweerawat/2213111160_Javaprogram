import java.util.*;

public class Example_401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String inputWrod="";
		String txtWord="";
		while(true) {
			System.out.print("Enter word : ");
			inputWrod = scan.next();
			if(inputWrod.equalsIgnoreCase("stop")) {
				break;
			}
			txtWord = txtWord+inputWrod+"";
		}
		System.out.print(txtWord.toUpperCase());

	}

}
