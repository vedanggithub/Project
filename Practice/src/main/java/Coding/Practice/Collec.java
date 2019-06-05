package Coding.Practice;

import java.util.TreeSet;

public class Collec {
	
	public static Integer meth(int[] a) {
		
		TreeSet<Integer> l = new TreeSet<Integer>();
		
		for (int b : a) {
			
			l.add(b);
			
		}
		l.pollLast();
		//System.out.println("1st Highest number : " + l.pollLast());
		
		//System.out.println("Second Highest number : " + l.last());
		return l.last();
	}
	
	public static void main(String[] args) {
		
		int[] a = { 2, 5, 6, 9, 8, 6, 7 };
		
		System.out.println(Collec.meth(a));
		//System.out.println("1st Highest number : "+Collec.meth(a).pollLast());	
		//System.out.println("Second Highest number : " +Collec.meth(a).pollLast().);
		
	}
}
