package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class MaroonMap {

	public static void main(String[] args) {
		HashMap<Integer, String> mp=new HashMap();
		mp.put(10, "Shri Ram");
		mp.put(12,  "Shri Krishna");
		
		System.out.println(mp);
		HashMap<Integer, String> mp2=new HashMap();
     	/*mp2.put(19, "Shri Brahma");
     	mp2.put(20,  "Shri Mahesh");*/
		
		mp2=(HashMap)mp.clone();
		
     	
     	//mp.putAll(mp2);
     	System.out.println(mp2);
     	System.out.println("********************************");
		
         for(Entry m : mp.entrySet()) {
        	 System.out.println(m.getKey() + " "+ m.getValue());
        	 
        
     	
			
		}
		
		Student st1=new Student("Aditya", 01, "Science");
		Student st2=new Student("Aditi", 02, "Biology");
		Student st3=new Student("Anu", 03, "Commerce");
		
		HashMap<Integer, Student> mp1=new HashMap();
		mp1.put(1, st1);
		mp1.put(2, st2);
		mp1.put(3, st3);
		for(Entry<Integer, Student> m:mp1.entrySet()) {
			int Integer=m.getKey();
			Student s=m.getValue();	
			System.out.println("Value of Student " + " " + Integer);
			System.out.println(s.name  + "  " + s.rollno  +" " +  s.dept);
			
			
		}
		
		
		
		
		
		
		

	}

}
