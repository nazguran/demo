package com.JunitDemo.demo;

import junit.framework.TestCase;

public class additionTest extends TestCase{
	public void testAddition() {
		additonClass addClass = new additonClass();
		assertEquals(2,addClass.addOne(1));

	}
	public void testTwoNumberAddition() {
		additonClass addClass = new additonClass();
		assertEquals(3,addClass.addTwoNumbers(1,2));
	}
}
