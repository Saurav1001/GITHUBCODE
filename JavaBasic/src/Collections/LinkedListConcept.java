package Collections;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList ab=new LinkedList();
		ab.add("Saurav");
		ab.add("Tyagi");
		ab.add(28);
		
		System.out.println(ab);
		
		ab.addFirst("Mr");
		System.out.println(ab);
		
		ab.addLast(1992);
		System.out.println(ab);
		
		ab.removeFirst();
		System.out.println(ab);
		ab.remove(2);
		System.out.println(ab);
		
		
			
			
		

	}

}
