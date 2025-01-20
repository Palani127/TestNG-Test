package com.RedRose.Testng01;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TesNG03 {
	//InvocationCount --> Specifies the number of times the test method should be invoked.

	@Test(priority=1,groups="making")
	@Parameters({"username","password"})
	public void startCar(String user,String pass) {
		System.out.println("Start the car!");
		System.out.println(user+pass);
		Assert.assertEquals(user, pass);
	}
	@Test(invocationCount=3,priority=2,groups="making")
	public void firstGear() {
		System.out.println("This is the firstGear!");
	}
	@Test(priority=3,groups="making")
	public void secondGear() {
		System.out.println("This is the secondGear!");
	}
	@Test(priority=4,groups="king")
	public void thirdGear() {
		System.out.println("This is the thirdGear!");
	}
	@Test(priority=5,groups="king")
	public void fourthGear() {
		System.out.println("This is the fourthGear!");
	}
	@Test(priority=6,groups="king")
	public void stopCar() {
		System.out.println("Stop the Car!");
	}
}
