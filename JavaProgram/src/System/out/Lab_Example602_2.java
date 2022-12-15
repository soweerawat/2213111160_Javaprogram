package System.out;
import javax.swing.*;
public class Lab_Example602_2 {
	static String[] deptName = {"Accounting","HR","Sales","Innovation"};
	static boolean deptwasFrond = false;

	public static void main(String[] args) {
		String dept = JOptionPane.showInputDialog("Enter item number to order");
		for(int i=0;i<deptName.length;i++) {
			if(dept.equalsIgnoreCase(deptName[i])) {
				deptwasFrond = true;
			}
		}
		if(deptwasFrond) {
			JOptionPane.showMessageDialog(null,dept + " was ford in the list");
			JOptionPane.showMessageDialog(null,dept + " was not ford in the list");
		}

	}
}
