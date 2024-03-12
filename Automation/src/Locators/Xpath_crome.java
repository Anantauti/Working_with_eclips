package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_crome {

	public static void main(String[] args) {
		
		  WebDriver driver = new   ChromeDriver();
	         
	         driver.manage().window().maximize();
	         
	         driver.get("https://www.google.com/");
	         driver.switchTo().activeElement().sendKeys("chandler bing",Keys.ENTER);
	        			   
	      //  driver.get("https://www.google.com/search?q=chander+bing&rlz=1C1CHBD_enIN1065IN1071&oq=chander+bing&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIMCAEQABgKGLEDGIAEMgkIAhAAGAoYgAQyCQgDEAAYChiABDIMCAQQABgKGLEDGIAEMgkIBRAAGAoYgAQyCQgGEAAYChiABDIJCAcQABgKGIAEMgkICBAAGAoYgAQyCQgJEAAYChiABNIBCjE4NzQ2ajBqMTWoAgCwAgA&sourceid=chrome&ie=UTF-8");	
	        
	        
	        driver.findElement(By.xpath("//canvas[@class='lNPNe']"));
	       
	               driver.findElement(By.xpath("//canvas[@class='lNPNe']")).click();    //canvas[@class='lNPNe'] 
	                                                                                                                                                                                                                                                                                                                                                
	}
}