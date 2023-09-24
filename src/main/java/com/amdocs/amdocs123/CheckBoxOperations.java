package com.amdocs.amdocs123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxOperations {

	public static void main(String[] args) {
		String exePath="C:\\Selenium\\firefoxdriver\firefoxdriver.exe";
		System.setProperty("webdriver.firefox.driver", exePath);
		WebDriver driver = new FirefoxeDriver();
		driver.get("/html/body/div[5]/div/div[12]/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div/div/span/a");
		driver.manage().window().maximize();
		WebElement checkBoxSelected = driver.findElement(By.cssSelector(".rct.title"));
		boolean isSelected=checkBoxSelected.isSelected();
		if(isSelected==false) {
			checkBoxSelected.click();
		}
		WebElement checkBoxDisplayed=driver.findElement(By.cssSelector(".rct.title"));
		boolean isDisplayed=checkBoxDisplayed.isDisplayed();
		if(isDisplayed==true) {
			checkBoxDisplayed.click();
		}
		
	}
}
		


