package Abstraction;

public class Test {

	public static void main(String[] args) {
		
		HDFC hb=new HDFC();
		hb.loan();
		hb.credit();
		hb.debit();
		hb.funds();
		
		Bank b=new HDFC();
		b.credit();
		b.debit();
		b.loan();
		

	}

}
