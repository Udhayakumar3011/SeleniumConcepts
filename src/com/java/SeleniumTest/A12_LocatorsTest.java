package com.java.SeleniumTest;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A12_LocatorsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// id- Email
		// WebElement enterEmail = driver.findElement(By.id("Email"));
		// WebElement enterEmail= driver.findElement(By.name("Email"));
		WebElement enterEmail = driver.findElement(By.className("password valid"));

		enterEmail.click();
		enterEmail.clear();
		enterEmail.sendKeys("abc@gmail.com");

		// String str="Hello"
		// charSeQ-H E L L O
		// Task-ByClassName and ByName

	}

}
