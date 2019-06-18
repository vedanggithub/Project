package code.Practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	
//public static int remove(int[] input) {
		/*
		 * int l=input.length; int current = input[0]; boolean flag = false;
		 * 
		 * for (int i = 0; i < l; i++) { if (current == input[i] && !flag) { flag =
		 * true; } else if (current != input[i]) { System.out.print(" " + current);
		 * current = input[i]; flag = false; } } System.out.print(" " + current);
		 */
	
	public static Set<Integer> remove(int[] input){

		   Set<Integer> set = new HashSet<Integer>();
		   for (int i = 0; i < input.length; i++) {
		     set.add(input[i]);
		   }
		   //System.out.println("Array after removing duplicates");
		   System.out.println(set);
		return set;
		  }
		

	public static void main(String[] args) {
		int[] input =new int[]{1, 1, 3, 7, 0, 8, 0, 9, 9, 10};
	
		remove(input);
	}
}

