package com.example.Selenium;

import java.lang.reflect.Array;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		String[] arr = new String[2];
		arr[0] = new String("XPath");
		arr[1] = new String("CSS Selector");
//		arr[2] = new String("name");
//		arr[3] = new String("ID");
//		arr[4] = new String("Tag name");
//		arr[5] = new String("Link-Text");
//		arr[6] = new String("Partial Link-Text");
//		arr[7] = new String("By CSS");
		
		for (String string : arr) {
			
		
		
		System.setProperty("webdriver.edge.driver", "D:\\SERP\\Testing\\edgedriver_win32\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.bing.com/");
		String expectedUrl ="https://www.bing.com/";
		
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		Assert.assertEquals(expectedUrl, actualUrl, "Test This URL");
		
//		searchBox.sendKeys(string);
//		searchBox.sendKeys("${KEY_ENTER}");
		
//		WebElement searchButton = driver.findElement(By.xpath("//form/label/svg"));
//		searchButton.click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.close();
		System.out.println("Edge Browser Close");
		
		}
	}
	
	
}
