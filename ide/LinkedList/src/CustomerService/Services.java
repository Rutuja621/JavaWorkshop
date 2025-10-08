package CustomerService;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Customer.Customer;
import Customer.CustomerOperations;

public class Services {
	 public static void main(String[] args) {
	        startApp();
	    }

	    public static void startApp() {
	        CustomerOperations co = new CustomerOperations();
	        Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n--- Customer Operations Menu ---");
	            System.out.println("Press 1 for Add new products");
	            System.out.println("press 2 for Display all products");
	            System.out.println("press 3 for Delete quantity for a customer");
	            System.out.println("press 4 Calculate total price of all products");
	            System.out.println("pree 5 for Exit");
	            System.out.print("Enter your choice: ");
	            
	            if (sc.hasNextInt()) {
	                choice = sc.nextInt();
	                sc.nextLine(); // Consume the newline
	            } else {
	                System.out.println("Invalid input. Please enter a number.");
	                sc.nextLine(); // Consume the invalid input
	                choice = 0; // Set choice to an invalid number to continue the loop
	            }

	            switch (choice) {
	                case 1:
	                    co.setCustomers();
	                    break;
	                case 2:
	                    co.getAllList();
	                    break;
	                case 3:
	                    co.deleteQuantity();
	                    break;
	                case 4:
	                    co.calculateTotalPriceOfAllProducts();
	                    break;
	                case 5:
	                    System.out.println("Exiting program.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 5);

	        sc.close();
	    }
	}

