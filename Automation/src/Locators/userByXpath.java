package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class userByXpath {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		driver.switchTo().activeElement().sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager",Keys.ENTER);
		
		driver.findElement(By.xpath("//a[@class=\'content users\']")).click();
		driver.findElement(By.xpath("//input[@value=\'Create New User\' ]")).click();
		
		driver.findElement(By.xpath("//input[contains (@name,\'username\')]")).sendKeys("project_manager");
		driver.findElement(By.xpath("//input[@type='text' and @name=\'firstName\' ]")).sendKeys("Tony");
		driver.findElement(By.xpath("//input[@type='text' and @name=\'lastName\']")).sendKeys("Stark");
	driver.findElement(By.xpath("//input[@name=\'passwordText\']")).sendKeys("Asdf123");
	driver.findElement(By.xpath("//input[@name=\'passwordTextRetype\']")).sendKeys("Asdf123"); 
	
	driver.findElement(By.xpath("// input[@name=\'rightGranted[2]\']")).click();
	driver.findElement(By.xpath("//input[@value=\'   Create User   \']")).click();
	}

}
