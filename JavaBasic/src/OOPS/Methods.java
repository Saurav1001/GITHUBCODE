package OOPS;

public class Methods {

	public static void main(String[] args) {
		Methods obj=new Methods();
		
		int s=obj.add();
		System.out.println(s);
		
		double f=obj.div(19, 7);
		System.out.println(f);
		

	}
	public void test() {
		System.out.println("Saurav is geniuos");
	}
	
	public int add() {
		System.out.println("Saurav is good");
		int a=18;
		int b=19;
		int c=a+b;
		return c;
	}
	public double div(double p, double q) {
		System.out.println("Saurav is graciuos");
		double r=p/q;
		return r;
	}

}
