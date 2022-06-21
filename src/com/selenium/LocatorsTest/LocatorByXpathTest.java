package com.selenium.LocatorsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByXpathTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// Absolute Xpath-/
		// WebElement enterEmail = driver
		// .findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[2]/div[1]/input"));

		// Relative Xpath-//
		WebElement enterEmail = driver.findElement(By.xpath("//*[@id=\"Email\"]"));

		enterEmail.click();
		enterEmail.clear();
		enterEmail.sendKeys("abc@gmail.com");

		
	}

}
