package code.Practice;

import java.util.Arrays;
import java.util.TreeSet;

public class Sort {
	public static void main(String[] args) {
		Integer ar[]= {1,2,5,7,8,3,3,4,5,6};
		System.out.println(Sort.sor(ar));
	}
	
public static TreeSet<Integer> sor(Integer ar[]) {
	TreeSet<Integer> tr=new TreeSet<>(Arrays.asList(ar));
	
	return tr;
	
}
}
