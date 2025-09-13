package StringDeclare;

public class Reversestr {
	public static void main(String[] args) {
		String a="abcdef";
		String r="";
		char ch;
		
		for(int i=0;i<a.length();i++) {
			ch=a.charAt(i);
			r=ch+r;
		}
		System.out.println(r);
		System.out.println(r.length());
	}

}
