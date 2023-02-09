
public class Rectangle2 implements Shape2 {
		private double widht;
		private double length;
		
		public Rectangle2(double widht,double length) {
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
			return "Rectangle [width="+getWidht()+",length = "+ getLength()+",""]]";
		}

	}	

}
