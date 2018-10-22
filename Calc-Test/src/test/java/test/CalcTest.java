package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import main.Calc;

public class CalcTest {
	private static double DELTA = 1e-14;
	Calc t = new Calc();
	@Test
	public void testDodawanie() {
		assertEquals(10.0, t.dodawanie(5,5));
	}
	
	@Test
	public void testOdejmowanie() {
		assertEquals(2.0, t.odejmowanie(6,4));
	}
	
	@Test
	public void testMnozenie() {
		assertEquals(15.0, t.mnozenie(3, 5));
		assertEquals(9.6, t.mnozenie(3.0, 3.2),DELTA); //problem z double, trzeba dac zakres - delta
	}
	
	@Test
	public void testDzielenie() {
		assertFalse(t.sprawdzyCzyDzieliPrzezZero(5, 1));
		assertEquals(12.0, t.dzielenie(6, 0.5));
		assertEquals(13.6, t.dzielenie(27.2, 2));
		assertEquals(5.4, t.dzielenie(41.04, 7.6));
		assertEquals(9.213978494, t.dzielenie(85.69, 9.3),DELTA=1e-9);
		assertEquals(1.0,Math.exp(t.odejmowanie(Math.log(5), Math.log(5)))); //dzielenie bez "/"
	}
}