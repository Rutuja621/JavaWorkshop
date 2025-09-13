package function;

public class Return2 {
	public static void main(String[] args) {
		Return1 obj=new Return1();
		System.out.println(obj.isPass());
//		retur1.isPass();// when function is not static we have to create object of a class 
		System.out.println(Return1.getNumber());//using static we can call function using classname.functionname
		//we can call static function in non statically it is not an ideal way
	}

}
