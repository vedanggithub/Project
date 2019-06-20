package coding.Assignment1;

import java.util.*;

public class ShuffleHp {
	public static void main(String[] args) {
		String str = "EADB";// ABDE
		String str1 = "BADE";
		String str2 = "DE";
		System.out.println(shuffle(str, str1, str2));
	}

	public static boolean shuffle(String str, String str1, String str2) {
		Map<Character, Integer> dp = new HashMap<Character, Integer>();
		Map<Character, Integer> dp1 = new HashMap<Character, Integer>();

		// int count = 0;

		String temp2 = str1 + str2;
		if (str != null && temp2!=null ) {
			char[] ch = str.toCharArray();
			for (char c : ch) {
				if (dp.containsKey(c)) {
					dp.put(c, dp.get(c) + 1);
				} else {
					dp.put(c, 1);
				}
			}
			System.out.println(dp);

			char[] ch2 = temp2.toCharArray();

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
