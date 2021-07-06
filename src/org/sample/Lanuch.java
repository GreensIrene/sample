package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lanuch {

	public static void main(String[] args) {

		// COnfigure Browser
		System.setProperty("webdriver.gecko.driver",
				"F:\\Velmurugan\\JAVA\\eclipse-java-oxygen-3a-win32-x86_64"
				+ "\\eclipse\\Sample\\FirstDaySeleniumClass\\Driver\\geckodriver.exe");
		
		WebDriver  driver = new FirefoxDriver();
		
		//Lanuch url
		driver.get("https://www.facebook.com/");
		
		//Get Title of page
		String ti = driver.getTitle();
		System.out.println(ti);
		
		//Current url of page
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}
}
