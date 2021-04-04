package OOPS;

public class Car {
	
	int mod;
	int wheel;
	String colour;

	public static void main(String[] args) {
		Car a=new Car();
		Car b=new Car();
		Car c=new Car();
		
		a.mod=12345;
		a.wheel=4;
		a.colour="red";
		b.mod=12385;
		b.wheel=4;
		
		c.mod=12395;
		c.wheel=4;
		
		System.out.println(a.mod);
		System.out.println(a.colour);
		System.out.println(b.mod);
		System.out.println(c.mod);
		
		
		
		
		
		

	}

}
