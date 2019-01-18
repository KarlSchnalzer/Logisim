package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.OrGate;

public class testOrGate {

	OrGate og;
	OrGate og2;
	OrGate og3;
	
	@Before
	public void setUp() {
		og = new OrGate(1,1,0,3);
		og2 = new OrGate(1,0,1,2);
		og3 = new OrGate(0,0,1,2);
	}

	@Test
	public void testOutputWithSame1Inputs() {
		assertEquals(1,og.getOutput());
	}
	@Test
	public void testOutputWithSame0Inputs() {
		assertEquals(0,og3.getOutput());
	}
	@Test
	public void testOutputDiffInputs() {
		assertEquals(1,og2.getOutput());
	}
	@Test
	public void testFirstInput() {
		assertEquals(1,og2.getInput1());
	}
	@Test
	public void testSecondInput() {
		assertEquals(0,og2.getInput2());
	}
	@Test
	public void testXCoordinate() {
		assertEquals(0,og.getX());
	}
	@Test
	public void testYCoordinate() {
		assertEquals(3,og.getY());
	}

}
