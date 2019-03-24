package day4.lineTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import day4.line.Line;

public class LineTest {
	private static double delta = 0.001;
	private static Line line;
	
	@BeforeEach
	void init() {
		line = new Line(1.0, 2.0, 3.0, 4.0);
	}
	
	@Test
	public void getSlopeTest() {
		assertEquals((double) 1.0, line.getSlope(), delta);
	}
	
	@Test
	public void getSlopeTestException() {
		Line customInstance = new Line(1.0, 2.0, 1.0, 3.0);
		assertThrows(ArithmeticException.class, () -> {
			customInstance.getSlope();
		});
	}
	
	@Test
	public void getDistanceTest() {
		assertEquals((double) 2.828, line.getDistance(), delta);
	}
	
	@Test
	public void parallelToTestTrue() {
		Line parallelLine = new Line(12.0, 13.0, 14.0, 15.0);
		assertTrue(line.parallelTo(parallelLine));
	}
	
	@Test
	public void parallelToTestFalse() {
		Line nonParallelLine = new Line(13.0, 14.0, 19.0, 25.0);
		assertFalse(line.parallelTo(nonParallelLine));
	}
}
