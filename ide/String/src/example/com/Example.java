package example.com;

public class Example {
	
public static String getString(String str) {
		
		String upperCaseStr=str.toUpperCase();
		String result=upperCaseStr.replaceAll("\\d","_");
		
		return result;
		
	}
	public static void main(String[] args) {
		
		//intput:"RUtuJA"-------------------->output:"RUTUJA"

		String name="RUtuJA";
		String name1=getString(name);
		System.out.println("name:" +  name1);
		
		//input:"sbpCOE135"--------------------->output:"SBPCOE_"
		String college="sbpcoE123456789";
		String college1=getString(college);
		System.out.println("college :" + college1);
		
		
		//I=1
		//V=5
		//X=10
		//L=50
		//C=100
		//D=500
		//M=1000
		//Input:I+V--------------->output:5
		
	}

}
