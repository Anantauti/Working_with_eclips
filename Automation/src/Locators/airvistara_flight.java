package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class airvistara_flight {

	public static void main(String[] args) throws Throwable {
	WebDriver driver= new ChromeDriver();
	
	//div[@id='container']
	
	driver.manage().window().maximize();
	driver.get("https://www.airvistara.com/in/en");
	driver.findElement(By.xpath("(//input[@placeholder=\"Select Departure City\"])[1]")).sendKeys("PNQ");
	driver.findElement(By.xpath("(//input[@placeholder=\"Select Arrival City\"])[1]")).sendKeys("DEL");
	
	//for popup closer
	driver.findElement(By.xpath("//button[@id=\'cookieModalCloseBtn\']")).click();

  //for calendre	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id=\'departCalendar\']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@monthname=\'Mar\']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='12']")).click();
	// for calender 
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id=\'returnCalendar\']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@monthname=\'Mar\']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='12']")).click();
	
	
	
	}
}
