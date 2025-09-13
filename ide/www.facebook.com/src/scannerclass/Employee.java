package scannerclass;

public class Employee {
	private int empid;
	private String name;
	private String city;
	private boolean hasAdhar;
	
	//setter
	public void setEmpid (int empid) {
		this.empid=empid;
	}
	public void setName (String name ) {
		this.name=name;
	}
	public void setCity (String city) {
		this.city=city;
	}
	public void setHasAdhar(boolean hasAdhar) {
		this.hasAdhar=hasAdhar;
	}
	
	//getter
	public int getEmpid() {
		return empid;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public boolean getHasAdhar() {
		return hasAdhar;
	}
}


