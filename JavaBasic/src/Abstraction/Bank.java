package Abstraction;

public abstract class Bank {
	
	public abstract void loan();
	
	public void debit() {
		System.out.println("From RBI BANK DEBIT");

}
	public void credit() {
		System.out.println("From RBI BANK CREDIT");
}
}
