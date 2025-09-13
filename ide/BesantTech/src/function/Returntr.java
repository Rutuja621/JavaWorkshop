package function;

public class Returntr {
	public char getData() {
		
		return 'A';
	}
	
//	public boolean getData() {
//		return true;
//		
//	}
	
	//in same class
	/*when static function called non static way --> we can call directly using object name
	 * when non-static funtion is called non static way--> we can directly call the function name
	 *
	 *when static function is called satic way --> we can directly call function name
	 * when non-static function is called static way we have to create an  object in same class
	 * */
	
	public static void main(String[] args) {
		Returntr obj=new Returntr();
		System.out.println("reutn:"+obj.getData());
		
	}

}
