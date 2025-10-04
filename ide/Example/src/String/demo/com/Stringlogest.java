package String.demo.com;

public class Stringlogest {
	
	public static void main(String[] args) {
		String  [] fruits= {"mango","ernvuy","banana"};
		String largest=fruits[0];
		for(int i=1;i<fruits.length;i++) {
			if(largest.compareTo(fruits[i])< 0 ){
				largest=fruits[i];
			}
		}
		
		System.out.println(largest);
	}

}
