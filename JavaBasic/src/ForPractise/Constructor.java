package ForPractise;

public class Constructor {
	
	int age=90;
	String name="radhe";
	
	public Constructor(int age) {
		//System.out.println("New Cosntructor");
		this.age=age;
		
	}
	public Constructor(int age, String name) {
		this.age=age;
		this.name=name;
		
		//System.out.println("New Cosntructor1");
		
	}
	
	public static void main(String[]args) {
		Constructor c=new Constructor(23);
		Constructor c1=new Constructor(28, "Saurav");
		System.out.println(c.age);
		System.out.println(c1.name);
		System.out.println(c1.age);
		
		
		
	}

}
