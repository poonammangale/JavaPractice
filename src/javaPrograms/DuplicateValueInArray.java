package javaPrograms;

public class DuplicateValueInArray {
	
	public static void main(String[] args) {
		
		int a[]= {8,6,5,7,2,8};
		
		int dup=a[0];
		
		for (int i=1;i<a.length;i++) {
			
			if(dup==a[i]) {
				dup=a[i];
			}
		}
		System.out.println("duplicate value is " +dup);
	}

}
