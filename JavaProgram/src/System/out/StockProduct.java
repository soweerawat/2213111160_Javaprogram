package System.out;
import java.util.*;
import java.text.DecimalFormat; 
public class StockProduct {
	static Scanner sc = new Scanner(System.in);
	static DecimalFormat fm = new DecimalFormat("#,###.00");
	static int total = 0;
	public static void main(String[] args) {
		Product[] productList = new Product[4];
		for(int i = 0 ; i<productList.length;i++) {
			productList[i] = new Product();
			System.out.print("Input product Id      : ");
			productList[i].setId(sc.next());
			
			System.out.print("Input product Unit    : ");
			productList[i].setUnit(sc.nextInt());
			while(productList[i].getUnit()<0) {
				System.out.print("Input product Unit, Again : ");
				productList[i].setUnit(sc.nextInt());
				
			}
			System.out.print("Input product Price   : ");
			productList[i].setUnit(sc.nextInt());
			while(productList[i].getPrice()<0) {
				System.out.print("Input product Price, Again : ");
				productList[i].setPrice(sc.nextDouble());
		    }
			System.out.println();

	
		}
		System.out.println("----------------------------------");
		for(Product _pd : productList) {
			System.out.println("product ID : "+_pd.getID()+"Total price = "+fm.format(_pd.calculate())+"Baht.");
		}
		System.out.println("----------------------------------");
		for(Product _total : productList) {
			total += _total.calculate();
		}
		System.out.print("Total price of all product is "+fm.format(total)+"Baht.");

}
}
