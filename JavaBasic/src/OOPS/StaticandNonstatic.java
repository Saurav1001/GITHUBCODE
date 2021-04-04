package OOPS;

public class StaticandNonstatic {
	
	String name="Radhe";
	static int age=20;

	public static void main(String[] args) {
		New();
		StaticandNonstatic.New();
		System.out.println(age);
		System.out.println(StaticandNonstatic.age);//we do not need to create object for static method and variables
		

	}public void nonstatic() {
		System.out.println("Non Static method");
	}
	public static void New() {
		System.out.println("Static Method");
	}

}
