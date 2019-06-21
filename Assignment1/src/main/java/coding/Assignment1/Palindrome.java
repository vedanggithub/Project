package coding.Assignment1;
//Program to check if String is Palindrome?
public class Palindrome {
public static void main(String[] args) {
	String str="@ #$# @";
	System.out.println(palin(str));
}


public static boolean palin(String str) {
	
	if(str==null || str.isEmpty()) {
		return false;
	}else {
		//String str1=str.toLowerCase();
		System.out.println(str);
		int length=str.length()-1;
		for (int i=0;i<length/2;i++) {
			if(str.charAt(i)!=str.charAt(length-i)) {
				return false;
			}
		}
	}
	return true;
	
}
}
