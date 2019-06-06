package Coding.Practice;

import java.util.Set;

import org.testng.annotations.*;

import Coding.Practice.RemoveDuplicates;

public class RemoveDuplicatesTest {
	@Test
	public void positive() {
		int[] a= {2,3,4,4,5,6,6,7,87,87};
		Set<Integer> act=RemoveDuplicates.remove(a);
		
		assertArrayEquals(a, act);
}

	}