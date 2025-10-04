package polymorphism.demo.com;

public class MethodOverriding {
	//parent class and child class have same function name and same parameters
	//also called as runtime polymorphism and non static
	public static void main(String[] args) {
		Deer d=new Deer();
		d.eats();
		
		Animal a=new Animal();
		a.eats();
	}

}


class Animal{
	void eats() {
		System.out.println("Eats anything");
	}
}

class Deer extends Animal{
	void eats() {
		System.out.println("eats grass");
	}
}

