package tostring;
//if there is having no parent class for Student then bydefault "object class" is parent class of any class
public class Student {
	String Name;
	int rollNo;
	String City;
	
	
	public void setName(String Name) {
		this.Name=Name;	
	}
	
	public String getName() {
		return Name;
	}
	
	public void setCity(String City) {
		this.City=City;	
	}
	
	public String getCity() {
		return City;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;	
	}
	
	public int getRollNo() {
		return rollNo;
	}
	//toString is used in both of the class so it override the method
	
	//overriding -must have same name same parameter
	//overloading- same name but different parameter
	public String toString() {
		return "Student [name:"+Name+", RollNo : "+rollNo+", City : "+City+"]";
	}

}
