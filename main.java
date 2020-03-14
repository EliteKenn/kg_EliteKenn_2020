package KargoHQ;
import java.util.*;
public class main {
	public static void main(String[] args) {
		
		String s1 = "abc"; String s2 = "bcd";
		String s3 = "foo"; String s4 ="bar";
		String s5 = "bar"; String s6 = "foo";
		
		System.out.println(isSurjective(s1,s2));
		System.out.println(isSurjective(s3,s4));
		System.out.print(isSurjective(s5,s6));
	}
	
	public static boolean isSurjective(String s1, String s2) {
		//Some error checking
		if(s1 == null || s2 == null) {//Edge case #1: Check if there are any strings
			return false;
		}
		else if(s1.length() != s2.length()) {//Edge case #2: Make sure the two strings are equal length
			return false;
		}
		
		Set<Character> set = new HashSet<>();
		Map<Character,Character> mapping = new HashMap<>();
		for(int i = 0; i < s1.length();i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			
	/*If hashmap contains the the characters in c1, 
	 * but c2 does not match any the existing characters in c1 then its false 
	 * 
	 */
		if(mapping.containsKey(c1) && c2 != mapping.get(c1)) {
			return false; 
		}
		else {
			if(set.contains(c2))
				return true;
				set.add(c2);
				mapping.put(c1,c2);
			}
}
		return true;
}
}
