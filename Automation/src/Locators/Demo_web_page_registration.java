package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_web_page_registration {
	
	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		
		WebElement genderbutton = driver.findElement(By.className("forcheckbox"));
		 
		genderbutton.click();
		
		WebElement firstname = driver.findElement(By.id("FirstName"));
		
		firstname.sendKeys("Anant");
		
		WebElement lastname = driver.findElement(By.id("LastName"));
		
		lastname.sendKeys("Auti");
		
		WebElement emailid = driver.findElement(By.id("Email"));
		emailid.sendKeys("moyemoye25@gmail.com");
		
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("@moyemoye145");
		
		WebElement confirmpassword = driver.findElement(By.id("ConfirmPassword"));
		confirmpassword.sendKeys("@moyemoye145");
		
	driver.findElement(By.name("register-button")).click();
		
		
		
		
		
		
		
		
		
	}

}
