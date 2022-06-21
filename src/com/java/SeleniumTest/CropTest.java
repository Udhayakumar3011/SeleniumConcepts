package com.java.SeleniumTest;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CropTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.LaunchBrowser();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileHandler.copy(src, new File("D:\\googleimg.png"));

		WebElement googleLogo = driver.findElement(By.xpath("//img[@alt='Google']"));

		BufferedImage bf = ImageIO.read(src);
		Dimension d = googleLogo.getSize();
		int height = d.height;
		int width = d.width;
		System.out.println("Height" + " " + height);
		System.out.println("Width" + " " + width);

		Point p = googleLogo.getLocation();
		int xaxis = p.x;
		int yaxis = p.y;
		System.out.println("X-Axis" + " " + xaxis);
		System.out.println("Y-Axis" + " " + yaxis);

		BufferedImage subbf = bf.getSubimage(xaxis, yaxis, width, height);
		ImageIO.write(subbf, "png", src);
		FileHandler.copy(src, new File("D:\\cropgoogle.png"));
		
	}

}
