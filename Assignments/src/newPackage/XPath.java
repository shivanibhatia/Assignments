package newPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPath {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
		
		
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']")).click();
		
		System.out.println(driver.findElement(By.xpath("//li[@id='tablist1-tab1']")).getAttribute("id"));

		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[1]")).click();
		
		System.out.println(driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[1]")).getAttribute("id"));
		
		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();
		
		System.out.println(driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).getAttribute("id"));

		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[3]")).click();
		
		System.out.println(driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[3]")).getAttribute("id"));
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));	

}
}
