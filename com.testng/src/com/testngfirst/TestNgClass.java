package com.testngfirst;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgClass {
	@Test
	public void checkOneTestcase() {
	System.out.println("checkOneTestcase");
	Assert.assertEquals(5, 5);
		
	}
	@Test
	public void checktwotestcase() {
		System.out.println("checktwotestcase");
		Assert.assertEquals(6, 8);
	}
	
	@Test
	public void checkthreetestcase() {
		System.out.println("checkthreetestcase");
		Assert.assertEquals(6, 6);}
		


}
