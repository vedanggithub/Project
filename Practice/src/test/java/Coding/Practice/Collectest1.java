package Coding.Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

//import static org.junit.Assert.*;

//import org.junit.Test;

//import junit.framework.Assert;

public class Collectest1{
	@Test
	public void test() {
		Collec help=new Collec();
		int a[]={1,2,3,4,9};
		int actual=help.meth(a);
		Assert.assertEquals(4,actual );
	}
	@Test
	public void test2() {
		Collec help=new Collec();
		int a[]={1,-7,8,6};
		int actual=help.meth(a);
		System.out.println(help.meth(a));
		Assert.assertEquals(6,actual );
		Assert.assertTrue(true);
	}
	@Test
	public void test3() {
		Collec help=new Collec();
		int a[]={-1,0,-3,0,-2};
		int actual=help.meth(a);
		//System.out.println(help.meth(a));
		Assert.assertEquals(-1,actual );
		Assert.assertTrue(true);
}
}