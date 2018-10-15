package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import main.Testowanie;

class TestowanieTest {
	private static double DELTA = 1e-14;
	Testowanie t = new Testowanie();
	@Test
	void testDodawanie() {
		//int x = 2;
		//int y = 2;
		
		//assertEquals(4, t.dodawanie(t.x, t.y));
		assertEquals(10, t.dodawanie(5,5));
	}
	
	@Test
	void testOdejmowanie() {
		//int x = 5;
		//int y = 3;
		
		//assertEquals(2, t.odejmowanie(t.x, t.y));
		assertEquals(2, t.odejmowanie(6,4));
	}
	
	@Test
	void testMnozenie() {
		//int x = 5;
		//int y = 3;
		//double delta = 0.000000001;
		
		//assertEquals(15, t.mnozenie(x, y));
		assertEquals(15, t.mnozenie(3, 5));
		assertEquals(9.6, t.mnozenie(3.0, 3.2),DELTA); //problem z double, trzeba dac zakres - delta
		//assertEquals(9.6, t.mnozenie(3.0, 3.2), delta);
	}
	
	@Test
	void testDzielenie() {
		//int x = 6;
		//int y = 3;
		//int z = 0;
		
		//assertFalse(t.sprawdzyCzyDzieliPrzezZero(t.x, t.y));
		//assertEquals(2, t.dzielenie(t.x, t.y));
		
		
		assertFalse(t.sprawdzyCzyDzieliPrzezZero(5, 1));
		assertEquals(12, t.dzielenie(6, 0.5));
		assertEquals(13.6, t.dzielenie(27.2, 2));
		assertEquals(5.4, t.dzielenie(41.04, 7.6));
		assertEquals(9.213978494, t.dzielenie(85.69, 9.3),DELTA=1e-9);
		assertEquals(1,Math.exp(t.odejmowanie(Math.log(5), Math.log(5)))); //dzielenie bez "/"
	}
	
	@Test
	@Disabled
	void testDzielenieIMnozenie(){
		//assertEquals(4,2+t.dzielenie(8, 4));
		//assertEquals(4,);
	}
}
