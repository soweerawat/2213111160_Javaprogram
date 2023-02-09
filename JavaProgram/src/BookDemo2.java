import javax.swing.JOptionPane;

import System.out.Author1;
import System.out.Book01;
public class BookDemo2 {

	public static void main(String[] args) {
		String name =JOptionPane.showInputDialog("Input author name:");
		String email =JOptionPane.showInputDialog("Input author e-mail:");
		String title =JOptionPane.showInputDialog("Input book title:");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page:"));
		int confim = JOptionPane.showConfirmDialog(null,"is the page correct?","comfim",0);
		
		Book01 book = new Book01(title,new ,page);
		while(confim ==1) {
			page = Integer.parseInt(JOptionPane.showInputDialog("Input book page,agin :"));
			confim =  JOptionPane.showConfirmDialog(null,"is the page correct?","comfim",0);
		}
		
		
		
		 JOptionPane.showMessageDialog(null,"Book Title:"+book.getTitle()+
				 								"\nAuthor name:"+book.getAuthor().getName()+
				 								" ("+book.getPage()+")"+
				 								"\nAuthor e-mail: "+book.getAuthor().getEmail());
	}

}