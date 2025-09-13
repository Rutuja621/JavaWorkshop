package scannerclass;
import java.util.Scanner;
public class Data {

		
	Employee emp =new Employee();
	Scanner sc = new Scanner (System.in);
	public void setData() {
		System.out.print("enter empid :");
		emp.setEmpid(sc.nextInt());
		System.out.print("enter name :");
		emp.setName(sc.next());
		System.out.print("enter city :");
		emp.setCity(sc.next());	
	}
	
	
	public void getData() {
		System.out.print(emp.getEmpid());
		System.out.print(emp.getName());
		System.out.print(emp.getCity());
	}
	public static void main(String[] args) {
		Data d=new Data();
		d.setData();
		d.getData();
	}

}
