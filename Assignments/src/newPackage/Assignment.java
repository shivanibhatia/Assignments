package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies(); // delete all coolies
		driver.manage().window().maximize(); //maximize the window
		
		//hit the site
		driver.get("http://cleartrip.com");
		
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
		System.out.println("date selected");
		////li[1]/following-sibling::li[1]
		Select s=new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("2");
		
		Select c=new Select(driver.findElement(By.id("Childrens")));
		c.selectByValue("3");
		
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("ABCD");
		
		
		
		driver.findElement(By.id("SearchBtn")).click();
		
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		
		
	}

}
