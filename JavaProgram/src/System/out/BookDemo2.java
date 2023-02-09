package System.out;
import javax.swing.*;
public class BookDemo2 {

	public static void main(String[] args) {
		String name =JOptionPane.showInputDialog("Input author name:");
		String email =JOptionPane.showInputDialog("Input author e-mail:");
		Author1 auth = new Author1(name,email);
		String title =JOptionPane.showInputDialog("Input book title:");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book title:"));
		int confim = JOptionPane.showConfirmDialog(null,"is the page correct?","comfim",0);
		while(confim ==1) {
			page = Integer.parseInt(JOptionPane.showInputDialog("Input book page,agin :"));
			confim =  JOptionPane.showConfirmDialog(null,"is the page correct?","comfim",0);
		}
		Book01 book = new Book01(title,auth,page);
		 JOptionPane.showConfirmDialog(null,"Book Title:"+book.getTitle()+"\nAuthor name:"+book.getAnthor()+" ("+book.getPage+")"+"\nAuthor e-mail: "+book.getAuthor().getEmail());
	}

}
