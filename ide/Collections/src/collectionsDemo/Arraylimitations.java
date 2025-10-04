package collectionsDemo;

public class Arraylimitations {
	public static void main(String[] args) {
		int [] arr=new int[5];
		//fixed size of data is stored only similar data is stored
		//for example
		arr[0]=10;
		arr[1]=11;
		arr[2]=12;
		arr[3]=13;
		arr[4]=14;
		//arr[5]=13;// this will through an error ArrayIndexOutOfBoundsException
		
		Object arr1[]=new Object[6];//object type data
		//conversion of primitive to Object
		arr1[0]=10;
		arr1[1]="Rutuja";
		arr1[2]=true;
		//this stores only single data type 
	}

}
