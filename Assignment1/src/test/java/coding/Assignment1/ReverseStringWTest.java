package coding.Assignment1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ReverseStringWTest{
	@Test
	public void validString() {
		
		assertEquals(ReverseStringW.reverString("hello how are you"), "you are how hello ");
	}
	@Test
	public void inValidString() {
		
		assertEquals(ReverseStringW.reverString("hellohowareyou"), "hellohowareyou ");
	}
	@Test
	public void nullString() {
		
		assertEquals(ReverseStringW.reverString(null), null);
	}
}
