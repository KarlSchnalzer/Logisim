package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.AndGate;

public class testAndGate {
	AndGate ag;
	AndGate ag2;
	AndGate ag3;
	
	@Before
	public void setUp() {
		ag = new AndGate(1,1,1,1);
		ag2 = new AndGate(1,0,1,2);
		ag3 = new AndGate(0,0,1,2);
	}

	@Test
	public void testOutputWithSame1Inputs() {
		assertEquals(1,ag.getOutput());
	}
	@Test
	public void testOutputWithSame0Inputs() {
		assertEquals(0,ag3.getOutput());
	}
	@Test
	public void testOutputDiffInputs() {
		assertEquals(0,ag2.getOutput());
	}
	@Test
	public void testFirstInput() {
		assertEquals(1,ag.getInput1());
	}
	@Test
	public void testSecondInput() {
		assertEquals(1,ag.getInput2());
	}
	@Test
	public void testXCoordinate() {
		assertEquals(1,ag.getX());
	}
	@Test
	public void testYCoordinate() {
		assertEquals(1,ag.getY());
	}

}
