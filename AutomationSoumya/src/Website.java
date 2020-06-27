import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Website {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.quadrealres.com/apartments/ab/calgary/calgary-place/");
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		WebElement Residentbtn = driver.findElement(By.cssSelector("input[class='btn']"));
		Residentbtn.click();
	
		

	}

}
