package polymorphism.demo.com;

public class MethodOverloading {
    // also called as static and compiletime polymorphism
	
	//overloading has same multiple function names but different parameter
	
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		System.out.println(calc.sum(3, 4));
		
		System.out.println(calc.sum(3, 4, 5));
		                           // by typecasting
		System.out.println(calc.sum((float)1.3, (float)3.4));
	}
}

class Calculator{
	int sum(int a,int b) {
		return a+b;
	}
	
	float sum(float a,float b) {
		return a+b;
	}
	
	int sum(int a,int b,int c) {
		return a+b+c;
	}
}
