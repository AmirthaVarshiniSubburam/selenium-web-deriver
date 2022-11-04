package com.example.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectFacebookExample {

	
public static WebDriver driver;
	
	@Test
	public void fbSelect() {
		
	System.setProperty("webdriver.edge.driver", "D:\\SERP\\Testing\\edgedriver_win32\\msedgedriver.exe");
	driver=new EdgeDriver();
	// Launching Facebook
	driver.get("https://www.facebook.com/");
	
	//Waiting to load
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println("Url Launched after 10 seconds");
	
	WebElement createNewAcc = driver.findElement(By.xpath("//form/div[5]/a"));
	createNewAcc.click();
	
	WebElement drpDownDay = driver.findElement(By.id("day"));
	Select drpDownDayselect = new Select(drpDownDay);
	drpDownDayselect.selectByValue("14");
	
	WebElement drpDownMonth = driver.findElement(By.id("month"));
	Select drpDownMonthselect = new Select(drpDownMonth);
	drpDownMonthselect.selectByValue("10");
	
	WebElement drpDownYear = driver.findElement(By.id("year"));
	Select drpDownYearselect = new Select(drpDownYear);
	drpDownYearselect.selectByValue("2019");
	
//	u_e_s_xm
	WebElement submitButton = driver.findElement(By.xpath("//form/div[1]/div[11]/button"));
	submitButton.click();
	
	driver.close();
	
	
	
	
	}
	
	
}
