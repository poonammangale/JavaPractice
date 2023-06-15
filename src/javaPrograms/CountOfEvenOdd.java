package javaPrograms;

public class CountOfEvenOdd {
	
	public static void main(String[] args) {
		
		int num = 978465132;
		int even=0;
		int odd=0;
		int rem;
		while(num>0) {
			
			 rem= num%10;
			 num=num/10;
			
			if(rem%2==0) {
				even++;
			}
			else {
				
				odd++;
			}	
			
		}
		System.out.println("count of even no is " +even);
		System.out.println("count of odd no is " +odd);
		
	}
	

}
