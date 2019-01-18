package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.XorGate;

public class TestXorGate {

	XorGate xg;
	XorGate xg2;
	XorGate xg3;
	
	@Before
	public void setUp() {
		xg = new XorGate(1,1,0,3);
		xg2 = new XorGate(1,0,1,2);
		xg3 = new XorGate(0,0,1,2);
	}

	@Test
	public void testOutputWithSame1Inputs() {
		assertEquals(0,xg.getOutput());
	}
	@Test
	public void testOutputWithSame0Inputs() {
		assertEquals(0,xg3.getOutput());
	}
	@Test
	public void testOutputDiffInputs() {
		assertEquals(1,xg2.getOutput());
	}
	@Test
	public void testFirstInput() {
		assertEquals(1,xg2.getInput1());
	}
	@Test
	public void testSecondInput() {
		assertEquals(0,xg2.getInput2());
	}
	@Test
	public void testXCoordinate() {
		assertEquals(0,xg.getX());
	}
	@Test
	public void testYCoordinate() {
		assertEquals(3,xg.getY());
	}

}
