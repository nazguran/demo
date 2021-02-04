package com.JunitDemo.demo;

import junit.framework.TestCase;

public class additionTest extends TestCase{
	public void testAddition() {
		additionClass addClass = new additionClass();
		assertEqual(2,addClass.addOne(1));
	}
}
