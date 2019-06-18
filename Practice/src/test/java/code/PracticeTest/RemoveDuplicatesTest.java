package code.PracticeTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.*;

import code.Practice.RemoveDuplicates;

public class RemoveDuplicatesTest {
	@Test
	public void positive() {
		int[] a= {2,3,4,4,5,6,6,7,87,87};
		int[] b= {2,3,4,5,6,7,87};
		Set<Integer> set = new HashSet<Integer>();
		for(int s:b) {
			set.add(s);
		}
		System.out.println(set);
	Set<Integer> act=RemoveDuplicates.remove(a);
	//assertEqual(set,act);
	
}

	}