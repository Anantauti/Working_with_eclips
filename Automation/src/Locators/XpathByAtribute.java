package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAtribute {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy\"]")).sendKeys("anant");
		driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy _9npi\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
				
				
				
	}
}
