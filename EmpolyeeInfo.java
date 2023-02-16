import java.util.Scanner;
import java.io.*;
public class EmpolyeeInfo {

	public static void main(String[] args)throws IOException {
		Scanner console = new Scanner(System.in);
		String choice;
		System.out.print("Input or Read data(from file)?: ");
		choice = console.next().toLowerCase();
		while(!choice.equals("insert")&&!choice.equals("read")) {
			System.out.print("Pleae text insert or read data?:" );
			choice = console.next().toLowerCase();
		}
		SaveandOpen file = new SaveandOpen();
		if(choice.equals("insert")) 
			file.insert();
		else {
			System.out.print("\nEnter department: ");
			String departmant = console.next();
			file.setDept(departmant);
			file.read();
		}

	}

}
