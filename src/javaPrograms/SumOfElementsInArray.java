package javaPrograms;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		
		int a[]= {5,8,9,3,7};
		
		int sum=0;
		for(int i=0; i<a.length;i++) {
			
			sum=sum + a[i];
		}
		
		System.out.println("sum of elements in array is " +sum);
		
		
	}
}
