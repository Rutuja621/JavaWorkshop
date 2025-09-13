package scannerclass;
/// using switch function call get and set functiony
import java.util.Scanner;
public class MainApp {
	public static void main(String[] args) {
		
		Data d =new Data();
		boolean start=true;
		while (start) {
		System.out.println("enter number 1 for setData 2 for getData");
		Scanner sc= new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			d.setData();
			break;
		case 2:
			d.getData();
			break;
		case 3:
			start=false;
			break;
		}	
		}
	}

}
