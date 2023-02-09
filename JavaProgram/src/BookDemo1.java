import java.util.*;

public class BookDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Intput  author name : ");
		String name = scan.nextLine();
		System.out.print("Intput  author e-mail : ");
		String email = scan.next();

		Author1 auth = new Author1(name, email);
		System.out.println(auth);

		System.out.println();
		System.out.println("Input book title : ");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.println("Input book page : ");
		int page = scan.nextInt();

		Book01 book01 = new Book01(title, auth, page);
		System.out.println(book01);
	}

}
