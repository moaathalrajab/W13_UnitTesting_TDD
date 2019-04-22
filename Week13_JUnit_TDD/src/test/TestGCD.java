package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import Logic.GUI_Controller;

class TestGCD {
	
	GUI_Controller control=new GUI_Controller();
	

	@Test
	void test() {
		//fail("Not yet implemented");
		assertEquals(control.gcd(10, 20), 10);
	}

}
