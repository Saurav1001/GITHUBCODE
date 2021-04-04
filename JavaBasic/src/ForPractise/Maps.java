package ForPractise;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		HashMap<Integer, String> hm= new HashMap();
		hm.put(10,  "Shri Ram");
		hm.put(20,  "Shri Krsihna");
		hm.put(30, "Shri Vishnu");
		System.out.println(hm);
		
		//hm.remove(20);
		//System.out.println(hm);
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey() + " "+ m.getValue());
		}
		Students s1=new Students(10, "Akash", "Physics");
		Students s2=new Students(12, "Ankush", "Chemistry");
		Students s3=new Students(10, "Arpita", "Maths");
		
		HashMap<Integer, Students> sc=new HashMap();
		sc.put(1, s1);
		sc.put(2, s2);
		sc.put(3, s3);
		//System.out.println(sc);
		for(Map.Entry<Integer, Students> st:sc.entrySet()) {
			int Integer=st.getKey();
			Students s=st.getValue();
			
			System.out.println("student " + Integer + " info");
			System.out.println(s.Rollno + " " + s.name + " " + s.dept);
			
		}
		
		
		
		
		

	}

}
