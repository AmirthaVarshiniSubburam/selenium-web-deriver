package com.example.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PetStoreTest {
	
	//Initiating Browser - Edge
	public static WebDriver driver;
	
	@Test
	public void petStoreTest() {
		
	System.setProperty("webdriver.edge.driver", "D:\\SERP\\Testing\\edgedriver_win32\\msedgedriver.exe");
	driver=new EdgeDriver();
	driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	System.out.println("Launch Pet Store");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	WebElement searchInput = driver.findElement(By.xpath("//input[@name='keyword']"));
//	searchBox.click();
	searchInput.clear();
	searchInput.sendKeys("fish");
	
	WebElement searchButton = driver.findElement(By.xpath("//input[@name='searchProducts']"));
	searchButton.click();
	
	WebElement goldFish = driver.findElement(By.linkText("Fresh Water fish from China"));
	goldFish.click();
	
	WebElement goldFishAddToCart = driver.findElement(By.cssSelector("tr:nth-child(2) .Button"));
	goldFishAddToCart.click();
	
	WebElement price = driver.findElement(By.cssSelector("td:nth-child(6)"));
	String goldFishPrice = price.getText();
	
	WebElement goldFishType = driver.findElement(By.cssSelector("td:nth-child(3)"));
	WebElement goldFishInStock = driver.findElement(By.cssSelector("td:nth-child(4)"));
	
	Assert.assertEquals(goldFishPrice, "$5.50");
	Assert.assertEquals(goldFishType.getText(), "Adult Male Goldfish");
	Assert.assertEquals(goldFishInStock.getText(), "true");
	
	driver.close();
	
	
	}
	
	
}
