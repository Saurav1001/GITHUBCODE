package OOPS;

public class CallbyValuecallbyReference {

	public static void main(String[] args) {
		CallbyValuecallbyReference obj=new CallbyValuecallbyReference();
		int x=50;
		int y=20;
		obj.Sum(x, y);

	}
	public void Sum(int a, int b) {
		a=20;
		b=30;
		
		
		System.out.println(a+b);
	}

}
