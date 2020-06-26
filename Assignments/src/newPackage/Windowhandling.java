package newPackage;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximize the window
		driver.get("https://the-internet.herokuapp.com");
		
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		
		//get all the ids of parent and child window from function getWindowHandles and store it in ids variable
		Set<String>ids=driver.getWindowHandles();
		
		//iterator class will iterate the ids one by one
		java.util.Iterator<String> it= ids.iterator();
		
		//get the id of parent window
		String parentid = it.next();
		
		//get the id of child window
		String childid = it.next();
		
		//switch to child window
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle()); //get the title
		
		//switching back to parent window
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
		
		
		
		
	}

}
