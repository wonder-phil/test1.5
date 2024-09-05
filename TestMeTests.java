package u;

import java.lang.Math;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import c.TestMe;

public class TestMeTests {

	TestMe testMe;

	@Before
	public void setUp() throws Exception {
		testMe  = new TestMe();
    }

	@Test
	public void squareTest() {

		double baseValue = 3.0;
		double expected = baseValue*baseValue;
		testMe.setValue(3.0);
		double actual = testMe.square();

		assertTrue(actual == expected);
	}

	@Test
	public void differenceTest() {
		double epsilon = 0.1;

		double baseValue = 3.0;
		double expected = baseValue*baseValue;
		testMe.setValue(3.01);
		double actual = testMe.square();

		assertTrue(Math.abs(actual- expected) < epsilon);
	}

}
