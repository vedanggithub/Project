package coding.Assignment1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

//import junit.framework.TestCase;

public class StringShuffle1Test {

	@Test
	public void validString() {
		String str1="WX";
		String str2="YZ";
		String str="WXYZ";
		boolean actual = StringShuffle1.shuffle(str, str1, str2);
		assertEquals(actual, true);
	}
	
	@Test
	public void inValidString() {
		String str1="PQR";
		String str2="MNO";
		String str="LMNOPQR";
		boolean actual = StringShuffle1.shuffle(str, str1, str2);
		assertEquals(actual, false);
	}
	@Test
	public void intString() {
		String str1="123";
		String str2="45";
		String str="12345";
		boolean actual = StringShuffle1.shuffle(str, str1, str2);
		assertEquals(actual, true);
	}
	@Test
	public void negIntString() {
		String str1="-1-2-3";
		String str2="-4-5";
		String str="-1-2-3-4-5";
		boolean actual = StringShuffle1.shuffle(str, str1, str2);
		assertEquals(actual, true);
	}
	@Test
	public void nullString() {
		String str1=" ";
		String str2=" ";
		String str="  ";
		boolean actual = StringShuffle1.shuffle(str, str1, str2);
		assertEquals(actual, true);
	}
}
