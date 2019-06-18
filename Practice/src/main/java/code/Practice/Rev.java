package code.Practice;

import java.util.Arrays;

public class Rev {
	   public static int rvereseArray(int arr[],int start, int end) 
{ 
   int temp; 
      
   while (start < end)
	   
   { 
       temp = arr[start];  
       arr[start] = arr[end]; 
       arr[end] = temp; 
       start++; 
       end--; 
   }
   for(int i=0;i<arr.length;i++) {
	   
   }
return arr[];
   
}  
	   
	   public static void main(String[] args) {
		   int arr[] = {1, 2, 3, 4, 5, 6}; 
		   rvereseArray(arr, 0, 5); 
	}
}
