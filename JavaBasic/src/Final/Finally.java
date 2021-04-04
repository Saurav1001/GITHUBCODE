package Final;

public class Finally {

	public static void main(String[] args) {
		test1();

	}
	public static void test1() {
		int i=10;
		try {
			
			System.out.println("inside the try block");
			int k=i/0;
		}
		catch(NullPointerException e) {
			System.out.println("inside the catch block");
			System.out.println("inside the catch block");
			
		}
		finally {
			System.out.println("inside finally block");
		}
		}
}
		
		
	


