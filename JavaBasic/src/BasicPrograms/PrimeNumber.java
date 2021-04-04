package BasicPrograms;

public class PrimeNumber {

	public static void main(String[]args) {
		
		/*int i=2;
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
			
		
very basic program*/
		for(int i=2; i<=100; i++) {
			for(int j=2; j<=i; j++) {
				
				if(j==i) {
					System.out.println(i);
				}
				
				
				  if(i %j==0) { 
					  
					 
					 break;
				 }
			}
		}
	}
}	