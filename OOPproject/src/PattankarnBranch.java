
public class PattankarnBranch extends Product {
	
	public int payUnit() {
		return super.getUnit()/2;
	}
	private int freeUnit() {
		return super.getUnit()-this.payUnit();
	}
	public int getTotolprice() {
		return this.payUnit()*100;
	}
	public String toString() {
		return "You buy "+this.payUnit()+" units,get free "+this.freeUnit()+
				"umits ("+this.getTotalprice()+")";
	}

}
