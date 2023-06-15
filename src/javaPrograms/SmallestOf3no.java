package javaPrograms;

public class SmallestOf3no {
	
	public static void main(String[] args) {
		
		int a=20;
		int b=15;
		int c=9;
		
		if(a<b && a<c) {
			System.out.println("a is smallest");
		}
		
		else if(b<a && b<c) {
			System.out.println("b is smallest");
			
		}
		
		else {
			System.out.println("c is smallest");
		}
	}

}
