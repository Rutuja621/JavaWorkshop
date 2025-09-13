package gettersetter;

public class Getset {
	private int EmpID;
	private String name;
	private boolean hasAdhar;
	
	
	public void setEmpID(int EmpID) {
		this.EmpID=EmpID;
		
	}
	
	public int getEmpID() {
		return EmpID;//while getting the data we have to use same datatype as used in declaration time
	}
	
	public void sethasAdhar(boolean hasAdhar) {
		this.hasAdhar=hasAdhar;
	}
	
	public boolean gethasAdhar() {
		return hasAdhar;
	}
	
	
	public void setname( String name) {
		this.name=name;
		//name=name points to the loacal variable
		//this.name=name  points to the global variable
	}
	
	public String getname() {
		return name;//while getting the data we have to use same datatype as used in declaration time
	}
	

}
