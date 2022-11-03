package com.example.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BingTest {

	/*Launch Edge Browser
	 * Navigate to
			Bing "https://www.bing.com/"
			Validate the current url
	 */
	public static WebDriver driver;
	@Test
	public void navigateToBing() {
		System.setProperty("webdriver.edge.driver", "D:\\SERP\\Testing\\edgedriver_win32\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.bing.com/");
		String expectedUrl ="https://www.bing.com/";
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		Assert.assertEquals(expectedUrl, actualUrl, "Test This URL");
		driver.close();
		System.out.println("Edge Browser Close");
	}
	
	
}
