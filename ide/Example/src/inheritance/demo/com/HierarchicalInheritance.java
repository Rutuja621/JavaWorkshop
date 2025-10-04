package inheritance.demo.com;

public class HierarchicalInheritance {
	/*      Animal
	 *        |
	 * |------|--------|
	 * fish   Mammal   Bird
	 */
	public static void main(String[] args) {
		Bird b=new Bird();
		b.breathe();
		b.fly();
	}

}

class Animal1{
	void eat() {
		System.out.println("Eats");
	}
	
	void breathe() {
		System.out.println("breaths");
	}
}

class Mammal1 extends Animal1{
	void walk() {
		System.out.println("walking");
	}
}

class Fish1 extends Animal1{
	void swim() {
		System.out.println("Swimming");
	}
}

class Bird extends Animal1{
	void fly() {
		System.out.println("Flying");
	}
}
