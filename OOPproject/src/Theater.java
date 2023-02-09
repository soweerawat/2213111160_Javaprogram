
public class Theater extends Movie  {
private int TheaterNo;
	
	public Theater(String id,String name,Director director,int TheaterNo) {
		super(id,name,director);
		this.TheaterNo = TheaterNo;
	}
	public Theater() {
		super();
		this.TheaterNo = 0;
		
	}
	public String getTheaterName() {
		if(TheaterNo >=1 && TheaterNo <=11) {
			return "Basic Theater";
		}
		else if(TheaterNo >=12 && TheaterNo <=14) {
		    return "Sweet Theater";
		}
		else if(TheaterNo ==15) {
		    return "Sweet Theater";
		}
		else {
			return "";
		}
		
	}
	public String toString() {
		return getTheaterName()+":"+super.toString();
		
	}
	

}
