package coding.Assignment1;

//Program to reverse words in a sentence without using a library method?
public class ReverseStringW {
	public static void main(String[] args) {
		String str = "practice programs well";
		System.out.println(reverString(str));
	}

	public static String reverString(String str) {
		if (str != null) {
			String rev = "";
			String a[] = str.split(" ");
			for (int i = a.length - 1; i >= 0; i--) {
				rev += a[i] + " ";
			}
			// System.out.println(rev);
			return rev;

		}
		return null;
	}

}
