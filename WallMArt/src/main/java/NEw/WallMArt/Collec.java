package NEw.WallMArt;

import java.util.TreeSet;

public class Collec {
	public static void meth(int[] a) {
		TreeSet<Integer> l = new TreeSet<Integer>();
		for (int b : a) {	
			l.add(b);
		}
		System.out.println("1st Highest number : " + l.pollLast());
		System.out.println("Second Highest number : " + l.last());
	}
	public static void main(String[] args) {
		int[] a = { 2, 5, 6, 9, 8, 6, 7 };
		Collec.meth(a);
	}
}
