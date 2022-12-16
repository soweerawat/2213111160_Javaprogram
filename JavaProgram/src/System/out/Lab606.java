package System.out;
import javax.swing.JOptionPane;

public class Lab606 {
	static int number[] = { 25, 78, 41, 22, 36, 85,37};
	public static void main(String[] args) {
		int _index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array: "));
		 checkIndex(number,_index);
	 while(!checkIndex(number,_index)) {
	 _index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array,again: "));
	 }
	JOptionPane.showMessageDialog(null,"Current data,nums["+_index+"] is "
	 +currentData(number,_index)+
	 ((_index!=0) ? "\nPrevious data,nums["+(_index-1)+"] is "
	 +prevData(number,_index) : "\nNo previous data ")+
	 ((_index!=6) ? "\nNext data,nums["+(_index+1)+"] is "
	 +nextData(number,_index) : "\nNo next data "));
	
		
	
	}  
	public static boolean checkIndex(int[] nums,int index) {
		return (index>=0 && index<=6) ? true : false ;
	}
	public static int currentData(int[] nums,int index) {
		return nums[index];
	}
	public static int prevData(int[] nums,int index) {
		return nums[index-1];
	}
	public static int nextData(int[] nums,int index) {
		return nums[index+1];
	}
			
}
	


