package scannerclass;

public class App {

	public static void main(String []args) {
		
		
		Employee emp= new Employee();
		emp.setEmpid(7382);
		emp.setName("Ashish");
		emp.setCity("indapur");
		emp.setHasAdhar(true);
		System.out.println(emp.getEmpid());
		System.out.println(emp.getName());
		System.out.println(emp.getCity());
		System.out.println(emp.getHasAdhar());

		
		Employee emp1= new Employee();
		emp1.setEmpid(3384);
		emp1.setName("Akash");
		emp1.setCity("solapur");
		emp1.setHasAdhar(true);
		System.out.println(emp1.getEmpid());
		System.out.println(emp1.getName());
		System.out.println(emp1.getCity());
		System.out.println(emp1.getHasAdhar());
 }
}