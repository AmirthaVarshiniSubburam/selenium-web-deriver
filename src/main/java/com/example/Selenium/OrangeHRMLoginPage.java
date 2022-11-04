package com.example.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMLoginPage {
	//Passing Login Credentials
	public String uname = "Admin";
	public String pwd = "admin123";
	
	//Initiating Browser - Edge
	public static WebDriver driver;
	
	@Test
	public void logintest() {
		
		
//		driver2 = new RemoteWebDriver();
		System.setProperty("webdriver.edge.driver", "D:\\SERP\\Testing\\edgedriver_win32\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Launch OrangeHRM System");
		
		
//		Thread.sleep(8000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Enter Username");
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']")); 
		username.clear();
		username.sendKeys(uname);
		System.out.println("Enter Password");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']")); 
		password.clear();
		password.sendKeys(pwd);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
//		WebElement profile = driver.findElement(By.xpath("//button[@type='submit']"));
//		profile.click();
		
		
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "OrangeHRM");
		driver.close();
		
		
	}
	
}
