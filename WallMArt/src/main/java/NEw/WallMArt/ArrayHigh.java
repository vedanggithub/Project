package NEw.WallMArt;

import java.util.Arrays;
//import java.util.HashSet;

//import java.lang.reflect.Array;

public class ArrayHigh {
	public static void SecondArray(int[] array,int arr) {
//Arrays.sort(array);


	for (int a = 0; a < arr; a++) {
			for (int b = a+1; b < arr; b++) {
				
				if (array[a] > array[b]) {

					int temp = array[a];

					array[a] = array[b];
					array[b]=temp;

				}
	
			}
			
		}
	System.out.println(array[arr-2]);
	
		// int b[]=array.sort();
		// System.out.println(array-2);
				
		//System.out.println(b);
		
	}

	public static void main(String[] args) {
		int[] array = { 5,6,9,8,4,6};
		ArrayHigh.SecondArray(array,array.length);
	}
}
