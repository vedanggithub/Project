package Coding.Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import Coding.Practice.Collec;

//import static org.junit.Assert.*;

//import org.junit.Test;

//import junit.framework.Assert;

public class Collectest1{
	@Test
	public void positive() {
		Collec help=new Collec();
		int a[]={1,2,3,4,9};
		int actual=help.meth(a);
		Assert.assertEquals(4,actual );
	}
	@Test
	public void nullvalue() {
		Collec help=new Collec();
		int a[]={0,0,2,0,0,1};
		int actual=help.meth(a);
		System.out.println(help.meth(a));
		Assert.assertEquals(1,actual );
		//Assert.assertTrue(true);
	}
	@Test
	public void negative() {
		Collec help=new Collec();
		int a[]={-1,0,-3,-6,-2};
		int actual=help.meth(a);
		//System.out.println(help.meth(a));
		Assert.assertEquals(-1,actual );
		//Assert.assertTrue(true);
}
}