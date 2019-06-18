package code.Practice;

import java.util.Arrays;
import java.util.HashSet;

public class Common {
	public static void main(String[] args) {
		
	
	Integer[] i1 = {1, 2, 3, 4, 5, 4};
	 
    Integer[] i2 = {3, 4, 5, 6, 7, 4};
    HashSet<Integer> hs=new HashSet<>(Arrays.asList(i1));
    //System.out.println(hs);
    HashSet<Integer> hs2=new HashSet<>(Arrays.asList(i2));
    hs.retainAll(hs2);
    System.out.println(hs);
    
	}
}
