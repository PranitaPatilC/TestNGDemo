package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NameNikhil {
	
	@BeforeSuite
	public void bsuite() {
		System.out.println("before suite");
	}

	@Test(timeOut = 4000)
	public void SNNikhil(){
		System.out.println("ChouguleN");
	}
	
	@Test(dependsOnMethods= {"SNNikhil"})
	public void FNNikhil(){
		System.out.println("Nikhil");
	}

	

	@Test(enabled = false)
	public void CNNikhil1(){
		System.out.println("Reyaansh");
	}
	
	@Parameters({"URL"})
	@Test
	public void CNNikhil2(String url){
		System.out.println("Riya");
		System.out.println(url);
	}
}
