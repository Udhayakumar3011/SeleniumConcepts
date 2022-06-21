package com.java.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A16_SubmitButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		WebElement email=driver.findElement(By.id("Email"));
		email.click();
		email.clear();
		email.sendKeys("abc@gmail.com");
		
		WebElement password=driver.findElement(By.id("Password"));
		password.click();
		password.clear();
		password.sendKeys("Password@123");
		
		WebElement loginButton=driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		//loginButton.click();
		loginButton.submit();
		
		
		
	}

}
