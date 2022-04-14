package com.crm.comcast.SDET32_GitPractice;

import org.testng.annotations.Test;

public class ClassD {

	@Test
	public void demoTest3() {
		
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");
		
		System.out.println(browser);
		System.out.println(url);
		
		System.out.println("from class D");
		System.out.println("from class D1");
		System.out.println("from class D2");
	}
}
