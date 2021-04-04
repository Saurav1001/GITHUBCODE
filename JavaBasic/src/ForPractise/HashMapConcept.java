package ForPractise;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap();
		map.put(10, "Som");
		map.put(20,"Ramkali");
		map.put(30,  "Rajkumar");
		System.out.println(map);
		System.out.println(map.get(10));
		
		for(int i=1; i<=map.size(); i++) {
			System.out.println(map.get(i));
		

	}for(Entry m:map.entrySet()) {
		System.out.println(m.getKey()  + " " + m.getValue());
	}
	map.remove(20);
	System.out.println(map);
	System.out.println("***************************");
	
	Employee e1=new Employee("Tom", 29, "Admin");
	Employee e2=new Employee("Brad", 32, "QA");
	Employee e3=new Employee("Ryan", 35, "DEV");
	
	
	HashMap<Integer, Employee> hm=new HashMap();
	hm.put(1, e1);
	hm.put(2, e2);
	hm.put(3, e3);
	//System.out.println(hm);
	for(Entry<Integer, Employee> m1:hm.entrySet()) {
		
		int key=m1.getKey();
		Employee e=m1.getValue();
		System.out.println("Employee " + key  +  " Info");
		System.out.println(e.name + " "+ e.age + " "+ e.dept);
	}
	
	
	
	
	
		
	
}
	
	
}

