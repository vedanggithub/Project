package coding.Assignment1;

public class StringShuffle1 {

	public static void main(String[] args) {
		String str = "DEAB";
		String str1 = "AB";
		String str2 = "DE";

		// shuffle(str, str1, str2);

		if (shuffle(str, str1, str2) == true) {
			System.out.println("it is valid");
		} else {
			System.out.println("it is not valid");
		}
	}
	public static boolean shuffle(String str,String str1,String str2) {
		if (str.length()==0 && str1.length()==0 && str2.length()==0)
		{
			return true;
		}
		if (str1.length() + str2.length() != str.length()) 
		{
			return false;
		}
		if(str1.length()!=0&& str.charAt(0)==str1.charAt(0))
		{
			return shuffle(str.substring(1),str1.substring(1),str2);
		}
		if(str2.length()!=0 && str.charAt(0)==str2.charAt(0))
		{
			return shuffle(str.substring(1),str1,str2.substring(1));
		}
		
		return false;
	}

//	public static boolean shuffle(String str, String str1, String str2) {
//
//		int a = 0, b = 0, c = 0;
//
//		if (str1.length() + str2.length() != str.length()) {
//
//			return false;
//		}
//		while (c < str.length()) {
//
//			if (a < str1.length() && str1.charAt(a) == str.charAt(c)) {
//
//				a++;
//
//			} else if (b < str2.length() && str2.charAt(b) == str.charAt(c)) {
//
//				b++;
//			}
//
//			else {
//
//				return false;
//			}
//
//			c++;
//		}
//
//		return true;
//	}
}
