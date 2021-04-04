package ForPractise;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		
		a1.add(10);
		a1.add(20);
		a1.add("SHIV");
		
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.get(0));
		
		System.out.println("*************************");
		
		for(int i=0; i<a1.size(); i++) {
			System.out.println(a1.get(i));
			
			
			
		}System.out.println("*************************");
		ArrayList a2=new ArrayList();
		a2.add(10);
		a2.add(20);
		a2.add("SHIV SHANKAR");
		
		a1.addAll(a2);
		System.out.println(a1);
		
		a1.retainAll(a2);
		System.out.println(a1);
		
		a1.removeAll(a2);
		System.out.println(a1);
		System.out.println("*************************");
		
		Constructor c3=new Constructor(30, "Krsihna");
		Constructor c4=new Constructor(36, "Ram");
		
		ArrayList<Constructor> n= new ArrayList();
		n.add(c4);
		n.add(c3);
		
		Iterator<Constructor> m=n.iterator();
		
		while(m.hasNext()) {
			Constructor q=m.next();
			
			System.out.println(q.age);
			System.out.println(q.name);
		}
		
		

	}

}
