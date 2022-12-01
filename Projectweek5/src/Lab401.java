import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Full name: ");
		String fullName = scan.next();
		if(!fullName.contains(" ")) {
			System.out.print("Incorrect Name");                                                                                                                                                                                                                                                            
			
		}else {
			String fristName = fullName.substring(0,fullName.indexOf(' '));
			String lastName = fullName.substring(fullName.indexOf(' ')+1);
			System.out.println("First Name"+fristName.toUpperCase());
			System.out.println("Last Name"+lastName.toUpperCase());
			
		}
	
	}

}
