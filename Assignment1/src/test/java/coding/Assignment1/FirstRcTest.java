package coding.Assignment1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class FirstRcTest {
	
@Test
public void valid() {
assertEquals(FirstRc.nonRc("dude"), 'u');
//assertEquals(FirstRc.nonRc("dude"), 'u');
}
@Test
public void nullStr() {
assertEquals(FirstRc.nonRc(null), 0);
//assertEquals(FirstRc.nonRc("dude"), 'u');
}@Test
public void inValid() {
assertEquals(FirstRc.nonRc("duDu"), 0);
//assertEquals(FirstRc.nonRc("dude"), 'u');
}@Test
public void wsStr() {
assertEquals(FirstRc.nonRc("  "), 0);
//assertEquals(FirstRc.nonRc("dude"), 'u');
}@Test
public void sStr() {
assertEquals(FirstRc.nonRc("d"), 'd');
//assertEquals(FirstRc.nonRc("dude"), 'u');
}



}
