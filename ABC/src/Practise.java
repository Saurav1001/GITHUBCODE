
public class Practise {

	public static void main(String[]args) {
		
		int i=2;
		int num =29;
		
		while(i>=num) {
			System.out.println("Number is not prime");
			break;
		}
			
		if(num % i==0) {
			System.out.println( num +":is not prime");
		}
		else {
			System.out.println(num + ": is  prime");
		}
			
		

	}
}	



