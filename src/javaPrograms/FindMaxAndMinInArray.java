package javaPrograms;

public class FindMaxAndMinInArray {
	
	public static void main(String[] args) {
		
		int a[]= {7,9,2,5,8,6,1};
		
		/*int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(max<a[i]) {
				
				max=a[i];
			}
		}
		
		System.out.println("maximum value in array is " +max);*/
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
			
		}
		System.out.println("min value in aaray is " +min);
	}

}
