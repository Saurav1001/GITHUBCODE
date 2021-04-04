package GIT;

public class GITCommands {
	public static void main(String[] args) {
		String n="SAURAVISMYNAME";
		
		int len=n.length();
		String m=" ";
		for(int i=(len-1);i>=0; i--) {
			m= m + n.charAt(i);
		}
		System.out.println(m);
		
		

}
}
