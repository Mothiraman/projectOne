package org.Git;

import org.testng.annotations.Test;

import baseClass.baseClass;

public class Git extends baseClass {

	@Test(groups="Smoke")
	private void tc2() {
	
		System.out.println("Thread Id is"+Thread.currentThread().getId());
		
		getUrl("https://en-gb.facebook.com/");
	}
	@Test(groups="Regerssion")
	private void tc3() {
	
		System.out.println("Thread Id is"+Thread.currentThread().getId());
		
		getUrl("https://en-gb.facebook.com/");
	}
	@Test(groups="Smoke")
	private void tc4() {
	
		System.out.println("Thread Id is"+Thread.currentThread().getId());
		
		getUrl("https://en-gb.facebook.com/");
	}
}
