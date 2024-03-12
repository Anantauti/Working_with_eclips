package findElements_byFor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithsearch {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		
		//for search iphone
	driver.findElement(By.name("q")).sendKeys("ipad",Keys.ENTER);
	
	//identify all the ipad names and print it
	//List<WebElement>elements=driver.findElements();

	}

}
