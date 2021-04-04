package OOPS;

public class Functions {

	public static void main(String[] args) {
		Functions obj=new Functions();
		obj.test();
		int l = obj.pqc();
		System.out.println(l);
		int m=obj.div(10, 5);
		
		System.out.println(m);

	}
	public void test() {
		System.out.println("Hello World");
		
		
	}
	public int pqc() {
		System.out.println("I'm Good");
		int q=10;
		int p=20;
		int c=q+p;
		
		
		return c;
	}
	public int div(int x, int y) {
		System.out.println("Saurav is genius");
		int z = x/y;
		
		return z;
		
	}

}
