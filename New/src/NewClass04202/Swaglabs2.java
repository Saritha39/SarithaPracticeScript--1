package NewClass04202;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Swaglabs2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver = new ChromeDriver();
		 //driver.get("https://www.saucedemo.com/"); //Open Browser
		 //driver.manage().window().maximize(); // Maximize the window
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));// implicit wait
		 //driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 //driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 //Thread.sleep(5000);
		 //driver.findElement(By.id("login-button")).click();
		 //driver.findElement(By.id("react-burger-menu-btn")).click();
		 //driver.findElement(By.id("logout_sidebar_link")).click();
		ChromeOptions options = new ChromeOptions();
			
		//options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		 String[] usernames  = {
			        "standard_user",
			        "locked_out_user",
			        "problem_user",
			        "performance_glitch_user",
			        "error_user",
			        "visual_user"
			};

			String password = "secret_sauce";
			
			driver.get("https://www.saucedemo.com");

			for (int i = 0; i < usernames.length; i++) {

			    // Enter username
				//driver.findElement(By.id("user-name")).clear();
				driver.findElement(By.id("user-name")).sendKeys(usernames[i]);

			    // Enter password
				Thread.sleep(3000);
				//driver.findElement(By.id("password")).clear();
				driver.findElement(By.id("password")).sendKeys(password);

			    // Click Login
				driver.findElement(By.id("login-button")).click();

			    Thread.sleep(2000); 
			    //Alert alert = driver.switchTo().alert(); // Handle OK buttom on the popup up alert
				//System.out.println(alert.getText()); //Handle OK buttom on the popup up alert
				//Thread.sleep(4000);
				 //alert.accept(); // Handle ok button on popup window
				 //driver.close();
				 //Thread.sleep(5000);
			    // Click Logout
			    //driver.findElement(By.id("react-burger-menu-btn")).click();
			    //Thread.sleep(5000);
			    //driver.findElement(By.id("logout_sidebar_link")).click();

			   // Thread.sleep(2000);

			    // Navigate back to login page
			    driver.get("https://www.saucedemo.com");
			}

			driver.quit();	
			
			{ 
		// TODO Auto-generated method stub

	}

}
