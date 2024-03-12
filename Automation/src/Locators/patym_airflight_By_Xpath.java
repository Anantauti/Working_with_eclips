package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class patym_airflight_By_Xpath {
      
	 
	 public static void main(String[] args) throws Throwable {
		 
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://paytm.com/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[2][@class='_2EGQY']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@id='srcCity']")).click();
			driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
			driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("PUNE");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[contains(text(),'Pune, Maharashtra, India')]")).click();
			driver.findElement(By.xpath("//span[@id='destCode']")).click();
			driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
			driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("DEL");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'Delhi, India')]")).click();
			//driver.findElement(By.xpath("//button[@class='rippleButton']")).click();
			
			//to find calender
			driver.findElement(By.xpath("//span[text()='Departure Date']")).click();
		
			
			Thread.sleep(1000);
			// to find date 
			driver.findElement(By.xpath("(//div[text()='19'])[2]")).click();
			//(//div[text()='19'])[2]
			
			//to click on search flight 
		 //   driver.findElement(By.xpath("//button[@class='rippleButton']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("flightSearch")).click();
		   // driver.findElement(By.xpath("(//span[text()='View Fare'])[1]")).click();
		    driver.findElement(By.xpath("//button[@class='_33sPg ywWP8']")).click();
		    
  }
}
