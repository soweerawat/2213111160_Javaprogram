import java.util.Scanner;

public class AuthorDemo1 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Input author name : ");
		String name = scan.nextLine();
		System.out.println("Input author e-maqil : ");
		String email = scan.nextLine();
		System.out.println("Input author gender : ");
		char gender = scan.next().charAt(0);
		Author author = new Author(name,email,gender);
		System.out.println("\n"+author);
	
	}
}
