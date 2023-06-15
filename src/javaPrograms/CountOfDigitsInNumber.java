package javaPrograms;

public class CountOfDigitsInNumber {
	
	public static void main(String[] args) {
		
		int a=846512;
		int count=0;
		
		while(a>0) {
			a=a/10;
			count++;
		}
		System.out.println("count of digits in a number is " + count);
	}

}
