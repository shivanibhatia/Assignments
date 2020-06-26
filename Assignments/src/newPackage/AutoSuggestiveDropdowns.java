package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximize the window
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;

		String script = "return document.getElementById(\"autocomplete\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		
		while(!text.equalsIgnoreCase("INDIA"))
		{
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			text=(String) js.executeScript(script);
			System.out.println(text);
		}
			

	}

}
