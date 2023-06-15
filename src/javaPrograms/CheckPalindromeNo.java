package javaPrograms;

public class CheckPalindromeNo {
	public static void main(String[] args) {
		
	
	int num = 9331;
	int rev=0;
	int temp=num;
	
	while(num!=0) {
		rev= rev*10+num%10;
		num=num/10;
		
	}
	
	System.out.println("reveerse of no is  "+rev);
	
	if (temp==rev) {
		System.out.println("no is palindrome");
	}
	else {
		System.out.println("no is not palindrome");
	}
	}
}
