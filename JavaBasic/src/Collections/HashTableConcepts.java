package Collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableConcepts {

	public static void main(String[] args) {
		Hashtable h1=new Hashtable();
		h1.put(1, "Serene");
		h1.put(2, "Sheropova");
		h1.put(3, "Venus");
		
		System.out.println(h1);
		Hashtable h2=new Hashtable();
		h2=(Hashtable)h1.clone();
		
		System.out.println("Values from h1" + h1);
		System.out.println("Values from h2" + h2);
		
		System.out.println("**************");
		h1.clear();
		System.out.println("Values from h1" + h1);
		System.out.println("Values from h2" + h2);
		
		System.out.println("value of h2 hashcod : " + h2.hashCode());
		
		//contains
		
		Hashtable h3=new Hashtable();
		h3.put("A", "Vat");
		h3.put("B", "Vats");
		h3.put("C", "Vaty");
		
		if(h3.contains("Vats"))
			System.out.println("Valus is found");
		
		//to print all the values use Enumeration -- elements()
		Enumeration e=h3.elements();
		System.out.println("print values from h3");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
			
		
		
		
		
		

	}

}
