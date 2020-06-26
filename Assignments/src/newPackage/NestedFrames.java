package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximize the window
		driver.get("https://the-internet.herokuapp.com");
		
		driver.findElement(By.xpath("//a[@href='/nested_frames']")).click();
		
		System.out.println(driver.findElements(By.tagName("frame")).size());
		
		driver.switchTo().frame(0);
		
		System.out.println((driver.findElements(By.tagName("frame")).size()));
		
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.id("content")).getText());
		
		//or can be done like this
		//driver.switchTo().frame("frame-top");
		//driver.switchTo().frame("frame-middle");
		
		
		
		
		
	}

}
