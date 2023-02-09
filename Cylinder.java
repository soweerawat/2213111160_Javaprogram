
public class Cylinder extends Circle {
	private double height;
	
	public Cylinder(double radius,double height) {
		super(radius,null);
		this.height = height;
	}
	public double getHeight() {
		return this.height; 
	}
	public double getVolme() {
		return getArea()*(height);
	}
	public String toString() {
		return "height=["+getHeight()+","+super.toString()+"]";
	}

}
