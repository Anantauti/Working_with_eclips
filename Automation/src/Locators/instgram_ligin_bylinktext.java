package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instgram_ligin_bylinktext {
	 
	 public static void main(String[] args) {
		 
 WebDriver driver = new   ChromeDriver();
         
         driver.manage().window().maximize();
         
        			   
        driver.get("https://www.instagram.com/");	
        
        WebElement stf= driver.findElement(By.name("username"));
        
        stf.sendKeys("anantauti25@gmail.com");
        
        WebElement stf2= driver.findElement(By.id("pass"));
        stf2.sendKeys("Anant786@@@@");
        
        WebElement searchbutton= driver.findElement(By.name("login"));
         searchbutton.click();
         
		
	}

}
