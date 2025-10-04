package String.demo.com;

public class Substringfunc {
	
	public static String substring(String str,int si,int ei) {
		String substr="";
		for(int i=si;i<ei;i++) {
			substr +=str.charAt(i);
		}
		return substr;
	}
	
	public static void main(String[] args) {
		String str="Rutuja";
		
		Substringfunc sc=new Substringfunc();
		System.out.println(substring(str,1,3));
	}

}
