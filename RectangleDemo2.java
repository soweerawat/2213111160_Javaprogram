import java.util.*;
public class RectangleDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter width");
		double width = scan.nextDouble();
		System.out.println("Enter length");
		double length = scan.nextDouble();
		
		
		Rectangle2 rec = new Rectangle2(width,length);
		System.out.print(rec);
		System.out.println("Area of  Rectangle is "+rec.getArea());
			
		

	}

}
