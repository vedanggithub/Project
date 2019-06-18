package code.PracticeTest;

import org.testng.Assert;
import org.testng.annotations.*;

import code.Practice.Fibonacci;

public class FibonacciTest {

	@Test
	public void negative() {
		int input=-4;
		Fibonacci.fib(input);
		
		Assert.assertEquals(Fibonacci.fib(input), 1);
	}
	@Test
	public void positive() {
		int input=6;
		Fibonacci.fib(input);
		
		Assert.assertEquals(Fibonacci.fib(input), 3);
	}
	@Test
	public void zero() {
		int input=0;
		Fibonacci.fib(input);
		
		Assert.assertEquals(Fibonacci.fib(input), 0);
	}
	
}
