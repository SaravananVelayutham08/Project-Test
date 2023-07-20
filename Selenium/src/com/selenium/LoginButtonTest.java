package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginButtonTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.driver.edgedriver", "C:\\Users\\Gamin\\eclipse-workspace\\Selenium\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://login-lounge.vercel.app/");
	WebElement login = driver.findElement(By.xpath("(//a[contains(@herf,Login)])[2]"));
	login.click();
	WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
	email.sendKeys("iamsaravanan08@gmail.com");
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("saravanan003");
	
	WebElement regbut = driver.findElement(By.xpath("//a[contains(@class,'navi')]"));
    regbut.click();
	WebElement log = driver.findElement(By.xpath("//button[contains(@button,Login)]"));
	log.click();
	}

}
