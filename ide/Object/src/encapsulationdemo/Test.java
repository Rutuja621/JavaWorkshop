package encapsulationdemo;

public class Test {
	Employee emp=new Employee();
	Employee emp1=new Employee();
	
	public void setData() {
		emp.empId=73;
		emp.name="rutuja";
		emp.address="sangola";
		
		
		emp1.empId=79;
		emp1.name="nagare";
		emp1.address="baramati";
		
		System.out.println("Data inserted..");
		
	}
	
	public void getData() {
		System.out.println(emp.empId);
		System.out.println(emp.name);
		System.out.println(emp.address);
		
		
		System.out.println(emp1.empId);
		System.out.println(emp1.name);
		System.out.println(emp1.address);
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.setData();
		test.getData();
	}

}
