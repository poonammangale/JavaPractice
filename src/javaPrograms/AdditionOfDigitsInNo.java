package javaPrograms;

public class AdditionOfDigitsInNo {
	
	public static void main(String[] args) {
		
		int num = 65326;
		int sum=0;
		int rem;
		
		while(num>0) {
			
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		
		System.out.println("addition of digits in a number " +sum);
		
	}

}
