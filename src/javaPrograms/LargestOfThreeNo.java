package javaPrograms;

public class LargestOfThreeNo {
	
	public static void main(String[] args) {
		
		int a=75;
		int b=65;
		int c=91;
		
		if(a>b && a>c) {
			System.out.println(a+ " is largest");
		}
		
		else if(b>a && b>c) {
			System.out.println(b+" is largest");
		}
		
		else {
			System.out.println(c+" is largest");
		}
	}
	
	

}
