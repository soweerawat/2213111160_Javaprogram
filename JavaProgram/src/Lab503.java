import javax.swing.*;

public class Lab503 {
	static int inputYear;

	public static void main(String[] args) {
		inputYear = Integer.parseInt(JOptionPane.showInputDialog("Input Year"));
		while ((inputYear < 1000 || inputYear > 3000)) {
			inputYear = Integer.parseInt(
					JOptionPane.showInputDialog("Please input year between 1000-3000" + "/nInput Year,again"));
			while (!checkYear(inputYear)) {
				inputYear = Integer.parseInt(JOptionPane.showInputDialog("Please input year between 1000"));
			}
			if (isLeapear(inputYear)) {
				JOptionPane.showMessageDialog(null, inputYear + "is Leap Year");
			} else {
				JOptionPane.showMessageDialog(null, inputYear + "is not Leap Year");
			}
		}
	}

	public static boolean checkYear(int year) {
		if (year >= 1000 && year <= 3000) {
			return true;
		} else {
			return false;

		}
	}

	public static boolean isLeapear(int year) {
			if((year%4==0)&&((year%100!=0)||(year%400==0))) {
				return true;
			}else {
				return false;

	}

}
}
