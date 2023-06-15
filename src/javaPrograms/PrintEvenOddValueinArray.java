package javaPrograms;

public class PrintEvenOddValueinArray {
	
	public static void main(String[] args) {
		
		int a[]= {8,6,5,45,30,63};
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0) {
				System.out.println("even value "+a[i]);
			}
			
			else {
				System.out.println("odd value  " +a[i]);
			}
			
		}
		
	}

}
