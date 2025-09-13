package parameterizedconstructor;
import java.util.Scanner;
//Test2

public class Operations {

	    int id;
	    String name;
	    String address;

	    public void addInfo() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter ID: ");
	        id = sc.nextInt();
	        sc.nextLine(); 
	        System.out.print("Enter Name: ");
	        name = sc.nextLine();
	        System.out.print("Enter Address: ");
	        address = sc.nextLine();
	       
	    }

	    public void getInfo() {
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Address: " + address);
	    }

	    public void updateInfo() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("What do you want to update? 1. ID 2. Name 3. Address");
	        int choice = sc.nextInt();
	        sc.nextLine(); 
	        switch(choice) {
	            case 1:
	                System.out.print("Enter new ID: ");
	                id = sc.nextInt();
	                sc.nextLine();
	                break;
	            case 2:
	                System.out.print("Enter new Name: ");
	                name = sc.nextLine();
	                break;
	            case 3:
	                System.out.print("Enter new Address: ");
	                address = sc.nextLine();
	                break;
	            default:
	                System.out.println("Invalid choice.");
	        }
	      
	    }
	
	}

