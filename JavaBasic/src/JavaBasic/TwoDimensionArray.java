package JavaBasic;

public class TwoDimensionArray {

	public static void main(String[] args) {
		String s[][]=new String[3][5];
		System.out.println(s.length);
		System.out.println(s[0].length);
		s[0][0]="A";
		s[0][1]="B";
		s[0][2]="C";
		s[0][3]="D";
		s[0][4]="E";
		
		s[1][0]="A1";
		s[1][1]="B1";
		s[1][2]="C1";
		s[1][3]="D1";
		s[1][4]="E1";
		
		System.out.println(s[1][4]);
		
		for(int row=0;row<s.length; row++) {
			for(int col=0; col<s[0].length; col++) {
				System.out.println(col);
				
			}
			//System.out.println(row);
			
		}

	}

}
