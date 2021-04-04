package JavaBasic;

public class IfElse {

	public static void main(String[] args) {
		int a=12;
		int b=13;
		if(a>b) {
			System.out.println("a is greater than b");	
		}
		else {
			System.out.println("b is greater than a");
		}
		
		double c=12.1;
		double d=12.10;
		if(c==d) {
			System.out.println("c and d are equals");
		}else {
			System.out.println("c and d are not equals");
		}
		int a1=100;
		int a2=102;
		int a3=103;
		if(a1>a2 & a1>a3) {
			System.out.println("a1 is greatest");
			
		}else if(a2>a3) {
			System.out.println("a2 is greatest");
		}else {
			System.out.println("a3 is greatest");
		}
	

	 }
	

}
