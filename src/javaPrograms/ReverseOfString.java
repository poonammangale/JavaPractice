package javaPrograms;

public class ReverseOfString {
	
	
	public static void main(String[] args) {
		
	
	String s="shekhar";
	String rev = " ";	
	/*for (int i=s.length()-1;i>=0;i--) {		
		rev=rev+s.charAt(i);		
	}	
	System.out.println(rev);*/
	
	
	// using charecher array
	
	
	char a[]=s.toCharArray();
	
	for (int i=a.length-1;i>=0;i--) {
		
		rev = rev+a[i];
	}
	
	System.out.println(rev);
	}
}
