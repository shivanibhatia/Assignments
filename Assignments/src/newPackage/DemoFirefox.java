package newPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		System.out.println(driver.getCurrentUrl());
		
		driver.get("http://yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();

	}

}
