package OOPS;

public class MethoadOverloading {

	public static void main(String[] args) {
		MethoadOverloading ov=new MethoadOverloading();
		ov.Sum();
		ov.Sum(0);
		ov.Sum(0, 0);
		

	}
	public void Sum() {
		System.out.println("Without param");
		
	}
	public void Sum(int i){
		i=15;
		System.out.println("With one param");
		
		
	}
	public void Sum(int i, int j) {
		i=10;
		j=12;
		System.out.println(i+j);
		
		
	}

}
