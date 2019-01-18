package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.AndGate;
import model.NotGate;

public class testNotGate {

	NotGate ng;
	NotGate ng2;
	
	@Before
	public void setUp() {
		ng = new NotGate(1,1,1);
		ng2 = new NotGate(0,1,2);
	}

	@Test
	public void testOutputWithInput1() {
		assertEquals(0,ng.getOutput());
	}
	@Test
	public void testOutputWithInput0() {
		assertEquals(1,ng2.getOutput());
	}
	@Test
	public void testInput() {
		assertEquals(1,ng.getInput());
	}
	@Test
	public void testXCoordinate() {
		assertEquals(1,ng.getX());
	}
	@Test
	public void testYCoordinate() {
		assertEquals(1,ng.getY());
	}

}
