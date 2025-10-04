package ShoppingDemo;

import linkdelistDemo.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
public class ProductOperations {
	Scanner sc=new Scanner(System.in);
    List<Shopping> allProducts=new ArrayList<>();
    Shopping sh=new Shopping();
	public void setProducts() {
		Boolean addMore =true;
		while(addMore) {
			System.out.println("ProductId :");
			sh.setProductID(sc.nextInt());
			System.out.println("enter name :");
			sh.setName(sc.next());
			System.out.println("enter price :");
			sh.setPrice(sc.nextDouble());
			System.out.println("enter stock :");
			sh.setStock(sc.nextInt());
			
			int year=sc.nextInt();
			System.out.println("Enter year");
			
			int month=sc.nextInt();
			System.out.println("Enter Month: ");
			
			int date=sc.nextInt();
			System.out.println("Enter date");
			
			sh.setRegisteredDate(LocalDate.of(year, month, date));
			
			System.out.println("Enter Description: ");
			sh.setDescription(sc.next());
			
			int year1=sc.nextInt();
			System.out.println("Enter year");
			
			int month1=sc.nextInt();
			System.out.println("Enter Month: ");
			
			int date1=sc.nextInt();
			System.out.println("Enter date");
					
			System.out.println("Enter Expiry Date: ");
			sh.setExpiryDate(LocalDate.of(year1, month, month1));
					
			System.out.println("Enter barcodeN: ");
			sh.setBarcodeNo(sc.next());
					
			
			System.out.println("press 1 for add more");
			if(sc.nextInt()==2) {
				 addMore =false;
			}
		}
	}
	
	public void getProducts() {
		Iterator<Shopping> itr=allProducts.iterator();
		while(itr.hasNext()) {
			Shopping sh =itr.next();
			System.out.println(sh);
			
		}
	}

}
