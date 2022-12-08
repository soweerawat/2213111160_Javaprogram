import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Full name: ");
		String fullName = scan.nextLine();
		int n = fullName.trim().indexOf(" ");
		if(n==-1) {
			                                                                                                                                                                                                                                                            
			System.out.print("Incorrect Name");
			
		}else {
			System.out.println("First Name : "+fullName.substring(0,n).toUpperCase());
			System.out.println("Last Name : "+fullName.substring(n+1).toLowerCase());
		}
	
	}

}
