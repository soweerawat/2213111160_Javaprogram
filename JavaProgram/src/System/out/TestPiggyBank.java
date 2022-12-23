package System.out;
import java.util.*;
public class TestPiggyBank {
	static Scanner scn = new Scanner(System.in);
	static PiggyBank  pg = new PiggyBank ();

	public static void main(String[] args) {
		sizeOfPiggyBank();

	}
	public static void sizeOfPiggyBank() {
		System.out.print("Money Total : "+pg.getTotal());
		System.out.print("Please define size of PiggyBank : ");
		pg.setPiggyBank(scn.nextInt());
		System.out.print("Size of your PiggyBank : "+pg.getPiggyBank());
		inputCoin();
	}
	public static void inputCoin() {
		while(true) {
			System.out.print("==================================");
			System.out.print("Menu of PiggyBank");
			System.out.print("==================================");
			System.out.print("[1] one baht.");
			System.out.print("[2] two baht.");
			System.out.print("[3] five baht.");
			System.out.print("[4] ten baht.");
			System.out.print("[5] Exit");
			System.out.print("==================================");
			
			System.out.print("Please select choice : ");
			int choice = scn.nextInt();
			
			if(choice ==1) {
				System.out.print("Insert 1 baht :");
				pg.addOne(scn.nextInt());
				System.out.print("Money Total : "+pg.getTotal());
			}
			else if (choice == 2) {
				System.out.print("Insert 2 baht :");
				pg.addTwo(scn.nextInt());
				System.out.print("Money Total : "+pg.getTotal());
			}
			else if (choice == 3) {
				System.out.print("Insert 5 baht :");
				pg.addTwo(scn.nextInt());
				System.out.print("Money Total : "+pg.getTotal());
			}
			else if (choice == 4) {
				System.out.print("Insert 1 baht :");
				pg.addTwo(scn.nextInt());
				System.out.print("Money Total : "+pg.getTotal());
			}
			else if (choice == 5) {
				System.out.print("Bye Bye");
				break;
			}
		}
	}


}
