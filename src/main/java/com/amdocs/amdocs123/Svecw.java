package com.amdocs.amdocs123;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Svecw {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String url = "https://www.javatpoint.com";
		driver.get(url);
		String title = driver.getTitle();
		int titleLength = driver.getTitle().length();
		System.out.println("Title of the page is: "+ title);
		System.out.println("Length of the title is: "+ titleLength);
		String actualUrl=driver.getCurrentUrl();
		if(actualUrl.equals(url)) {
			System.out.println("Verification Successful - The correct Url is opened");
		}
		else {
			System.out.println("Verification Failed-An incorect Url is opened:");
			System.out.println("Actual Url is: "+actualUrl);
			System.out.println("Expected Url is: "+url);
		}
		String pageSource=driver.getPageSource();
		int pageSourceLength=pageSource.length();
		System.out.println("Total length of the Page Source is: "+pageSourceLength);
		driver.close();
	}
}

			

