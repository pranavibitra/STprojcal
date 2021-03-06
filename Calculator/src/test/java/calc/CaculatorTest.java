package calc;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class CaculatorTest {
	private static CalculatorMain calc;
	
	@BeforeClass
	public static void setup(){
		calc = new CalculatorMain();
	}
	
	@Test
	public void testAdd() {
		assertEquals(5, calc.add(3,2));
	}
	@Test
	public void testAdd() {
		assertEquals(10, calc.add(4,6));
	}
	@Test
	public void testSub() {
		assertEquals(1, calc.sub(3,2));
	}
	@Test
	public void testSub() {
		assertEquals(2, calc.sub(4,2));
	}
	@Test
	public void testMul() {
		assertEquals(6, calc.mul(3,2));
	}
	@Test
	public void testDiv() {
		assertEquals(1, calc.div(2,2));
	}
	
}
