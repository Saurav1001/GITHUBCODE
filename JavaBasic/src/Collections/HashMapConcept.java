package Collections;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.groovy.util.SingleKeyHashMap.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap();
		
		hm.put(1,"Selenium");
		hm.put(2, "TestNG");
		hm.put(3, "TestNG");
		System.out.println(hm.get(1));
		System.out.println(hm);
		System.out.println("********************");
		
		
		for(int i=1; i<=hm.size(); i++) {
			System.out.println(hm.get(i));
		}System.out.println("********************");
		
		//for(java.util.Map.Entry<Integer, String> m :hm.entrySet()) {
			//System.out.println(m.getKey() +" "+ m.getValue());
		//}
		for(Map.Entry m: hm.entrySet()) {
			System.out.println(m.getKey() + " "+ m.getValue());

	}

}
}

