package coding.Assignment1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AnagramTest {
@Test
public void valid() {
	
	boolean actual=Anagram.anag("suntooilquiz", "quizsolution");

	assertEquals(actual, true);
}
@Test
public void validCaps() {
	
	boolean actual=Anagram.anag("ReaRRangement", "greenermantra");

	assertEquals(actual, true);
}
@Test
public void inValid() {
	
	//boolean actual=;

	assertEquals(Anagram.anag("anagram", "anAgraAM"), false);
}
@Test
public void npValid() {
	
	//boolean actual=;

	assertEquals(Anagram.anag("a", "a"), true);
}

}
