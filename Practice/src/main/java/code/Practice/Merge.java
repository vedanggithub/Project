package code.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Merge {
	public static void main(String[] args) {
		
	
	   String a[] = { "4", "67", "78" };
	      String b[] = { "3", "98" };
	     System.out.println(Merge.Mer(a, b));
	}
	public static TreeSet Mer(String a[],String b[]) {
		
	      TreeSet list = new TreeSet(Arrays.asList(a));
	      list.addAll(Arrays.asList(b));
	      
	      //Object[] c = list.toArray();
		return list;
}
}