package inheritance;

public class SingleInheritanceClassB extends SingleInheritanceClassA {
	
	public void method4() {
		System.out.println("method 4 from single class B");
	}
	public void method5() {
		System.out.println("method 5 from single class B");
	}
	public static void main(String[] args) {
		
		SingleInheritanceClassB sicb=new SingleInheritanceClassB();
		sicb.method1();
		sicb.method4();
		
	
	
}
}
