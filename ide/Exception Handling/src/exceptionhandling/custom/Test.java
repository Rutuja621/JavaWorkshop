package exceptionhandling.custom;

public class Test {
	public static void getCollege() {
		try {
			throw new CollegeNotFoundException();
		} catch (CollegeNotFoundException e) {
			// TODO: handle exception
			System.out.println("Handled");
		}
	}
	public static void main(String[] args) {
		Test.getCollege();
	}

}
