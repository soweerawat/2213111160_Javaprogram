import javax.swing.JOptionPane;
public class ShapeDemo3 {

	public static void main(String[] args) {
		Cylinder[] cy1 = new Cylinder[5];
		for(int i = 0;i<cy1.length;i++) {
			String[] result = (JOptionPane.showInputDialog("Input radius & height : ")).split(" ");
			System.out.println("Input radius & height : ");
			double radius = Double.parseDouble(result[0]);
			double height = Double.parseDouble(result[1]);
			cy1[i] = new Cylinder(radius,height);
			
		}
		int i = 1;
		String result="";
		for(Cylinder Cylinder_cy1:cy1) {
			result += "Cylinder"+1+",volume"+Cylinder_cy1.getVolme()+"\n";
			i++;
			
		}
		JOptionPane.showMessageDialog(null, result);


	}

}
