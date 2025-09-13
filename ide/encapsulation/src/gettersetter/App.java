package gettersetter;

public class App {
	
	public static void main(String[] args) {
		Getset emp=new Getset();
		emp.setEmpID(123);
		emp.setname("rutuja");
		emp.sethasAdhar(true);
		
		System.out.println(emp.getEmpID());
		System.out.println(emp.gethasAdhar());
		System.out.println(emp.getname());
		
		
		
		Getset emp1=new Getset();
		emp1.setEmpID(1234);
		emp1.sethasAdhar(false);
		emp1.setname("misal");
		
		System.out.println(emp1.getEmpID());
		System.out.println(emp1.gethasAdhar());
		System.out.println(emp1.getname());
	}

}
