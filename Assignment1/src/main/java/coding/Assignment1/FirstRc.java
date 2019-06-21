package coding.Assignment1;

import java.util.HashMap;

//Program to return first non repeated character from String?
public class FirstRc {
public static void main(String[] args) {
	String str=null;
	System.out.println(nonRc(str));
}

public static Object nonRc(String str) {
	if(str!=null) {
		HashMap<Character,Integer> Hp=new HashMap<Character,Integer>();
		char[] c=str.toLowerCase().toCharArray();
		for(char ch:c) {
			if(Hp.containsKey(ch)) {
			Hp.put(ch,Hp.get(ch)+1);
		}else 
		{
			Hp.put(ch, 1);
		}
		}
		System.out.println(Hp);
		
		for(char ch:c) {
		if(Hp.get(ch)==1) {
			
			return ch;
		}
		//System.out.println(ch);
		
	}
	
}
	return 0;

}}
