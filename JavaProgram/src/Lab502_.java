import javax.swing.*;

public class Lab502_ {
	static String email;
	
	public static void main(String[] args) {
	
		inputEmail();
	}
	public static void inputEmail() {
		String answer="";
		do {
			email = JOptionPane.showInputDialog("Input your e-mail");
			checkEmailError(email);
			answer = JOptionPane.showInputDialog("Continue[y||y to continue]");
		}while (answer.equalsIgnoreCase("y"));	
	}
	public static void checkEmailError(String[] args) {
		while(chkEmail.startsWith("@")||chkEmail.contains(" ")) {
			chkEmail = JOptionPane.showInputDialog("Input your e-mail,again : ");
			
		}
		chkEmail = chkEmail.toLowerCase(); 
		JOptionPane.showMessageDialog(null, checkEmail(chkEmail)? "your e-mail is "+ chkEmail : "Your e-mail is not hotmail or gmail dot com ");
		
	}
	publ
		boolean checkEmail = inputEmail.endsWith("@gmail.com"@)||inputEmail.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null,
				(checkEmail)
				?"Your e-mail is"+inputEmail
				:"Your e-mail is not hotmail or gmail dot com ");
	

}
