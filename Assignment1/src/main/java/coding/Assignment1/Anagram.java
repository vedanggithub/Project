package coding.Assignment1;

//Program to check if two Strings are anagrams of each other?
import java.util.HashMap;
import java.util.Map;

public class Anagram {
	public static void main(String[] args) {
			String str = "ponmlkjihgfedcba";
			String str1 = "abcdefghijklmnop";
		
			System.out.println(anag(str, str1));
		}

		public static boolean anag(String str, String str1 ) {
		
		Map<Character, Integer> dp = new HashMap<Character, Integer>();
		Map<Character, Integer> dp1 = new HashMap<Character, Integer>();
		
			if ( str1.length()==str.length() && str != null && str1!=null) {
				char[] ch = str.toLowerCase().toCharArray();
				for (char c : ch) {
					if (dp.containsKey(c)) {
						dp.put(c, dp.get(c) + 1);
					} else {
						dp.put(c, 1);
					}
				}
				//System.out.println(dp);

				char[] ch2 = str1.toLowerCase().toCharArray();

				for (char c1 : ch2) {

					if (dp1.containsKey(c1)) {
						dp1.put(c1,dp1.get(c1)+1);
					}else {
						dp1.put(c1, 1);
					}
					
				}	
				//System.out.println(dp1+" "+dp);
				if (dp.equals(dp1)) {
					return true;
				}
				
			}
				
		
			return false;
		}
}