package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NameInfo {
	
	@AfterClass
	public void aclass() {
		System.out.println("after class");
	}
	@BeforeTest
	public void bt() {
System.out.println("before test");
	}
	@AfterSuite
	public void asuite() {
		System.out.println("after suite");
	}
	@AfterTest
	public void at() {
System.out.println("after test");
	}
	
	@AfterMethod
	public void ate() {
System.out.println("after method");
	}
	
	@BeforeMethod
	public void bte() {
System.out.println("before method");
	}
	
	
	@Test
	public void SN(){
		System.out.println("ChouguleP");
		//Assert.assertTrue(false);
	}
	
	@Test
	public void FN(){
		System.out.println("Pranita");
	}
	
	
	@Test(groups= {"JSP"})
	public void FatherName() {
		System.out.println("Shitalkumar");
		//Assert.assertTrue(false);
	}

	@Test(groups= {"JSP"})
	public void MotherName() {
		System.out.println("Manik");
	}
}
