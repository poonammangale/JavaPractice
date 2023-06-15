package javaPrograms;

public class RemoveSpecialCharectorsInString {
	
	
	public static void main(String[] args) {
		
		String s = "&*$Poonam(*&^$#@Shekhar";
		
		s=s.replaceAll("[^a-zA-z0-9]", "");
		
		System.out.println(s);
				
	}

}
