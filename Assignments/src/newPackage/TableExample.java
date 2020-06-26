package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().deleteAllCookies(); // delete all coolies
		driver.manage().window().maximize(); //maximize the window
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		WebElement table = driver.findElement(By.id("product"));
		int rowcount = table.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
		System.out.println("Number of rows: " +rowcount);
		
		int columncount = table.findElements(By.xpath("//table[@id='product']/tbody/tr[1]/th")).size();
		System.out.println("Number of columns: " +columncount);
		
		
		
		for(int i=0;i<columncount;i++)
		{
			String firsttext = table.findElements(By.xpath("//table[@id='product']/tbody/tr[3]/td")).get(i).getText();
						System.out.println(firsttext);
		}
		
		
	}

}
/* Another method
 * WebElement table=driver.findElement(By.id("product"));

System.out.println(table.findElements(By.tagName("tr")).size());

System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

System.out.println(secondrow.get(0).getText());

System.out.println(secondrow.get(1).getText());

System.out.println(secondrow.get(2).getText());
}
} */
