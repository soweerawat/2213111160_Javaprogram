import java.io.*;
import java.util.*;
public class Example_1202 {
	static Scanner input = new Scanner(System.in);


	public static void main(String[] args)throws IOException {
		System.out.print("Input Section: ");
		int Section = input.nextInt();
		Header(Section);
		showListStudent(Section);
		
	}
	public static void showListStudent(int sec)throws IOException{
		BufferedReader read = new BufferedReader(new FileReader("List107.txt"));
		String temp = "";
		while ((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");
			double mistermScore = Double.parseDouble(data[4]);
			double finalSccore = Double.parseDouble(data[5]);
			String gradeResult = fileReader(mistermScore,finalSccore);
			if(Integer.parseInt(data[3])==sec) {
				System.out.println(data[0]+" "+data[2]+"\t"+
						mistermScore+"\t"+finalSccore +"\t"+gradeResult);
			}
		}
		read.close();
	}
	private static String fileReader(double mistermScore, double finalSccore) {
		// TODO Auto-generated method stub
		return null;
	}
	public static String fileResult(double mid,double fin) {
		double totalScore = mid+fin;
		if(totalScore<=40)return "Fail";
		else return "Pass";
	}
	public static void Header(int sec) {
		System.out.println("*****************************************************");
		System.out.println("\t\tList of Data for Section " + sec);
		System.out.println("*****************************************************");

}
}
