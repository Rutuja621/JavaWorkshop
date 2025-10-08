package Customer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class CustomerOperations {
	Scanner sc = new Scanner(System.in);
    public static List<Customer> allCustomer = new ArrayList<>();
    
    public void setCustomers() {
        boolean addMore = true;
        while(addMore) {
            Customer sh = new Customer(); 
            System.out.println("Enter Product ID :");
            sh.setCust_Id(sc.nextInt());
            sc.nextLine();
            System.out.println("Enter Productname :");
            sh.setName(sc.nextLine());
            System.out.println("Enter address :");
            sh.setAddress(sc.nextLine());
            System.out.println("Enter Quantity :");
            sh.setQuantity(sc.nextInt());
            System.out.println("Enter price :");
            sh.setPrice(sc.nextDouble());
            
            allCustomer.add(sh);
            
            System.out.println("Press 1 to add more products, or any other number to stop.");
            if(1 != (sc.nextInt())) {
                addMore = false;
            }
            sc.nextLine(); // Consume the rest of the line
        }
    }
    
    public void getAllList() {
        Iterator<Customer> itr = allCustomer.iterator();
        while(itr.hasNext()) {
            Customer sh = itr.next();
            System.out.println(sh);
        }
    }

    public void deleteQuantity() {
        System.out.print("Enter Customer ID to update: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline left-over

        Customer customer = findCustomerById(id);
        if (customer == null) {
            System.out.println("Customer with ID " + id + " not found.");
            return;
        }

        System.out.println("Current quantity for " + customer.getName() + " is: " + customer.getQuantity());
        System.out.print("Enter quantity to delete: ");
        int qtyToDelete = sc.nextInt();
        sc.nextLine(); // Consume newline left-over

        int currentQuantity = customer.getQuantity();
        if (qtyToDelete >= currentQuantity) {
            allCustomer.remove(customer);
            System.out.println("All items for customer ID " + id + " have been removed.");
        } else {
            customer.setQuantity(currentQuantity - qtyToDelete);
            System.out.println("Quantity updated. Remaining quantity is: " + customer.getQuantity());
        }
    }

    private Customer findCustomerById(int id) {
        for (Customer customer : allCustomer) {
            if (customer.getCust_Id() == id) {
                return customer;
            }
        }
        return null;
    }
    
    // New method to calculate the total price of all products
    public void calculateTotalPriceOfAllProducts() {
        double totalSum = 0.0;
        for (Customer customer : allCustomer) {
            totalSum += customer.getTotalPrice();
        }
        System.out.println("Total price of all products is: " + totalSum);
    }
}