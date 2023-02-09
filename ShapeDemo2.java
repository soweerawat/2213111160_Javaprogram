import java.util.*;
public class ShapeDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cylinder[] cy = new Cylinder[5];
		for(int i = 0;i<cy.length;i++) {
			System.out.println("Input radius & height : ");
			double radius = scan.nextDouble();
			double height = scan.nextDouble();
			cy[i] = new Cylinder(radius,height);
			
		}
		int i = 1;
		for(Cylinder Cylinder_cy:cy) {
			System.out.println("Cylinder"+i+",volume="+Cylinder_cy.getVolme());
			i++;
		}

	}

}
