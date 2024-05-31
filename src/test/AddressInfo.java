package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddressInfo {

	@Test(groups= {"JSP"})
	public void AddressJSP() {
		System.out.println("JSPPranita");
	}
	@BeforeClass
	public void bclass() {
		System.out.println("before class");
	}
	@Test
	public void PuneAddress() {
System.out.println("PunePranita");
	
}
}
