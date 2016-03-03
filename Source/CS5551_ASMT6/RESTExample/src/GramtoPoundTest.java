import static org.junit.Assert.*;

import org.junit.Test;

public class GramtoPoundTest {
	GramtoPound g = new GramtoPound();
	Double pound = g.convertgtop(526.0);
	
	Double testConversion = 1.1596196;
	
	@Test
	public void test() {
		//System.out.println(USD);
		System.out.println("@Test conversion(): " + pound + " = " + testConversion);
		assertEquals(testConversion, pound);
		//fail("Not yet implemented");
	}

}
