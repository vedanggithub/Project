package Coding.Practice;

import org.testng.annotations.*;

public class RemoveDuplicatesTest {
	@Test
	public void positive() {
		int[] a= {2,3,4,4,5,6,6,7,87,87};
		int act=RemoveDuplicates.remove(a);
		int[] exp= 2,3,4,5,6,7,87;
		assertArrayEquals(exp, act);
}}