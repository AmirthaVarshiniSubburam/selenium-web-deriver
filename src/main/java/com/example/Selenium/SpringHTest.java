package com.example.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SpringHTest {

	
	//Initiating Browser - Edge
		public static WebDriver driver;
		
		@Test
		public void springHTest() {
			
		System.setProperty("webdriver.edge.driver", "D:\\SERP\\Testing\\edgedriver_win32\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("http://localhost:3000/login");
		System.out.println("Launch Wallet Pay");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='floatingInput']"));
//		searchBox.click();
		userName.clear();
		userName.sendKeys("amutheswaran@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='floatingPassword']"));
//		searchBox.click();
		password.clear();
		password.sendKeys("Password12#");
		
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		LoginButton.click();
		
		WebElement ProfilePageEmail = driver.findElement(By.xpath("//div[2]/span"));
		
		Assert.assertEquals(ProfilePageEmail.getText(), "Signed in as: amutheswaran@gmail.com");
		
		driver.close();
		
		}
	
}
