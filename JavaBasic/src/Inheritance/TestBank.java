package Inheritance;

public class TestBank {

	public static void main(String[] args) {
		ICICIBANK b = new ICICIBANK();
		b.credit();
		b.atm();
		b.debit();
		b.loan();
		b.mutualfunds();
		b.trade();
		b.tranfer();
		
		UKBANK c= new ICICIBANK();
		c.atm();
		c.tranfer();
		
	}

}
