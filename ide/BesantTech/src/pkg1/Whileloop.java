package pkg1;

public class Whileloop {
	public static void main(String[] args) {
	/*int i=0;
	while(i<6) {
			System.out.println(i);
			i++;
		}*/
		
	/*int i=0;
	while(i<6) {
		i++;
		System.out.println(i);
	}*/
		
	/*int i=0;
	while(i<10) {
		if(i==4) {
			continue;
		}
		System.out.println(i);
		i++;
	}*/
		
		
	int i=0;
	while(i<10) {//0<10/T 1 2 3 4 5
		if(i==5) {//1 2 3 4 5==5 T
			i++;//5+1=6
			break;//stop
		}else {
			i++;//0+1=1 1+1=2 2+1=3 3+1=4 4+1=5
			System.out.println(i);//1 2 3 4 5
		}
	}
	
		
	}

}
