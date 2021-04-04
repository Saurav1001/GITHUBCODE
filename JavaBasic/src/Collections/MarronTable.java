package Collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class MarronTable {

	public static void main(String[] args) {
		Hashtable<Integer, String> hm=new Hashtable();
		hm.put(1, "Sarita");
		hm.put(2,"Sanju");
		System.out.println("Values of hm "+ hm);
		System.out.println("*******");
		System.out.println(hm.get(1));
		
		Hashtable<Integer, String> h2=new Hashtable();
		h2=(Hashtable)hm.clone();
		
		System.out.println("Values of hm "+ hm);
		System.out.println("Values of ht2 "+ h2);
		
		h2.clear();
		System.out.println("Values of h2 "+ h2);
		System.out.println("Value of HAshCode " + hm.hashCode() );
		
		System.out.println("********************************");
		
		if(hm.contains("Sanju"))
			System.out.println("Value found");
		
		System.out.println("*******");
		
		/*Student st1=new Student("Aditya", 01, "Science");
		Student st2=new Student("Aditi", 02, "Biology");
		Student st3=new Student("Anu", 03, "Commerce");
		
		Hashtable<Integer, Student> ht=new Hashtable();
		ht.put(1, st1);
		ht.put(2, st2);
		ht.put(3, st3);*/
		//you cannot use this 
		
		Enumeration e=hm.elements();
		System.out.println("Value of hm");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
		
		
		
		

	}

}
