import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests {

	private RomanNumerals number = new RomanNumerals();

	@Test
	public void testThat1ReturnsI() {
		assertEquals("II", number.toRoman(3));
		assertEquals("II", number.toRoman(2));
		assertEquals("M", number.toRoman(1000));
		assertEquals("XLIX",number.toRoman(49));
		assertEquals("MMM",number.toRoman(3000));
	}
	

}
