package com.login.hubSpot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	WebDriver driver;


	@BeforeMethod	
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.hubspot.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();


	}

	@Test
	public void titleTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}

	@AfterMethod
	public void quitBrowser()
	{
		driver.quit();
	}

}
