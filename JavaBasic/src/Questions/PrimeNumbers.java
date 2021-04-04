package Questions;

public class PrimeNumbers {

	public static void main(String[] args) {
		/*int i=2;
		int j=17;
		
		while(i>=j) {
			System.out.println("Number is not prime");
			break;
		}if(j%i==0) {
			System.out.println(" Number is not prime");
		}else {
			System.out.println(j + " Number is prime");
		}*/
		
		for(int i=2; i<=100; i++) {
			
			for(int j=3; j<100; j++) {
				
				if(j<=i) {
					System.out.println( " Number is not prime");
					break;
					
				}if(j% i==0) {
					System.out.println(j + " Number is not prime");
					
				}else {
					System.out.println(j + " Number is  prime");
				}
			}
			
		}
			

	}

}
