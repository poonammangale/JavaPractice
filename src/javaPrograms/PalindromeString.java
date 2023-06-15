package javaPrograms;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String s="poonam";
		String temp=s;
		String rev=" ";
		
		for (int i=s.length()-1;i>=0;i--) {
			
		rev=rev+s.charAt(i);	
			
		}
		
		System.out.println("reverse of string is  " + rev);
		
		if(temp.equals(rev)) {
			System.out.println("string is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}
