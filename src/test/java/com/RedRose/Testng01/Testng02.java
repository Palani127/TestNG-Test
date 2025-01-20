package com.RedRose.Testng01;

import org.testng.annotations.Test;

public class Testng02 {
	@Test(priority=1,groups="GroupA")
	public void startCar() {
		System.out.println("Start the car!");
	}
	@Test(groups="GroupA")
	public void firstGear() {
		System.out.println("This is");//it wil throws the exception
	}
	@Test(groups="GroupA")
	public void secondGear() {
		System.out.println("This is the secondGear!");
	}
	@Test(dependsOnGroups= {"GroupA"},alwaysRun=true)// if on of the method failed in group, current method also failed..
	public void thirdGear() {
		System.out.println("This is the thirdGear!");
	}
	
	
	@Test()
	public void fourthGear() {
		System.out.println("This is the fourthGear!");
	}
	@Test()
	public void stopCar() {
		System.out.println("Stop the Car!");
	}
	
}
