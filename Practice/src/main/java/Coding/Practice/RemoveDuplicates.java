package Coding.Practice;

public class RemoveDuplicates {
	
public static int remove(int[] input) {
	int l=input.length;
	int current = input[0];
	boolean flag = false;

	for (int i = 0; i < l; i++) {
	    if (current == input[i] && !flag) {
	        flag = true;
	    } else if (current != input[i]) {
	        System.out.print(" " + current);
	        current = input[i];
	        flag = false;
	    }
	}
	System.out.print(" " + current);
	return current;
}
	public static void main(String[] args) {
		int[] input ={1, 1, 3, 7, 0, 8, 0, 9, 9, 10};
	
		remove(input);
	}
}

