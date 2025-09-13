package function;

public class Inside {
	public void getm1() {
		System.out.println("Inside m1");
	}
	
	public void getm2() {
		System.out.println("inside m2");
		getm1();
	}
	public static void main(String[] args) {
		Inside ins=new Inside();
		ins.getm2();
	}

}
