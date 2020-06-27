package heroku;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heroku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium drivers\\chromedriver_win32/chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://google.com");
	        
	        WebElement name = driver.findElement(By.name("q"));
	        name.click();
	        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	        name.sendKeys("Hazard");
	        
	        
	        WebElement button = driver.findElement(By.name("btnK"));
	        button.click();
	       
	}

}
