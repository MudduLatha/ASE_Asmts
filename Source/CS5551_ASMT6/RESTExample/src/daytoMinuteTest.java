import static org.junit.Assert.*;

import org.junit.Test;

public class daytoMinuteTest {
	daytoMinute g = new daytoMinute();
	Double pound = g.convertdtom(25.0);
	
	Double testConversion = 36000.0;
	
	@Test
	public void test() {
		//System.out.println(USD);
		System.out.println("@Test conversion(): " + pound + " = " + testConversion);
		assertEquals(testConversion, pound);
		//fail("Not yet implemented");
	}
}
