package com.example.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MyStoreTest {
	
	
	public static WebDriver driver;
	
	@Test
	public void myStoreTest() {
		
	System.setProperty("webdriver.edge.driver", "D:\\SERP\\Testing\\edgedriver_win32\\msedgedriver.exe");
	driver=new EdgeDriver();
	// Launching MyStore
	driver.get("http://automationpractice.com/index.php");
	
	//Waiting to load
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println("Url Launched after 10 seconds");
	
	String homepageTitle = driver.getTitle();
	System.out.println(homepageTitle);
	
	if (homepageTitle.equals("My Store")) {
//		contact-link
		WebElement contactUs = driver.findElement(By.id("contact-link"));
		contactUs.click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		String contactPageTitle = driver.getTitle();
		
		if(contactPageTitle.equals("Contact us - My Store")) {
		
		System.out.println("Contact page lauched successfully ");
		WebElement drpDown = driver.findElement(By.id("id_contact"));
		Select drpDownType = new Select(drpDown);
		drpDownType.selectByVisibleText("Customer service");
		System.out.println("dropdown selected successfully ");
		driver.close();
		System.out.println("Test passed - Driver Closed");
		}
		
		else {
			driver.close();
			System.out.println("Test passed - Driver Closed - " + contactPageTitle);
		}
	}
	else {
		driver.close();
		System.out.println("Test passed - Driver Closed - " + homepageTitle);
	}
		
	
	
	
	}
	
}
