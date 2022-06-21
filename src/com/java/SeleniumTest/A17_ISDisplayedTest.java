package com.java.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A17_ISDisplayedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		WebElement email = driver.findElement(By.id("Email"));
		boolean flag = email.isDisplayed();

		System.out.println("Email is Displayed:" + " " + flag);
		email.click();
		email.clear();
		email.sendKeys("abc@gmail.com");

		WebElement rememberMe = driver.findElement(By.id("RememberMe"));

		boolean flag1 = rememberMe.isSelected();
		System.out.println("Remember Me" + " " + flag1);
		rememberMe.click();

		WebElement loginButton = driver
				.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));

		boolean flag2 = loginButton.isEnabled();
		System.out.println("Login Button State" + " " + flag2);
		loginButton.submit();
		
		
	}

}
