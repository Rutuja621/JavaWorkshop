package inheritance.demo.com;

public class MultilevelInheritance {
//base class-->derived class-->derived class
	
	public static void main(String[] args) {
		Dog d=new Dog();
		
		d.eat();
		d.legs=4;
		System.out.println(d.legs+" legs");
	}
}

class Animals{
	void eat() {
		System.out.println("eats");
	}
	
	void breathe() {
		System.out.println("breathes");
	}
}

class Mammals extends Animals{
	int legs;
}

class Dog extends Mammals{
	
	String breed;
	
}