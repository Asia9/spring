package com.amdocs.amdocs123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigatecommands {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String appUrl="https://www.flipkart.com";
		WebDriver diver = null;
		diver.get(appUrl);
		driver.findElement(By.xpath("/html/body/div[5]/div/div[12]/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div/div/span/a")).click();
		driver.navigate().back();
	   	driver.navigate().forward();
		driver.navigate().to(appUrl);
		driver.navigate().refresh();
		driver.close();
	}

}
