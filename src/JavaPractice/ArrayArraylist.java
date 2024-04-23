package JavaPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayArraylist {
	
	public static void main(String[] args) {
		
		//find duplicate ele in an array
		
		String s[] = {"java","python","ruby","c#","python","perl"};
		
		/*
		 * Set<String> set = new HashSet<String>();
		 * 
		 * for(String s1 : s ) {
		 * 
		 * if(set.add(s1)==false) { System.out.println(" duplicate value is " +s1); }
		 * 
		 * }
		 */
		
		//using HashMap
		
		Map<String,Integer> map = new HashMap<>();
	
		for (int i = 0; i < s.length; i++) {
			
			if(map.containsKey(s[i])) {
				
				map.put(s[i], map.get(s[i])+1);
			}
			else {
				map.put(s[i],1 );
			}
			
		}
		System.out.println(map);
		
		for(Entry<String, Integer> entryset:map.entrySet()) {
			//System.out.println(entryset.getKey() + "and" +entryset.getValue());
			 if(entryset.getValue()>1) {
				 System.out.println(entryset.getKey());
			 }
			
		}
		
	}
	
		
	
}
