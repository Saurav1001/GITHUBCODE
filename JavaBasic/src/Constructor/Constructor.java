package Constructor;

public class Constructor {
	 String name="Tyagi";
	 int age=28;
	public Constructor() {
		System.out.println(name);
		System.out.println(age);
	
		
	}
	public Constructor(int age) {
		System.out.println(age);
		
	}
	public Constructor( String name, int age) {
		this.name=name;
		this.age=age;
	
		//System.out.println(name);
		//System.out.println(age);
	}

	public static void main(String[] args) {
		Constructor obj =new Constructor(78);
		Constructor obj1= new  Constructor("Krishna", 20);
		Constructor obj2= new  Constructor();
		
		

	}

}
