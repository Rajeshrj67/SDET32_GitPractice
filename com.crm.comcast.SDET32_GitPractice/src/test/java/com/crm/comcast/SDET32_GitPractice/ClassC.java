package com.crm.comcast.SDET32_GitPractice;

import org.testng.annotations.Test;

public class ClassC {

	@Test
	public void demoTest3() {
		
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");
		
		System.out.println(browser);
		System.out.println(url);
		
		System.out.println("from class C");
	}
}
