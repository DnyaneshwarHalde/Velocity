package org.velocity2022.ActiTimeProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGVerify {
		
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
		
	}
	@Test
	public void test() {
		System.out.println("test");
	}
	
	@AfterMethod
	public void afterMethod() {
		
	}
	@AfterClass
	public void afterClass() {
		
	}
	@BeforeClass
	public void beforeClass() {
		
	}
}
