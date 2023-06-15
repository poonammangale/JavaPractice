package javaPrograms;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int num=20;
		int sum=0;
		
		for(int i=0;i<=num;i++) {
			sum=sum+i;   //0+1, 1+2
		}
		
		System.out.println("fibonacci series is " + sum);
	}

}
