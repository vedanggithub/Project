package coding.Assignment1;

import java.util.HashSet;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;


public class IntersectionATest {
	@Test
	public void positive() {
		int a[]= {4,9,5};
		int b[]= {9,4,9,8,4};
		String act=IntersectionA.intersection(a,b);
		Assert.assertEquals(act, "[4, 9]");
	}
	@Test
	public void negative() {
		int a[]= {-1,-2,2,-1,2};
		int b[]= {1,-2};
		String act=IntersectionA.intersection(a,b);
		Assert.assertEquals(act, "[-2]");
	}
	@Test
	public void emptynull() {
		int a[]= {1,2,2,1,2};
		int b[]= null;
		String act=IntersectionA.intersection(a,b);
		Assert.assertEquals(act, null);
	}
	@Test
	public void zero() {
		int a[]= {0};
		int b[]= {};
		String act=IntersectionA.intersection(a,b);
		Assert.assertEquals(act, "[]");
	}
}
