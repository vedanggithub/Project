package code.Practice;


import java.util.Random;

public class Arrayspractice {

	public static void main(String[] args) {
		double[] count = new double[6];
		count[0] = 3.0;
		count[1] = 5;
		count[2] = count[0] * 3;
		count[3]++;
		count[4] -= 9;
		/*
		 * int i=0; while(i < 5) { System.out.println(count[i]); i++;} for (i = 0; i <
		 * count.length; i++) { count[i] =Math.pow(count[i], 2);
		 * System.out.println(count[i]); }
		 */
	
	System.out.println(search(count,1));

	Random ran=new Random();
	int[] a = new int[5];
	for (int i = 0; i < a.length; i++) {
	a[i]=ran.nextInt(50);
	System.out.println(a[i]);
	}
	
	}
	public static int search(double[] count,double a) {
		for (int i=0;i<count.length;i++) {
			if(count[i]==a) {
				return i;
			}
		}
		return -1;
		
	}
	
}
