package newPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class childElements {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies(); // delete all coolies
		driver.manage().window().maximize(); //maximize the window
		
		//hit the site
		driver.get("http://retail.upskills.in/admin");
		driver.findElement(By.id("input-username")).sendKeys("admin");
		driver.findElement(By.id("input-password")).sendKeys("admin@123");
		driver.findElement(By.className("btn-primary")).click();
		WebElement cat = driver.findElement(By.xpath("//*[@id=\"menu-catalog\"]/a/i"));
		Actions act = new Actions(driver);
		act.moveToElement(cat).perform();
		driver.findElement(By.xpath("//*[@id=\"menu-catalog\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/a")).click();
		
		driver.findElement(By.id("input-name1")).sendKeys("Samsung");
		driver.findElement(By.id("input-meta-title1")).sendKeys("Samsung");
		
		driver.findElement(By.xpath("//*[@id=\"form-product\"]/ul/li[2]/a")).click();
		driver.findElement(By.id("input-model")).sendKeys("SKU-003");
		driver.findElement(By.id("input-price")).sendKeys("20000");
		
		driver.findElement(By.xpath("//*[@id=\"form-product\"]/ul/li[3]/a")).click();
		driver.findElement(By.id("input-category")).sendKeys("TV");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/button")).click();
		
		//System.out.println(driver.findElement(By.className("alert-success")).getText());
		WebElement ls = driver.findElement(By.className("alert-success"));
		//List<WebElement> lschild = driver.findElements(By.xpath(".//*"));
		//System.out.println("text " +ls.get(0).getText());
		//System.out.println("size" +ls.size());
		//System.out.println(ls.findElement(By.xpath("/html/body/div/div/div[2]/div[1]")).getText());
	
		//System.out.println(ls.findElement(By.tagName("button")).getText());
		
		//String[] text = ls.getText().split("\\n");
		//String lin1 = text[0];
		//System.out.println(lin1);
		
		//System.out.println(lschild.size());
		
		String mytext = (String)((JavascriptExecutor)driver).executeScript("return arguments[0].childNodes[1].textContent;", ls);
		System.out.println(mytext);
		
		//Assert.assertEquals(mytext.trim(), "Success: You have modified products!");

}
}
