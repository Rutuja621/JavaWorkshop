package inheritance.demo.com;

public class Inheritancedemo {
	//in single inheritance there is one base class and one child class
	//Example of single level inheritance
	//inheritance is when properties and methods of base class are passed to a derived class
	public static void main(String[] args) {
		Fish f=new Fish();
		f.breathe();//extend by parent class
		f.eat();
		f.swim();
	}

}
//base class
class Animal{
	
	void eat() {
		System.out.println("eats");
	}
	
	void breathe() {
		System.out.println("breathing by nose");
	}
}

//derived class

class Fish extends Animal{
	String fins;
	void swim() {
		System.out.println("swims is water");
	}
}
