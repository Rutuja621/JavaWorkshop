package inheritance.demo.com;

public class HybridInheritance {
	//combination of one or more types of inheritance
	public static void main(String[] args) {
		Peacock p=new Peacock();
		p.breathe();
		p.fly();
		p.dance();
		
		
		Fish2 f=new Fish2();
		f.breathe();
		f.swim();
		
		
	}

}

class Animal2{
	void eat() {
		System.out.println("Eats");
	}
	
	void breathe() {
		System.out.println("breaths");
	}
}

class Fish2 extends Animal2{
	void swim() {
		System.out.println("Swimming");
	}
}

class Bird2 extends Animal2{
	void fly() {
		System.out.println("Flying");
	}
}

class Mammal2 extends Animal2{
	void walk() {
		System.out.println("walking");
	}
}


class Shark extends Fish2 {
	void type() {
		System.out.println("shark");
	}
}

class Tuma extends Fish2{
	void tuma() {
		System.out.println("type of fish");
	}
}

class Peacock extends Bird2{
	void dance() {
		System.out.println("Dancing");
	}
}

class Dog1 extends Mammal2{
	void barks() {
		System.out.println("Dog barks");
	}
}