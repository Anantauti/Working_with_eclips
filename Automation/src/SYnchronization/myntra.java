package SYnchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra {
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/jens?rawQuery=jens");
	//	(//a[@href='/shop/men'])[1] 
				//a[@data-group='men']
		//driver.findElement(By.xpath("//a[@data-group='men']")).click();
		driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[3]")).click();
	}

}
