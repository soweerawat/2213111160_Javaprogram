
public abstract  class Shap {
	private String color;
	
	public Shap(String color) {
		this.color = color;
	}
	public Shap() {
		color = null;
	}
	//abstract method
	public abstract double getArea();
	
	//return String in from "
	public String toString() {
		return "color = "+this.color;
	}

}
