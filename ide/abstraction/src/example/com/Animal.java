package example.com;

public class Animal {
	public static void main(String[] args) {
		//when we create an object of an child class constructor first parent class constrctor is called 
		Horse h=new Horse();
		h.eat();
		h.walk();
		System.out.println(h.color);//brown
		
		
		Chicken c=new Chicken();
		c.eat();
		c.walk();
	}

}


abstract class Animal2{
	String color;
	Animal2(){
		color="brown";
	}
	void eat()
{
		System.out.println("animal eats");}

//abstact method to identify abstract method there no implementation of method means this is empty we cant write data in it
abstract void walk();
//this gives only idea that there is must having a walk method/feature in animal and the create a method as your choice
//here abstaraction is applied
}


class Horse extends Animal2{
	//implementation of an abstract method walk
	void walk() {
		System.out.println("Horse walks on four leg");
	}
	
	void changeColor() {
		color="dark brown";
	}
}

class Chicken extends Animal2{
	//implementation of an abstract method walk
	void walk() {
		System.out.println("Chicken walks on two legs");
	}
	void changeColor() {
		color="dark brown";
	}
}