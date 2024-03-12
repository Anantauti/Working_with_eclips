package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class paytm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open Paytm website
        driver.get("https://paytm.com/flights/");

        try {
            // Enter origin (Pune)
            WebElement originInput = driver.findElement(By.xpath("//input[@placeholder='From']"));
            originInput.sendKeys("Pune");

            // Enter destination (Delhi)
            WebElement destinationInput = driver.findElement(By.xpath("//input[@placeholder='To']"));
            destinationInput.sendKeys("Delhi");

            // Enter travel date
            WebElement dateInput = driver.findElement(By.xpath("//input[@placeholder='Departure']"));
            dateInput.sendKeys("2024-03-01"); // Example date

            // Click on Search button
            WebElement searchButton = driver.findElement(By.xpath("//button[text()='Search']"));
            searchButton.click();

            // Wait for search results to load (you may need to implement an explicit wait here)

            // Select the desired flight (assuming there's only one flight listed)
            WebElement selectFlightButton = driver.findElement(By.xpath("//button[text()='Select']"));
            selectFlightButton.click();

            // Proceed with booking process
            // (Enter passenger details, select seats, make payment, etc.)
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
	}
}
