package Questions;

import java.util.Scanner;

public class AddNumbersUserInput {

	public static void main(String[] args) {
		/*Scanner num = new Scanner(System.in);
		System.out.println("Please enter the number");
		//printing number given by user
		int number=num.nextInt();
		
		System.out.println("You entered " + number);*/
		Scanner n1= new Scanner(System.in);
		System.out.println("Enter the fist number");
		int i=n1.nextInt();
		System.out.println("Enter the second number");
		int j=n1.nextInt();
		int z=i+j;
		System.out.println("Sum of your number is: " + z);
		
		

	}

}
