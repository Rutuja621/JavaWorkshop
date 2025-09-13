package arraydemo;

public class Example3 {
	//sum of array elements
	public int sumOfArray(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
//			System.out.println(sum);
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int [] arr= {1,6,4,3,2,9};
		Example3 b=new Example3();
		System.out.println(b.sumOfArray(arr));
	}

}
