package Coding.Practice;

import java.util.TreeSet;

public class Collec {

	/*
	 * public static Integer meth(int[] a) {
	 * 
	 * TreeSet<Integer> l = new TreeSet<Integer>();
	 * 
	 * for (int b : a) {
	 * 
	 * l.add(b);
	 * 
	 * } l.pollLast(); //System.out.println("1st Highest number : " + l.pollLast());
	 * 
	 * //System.out.println("Second Highest number : " + l.last()); return l.last();
	 */
	static int meth(int[] a) {
		int h1 =0;
		int h2 = 0;
		for (int num : a) {
			if (num > h1) {//2>0
				h2 = h1;//h2=0
				h1 = num;//h1=2
			} else if (num > h2) {
				h2 = num;
			}

		}
		return h2;

	}

	public static void main(String[] args) {

		int[] a = { 2, 5, 6, 9, 8, 6, 7 };

		System.out.println(Collec.meth(a));

	}
}
