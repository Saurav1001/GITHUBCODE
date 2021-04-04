package OOPS;

public class WrapperClass {

	public static void main(String[] args) {
		
		
		String s="1000";
		int i=1000;
		
		int j=Integer.parseInt(s);
		
		System.out.println(j+i);
		
		String x="ABC";
		int p=1000;
		
		//String q= String.copyValueOf(p);
		
		//System.out.println(x+q);
		
		double d=12.33;
		String a="100";
		double b=Double.parseDouble(a);
		System.out.println(d+b);
		
		int ac=1001;
		String xy="100";
		String z=String.valueOf(ac);
		System.out.println(xy+z);
		
		
		
		
		
		
		

	}

}
