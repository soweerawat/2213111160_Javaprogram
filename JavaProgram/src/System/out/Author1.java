package System.out;


public class Author1 {
	private String name;
	private String email;
	
	public Author1(String name,String aemail) {
		//this(null,null);
		this.name = name;
		this.email = email;
	}
	public Author1() {
		this(null,null);
		
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String toString() {
		return getName()+"("+getEmail()+")";
	}

}

