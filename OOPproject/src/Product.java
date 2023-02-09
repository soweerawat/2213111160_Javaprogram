
public class Product {
	private int unit;
	
	public void setUnit(int unit) {
		 this.unit = unit;
	}
	public int getUnit() {
		
	}
	
	public int getTotalprice() {
		return getUnit();
	}
	public String toString() {
		return "You buy"+getUnit()+"unit("+getTotalprice()+")";
	}

}
