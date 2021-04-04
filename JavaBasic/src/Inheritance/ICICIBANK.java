package Inheritance;

public class ICICIBANK implements USBANK, UKBANK, AUSBANK {
	
	public void credit() {
		System.out.println("Inherit from US Bank");

}
	public void debit() {
		System.out.println("Inherit from US Bank");
		
}public void tranfer() {
	System.out.println("Inherit from Uk Bank");
	
	}public void atm() {
		System.out.println("Inherit from Uk Bank");
}
	public void trade() {
		System.out.println("Inherit from aus Bank");
}
	public void mutualfunds() {
		System.out.println("Inherit from aus Bank");
	}
	public void loan() {
		System.out.println("ICICI Bank feature");
	}
	
}
