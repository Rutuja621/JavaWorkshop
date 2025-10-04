package ExampleDemo;

public class Student {
	private String name;
	private int rollNo;
	private String city;
	private int contact;

	public String getName() {
		return name;
	}


	public String setName(String name) {
		this.name = name;
		return name;
	}


	public int getRollNo() {
		return rollNo;
	}


	public int setRollNo(int rollNo) {
		this.rollNo = rollNo;
		return rollNo;
	}


	public String getCity() {
		return city;
	}


	public String setCity(String city) {
		this.city = city;
		return city;
	}
	
	public int getContact() {
		return contact;
	}
	
	public int setContact(int contact) {
		this.contact = contact;
		return contact;
	}
    public String toString() {
    	return "Student [name="+name+", rollNo="+rollNo+", city= "+city+"]";
    }
	


	

}



