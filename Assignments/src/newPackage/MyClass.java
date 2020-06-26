package newPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {
	
	WebDriver driver;
	
	public void invokeBrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			
			
			driver.get("http://www.edureka.co");
			searchCourse();
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	
	public void searchCourse() {
	
	driver.findElement(By.id("search-inp")).sendKeys("Java");
	driver.findElement(By.id("search-button-top")).click();
	
		
	}
	
	public static void main(String[] args) {
		MyClass myobj = new MyClass();
		myobj.invokeBrowser();
		
	}

}
