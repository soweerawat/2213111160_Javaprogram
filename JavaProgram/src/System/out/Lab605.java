package System.out;
import javax.swing.JOptionPane;

public class Lab605 {
	public static void main(String[] args) {
	    int number[] = new int[5];
		for(int i=0; i<number.length;i++) {
			number[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+":"));
		}
	    showEven(number);
	    showOdd(number);
	}
	public static void showEven(int[] nums) {
		String listOfeven ="";
		for(int _nums : nums) {
			if(_nums%2==0) {
				listOfeven = listOfeven+_nums+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number:\n"+listOfeven);
	}
	public static void showOdd(int[] nums) {
		String listOfodd ="";
		for(int _nums : nums) {
			if(_nums%2!=0) {
				listOfodd = listOfodd+_nums+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number:\n"+listOfodd);
		
	}
	
}

