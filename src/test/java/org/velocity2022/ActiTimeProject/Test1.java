package org.velocity2022.ActiTimeProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibhav\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		
		LoginPage login = new LoginPage(driver);
		login.loginToApplicationAction();
		
	}
}
