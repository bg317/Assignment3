package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}

	@Test
	public void testGetTotal() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
		
		calc.add(3);
		assertEquals(3, calc.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
		
		calc.add(3);
		assertEquals(3, calc.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
		
		calc.add(3);
		assertEquals(3, calc.getTotal());
		
		calc.subtract(3);
		assertEquals(0, calc.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
		
		calc.add(3);
		assertEquals(3, calc.getTotal());
		
		calc.multiply(3);
		assertEquals(9, calc.getTotal());
	}

	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
		
		calc.add(3);
		assertEquals(3, calc.getTotal());
		
		calc.divide(0);
		assertEquals(0, calc.getTotal());
		
		calc.add(15);
		calc.divide(5);
		assertEquals(3, calc.getTotal());
	}

	@Test
	public void testGetHistory() {
		Calculator calc = new Calculator();
		calc.add(3);
		calc.add(5);
		
		assertEquals("", calc.getHistory());
	}

}
