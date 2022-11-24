import javax.swing.*;

public class Lab302 {

	public static void main(String[] args) {
	
		float ipw = Integer.parseInt(JOptionPane.showInputDialog("Input Weight:"));
		int iph =  Integer.parseInt(JOptionPane.showInputDialog("Input Height:"));
		float bmi = (ipw/iph)*(ipw/iph);
		do {
			JOptionPane.showMessageDialog(null, "BMI"+bmi);
		} while(bmi==18.5);
			if(bmi<18.5) {
				
				JOptionPane.showMessageDialog(null,"Underweight");
		}
			if(bmi>=18.5){
				JOptionPane.showMessageDialog(null,"Normal-weight");
			}
			if(bmi>=25.0) {
				JOptionPane.showMessageDialog(null,"Overweight");
			}
			 else if(bmi<=30.0) {
				 JOptionPane.showMessageDialog(null,"Obesity");
			 }
		
		
		
		

}
}
