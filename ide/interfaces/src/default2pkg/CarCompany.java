package default2pkg;

public interface CarCompany {
	default void getFuelType() {
		System.out.println("petrol");
	}
	public static void getCar() {
		System.out.println("car");
	}

}
