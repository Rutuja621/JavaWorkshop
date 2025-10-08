package Customer;

public class Customer {
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Customer(int cust_Id, String name, String address,int Quantity,double price) {
		super();
		this.Cust_Id = cust_Id;
		this.name = name;
		this.address = address;
		this.Quantity=Quantity;
		this.price = price;
		
	}
	
	
	private int Cust_Id;
	private String name;
	private String address;
	private int Quantity;
	private double price;
	
	
	public int getCust_Id() {
		return Cust_Id;
	}
	public void setCust_Id(int cust_Id) {
		Cust_Id = cust_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		this.Quantity = quantity;
	}
	
	public double getPrice() 
	{ return price; } // New getter for price
    public void setPrice(double price)
    { this.price = price; } // New setter for price
	
    
 // Calculate total price for this customer
    public double getTotalPrice() {
        return this.price * this.Quantity;
    }
	
	@Override
	public String toString() {
		return "Customer [Cust_Id=" + Cust_Id + ", name=" + name + ", address=" + address + ",Quantity= " +Quantity+ ", Price=" + price + ", Total=" + getTotalPrice() + "]";
	}
	
	
	

}
