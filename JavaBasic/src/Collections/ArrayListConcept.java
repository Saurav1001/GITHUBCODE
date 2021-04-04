package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	
	public static void main(String[]args) {
		ArrayList qw1=new ArrayList();
		
		qw1.add(10);
		qw1.add(20);
		qw1.add(30);
		
		System.out.println(qw1.size());
		System.out.println(qw1.get(0));
		System.out.println(qw1.get(0 +1));
		System.out.println("****************************");
		
		
		qw1.set(2, 35);
		//qw1.addFirst(24);
		System.out.println(qw1);
		
		ArrayList qw2=new ArrayList();
		qw2.add(20);
		qw2.add(20);
		
		qw1.addAll(qw2);
		
		System.out.println(qw1);
		
		//qw1.retainAll(qw2);
		//System.out.println(qw1);
		
		qw1.removeAll(qw2);
		System.out.println(qw1);
		
		System.out.println("*******************************");
		
		Employee e1=new Employee("Saurav", 28, "Mundet");
		Employee e2 = new Employee("Tyagi", 20, "Manglore");
		
		ArrayList<Employee> e3=new ArrayList();
		e3.add(e2);
		e3.add(e1);
		Iterator<Employee> it=e3.iterator();
		
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		
		
			
		}
		
		
		
		
		
	
	
	
			

	}

}
