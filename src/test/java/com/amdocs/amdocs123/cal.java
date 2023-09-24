package com.amdocs.amdocs123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cal {
	private static WebElement element=null;
	public static WebElement lnk_math_calc(WebDriver driver) {
		element=driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a"));
		return element;
	}
	public static WebElement lnk_percent_calc(WebDriver driver) {
		element=driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a"));
		return element;
	}
	public static WebElement txt_num_1(WebDriver driver) {
		element=driver.findElement(By.id("cpar1"));
		return element;
	}
	public static WebElement txt_num_2(WebDriver driver) {
		element=driver.findElement(By.id("cpar2"));
		return element;
	}
	public static WebElement btn_calc(WebDriver driver) {
		element=driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr/td[2]/input"));
		return element;
	}
	public static WebElement web_result(WebDriver driver) {
		element=driver.findElement(By.xpath(".//*[@id='content']/p[2]/span/font/b"));
		return element;
	}
}
	