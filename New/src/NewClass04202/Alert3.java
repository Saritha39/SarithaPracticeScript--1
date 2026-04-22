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
public class Alert3 {
//Alert to handle popup message that has text box to enter text and click ok
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts"); //Open Browser
		 driver.manage().window().maximize(); // Maximize the window
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));// implicit wait
		 driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
		
		 Thread.sleep(5000);
		 Alert alert3 = driver.switchTo().alert();
		 System.out.println("Prompt Alert Text: " + alert3.getText());
		 alert3.sendKeys("Hello Students");
		 Thread.sleep(5000);
		 alert3.accept(); // submit input
	}

}
