package CustomerService;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Customer.Customer;
import Customer.CustomerOperations;

public class Services {
	
	Scanner sc=new Scanner(System.in);
	public void makeBill() {
		 System.out.println("Enter Customer Id to view details:");
	        int custId = sc.nextInt();
	        List<Customer> allCustomer = CustomerOperations.allCustomer;
	        Iterator<Customer> itr = allCustomer.iterator();
	        boolean foundCustomer = false;
	        while (itr.hasNext()) {
	            Customer customer = itr.next();
	            if (customer.getCust_Id() == custId) {
	                System.out.println(customer);
	                foundCustomer = true;
	            }
	        }
	        if (!foundCustomer) {
	            System.out.println("Not found");
	        }
	}

	    public void calculateTotalQuantityByPrice() {
	        System.out.println("Enter Customer Id:");
	        int custId = sc.nextInt();
	        System.out.println("Enter the Price (Product Identifier) to sum quantities for:");
	        String priceIdentifier = sc.next(); // Assuming 'price' is stored as a String in 'address'

	        List<Customer> allCustomer = CustomerOperations.allCustomer;
	        int totalQuantity = 0;
	        boolean customerFound = false;

	        for (Customer customer : allCustomer) {
	            if (customer.getCust_Id() == custId) {
	                customerFound = true;
	                // Assuming 'address' is used to store the 'price' or product identifier
	                // And 'quantity' is stored as a String, so it needs parsing
	                if (customer.getAddress().equals(priceIdentifier)) {
	                    try {
	                        totalQuantity += Integer.parseInt(customer.getQuantity());
	                    } catch (NumberFormatException e) {
	                        System.err.println("Invalid quantity format for customer " + customer.getCust_Id() + ": " + customer.getQuantity());
	                    }
	                }
	            }
	
	
	        }

