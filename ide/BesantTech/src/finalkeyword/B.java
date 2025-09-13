package finalkeyword;
//this will through an error because B is an final class this can't be inherited
public  class B /*extends A*/{
	public final void m1() {
		System.out.println("Final class");
	}

}
