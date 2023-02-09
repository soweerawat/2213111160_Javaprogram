
public class Rectangle extends Shape {
	private double widht;
	private double length;
	
	public Rectangle(double widht,double length,String color) {
		super(color);
		this.widht = widht;
		this.length = length;
	}
	public double getWidht() {
		return this.widht ;
	}
	public double getLength() {
		return this.length;
	}
	public double getArea() {
		return getWidht()* getLength();
	}
	
	public String toString() {
		return "Rectangle [width="+getWidht()+",length = "+ getLength()+","+super.toString()+"]]";
	}

}
