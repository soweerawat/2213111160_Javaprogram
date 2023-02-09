import java.util.*;
public class ShapeDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input radius : ");
		double radius = scan.nextDouble();
		System.out.println("Input height : ");
		double height = scan.nextDouble();
		
		Circle circle = new Circle(radius,null);
		System.out.println("Circle["+circle+"]");
		System.out.println("Circle[area="+circle.getArea()+"]");
		Cylinder cylinder = new Cylinder(radius,height);
		System.out.println();
		System.out.println("Cylinder["+cylinder+"]");
		System.out.println("Cylinder["+cylinder.getArea()+"]");
		System.out.println("Cylinder["+cylinder.getVolme()+"]");

	}

}
