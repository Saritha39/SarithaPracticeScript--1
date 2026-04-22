package NewClass04202;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Alert2 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts"); //Open Browser
		 driver.manage().window().maximize(); // Maximize the window
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));// implicit wait
		 driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
		 Thread.sleep(5000);
		 //Alert alert = driver.switchTo().alert(); // Handle OK buttom on the popup up alert
		 //System.out.println(alert.getText()); //Handle OK buttom on the popup up alert
		 //alert.accept(); // Handle ok button on popup window
		 //Thread.sleep(5000);
		 Alert alert1 = driver.switchTo().alert(); // Handle cancel buttom on the popup up alert
		 System.out.println(alert1.getText()); //Handle cancel buttom on the popup up alert
		 alert1.dismiss(); // Handle cancel button on popup window
		 
	}

}
