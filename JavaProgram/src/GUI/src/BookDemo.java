import java.util.*;
public class BookDemo {
	static Scanner scan = new Scanner(System.in);
	static Book book = new Book();

	public static void main(String[] args) {
		System.out.println("Input book  title  : ");
		book.setTitle(scan.nextLine());
		System.out.println("Input book price   : ");
		book.setPrice(scan.nextFloat());
		System.out.println("Input publish year : ");
		book.setPublishyear(scan.nextInt());
		System.out.print("/n"+book);

	}

}
