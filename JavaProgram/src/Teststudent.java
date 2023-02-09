
public class Teststudent {

	public static void main(String[] args) {
		//test Constructor and toString()
		Student jirapat = new Student("Jirapat Anantasiri","1 Happay Ave");
		System.out.println(jirapat);
		
		
		//
		jirapat.setAddress("25 Pattanakarn");
		System.out.println(jirapat);
		System.out.println(jirapat.getName());
		System.out.println(jirapat.getAddress());
		
		//
		jirapat.addCourseGrade("INT107",25);
		jirapat.addCourseGrade("INT108",79);
		jirapat.addCourseGrade("MSC202",69);
		jirapat.printGrade();
		
		System.out.printf("The average grade is  %.2f%n",jirapat.getAverageGrade());
		
		
	

	}

}
