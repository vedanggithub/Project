package coding.Assignment1;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	public static void main(String[] args) {
			String str = "listen";
			String str1 = "silent";
		
			System.out.println(shuffle(str, str1));
		}

		public static boolean shuffle(String str, String str1 ) {
			Map<Character, Integer> dp = new HashMap<Character, Integer>();
			Map<Character, Integer> dp1 = new HashMap<Character, Integer>();

			// int count = 0;

		
			if (str != null && str1!=null ) {
				char[] ch = str.toCharArray();
				for (char c : ch) {
					if (dp.containsKey(c)) {
						dp.put(c, dp.get(c) + 1);
					} else {
						dp.put(c, 1);
					}
				}
				System.out.println(dp);

				char[] ch2 = str1.toCharArray();

				for (char c : ch2) {

					if (dp1.containsKey(c)) {
						dp1.put(c, dp1.get(c) + 1);
					} else {
						dp1.put(c, 1);
					}
				}
				System.out.println(dp1);
				if (dp.equals(dp1)) {
					return true;
				}
			}
			return false;
		}
}