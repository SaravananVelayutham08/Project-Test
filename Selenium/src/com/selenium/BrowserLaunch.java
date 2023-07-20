package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Gamin\\eclipse-workspace\\Selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://login-lounge.vercel.app/");
		WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
		name.sendKeys("Savanan");
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("velayuthamk2019@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("saravanan003");
		WebElement register = driver.findElement(By.xpath("//button[contains(@button,Resigter)]"));
		register.click();
	    
	    
		
		
		
		
		
		
	}
}
