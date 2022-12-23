import java.util.Scanner;
import System.out.Product;

public class CheckStockProduct {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("How many product list in stock : ");
		int num = sc.nextInt();
		Product[] productList = new Product[num];
		System.out.println();
		for (int i = 0; i < productList.length; i++) {
			productList[i] = new Product();
			System.out.print("Input product Id     : ");
			productList[i].setId(sc.next());  

			System.out.print("Input product Unit   : ");
			productList[i].setUnit(sc.nextInt());
			System.out.println();
		}
		System.out.println("--------------------------------------------");
		System.out.println("List of product in 'LOW' status.");
		System.out.println("--------------------------------------------");
		for(Product pd : productList) {
			if(pd.status(pd.getUnit()).equalsIgnoreCase("LOW")) {
				System.out.println(">> "+pd.getID()+" has "+pd.getUnit()+" units");
			}
		}
		System.out.println("--------------------------------------------");
		System.out.println("List of product in 'NORMAL' status.");
		System.out.println("--------------------------------------------");
		for(Product pd : productList) {
			if(pd.status(pd.getUnit()).equalsIgnoreCase("NORMAL")) {
				System.out.println(">> "+pd.getID()+" has "+pd.getUnit()+" units");
			}
		}
		System.out.println("--------------------------------------------");
		System.out.println("List of product in 'HIGH' status.");
		System.out.println("--------------------------------------------");
		for(Product pd : productList) {
			if(pd.status(pd.getUnit()).equalsIgnoreCase("HIGH")) {
				System.out.println(">> "+pd.getID()+" has "+pd.getUnit()+" units");
			}
		}
	}
}
