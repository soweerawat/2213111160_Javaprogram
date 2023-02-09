
public class Student {
	// the private instance variables
	private String name;
	private String address;
	//the courses and grades for the courses are kept in 2 parallel arrays
	private String[] courses;
	private int[] grades;
	private int numCourses;
	private static final int MAX_COURSE = 30;
	
	/**Constructor a Student instance wiht the given input*/
	public Student(String name,String address) {
		this.name = name;
		this.address = address;
		courses = new String[MAX_COURSE];
		grades = new int [MAX_COURSE];
		numCourses = 0;
	}
	//the public getters and setters.
	//No setter for name as it is not desi
	public String getName() {
		return this.name = name;
	}
	public String getAddress() {
		return this.address = address;
		
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return getName()+"("+getAddress()+")";
	}
	public void addCourseGrade(String course,int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;
	}
	public void printGrade() {
		System.out.print(name);
		for(int i=0;i<numCourses;i++) {
			System.out.print(""+courses[i]+":"+grades[i]);
		}
		System.out.println();
	}
	/**Computes the average grade*/
	public double getAverageGrade() {
		int sum = 0;
		for(int i=0;i<numCourses;i++) {
			sum+=grades[i];
		}
		return (double)sum/numCourses;
	}
}
