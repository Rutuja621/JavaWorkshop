package stringbuilder.demo.com;

public class StringBuilderDemo {
	//we change or modify the at first 
	//this used to resolve immutable problem of a String
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		for(char ch='a';ch<='z';ch++) { //this loop go through the a to z
			sb.append(ch); //this will print or append all the characters
		}
		System.out.println(sb);
	}
	
	

}
