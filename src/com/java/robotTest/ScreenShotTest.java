package com.java.robotTest;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;

import com.java.SeleniumTest.Utility;

public class ScreenShotTest {

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = Utility.LaunchBrowser();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Robot robot = new Robot();

		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(screensize);

		BufferedImage source = robot.createScreenCapture(rectangle);

		File des = new File("D:\\imagesGoogle.png");
		ImageIO.write(source, "png", des);
		
		
		
	}

}
