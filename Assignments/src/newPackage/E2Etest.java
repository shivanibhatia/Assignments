package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class E2Etest {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//select the driver and instantiate the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies(); // delete all coolies
		driver.manage().window().maximize(); //maximize the window
		
		//hit the site
		driver.get("http://spicejet.com");
		
		//click on the From
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//select the city in From
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000); // need to make thread sleep as the site will take time to open To dropdown
		// select GOA from destination 
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();
		//select the current date from calendar by taking class
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		// check the disable calendar
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{

		System.out.println("its disabled");
		Assert.assertTrue(true);
		}
		else
		{
		Assert.assertTrue(false);
		}
		// click on checkbox family and friends
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		//select the Adult dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		//select 4 adults
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}	
		// close the adults dropdown with close button
		driver.findElement(By.id("btnclosepaxoption")).click();
		//click on serach button
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		

}
	
}	
