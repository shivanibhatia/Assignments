package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignOptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximize the window
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		driver.findElement(By.id("checkBoxOption3")).click();
		//System.out.println("getting text");
		System.out.println(driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]")).getText());
		
		String optiontext = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]")).getText();
						//	System.out.println(optiontext);
		Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
		
		s.selectByVisibleText(optiontext);
		
		driver.findElement(By.id("name")).sendKeys(optiontext);
		driver.findElement(By.id("alertbtn")).click();
		
		String text = driver.switchTo().alert().getText();
		
		if(text.contains(optiontext))
		{
			System.out.println("Alert message displayed correctly");
			
		}
		else
		{
			System.out.println("message not correct");
		}
		
		
		
		
	}

}
