package Example3;

public class User {
	private String name;
	private int password;
	private String city;
	
	

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
		
	}

	public void setPassword(int password) {
		// TODO Auto-generated method stub
		this.password=password;
	}

//	public void setCity(String city) {
//		// TODO Auto-generated method stub
//		this.city=city;
//	}
	
	public String toString() {
    	return "Student [name="+name+", password="+password+"]";
    }
	
	public User(String name,int password) {
		super();
		this.name=name;
		this.password=password;
		
	}
	
	public User() {
		super();
	}
	
	

	

}
