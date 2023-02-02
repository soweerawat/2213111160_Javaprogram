import javax.swing.JOptionPane;

public class Shop100Baht {

	public static void main(String[] args) {
		Product arnupsb = new Product();
		
		int button = JOptionPane.showConfirmDialog(null, "Pattanakrn?");
		
		if(button==0) {
			arnupsb = new  PattankarnBranch();
		}
		
		arnupsb.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the nuber of product")));
		JOptionPane.showMessageDialog(null, arnupsb);
		

	}

}
