package statickeyword.StaticKeyword.com;

public class StaticDemo {
	//this an static function which won't change
	public static void main(String[] args) {
		//static keyword in java is used to share the same variable or method of a given class
		/*we can make static
		 * properties ex : string ,float ,int
		 * functions
		 * blocks ex : it means written in {} pararenthesis
		 * nested class
		 */
		Student s1=new Student();
		//s1.clg_Name="jvm";
		System.out.println(s1.clg_Name);
		
		//this clg name is same for all the objects
		Student s2=new Student();
		
		s2.clg_Name="jsp";
		System.out.println(s2.clg_Name+"s2");
	}
	

}

class Student{
	int id;
	String Stud_name;
	//staic keyword for properties
	static String clg_Name;
	
	void setName(String Stud_name) {
		this.Stud_name=Stud_name;
	}
	
	String getName() {
		return this.Stud_name;
	}
}
