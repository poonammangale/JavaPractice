package javaPrograms;

public class ReverseOfno {
	public static void main(String[] args) {
		int num =985632;
		int rev=0;
		
		
		while(num!=0) {
			rev=rev*10+num%10;  //rev =2, rev= 23, rev =236
			num=num/10; 	//num 9856
		}
		
		System.out.println("reverse of no is" + rev);
	}

}
