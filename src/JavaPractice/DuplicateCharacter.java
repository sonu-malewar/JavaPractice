package JavaPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharacter {
	
	

	public static void findDuplicatechar(String str) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char c[] = str.toCharArray();
		for (char c1 : c) {

			if (map.containsKey(c1)) {

				map.put(c1, map.get(c1)+1);
			} else {

				map.put(c1, 1);
			}

		}
		
		for( Entry<Character, Integer> entry:map.entrySet()) {
			
			if(entry.getValue()>1) {
				
				System.out.println(entry.getKey() +" "+entry.getValue());
			}
		}
		}
	public static String reverseString(String s) {
		
		String rev=""; //abcde
		
		for(int i=s.length()-1;i>=0;i--) {
		
		char c = s.charAt(i);
		
		rev= rev +String.valueOf(c);
		}
		return rev;
	}
	
	

	public static void main(String[] args) {
		
		//findDuplicatechar("java");
		
		//String rev= reverseString("abcde");
		
		//System.out.println(rev);
		
	int a[] = {2,4,5,3,6,1};
	int sum=0;
		
		
		for (int i = 0; i < a.length-1; i++) {
			
			for (int j = 1; j < a.length-1; j++) {
				
				sum=a[i]+a[j];
				
				if(sum==7) {
					
					System.out.println(a[i] +" "+a[j]);
				}
			}
			
		}
		

	}

}
