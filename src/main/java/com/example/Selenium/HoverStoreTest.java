package com.example.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverStoreTest {

	
	
public static WebDriver driver;
	
	@Test
	public void myStoreTest(){
		
	System.setProperty("webdriver.edge.driver", "D:\\SERP\\Testing\\edgedriver_win32\\msedgedriver.exe");
	driver=new EdgeDriver();
	// Launching MyStore
	driver.get("http://automationpractice.com/index.php");
	
	//Waiting to load
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println("Url Launched after 10 seconds");
	
	WebElement women_link = driver.findElement(By.xpath("//a[text()='Women']"));

	Actions builder = new Actions(driver);
	//Action seriesOfActions = builder
	builder
		.moveToElement(women_link)
		.build().perform() ;
	
	WebElement tShirt = driver.findElement(By.xpath("//div[6]/ul/li[1]/ul/li[1]/ul/li[1]/a"));
	tShirt.click();
	
	WebElement sortBy = driver.findElement(By.id("selectProductSort"));
	Select sortByDrpDown = new Select(sortBy);
	sortByDrpDown.selectByValue("price:desc");
	
	WebElement price = driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[1]/span"));
	
	Assert.assertEquals(price.getText(), "$16.51");
		
	driver.close();
	
	
	
	}
}
