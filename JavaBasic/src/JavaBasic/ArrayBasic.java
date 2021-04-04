package JavaBasic;

public class ArrayBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[]=new int[4];
		i[0]=10;
		i[1]=15;
		i[2]=20;
		i[3]=25;
		//System.out.println(i[2]);
		//System.out.println(i[3]);
		//System.out.println(i.length);//to print lenght of an array
		
		for(int j=0; j<i.length; j++) {
			//System.out.println(i[j]);//to print all the values in array
		}
		char c[]=new char[4];
		c[0]=1;
		c[1]='a';
		c[2]='$';
		c[3]='S';
		
		String s[]=new String[2];
		s[0]="1";
		s[1]="HelloWorld";
		//System.out.println(s[0]);
		
		Object ob[]=new Object[5];//Object Array is a class
		ob[0]="Tom";
		ob[1]=28;
		ob[2]="1/1/1992";
		ob[3]=78.9;
		ob[4]="London";
		//System.out.println(ob[2]);
		//System.out.println(ob.length);
		
		for(char j=0; j<ob.length; j++) {
			System.out.println(ob[j]);
		}
		
		
		
		

	}

}
