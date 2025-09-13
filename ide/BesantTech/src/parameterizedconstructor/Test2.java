package parameterizedconstructor;

import java.util.Scanner;
public class Test2 {
	 public static void main(String[] args) {
	        Operations ops = new Operations();
	        Scanner sc = new Scanner(System.in);
	        while (true) {
	            System.out.println("Press 1 for add student\nPress 2 for see student Data\nPress 3 for update the student details\nPress 0 to exit");
	            int choice = sc.nextInt();
	            sc.nextLine(); 
	            switch (choice) {
	                case 1:
	                    ops.addInfo();
	                    break;
	                case 2:
	                    ops.getInfo();
	                    break;
	                case 3:
	                    ops.updateInfo();
	                    break;
	                case 0:
	                    System.out.println("Exiting...");
	                    sc.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        }
	 }
}


	            
	 
	



