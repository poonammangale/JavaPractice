package javaPrograms;

public class RemoveWhiteSpacesInString {

	
	public static void main(String[] args) {
		
		String a ="java is    computer   programming languge";
		
		a=a.replaceAll("\\s", "");
		System.out.println(a);
	}
}
